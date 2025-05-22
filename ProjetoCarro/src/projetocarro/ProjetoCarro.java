package projetocarro;


public class ProjetoCarro {
    

    public static void main(String[] args) {

        
        Carro c1 = new Carro();
        c1.nome = "UNO";
        c1.marca = "FIAT";
        c1.ano = 2015;
        c1.vel = 120;
        
        c1.acelerar(20);
        System.out.println("Velocidade: "+c1.vel+" KM");
        c1.freiar(45);
        System.out.println("Velocidade Apos Freio: "+c1.vel+" km");
        
        c1.buzinar();
        
        
        
        
        System.out.println("====================================================");
        
        
        
        
        
                Moto c2 = new Moto();
        c2.nome_moto = "CG 160";
        c2.marca_moto = "Honda";
        c2.preço = 21000;
        c2.vel_moto = 150;
        
        c2.acelerar_pouco(50);
        System.out.println("Velocidade da moto depois de pequena aceleracao: "+c2.vel_moto+" KM");
        
        c2.acelerar_muito(100);
        System.out.println("Velocidade da moto depois de grande aceleracao: "+c2.vel_moto+" KM");
        
        c2.freiar_moto(40);
        System.out.println("Velocidade Apos Freio: "+c2.vel_moto+" km");
        
        c2.empinar();
    }
    
       
    
}
