public class ProfissionalMain {

    public static void main(String[] args) {

    Profissional profissional = new Profissional();
    
    profissional.idPublic = 1;
    profissional.trabalharPublic();
    profissional.salarioProtected = 1320.0;
    profissional.setId(13);

    System.out.println(profissional.salarioProtected);
    System.out.println(profissional.getId());
    
    }
}
