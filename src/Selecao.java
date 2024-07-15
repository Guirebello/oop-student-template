public class Selecao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a != b){
            System.out.println("a == b");
        }

        String nomeDia = null;
        int dia = 4;

        switch (dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        
        System.out.println(nomeDia.toUpperCase());
        System.out.println("O dia é: " + nomeDia);
        
    }
    
}
