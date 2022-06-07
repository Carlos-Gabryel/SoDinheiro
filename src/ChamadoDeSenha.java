public class ChamadoDeSenha {
    private FilaComLimite <Senha> chamados;

    public ChamadoDeSenha() {
        this.chamados = new FilaComLimite <Senha>(20);
    }
    public void criarSenha(Senha s){
        if(chamados.isFull()){
            System.out.println("Senha não pode ser criada, fila cheia!");
        }else{
            chamados.enqueue(s);
            System.out.println("Senha criada com sucesso");
        }
    }
    public void chamarSenha(){
        if(chamados.isEmpty()){
            System.out.println("Não há senhas para chamar");
        }else{
            System.out.println("Senha chamada: " + chamados.dequeue());
        }
    }
    
}
