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
* addItem
* changeItemInfo

### [Books](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Book.java)
Subklasse von Media: Dient zur Erstellung von Büchern.
#### Methods
* 

### [CD](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/CD.java)
Subklasse von Media: Dient zur Erstellung von CDs und DVDs.
#### Methods
* 

## Testing
[Tests](Project_library/the_library/src/test/java)

### [Customer](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Customer.java)
Subklasse von User: Für Kunden der Bibliothek, die ein Buch reservieren möchten.
#### Methods
* rentMedia
* returnMedia
* list

### [Librarian](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Librarian.java)
Subklasse von User: Für die Bibliotekarinnen/Bibliotekaren, welches neue Bücher und CDs zum Reservieren hinzufügt.
#### Methods
* addItem
* changeItemInfo

### [Books](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/Book.java)
Subklasse von Media: Dient zur Erstellung von Büchern.
#### Methods
* 

### [CD](https://github.com/sraosha47/m226/blob/main/Project_library/the_library/src/main/java/model/CD.java)
Subklasse von Media: Dient zur Erstellung von CDs und DVDs.