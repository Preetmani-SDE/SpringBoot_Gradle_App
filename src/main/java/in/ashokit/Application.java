 package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args); 
		
		//we get the object of the repository using the getBean method
		
		ProductRepository repositoryObject = context.getBean(ProductRepository.class);
		
		//inserting an object using the save method in the table
		
		
		Product productObject = new Product();
		productObject.setProductName("Rajdllllllllloot");
		productObject.setProductPrice(201.876);
		
		repositoryObject.save(productObject);
		
		System.out.println("Product Inserted");
		
	}
	}

