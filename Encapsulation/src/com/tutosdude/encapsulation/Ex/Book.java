package com.tutosdude.encapsulation.Ex;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;
    private String bookGenre;
    private double bookPrice;
    private String publicationDate;
    private int numberOfPages;
    private String language;
    private String publisher;
    private String edition;

    private boolean isAvailable;
    private String shelfNumber;
    private int rackId;

    private int borrowedCount;
    private String dueDate;
    private double fineAmount;

    // User-related variables
    private int userId;
    private String userName;
    private String userEmail;
    private long userPhone;
    private String membershipType;

    private String borrowDate;
    private String returnDate;
    private int overdueDays;
    private String finePaid;

    //getter

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public String getBookISBN(){
        return bookISBN;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public double getBookPrice() {
        return bookPrice;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getLanguage(){
        return language;
    }
    public String getPublisher(){
        return  publisher;
    }
    public String getEdition(){
        return edition;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public String getShelfNumber() {
        return shelfNumber;
    }
    public double getFineAmount() {
        return fineAmount;
    }
    public int getRackId() {
        return rackId;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public long getUserPhone() {
        return userPhone;
    }
    public String getMembershipType(){
        return membershipType;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
    public String getReturnDate(){
        return returnDate;
    }

    public int getOverdueDays() {
        return overdueDays;
    }
    public String getFinePaid(){
        return finePaid;
    }

    //setter
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
    public void setBookISBN(String bookISBN){
        this.bookISBN = bookISBN;
    }
    public void setBookGenre(String bookGenre){
        this. bookGenre = bookGenre;
    }
    public void setBookPrice(double bookPrice){
        this.bookPrice = bookPrice;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setLanguage(String language){
        this.language = language;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setShelfNumber(String shelfNumber){
        this.shelfNumber = shelfNumber;
    }
    public void setRackId(int rackId){
        this.rackId = rackId;
    }

    public void setBorrowedCount(int borrowedCount) {
        this.borrowedCount = borrowedCount;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public void setFinePaid(String finePaid) {
        this.finePaid = finePaid;
    }

}

