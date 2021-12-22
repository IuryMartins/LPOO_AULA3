public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setCor("PRETO");
        c.setTipo("PASSEIO");
        c.setPlacas("GGG-1111");
        c.setNumPortas(4);

        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("Pedro","Loiro","Gordo",45);
        Carro c2 = new Carro("Branco","Passeio","GGG-0000",2,p2);
        c.setDono(p2);
        p.setNome("João");
        p.setCorDoCabelo("Castanho");
        p.setBiotipo("Magro");
        p.setIdade(25);
        c.setDono(p);

        System.out.println("-----CARRO-----");
        System.out.println("COR: " + c.getCor());
        System.out.println("TIPO: " + c.getTipo());
        System.out.println("PLACAS: " + c.getPlacas());
        System.out.println("PORTAS: " + c.getNumPortas());
        System.out.println("DONO: " + c.getDono().getNome());

        System.out.println("-----CARR02-----");
        System.out.println("COR: " + c2.getCor());
        System.out.println("TIPO: " + c2.getTipo());
        System.out.println("PLACAS: " + c2.getPlacas());
        System.out.println("PORTAS: " + c2.getNumPortas());
        System.out.println("DONO: " + c2.getDono().getNome());

    }
}
