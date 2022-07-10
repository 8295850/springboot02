package com.study.dao;

import com.study.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id  = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();

    @Update("update tbl_book  set name = #{name} where id = #{id}}")
    public int Update(Book book);


}
