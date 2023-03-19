package com.pablo.vega.similar.products.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pablo.vega.similar.products.domain.Product;
import com.pablo.vega.similar.products.domain.Tag;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EntityManager entityManager;

    @Autowired
    public DataInitializer(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
    	//tag creation
    	Tag springTag = new Tag("Spring", "Spring products");
    	Tag summerTag = new Tag("Summer", "Summer products");
    	Tag autumnTag = new Tag("Autumn", "Autumn products");
    	Tag winterTag = new Tag("Winter", "Winter products");

    	Tag pantsTag = new Tag("Pants", "Pants type product");
    	Tag tshirtTag = new Tag("T-shirt", "T-shirt type product");
    	Tag socksTag = new Tag("Socks", "Socks type product");
    	Tag jacketTag = new Tag("Jacket", "Jacket type product");
    	
    	entityManager.persist(springTag);
    	entityManager.persist(summerTag);
    	entityManager.persist(autumnTag);
    	entityManager.persist(winterTag);
    	
    	entityManager.persist(pantsTag);
    	entityManager.persist(tshirtTag);
    	entityManager.persist(socksTag);
    	entityManager.persist(jacketTag);
    	
    	//product creation
    	Product springPants = new Product("Spring pants", 29.90d, Boolean.TRUE);
    	List<Tag> springPantsTags = new ArrayList<>();
    	springPantsTags.add(pantsTag);
    	springPantsTags.add(springTag);
    	springPants.setTags(springPantsTags);
    	entityManager.persist(springPants);
    	
    	Product springTShirt = new Product("Spring t-shirt", 29.90d, Boolean.TRUE);
    	List<Tag> springTShirtTags = new ArrayList<>();
    	springTShirtTags.add(tshirtTag);
    	springTShirtTags.add(springTag);
    	springTShirt.setTags(springTShirtTags);
    	entityManager.persist(springTShirt);
    	
    	Product springSocks = new Product("Spring socks", 29.90d, Boolean.TRUE);
    	List<Tag> springSocksTags = new ArrayList<>();
    	springSocksTags.add(socksTag);
    	springSocksTags.add(springTag);
    	springSocks.setTags(springSocksTags);
    	entityManager.persist(springSocks);
    	
    	Product springJacket = new Product("Spring jacket", 29.90d, Boolean.TRUE);
    	List<Tag> springJacketTags = new ArrayList<>();
    	springJacketTags.add(jacketTag);
    	springJacketTags.add(springTag);
    	springJacket.setTags(springJacketTags);
    	entityManager.persist(springJacket);
    	
    	Product summerPants = new Product("Summer pants", 29.90d, Boolean.TRUE);
    	List<Tag> summerPantsTags = new ArrayList<>();
    	summerPantsTags.add(pantsTag);
    	summerPantsTags.add(summerTag);
    	summerPants.setTags(summerPantsTags);
    	entityManager.persist(summerPants);
    	
    	Product summerTShirt = new Product("Summer t-shirt", 29.90d, Boolean.TRUE);
    	List<Tag> summerTShirtTags = new ArrayList<>();
    	summerTShirtTags.add(tshirtTag);
    	summerTShirtTags.add(summerTag);
    	summerTShirt.setTags(summerTShirtTags);
    	entityManager.persist(summerTShirt);
    	
    	Product summerSocks = new Product("Summer socks", 29.90d, Boolean.TRUE);
    	List<Tag> summerSocksTags = new ArrayList<>();
    	summerSocksTags.add(socksTag);
    	summerSocksTags.add(summerTag);
    	summerSocks.setTags(summerSocksTags);
    	entityManager.persist(summerSocks);
    	
    	Product summerJacket = new Product("Summer jacket", 29.90d, Boolean.TRUE);
    	List<Tag> summerJacketTags = new ArrayList<>();
    	summerJacketTags.add(jacketTag);
    	summerJacketTags.add(summerTag);
    	summerJacket.setTags(summerJacketTags);
    	entityManager.persist(summerJacket);
    	
    	Product autumnPants = new Product("Autumn pants", 29.90d, Boolean.TRUE);
    	List<Tag> autumnPantsTags = new ArrayList<>();
    	autumnPantsTags.add(pantsTag);
    	autumnPantsTags.add(autumnTag);
    	autumnPants.setTags(autumnPantsTags);
    	entityManager.persist(autumnPants);
    	
    	Product autumnTShirt = new Product("Autumn t-shirt", 29.90d, Boolean.TRUE);
    	List<Tag> autumnTShirtTags = new ArrayList<>();
    	autumnTShirtTags.add(tshirtTag);
    	autumnTShirtTags.add(autumnTag);
    	autumnTShirt.setTags(autumnTShirtTags);
    	entityManager.persist(autumnTShirt);
    	
    	Product autumnSocks = new Product("Autumn socks", 29.90d, Boolean.TRUE);
    	List<Tag> autumnSocksTags = new ArrayList<>();
    	autumnSocksTags.add(socksTag);
    	autumnSocksTags.add(autumnTag);
    	autumnSocks.setTags(autumnSocksTags);
    	entityManager.persist(autumnSocks);
    	
    	Product autumnJacket = new Product("Autumn jacket", 29.90d, Boolean.TRUE);
    	List<Tag> autumnJacketTags = new ArrayList<>();
    	autumnJacketTags.add(jacketTag);
    	autumnJacketTags.add(autumnTag);
    	autumnJacket.setTags(autumnJacketTags);
    	entityManager.persist(autumnJacket);
    	    	
    	Product winterPants = new Product("Winter  pants", 29.90d, Boolean.TRUE);
    	List<Tag> winterPantsTags = new ArrayList<>();
    	winterPantsTags.add(pantsTag);
    	winterPantsTags.add(winterTag);
    	winterPants.setTags(winterPantsTags);
    	entityManager.persist(winterPants);
    	
    	Product winterTShirt = new Product("Winter t-shirt", 29.90d, Boolean.TRUE);
    	List<Tag> winterTShirtTags = new ArrayList<>();
    	winterTShirtTags.add(tshirtTag);
    	winterTShirtTags.add(winterTag);
    	winterTShirt.setTags(winterTShirtTags);
    	entityManager.persist(winterTShirt);
    	
    	Product winterSocks = new Product("Winter socks", 29.90d, Boolean.TRUE);
    	List<Tag> winterSocksTags = new ArrayList<>();
    	winterSocksTags.add(socksTag);
    	winterSocksTags.add(winterTag);
    	winterSocks.setTags(winterSocksTags);
    	entityManager.persist(winterSocks);
    	
    	Product winterJacket = new Product("Winter jacket", 29.90d, Boolean.TRUE);
    	List<Tag> winterJacketTags = new ArrayList<>();
    	winterJacketTags.add(jacketTag);
    	winterJacketTags.add(winterTag);
    	winterJacket.setTags(winterJacketTags);
    	entityManager.persist(winterJacket);    	
    }

}
