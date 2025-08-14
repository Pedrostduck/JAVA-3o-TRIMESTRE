public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana=1;
        String nomeDoDia;
        switch (diaDaSemana) {
            case 1:nomeDoDia="Domingo";
            case 2:
                nomeDoDia = "segunda";
                case 3:
                nomeDoDia = "terça";
                case 4:
                nomeDoDia = "quarta";
                case 5:
                nomeDoDia = "quinta";
                case 6:
                nomeDoDia = "sexta";
                case 7:
                nomeDoDia = "sabado";
                
                break;
        
            default:nomeDoDia="dia inválido";
                break;
        }
        System.out.println(nomeDoDia);
    }
}
