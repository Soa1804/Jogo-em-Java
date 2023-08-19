import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Leitordearquivo {
    
    HashMap<String, personagem> lerpersonagem(String CaminhoArquivoPersonagem){

        HashMap<String, personagem> personagem = new HashMap<String, personagem>();
        File arquivoPersonagem = new File(CaminhoArquivoPersonagem);
        try 
        {
            Scanner escaneadordopersonagem = new Scanner(arquivoPersonagem, "UTF-8");

            String NomePersonagem = "";
            String linhaEscaneada = "";
            int Energia_1 = 0;
            int Energia_2 = 0;
            while(escaneadordopersonagem.hasNextLine()){
                while (!linhaEscaneada.equals("PERSONAGEM")) 
            {
                linhaEscaneada = escaneadordopersonagem.nextLine();
            }
            linhaEscaneada = escaneadordopersonagem.nextLine(); //Nome do Personagem:
            NomePersonagem = escaneadordopersonagem.nextLine();
            linhaEscaneada = escaneadordopersonagem.nextLine(); //Energia_1:
            Energia_1 = Integer.parseInt(escaneadordopersonagem.nextLine());
            linhaEscaneada = escaneadordopersonagem.nextLine(); //Energia_2:
            Energia_2 = Integer.parseInt(escaneadordopersonagem.nextLine());
            personagem.put(NomePersonagem,new personagem(NomePersonagem, Energia_1, Energia_2));
            }

            escaneadordopersonagem.close();
        }
         catch (FileNotFoundException exception)
         {
            exception.printStackTrace();
        }
        return personagem;
        
    }
    HashMap<String, capitulo> lercapitulos(String CaminhoArquivocapitulo,
                                        HashMap<String, personagem> personagem, 
                                        Scanner escaneadorConsole)
    {
        HashMap<String, capitulo> capitulos = new HashMap<String, capitulo>();
        File arquivocapitulos = new File(CaminhoArquivocapitulo);
        try 
        {
            Scanner escaneadordocapitulos = new Scanner(arquivocapitulos, "UTF-8");

            String NomeCapitulo = "";
            String TextoCapitulo = "";
            String NomePersonagem = "";
            int Variacao_Energia_1 = 0;
            int Variacao_Energia_2 = 0;
            String linhaEscaneada = "";

            while(escaneadordocapitulos.hasNextLine()){
                while (!linhaEscaneada.equals("CAPITULO") ||
                       !linhaEscaneada.equals("ESCOLHA")) 
            {
                linhaEscaneada = escaneadordocapitulos.nextLine();
            }
            if(!linhaEscaneada.equals("CAPITULO")){
                lerCapitulo(personagem,
                            escaneadorConsole,
                            capitulos,
                            escaneadordocapitulos);
            }
            else if(!linhaEscaneada.equals("ESCOLHA"))
            linhaEscaneada = escaneadordocapitulos.nextLine(); //Nome:
            NomeCapitulo = escaneadordocapitulos.nextLine();
            linhaEscaneada = escaneadordocapitulos.nextLine(); //TEXTO:
            TextoCapitulo = escaneadordocapitulos.nextLine();
            linhaEscaneada = escaneadordocapitulos.nextLine(); //Personagem:
            NomePersonagem = escaneadordocapitulos.nextLine();
            linhaEscaneada = escaneadordocapitulos.nextLine(); //Variação_de_Energia_1:
            Variacao_Energia_1 = Integer.parseInt(escaneadordocapitulos.nextLine());
            linhaEscaneada = escaneadordocapitulos.nextLine(); //Variação_de_Energia_2:
            Variacao_Energia_2 = Integer.parseInt(escaneadordocapitulos.nextLine());
            capitulos.put(NomeCapitulo,new capitulo(NomeCapitulo, 
                                                    TextoCapitulo, 
                                                    personagem.get(NomePersonagem),  
                                                    Variacao_Energia_1, 
                                                    Variacao_Energia_2, 
                                                    escaneadorConsole));
            }

            escaneadordocapitulos.close();
        }
         catch (FileNotFoundException exception)
         {
            exception.printStackTrace();
        }
        return capitulos;
    }
    private void lerCapitulo(HashMap<String, personagem> personagem,
                             Scanner escaneadorConsole,
                             HashMap<String, capitulo> capitulos,
                             Scanner escaneadordocapitulos) {
        String NomeCapitulo;
        String TextoCapitulo;
        String NomePersonagem;
        int Variacao_Energia_1;
        int Variacao_Energia_2;
        String linhaEscaneada;
        linhaEscaneada = escaneadordocapitulos.nextLine(); //Nome:
        NomeCapitulo = escaneadordocapitulos.nextLine();
        linhaEscaneada = escaneadordocapitulos.nextLine(); //TEXTO:
        TextoCapitulo = escaneadordocapitulos.nextLine();
        linhaEscaneada = escaneadordocapitulos.nextLine(); //Personagem:
        NomePersonagem = escaneadordocapitulos.nextLine();
        linhaEscaneada = escaneadordocapitulos.nextLine(); //Variação_de_Energia_1:
        Variacao_Energia_1 = Integer.parseInt(escaneadordocapitulos.nextLine());
        linhaEscaneada = escaneadordocapitulos.nextLine(); //Variação_de_Energia_2:
        Variacao_Energia_2 = Integer.parseInt(escaneadordocapitulos.nextLine());
        capitulos.put(NomeCapitulo,new capitulo(NomeCapitulo, 
                                                TextoCapitulo, 
                                                personagem.get(NomePersonagem),  
                                                Variacao_Energia_1, 
                                                Variacao_Energia_2, 
                                                escaneadorConsole));
    }
    private void lerEscolha(HashMap<String, capitulo> capitulos,
                            Scanner escaneadordocapitulos) {
        String NomeCapituloOrigem;
        String TextoEscolha;
        String NomeCapituloDestino;
        String linhaEscaneada;
        linhaEscaneada = escaneadordocapitulos.nextLine(); //CAPITULO DE ORIGEM:
        NomeCapituloOrigem = escaneadordocapitulos.nextLine();
        linhaEscaneada = escaneadordocapitulos.nextLine(); //TEXTO:
        TextoEscolha = escaneadordocapitulos.nextLine();
        linhaEscaneada = escaneadordocapitulos.nextLine(); //CAPITULO DE DESTINO:
        NomeCapituloDestino = escaneadordocapitulos.nextLine();

        capitulo capituloOrigem = capitulos.get(NomeCapituloOrigem);
        capitulo capituloDestino = capitulos.get(NomeCapituloDestino);
        capituloOrigem.(new Escolha(TextoEscolha, capituloDestino));
        capitulos.put(NomeCapitulo,new capitulo(NomeCapitulo, 
                                                TextoCapitulo, 
                                                personagem.get(NomePersonagem),  
                                                Variacao_Energia_1, 
                                                Variacao_Energia_2, 
                                                escaneadorConsole));
    }
}
