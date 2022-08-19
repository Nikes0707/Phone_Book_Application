package com.NikheelIT.Phone_Book_Application.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NikheelIT.Phone_Book_Application.Model.PhoneBook;

public interface PhoneBookRepositry extends JpaRepository<PhoneBook, Integer> {

}
