synchronized (object) {
    if (<condition does not hold>) {
      object.wait();
    }
    // Proceed when condition holds
}