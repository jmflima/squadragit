import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    Funcionarios func1 = new Funcionarios();
    Funcionarios func2 = new Funcionarios();
    Funcionarios func3 = new Funcionarios();
    Funcionarios func4 = new Funcionarios();
    Funcionarios func5 = new Funcionarios();
    Funcionarios func6 = new Funcionarios();
    Funcionarios func7 = new Funcionarios();
    Funcionarios func8 = new Funcionarios();
    Funcionarios func9 = new Funcionarios();
    func1.setnome("Joao Lima");
    func1.setatividade("Cozinheiro");
    func2.setnome("Jose Alves");
    func2.setatividade("Copeiro");
    func3.setnome("Maria Lima");
    func3.setatividade("Garçonete");
    func4.setnome("Eduardo Souza");
    func4.setatividade("Cozinheiro");
    func5.setnome("Sandra Souza");
    func5.setatividade("Cozinheira");
    func6.setnome("Marcos Aurélio");
    func6.setatividade("Copeiro");
    func7.setnome("Carlos da Silva");
    func7.setatividade("Segurança");
    func8.setnome("Marcia Nunes");
    func8.setatividade("Copeira");
    func9.setnome("Mariana Carvalho");
    func9.setatividade("Arrumadeira");

    Ingredientes ing1 = new Ingredientes();
    Ingredientes ing2 = new Ingredientes();
    Ingredientes ing3 = new Ingredientes();
    Ingredientes ing4 = new Ingredientes();
    Ingredientes ing5 = new Ingredientes();
    Ingredientes ing6 = new Ingredientes();
    Ingredientes ing7 = new Ingredientes();
    Ingredientes ing8 = new Ingredientes();
    Ingredientes ing9 = new Ingredientes();
    Ingredientes ing10 = new Ingredientes();
    Ingredientes ing11 = new Ingredientes();
    Ingredientes ing12 = new Ingredientes();
    ing1.setnome("Macarrão");
    ing1.setvalidade("Validade: 02/01/2021");
    ing2.setnome("Alho");
    ing2.setvalidade("Validade: 03/01/2021");
    ing3.setnome("Azeite");
    ing3.setvalidade("Validade: 04/01/2021");
    ing4.setnome("Sal");
    ing4.setvalidade("Validade: 15/01/2021");
    ing5.setnome("Charque");
    ing5.setvalidade("Validade: 05/01/2021");
    ing6.setnome("Pimenta");
    ing6.setvalidade("Validade: 06/01/2021");
    ing7.setnome("Molho Tomate");
    ing7.setvalidade("Validade: 07/01/2021");
    ing8.setnome("Pé de porco");
    ing8.setvalidade("Validade: 08/01/2021");
    ing9.setnome("Calabreza");
    ing9.setvalidade("Validade: 09/01/2021");
    ing10.setnome("Feijão");
    ing10.setvalidade("Validade: 10/01/2021");
    ing11.setnome("Camarão seco");
    ing11.setvalidade("Validade: 11/01/2021");
    ing12.setnome("Azeite de Dendê");
    ing12.setvalidade("Validade: 12/01/2021");
    
    

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
    cozItalia.pratoPrincipal="Talharim";
    cozItalia.horaAbertura=10;
    cozItalia.horaFechamento=21;

    Cozinha cozBahia = new Cozinha();
    cozBahia.tipo = "Cozinha Bahiana";
    cozBahia.numeroCozinheiro=40;
    cozBahia.tempoPreparo=25;
    cozBahia.pratoPrincipal="Acarajé";
    cozBahia.setnumeroPratos(450);
    cozBahia.horaAbertura=13;
    cozBahia.horaFechamento=22;

    System.out.println(" ");
    System.out.println("****** Tipo: " + cozMinas.tipo.toUpperCase());
    System.out.println("Prato principal: " + cozMinas.getnumeroPratos());
    System.out.println("Funciona de " + cozMinas.horaAbertura + " às " + cozMinas.horaFechamento);
    System.out.println("Prato principal: " + cozMinas.pratoPrincipal);
    System.out.println("INGREDIENTES");
    System.out.println("   " + ing10.getnome() + " - " + ing10.getvalidade());
    System.out.println("   " + ing2.getnome() + " - " + ing2.getvalidade());
    System.out.println("   " + ing4.getnome() + " - " + ing4.getvalidade());
    System.out.println("   " + ing8.getnome() + " - " + ing8.getvalidade());
    System.out.println("   " + ing9.getnome() + " - " + ing9.getvalidade());
    System.out.println("FUNCIONÁRIOS");
    System.out.println("   " + func1.getnome() + " - " + func1.getatividade());
    System.out.println("   " + func2.getnome() + " - " + func2.getatividade());
    System.out.println("   " + func3.getnome() + " - " + func3.getatividade());

    System.out.println(" ");
    System.out.println("****** Tipo: " + cozItalia.tipo.toUpperCase());
    System.out.println("Número de pratos: " + cozItalia.getnumeroPratos());
    System.out.println("Funciona de " + cozItalia.horaAbertura + " às " + cozItalia.horaFechamento);
    System.out.println("Prato principal: " + cozItalia.pratoPrincipal);
    System.out.println("INGREDIENTES");
    System.out.println("   " + ing1.getnome() + " - " + ing1.getvalidade());
    System.out.println("   " + ing2.getnome() + " - " + ing2.getvalidade());
    System.out.println("   " + ing3.getnome() + " - " + ing3.getvalidade());
    System.out.println("FUNCIONÁRIOS");
    System.out.println("   " + func5.getnome() + " - " + func5.getatividade());
    System.out.println("   " + func8.getnome() + " - " + func8.getatividade());
    System.out.println("   " + func9.getnome() + " - " + func9.getatividade());
    
    System.out.println(" ");
    System.out.println("****** Tipo: " + cozBahia.tipo.toUpperCase());
    System.out.println("Número de pratos: " + cozBahia.getnumeroPratos());
    System.out.println("Funciona de " + cozBahia.horaAbertura + " às " + cozBahia.horaFechamento);
    System.out.println("Prato principal: " + cozBahia.pratoPrincipal);
    System.out.println("INGREDIENTES");
    System.out.println("   " + ing10.getnome() + " - " + ing10.getvalidade());
    System.out.println("   " + ing12.getnome() + " - " + ing12.getvalidade());
    System.out.println("   " + ing11.getnome() + " - " + ing11.getvalidade());
    System.out.println("   " + ing6.getnome() + " - " + ing6.getvalidade());
    System.out.println("FUNCIONÁRIOS");
    System.out.println("   " + func4.getnome() + " - " + func4.getatividade());
    System.out.println("   " + func6.getnome() + " - " + func6.getatividade());
    System.out.println("   " + func7.getnome() + " - " + func7.getatividade());
  }
}