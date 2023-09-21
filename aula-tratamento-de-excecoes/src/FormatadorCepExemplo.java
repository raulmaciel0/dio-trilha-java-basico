public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1376504");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("O cep digitado é invalido");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "23.765-064";
    } 

}
