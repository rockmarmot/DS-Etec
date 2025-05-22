
package projetocarro;

public class Moto {
    
    String  nome_moto ;
    String  marca_moto;
    int preço;
    int vel_moto;

    void acelerar_pouco(int aceleracao){
        vel_moto+=aceleracao;
    }
    
        void acelerar_muito(int aceleracao_M){
        vel_moto+=aceleracao_M;
    }
    
    void freiar_moto(int reduzir){
        vel_moto-=reduzir;
    }
    
    void empinar(){
        System.out.println("Moto empinando");
    }
}

