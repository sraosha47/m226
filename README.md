# m226
Repository von Sorusch Afkhami, Leon Kurtaj und Wesam Awelkir für das Modul 226 Objektorientiertes Programmieren. 

# Dokumentation
[Dokumentation](Dokumentation/diagrams)

# Library


## Classes

### [User](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/User.java)
Abstrakte Klasse, welches den Benutzer, die unsere Library-App verwendet, definiert.
#### Methods
* LogIn
* CreateAccount
* ChangePassword
* CheckAccount

### [Media](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Media.java)
Abstrakte Klasse, welches die Medien, wie zum Beispiel in Buch oder CD,definiert. Es zeigt auch an, ob die Medien auch bestellbar sind.
#### Methods
* 

### [Customer](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Customer.java)
Subklasse von User: Für Kunden der Bibliothek, die ein Buch reservieren möchten.
#### Methods
* reserveMedia
* browseMedia
* browseRentedMedia

### [Librarian](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Librarian.java)
Subklasse von User: Für die Bibliotekarinnen/Bibliotekaren, welches neue Bücher und CDs zum Reservieren hinzufügt.
#### Methods
* addItem
* changeItemInfo
* implentInDB

### [Books](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Book.java)
Subklasse von Media: Dient zur Reservierung von Büchern.
#### Methods
* 

### [CD](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/CD.java)
Subklasse von Media: Dient zur Reservierung von CDs und DVDs.
#### Methods
* 

## Testing
[Tests](Project_library/the_library/src/test/java)

