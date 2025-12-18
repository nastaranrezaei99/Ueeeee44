package ballsportverein.trikots; 
   
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.*; 
   
class TrikotTest { 
   
 private Trikot trikot; 
 
     
 
  2 
 @AfterEach 
 void tearDown() throws Exception { 
  this.trikot = null; 
 } 
  
 @Test  
 void testTrikot() { 
  this.trikot = new Trikot(1, 42, 49.90, 20240701); 
  // Trikotnummer groesser als 0 
  assertTrue(() -> this.trikot.getTrikotnummer() == 1,  
   "Die Trikotnummer wurde nicht richtig gesetzt."); 
  // Groesse groesser als 0 
  assertTrue(() -> this.trikot.getGroesse() == 42,  
   () -> "Die Trikotnummer wurde nicht richtig gesetzt."); 
  // Trikotnummer kleiner oder gleich 0 
  Throwable exc = assertThrows(IllegalArgumentException.class,  
            () -> {new Trikot(-1, 40, 29.99, 20220919);}); 
  assertEquals("Die Trikotnummer darf nicht 0 oder negativ sein.",  
   exc.getMessage()); 
 } 
} 