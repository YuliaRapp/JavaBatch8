package com.syntax.reviewlass4;

public class Library {
    String name;
    Book books[];
    Student[] students;
    Librarian librarian;

    public Library(String name, Book[] books, Student[] students, Librarian librarian) {
        this.name = name;
        this.books = books;
        this.students = students;
        this.librarian = librarian;
    }

    void issueBook(Book bookVar,Student student,Librarian librarian){

        System.out.println("Checking for the availability of a book inside library");
        for (Book book:books
             ) {
            if(book.getISBN().equals(bookVar)){

                System.out.println("Book found checking if that is available or already issued ");
                if(bookVar.isAvailable()){
                    System.out.println("Book is available checking if student can have this book");
                    if(student.getBooks().length>=2){
                        System.out.println("Sorry you limit has exceeded");
                    }else {
                        System.out.println("Issuing the book");

                    }


                }else {
                    System.out.println("Book not available");
                }
            }else {
                System.out.println("Book does not exists in the library");
            }

        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}
