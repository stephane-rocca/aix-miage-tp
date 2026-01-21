package fr.univ.amu.miage.m1.glq.tp.tp1.exo1;

public class GestionException {
  static class Exception1 extends Exception {}

  static class Exception2 extends Exception {
    public Exception2() {
      super("coucou");
    }
  }

  static class Exception3 extends Exception {
    public Exception3(String msg) {
      super(msg);
    }
  }

  static class Exception4 extends Exception {}

  private int valeur;

  public GestionException(int n) {
    valeur = n;
  }

  private void methode1() throws Exception1 {
    if (valeur == 1) throw new Exception1();
    System.out.println("Methode1");
  }

  private void methode2() throws Exception2 {
    if (valeur == 2) throw new Exception2();
    System.out.println("Methode2");
  }

  private void methode3() throws Exception3 {
    if (valeur == 3) throw new Exception3("Methode3");
    System.out.println("Methode3");
  }

  private void methode4() throws Exception4 {
    if (valeur == 1) throw new Exception4();
    System.out.println("Methode4");
  }

  private void methode5() throws Exception1 {
    throw new Exception1();
  }

  public void faire() {
    System.out.println("********** " + valeur + " **********");
    try {
      methode1();
      methode2();
      methode3();
      methode4();
      methode5();
    } catch (Exception1 e) {
      System.out.println("recuperation de Exception1 " + e);
    } catch (Exception2 e) {
      System.out.println("recuperation de Exception2 " + e);
    } catch (Exception3 | Exception4 e) {
      System.out.println("recuperation de Exception3 ou 4 " + e);
    } catch (Exception e) {
      System.out.println("code jamais atteint");
    } finally {
      System.out.println("finally");
    }
  }

  public static void main(String[] args) {
    new GestionException(1).faire();
    new GestionException(2).faire();
    new GestionException(3).faire();
    new GestionException(4).faire();
  }
}
