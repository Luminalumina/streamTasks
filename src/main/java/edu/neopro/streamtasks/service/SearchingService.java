package edu.neopro.streamtasks.service;

import edu.neopro.streamtasks.model.Account;
import edu.neopro.streamtasks.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;
@Service
public class SearchingService {


    public boolean isIbanBelongToAccount(Account account, String iban) {
        Stream<String> streamOfIban = Stream.of(iban);
        return (streamOfIban.filter(account.getIban()::equals).count() == 1);
    }


    public boolean isAccountBelongToCustomer(Account account, Customer customer) {
        return customer.getScroogeId().equals(account.getCustomerScroogeId());
    }

    public String isAccountBelongToAccountList(List<Account> accountList, Account account) {
        if (accountList.stream().filter(account::equals).toString() != null)
            return accountList.stream().filter(account::equals).toString();
        else return null;
    }

    public boolean isIbanBelongToCustomer(Account account, String iban, Customer customer) {
        return (isIbanBelongToAccount(account, iban) && isAccountBelongToCustomer(account, customer));
    }
}
