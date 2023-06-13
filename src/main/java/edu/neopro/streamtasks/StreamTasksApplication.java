package edu.neopro.streamtasks;

import edu.neopro.streamtasks.model.Account;
import edu.neopro.streamtasks.model.Customer;
import edu.neopro.streamtasks.service.SearchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class StreamTasksApplication {
    @Autowired
    private static SearchingService searchingService;

    public static void main(String[] args) {
        SpringApplication.run(StreamTasksApplication.class, args);


        Customer customer001 = new Customer("skid001");
        Account account = new Account("UA233073500000026007691393101", "skid001", "cuskid001");
        String givenIban = "UA233073500000026007691393101";

        boolean first = searchingService.isAccountBelongToCustomer(account, customer001);
        boolean second = searchingService.isIbanBelongToAccount(account, givenIban);
        boolean third = searchingService.isIbanBelongToCustomer(account, givenIban, customer001);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
