package com.pages;

import Pages.BookStorepage;
import baseclass.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookShopTest extends BaseClass {
    public BookStorepage bookStorepage;

    public BookShopTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        bookStorepage = new BookStorepage();
    }

    @Test
    public void bookSearchTest() throws InterruptedException {
        bookStorepage.bookSearch(properties.getProperty("bookname"));

    }
}
