class Funcionarios{
  private String nome;
  private String atividade;


  public Funcionarios(String nome, String atividade){
    this.nome = nome;
    this.atividade = atividade;
  }
  
  public String getnome(){
    return nome;
  }

  public void setnome(String nome){
    this.nome = nome;
  }

  public String getatividade(){
    return atividade;
  }

  public void setatividade(String atividade){
    this.atividade = atividade;
  }

}