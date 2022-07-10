package com.study;

import com.study.dao.BookDao;
import com.study.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot02ApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        Book byId = bookDao.getById(40);
        System.out.println(byId);
        List<Book> all = bookDao.getAll();
        System.out.println(all);
//        List<Book> all = bookDao.getAll();
//        System.out.println(all);
    }

}
