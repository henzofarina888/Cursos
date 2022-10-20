package modulo1;

public class cachorroTeste {

    public static void main(String[]args){
        cachorro beagle = new cachorro();
        beagle.sexo =  "macho";
        beagle.raca = "Beagle";
        beagle.tamanho= 39;
        beagle.peso = 10;
        beagle.latir();
        beagle.pular();
        beagle.comer();
    }
}
