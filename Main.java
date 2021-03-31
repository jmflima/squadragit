import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

//  String listMinas[][] = new String[3][3];

    ArrayList listMinas = new ArrayList();

    Funcionarios func1 = new Funcionarios("Joao", "Cozinheiro");

  //  func.setnome("Joao");
  //  func.setatividade("Cozinheiro");
//    listMinas.addAll(Arrays.asList(func1));
    listMinas.add(func1);
  //  func.setnome("Maria Alves");
  //  func.setatividade("Garçonete");
  //  listMinas.addAll(func);
  //  func.setnome("Carlos Costa");
  //  func.setatividade("Copeiro");
  //  listMinas.addAll(func);
//    System.out.println("Total: " + listMinas.size());
    System.out.println(listMinas.get(0));


    Cozinha cozMinas = new Cozinha();
    cozMinas.tipo = "Cozinha Mineira";
    cozMinas.numeroCozinheiro=10;
    cozMinas.tempoPreparo=40;
    cozMinas.setnumeroPratos(60);
    cozMinas.pratoPrincipal="Feijoada";
    cozMinas.horaAbertura=14;
    cozMinas.horaFechamento=20;

    Cozinha cozItalia = new Cozinha();
    cozItalia.tipo = "Cozinha Italiana";
    cozItalia.numeroCozinheiro=20;
    cozItalia.tempoPreparo=30;
    cozItalia.setnumeroPratos(20);
    cozItalia.horaAbertura=10;
    cozItalia.horaFechamento=21;

    Cozinha cozBahia = new Cozinha();
    cozBahia.tipo = "Cozinha Bahiana";
    cozBahia.numeroCozinheiro=40;
    cozBahia.tempoPreparo=25;
    cozBahia.setnumeroPratos(450);
    cozBahia.horaAbertura=13;
    cozBahia.horaFechamento=22;

    System.out.println("****** Tipo: " + cozMinas.tipo);
    System.out.println("Número de pratos: " + cozMinas.getnumeroPratos());
    System.out.println("Funciona de " + cozMinas.horaAbertura + " às " + cozMinas.horaFechamento);

    System.out.println("****** Tipo: " + cozItalia.tipo);
    System.out.println("Número de pratos: " + cozItalia.getnumeroPratos());
    System.out.println("Funciona de " + cozItalia.horaAbertura + " às " + cozItalia.horaFechamento);
    
    System.out.println("****** Tipo: " + cozBahia.tipo);
    System.out.println("Número de pratos: " + cozBahia.getnumeroPratos());
    System.out.println("Funciona de " + cozBahia.horaAbertura + " às " + cozBahia.horaFechamento);
  }
}