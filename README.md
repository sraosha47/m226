# m226
Repository von Sorusch Afkhami, Leon Kurtaj und Wesam Awelkir für das Modul 226 Objektorientiertes Programmieren. 

# Dokumentation
*[Diagramme](Dokumentation/diagrams)
*[Bilder](Dokumentation/pictures)

# Library


## [Models](https://github.com/sraosha47/m226/tree/main/Project_library/the_library/src/main/java/model)

### [User](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/User.java)
Abstrakte Klasse, welche den Benutzer, der unsere Library-App verwendet, definiert.
#### Methods
* LogIn
* CreateAccount
* ChangePassword
* CheckAccount

### [Media](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Media.java)
Abstrakte Klasse, welche die Medien, wie zum Beispiel ein Buch oder eine CD,definiert. Es zeigt auch an, ob die Medien auch deren Verfügbarkeit.
#### Methods
* info
* getOwner
* setOwner
* getAvailable
* switchAvailability
* getDescription
* setDescription
* setTimestamp

### [Customer](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Customer.java)
Subklasse von User: Für Kunden der Bibliothek, die ein Buch reservieren möchten.
#### Methods
* rentMedia
* returnMedia
* list

### [Librarian](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Librarian.java)
Subklasse von User: Für die Bibliotekarinnen/Bibliotekaren, welches neue Bücher und CDs zum Reservieren hinzufügt.
#### Methods
* addMedia
* changeMediaInfo

### [Library](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Library.java)
Eine Arrayliste für alle vorhandenen Medien in der Bibliothek
#### Methods
* getInstance
* addMedium
* listMedia

### [Books](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Book.java)
Subklasse von Media: Dient zur Erstellung von Büchern.
#### Methods
* getIsbn
* info

### [CD](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/CD.java)
Subklasse von Media: Dient zur Erstellung von CDs und DVDs.
#### Methods
* getArtist
* info

## Testing


### [Booktests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/BookTests.java)
* public void testBookInfo()
    Wanted but not invoked:
book.getTitle();
-> at model.Media.getTitle(Media.java:17)
* public void testBookSwitchAvailability()
Process finished with exit code 0
* public void testBookSetTimestamp()
Process finished with exit code 0
* public void testBookCreation()
Process finished with exit code 0

### [CdTests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/CdTests.java)
* public void testCdInfo
Wanted but not invoked:
cd.getTitle();
-> at model.Media.getTitle(Media.java:17)

### [Customertests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/CustomerTests.java)
* public void testRentMedia()
Process finished with exit code 0
* public void testReturnMedia()
Process finished with exit code 0

### [LibrarianTests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/LibrarianTests.java)
* public void testAddMedia()
Wanted but not invoked:
arrayList.add(
    Mock for Media, hashCode: 290509937
);
* public void testChangeMediaInfo()
Wanted but not invoked:
arrayList.contains(
    Mock for Media, hashCode: 290509937
);

### [LibraryTests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/LibraryTests.java)
* public void testListMedia()
Process finished with exit code 0

### [UserTests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/UserTests.java)
* public void testGetFullname()
Wanted but not invoked:
user.getFirstname();
-> at model.User.getFirstname(User.java:23)

### [MediaTests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/MediaTests.java)
* public void testMediaMethods()
Process finished with exit code 0

### [MainTests](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/test/java/model/MainTests.java)
*  public void testRentMediaAndReturnMedia()
java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because the return value of "model.Media.getOwner()" is null