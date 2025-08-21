package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
	
	//here we will  create a repository for the Product class and the repository will hava int datatype
	
	

}
