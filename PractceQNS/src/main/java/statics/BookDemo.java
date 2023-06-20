package statics;

public class BookDemo {
    public static void main(String[] args) {
        Book bk=new Book ("Networking","Johan",87);
        System.out.println ("this is my book author: "+bk.getBookAuthor ());
        System.out.println ("this is my book title: "+bk.getBoolTitle () );
        System.out.println ("this is my book Page: "+bk.getNumOfPage () );
    }
}
