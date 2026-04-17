package com.pluralsight;

  public class Book {

      private int id;
      private String isbn, title, checkedOutTo;
      private boolean isCheckedOut;

      public Book(boolean isCheckedOut, String checkedOutTo, String title, String isbn, int id) {
          this.isCheckedOut = isCheckedOut;
          this.checkedOutTo = checkedOutTo;
          this.title = title;
          this.isbn = isbn;
          this.id = id;
      }

      public void checkOut(String name) {
          this.checkedOutTo = name;
          this.isCheckedOut = true;

      }

      public void checkIn() {
          this.checkedOutTo = "";
          this.isCheckedOut = false;
      }

      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public String getIsbn() {
          return isbn;
      }

      public void setIsbn(String isbn) {
          this.isbn = isbn;
      }

      public String getTitle() {
          return title;
      }

      public void setTitle(String title) {
          this.title = title;
      }

      public String getCheckedOutTo() {
          return checkedOutTo;
      }

      public void setCheckedOutTo(String checkedOutTo) {
          this.checkedOutTo = checkedOutTo;
      }

      public boolean isCheckedOut() {
          return isCheckedOut;
      }

      public void setCheckedOut(boolean checkedOut) {
          isCheckedOut = checkedOut;
      }
  }

