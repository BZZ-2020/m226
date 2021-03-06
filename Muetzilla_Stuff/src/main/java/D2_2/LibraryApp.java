package D2_2;

/**
  Hier werden alle ben�tigten Objekte erstellt
  <p>
     <ul>
         <li>theLibrary : Library (die Bibliothek)</li>
         <li>max        : Librarian (der Bibliothekar)</li>
         <li>moritz     : Customer (ein Kunde)</li>
         <li>ursula     : Customer (eine Kundin)</li>
     </ul>
  </p>
  
  <p>Das "Drehbuch" wird gem�ss Sequenzdiagramm der Aufgabenstellung
  implementiert.<br>
  Dazu braucht es auch Anpassungen in den Klassen
  <ul>
      <li>Librarian</li>
      <li>Customer</li>
  </ul>
  Die Klassen Library und Book m�ssen nicht bearbeitet werden.
  
  @Author:   bitte Namen erg�nzen
  @Date:     aktuelles Bearbeitungsdatum eintragen
  @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class LibraryApp{
  
  
  /* 
  Hier den Ablauf implementieren
  */
  public static void main(String[] args){
    // -------------
    // Teilauftrag 1
    // -------------
    Library library = new Library();
    Librarian max =  new Librarian(library);
    Customer moritz = new Customer("Moritz", max);
    Customer ursula = new Customer("Ursula", max);
    // -------------
    // Teilauftrag 2
    // -------------
    System.out.println("Der Bibliothekar kauft neue B�cher und stellt diese in die Bibliothek");
    for (int i = 0; i < 5; i++) {
      max.buyNewBook("Buch" + i, String.valueOf(i));
    }
    // -------------
    // Teilauftrag 3
    //--------------
    System.out.println("\n\nEs erfolgen Ausleihen");
    library.printInventory();
    moritz.borrow_aBookByTitle("Buch0");
    library.printInventory();
    ursula.borrow_aBookByTitle("Buch1");
    // -------------
    // Teilauftrag 4
    // -------------
       System.out.println("\n\nKundin "+ursula.getName()+" bringt ein Buch zur�ck");
    ursula.bringBackABook();
    library.printInventory();
    // Ein Kunde wird gemahnt und bringt dann sein Buch zur�ck
    System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
    max.remindCustomer(moritz);
    library.printInventory();
    // -------------
    // Teilauftrag 5:
    // --------------
    System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
    max.removeBook("Buch2");
    library.printInventory();
    
  }
}