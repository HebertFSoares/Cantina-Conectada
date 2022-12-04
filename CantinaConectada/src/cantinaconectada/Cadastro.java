package cantinaconectada;


public class Cadastro {
    private String nome;
    private boolean email;
    private String senha;
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getEmail() {
        return email;
    }

    public String setEmail(String email) {
        if(this.email = email.endsWith("ubec.br")){
            System.out.println("Email Cadastrado");
            
        }else{
            System.out.println("Email nao cadastrado");
        }
        return null;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String confirmas(String confirmas){
        if(confirmas != senha){
            System.out.println("As senhas não coincidem!");
        }else{
            System.out.println("Senha cadastrada com sucesso!");
        }
        return confirmas;
    }

    
    
}
