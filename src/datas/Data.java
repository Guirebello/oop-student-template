package datas;

public class Data {
    int dia;
    int mes;
    int ano;

    // metodos
    
    //construtor
    public Data(int dia, int mes, int ano){
        if (dia < 1 || dia > 31){
            throw new IllegalArgumentException("Dia fora do intervalo válido");
        }
        if (mes < 1 || mes > 12){
            throw new IllegalArgumentException("Mês fora do intervalo válido");
        }
        if (ano < 0){
            throw new IllegalArgumentException("Ano fora do intervalo válido");
        }

        // testar meses com 31 dias
        // testar meses com 30 dias
        // testar fevereiro
    }

    static boolean bissexto(int ano){
        if(ano < 0){
            throw new IllegalArgumentException("Ano fora do intervalo válido");
        }

        // se não é divisivel por 4, não é bissexto
        if(ano % 4 != 0){
            return false;
        }

        // divisivel por 4, mas não por 100, é bissexto
        if(ano % 100 != 0){
            return true;
        }

        // divisivel por 100 e 400
        if(ano % 400 == 0){
            return true;
        }

        return false;
    }

}
