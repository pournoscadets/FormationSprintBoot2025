package formation.afiuna.springboot;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import formation.afiuna.springboot.domain.repositories.AccountRepository;
import formation.afiuna.springboot.domain.repositories.AddressRepository;
import formation.afiuna.springboot.domain.repositories.TransactionRepository;
import formation.afiuna.springboot.domain.repositories.UserRepository;

@SpringBootApplication
public class SpringbootApplication {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Bean
	public CommandLineRunner starter() {
			return args -> {

				// Address address = Address.builder()
				// .label("test")
				// .build();

				// addressRepository.save(address);

				userRepository.findById(1L)
				.ifPresent(u -> {
					u.setUsername("changeMyName"+new Random().nextInt());
					u.setAddress(addressRepository.findById(1L).orElseGet(null));
					userRepository.save(u);
				});

				addressRepository.findById(1L).ifPresent(System.out::println);

				userRepository.findById(1L).ifPresent(System.out::println);

				// userRepository.save(User.builder()
				// .username("admin"+new Random().nextInt())
				// .build());	

				
				// Create Account

				// Account account = Account.builder()
				// .accountNumber("123456789")
				// .balance(1000.0)
				// .user(userRepository.findById(1L).orElseGet(null))
				// .build();

				// accountRepository.save(account);

				accountRepository.findById(1L).ifPresent(System.out::println);

				// Create transaction
				// Transaction transaction = Transaction.builder()
				// .transactionIdentifier("123456789")
				// .amount(1000.0)
				// .transactionState(TransactionState.SUCCESS)
				// .description("test")				
				// .build();

				// transactionRepository.save(transaction);

				// Update account by adding a transaction

				// accountRepository.findById(1L).ifPresent(a -> {
				// 	a.getTransactions().add(transactionRepository.findById(1L).orElseGet(null));
				// 	accountRepository.save(a);
				// });
			};
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
