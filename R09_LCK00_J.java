public class SomeObject {
  private final Object lock = new Object(); // private final lock object
 
  public void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}
   
// Untrusted code
String name = // ...
SomeObject someObject = SomeObject.lookup(name);
if (someObject == null) {
    // ... handle error
}
synchronized (someObject) {
    while (true) {
      // Indefinitely lock someObject
      Thread.sleep(Integer.MAX_VALUE);
    }
}
