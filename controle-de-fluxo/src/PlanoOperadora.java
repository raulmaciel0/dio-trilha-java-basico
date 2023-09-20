public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        switch (plano){
            case "T": {
                System.out.println("5GB Youtube");
                break;
            }

            case "M": {
                System.out.println("Whatsapp e instagram gratis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }

            default: {
                System.out.println("Plano inexistente");
                break;
            }
        }
    }   
}
