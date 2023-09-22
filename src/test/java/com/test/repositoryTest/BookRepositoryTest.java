package com.test.repositoryTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.models.Book;
import com.test.repositories.BookRepository;


@SpringBootTest
class BookRepositoryTest {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	void testFindByName() {
		String expectedBookName="spring";
		
		Book found_book=bookRepository.findByName("java");
		String actulBookName=found_book.getName();
		
		assertEquals(expectedBookName, actulBookName);
		
		
	}

}
