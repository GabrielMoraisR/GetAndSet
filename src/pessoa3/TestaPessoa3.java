package pessoa3;

public class TestaPessoa3 {

    public static void main(String[] args) {
        Pessoa3 X1 = new Pessoa3("Gabriel de Morais", 23, "morais.g99@gmail.com");
        Pessoa3 X2 = new Pessoa3();
        
        X2.setEmail("morais@1.com");
        X2.setNome("Gabriel");
        X2.setIdade(14);
        
        System.out.println(X1.getEmail());
        System.out.println(X1.getIdade());
        System.out.println(X1.getNome());
        System.out.println();
        
        System.out.println(X2.nome);
        System.out.println(X2.idade);
        System.out.println(X2.email);
       
    }
    
}
