import java.util.Scanner;

public class Jogo2 {
    public static void main(String[] args){
    System.out.println("Diga o nome do seu personagem: ");
    Scanner resposta = new Scanner(System.in);
    personagem principal1 = new personagem(resposta.nextLine());
    personagem Phillipy = new personagem("Phillipy");
    String cap1J = "INTRODUÇÃO "+principal1.Nome()+":"+principal1.Nome()+" é um presidiário da penitenciária de segurança máxima de veridium, "+
    "onde trabalha na parte de metalúrgica dela, ele está preso por roubo ao banco central da cidade Serenópolis "+
    "junto com alguns parceiros como Kenny, porém por um deslize de "+principal1.Nome()+" todos acabaram presos. Mas na noite do"+
    " dia 28 de outubro de 1995, "+principal1.Nome()+" está pensando se ele deve tentar fugir de uma vez por todas ou continuar"+
    "ali até a sua sentença ser completa. O Que você decide fazer?";
    
    String cap2J = "Você decide sair e decide colocar seu plano em prática na manhã seguinte."+"Durante a manhã do dia 29, "+principal1.Nome()+""+
    "se encontra no refeitório e isso acaba lhe dando uma ideia, ele decide pegar duas colheres para usar uma para fabricar uma chave"+
    " para sair de sua sela. Após passar na mesa onde Kenny estava, esse o atacou, o que "+principal1.Nome()+" deve fazer?";

    String cap3J = ""+principal1.Nome()+" decide apenas cumprir sua sentença, porém já com seus 45 anos"+
    " e sua sentença sendo de 50 anos, "+principal1.Nome()+" acabou falecendo na prisão. (final 1)";

    String cap4J = "Kenny pega a faca que estava na mão e esfaqueia "+principal1.Nome()+" até a morte.(Final 2)";

    String cap5J = ""+principal1.Nome()+" resolve sentar bem longe de Kenny, e com isso senta em uma mesa vazia"+
    " e após isso outro presidiário senta junto dele, "+Phillipy.Nome()+"."+principal1.Nome()+" conversa com "+Phillipy.Nome()+""+
    "e esse o revela que não aguenta mais essa prisão."+principal1.Nome()+" conta para "+Phillipy.Nome()+" seu plano?";

    String cap6J = ""+Phillipy.Nome()+" gosta da ideia e propõe ambos se juntarem para saírem da prisão. Após ouvir as ideias de"+
    ""+Phillipy.Nome()+", "+principal1.Nome()+" deve decidir se irá se aliar a ele ou não. O que fazer?";

    String cap7J = ""+principal1.Nome()+" recusa o pedido de "+Phillipy.Nome()+" e fracassa na sua fuga da prisão e é detido"+
    "e pega mais 50 anos a mais.(final 4)";

    String cap8J = ""+principal1.Nome()+" decidiu se aliar a "+Phillipy.Nome()+" e isso fez com que ambos conseguissem bolar"+
    "um plano melhor para saírem da prisão.";

    String cap9J = "Na noite do dia 29 ao tentar sair sem a ajuda de outra pessoa, "+principal1.Nome()+" é pego"+
    "pelos guardas e é separado dos outros presos.(Final 3)";
//_________________________________________________________________________________________________________________________________________
    String cap1P = "INTRODUÇÃO "+Phillipy.Nome()+": "+Phillipy.Nome()+" é outro detento presidiário da penitenciária"+
    " de segurança máxima de veridium, trabalha na parte da prisão que cria placas para carros, e já"+
    " faz um bom tempo que ele vem pensando em fugir. O Motivo dele está ali é o sequestro da filha de"+
    " um cara rico. Após a chegada do dia 29 de outubro de 1995, na manhã desse dia os presos devem se"+
    "dirigir ao refeitório, porém "+Phillipy.Nome()+" pensa se deve ir para o refeitório ou tentar fugir pela"+
    "lavanderia onde ele sabe que há um duto de ventilação que dá do lado de fora da prisão.";

    String cap2P = "Ao chegar no refeitório ele vê que um detento   "+principal1.Nome()+" está sendo provocado,"+
    "e por saber que "+principal1.Nome()+" sabe muito de chaves pois ele era assaltante de bancos, decide fazer "+
    "amizade com ele. "+principal1.Nome()+" deve decidir se ele espera "+principal1.Nome()+" tomar uma providência ou se ele deve"+
    "atacar Kenny e defender "+principal1.Nome()+".";

    String cap3P = ""+Phillipy.Nome()+" é pego pelos policiais e é jogado na solitária durante 2 meses. (Final 1)";

    String cap4P = "Após vê que "+principal1.Nome()+" decidiu ignorar Kenny e se sentar em uma mesa distante, ele vai até lá."+
    "Durante o caminho Kenny o para e pergunta o que ele estava olhando durante a discursão, "+Phillipy.Nome()+" manda ele se"+
    "ferrar ou pede desculpas e segue em frente?";

    String cap5P = "Após atacar Kenny eles começam uma briga e isso acaba chamando a atenção"+
    "dos que acabam levando os dois para a solitária por um longo período. (Final 2)";

    String cap6P = "Ele pede desculpas e segui para a mesa de "+principal1.Nome()+". Após seguir em frente, ele senta na mesa de"+
    ""+principal1.Nome()+", "+principal1.Nome()+" acaba "+"contando o seu plano, "+Phillipy.Nome()+" deve chamar"+
    ""+principal1.Nome()+" para fugirem juntos?";

    String cap7P = "Por não decidir chamar "+principal1.Nome()+", o plano de "+Phillipy.Nome()+" se saí muito bem, e esse"+
    "acaba se dando muito mal.(final 3)";

    String cap8P = ""+Phillipy.Nome()+" chama "+principal1.Nome()+" para saírem daquela cadeia juntos";
    
    String cap9P = "Por não decidir chamar "+principal1.Nome()+", o plano de "+Phillipy.Nome()+" se saí muito bem, e esse acaba "+
    "se dando muito mal.(final 3)";
//------------------------------------------------------------------------------------------------------------------------------
    String escolha1_cap1J = "fica";
    String escolha2_cap1J = "foge";

    String escolha1_cap2J = "vai para cima dele";
    String escolha2_cap2J = "apenas ignora";

    String escolha1_cap5J = "conta";
    String escolha2_cap5J = "não conta";

    String escolha1_cap6J = "se alia";
    String escolha2_cap6J = "recusa";

    String escolha1_cap1P = "refeitorio";
    String escolha2_cap1P = "lavanderia";

    String escolha1_cap2P = "ignora";
    String escolha2_cap2P = "luta";

    String escolha1_cap4P = "pede desculpas";
    String escolha2_cap4P = "manda se ferrar";

    String escolha1_cap6P = "chama";
    String escolha2_cap6P = "se recusa";


    //código do jogo
    //cap1J
    capitulo capitulo1J = new capitulo(cap1J, escolha1_cap1J, escolha2_cap1J,principal1, 0, 0);
    capitulo capitulo2J = new capitulo(cap2J, escolha1_cap2J, escolha2_cap2J,principal1, 2, 0);
    capitulo capitulo3J = new capitulo(cap3J, "", "", principal1, 0, 0);
    capitulo capitulo4J = new capitulo(cap4J, "", "", principal1, 0, 2);
    capitulo capitulo5J = new capitulo(cap5J, escolha1_cap5J, escolha2_cap5J, principal1, 4,0);
    capitulo capitulo6J = new capitulo(cap6J, escolha1_cap6J, escolha2_cap6J, principal1, 4, 0);
    capitulo capitulo7J = new capitulo(cap7J, "", "", principal1, 0, 4 );
    capitulo capitulo8J = new capitulo(cap8J, "", "", principal1, 4, 0);
    capitulo capitulo9J = new capitulo(cap9J, "", "", principal1, 0, 6);

    capitulo capitulo1P = new capitulo(cap1P, escolha1_cap1P, escolha2_cap1P, Phillipy, 0, 0);
    capitulo capitulo2P = new capitulo(cap2P, escolha1_cap2P, escolha2_cap2P, Phillipy, 0, 0);
    capitulo capitulo3P = new capitulo(cap3P, "", "", Phillipy, 0, 0);
    capitulo capitulo4P = new capitulo(cap4P, escolha1_cap4P, escolha2_cap4P, Phillipy, 0, 0);
    capitulo capitulo5P = new capitulo(cap5P, "", "", Phillipy, 0, 0);
    capitulo capitulo6P = new capitulo(cap6P, escolha1_cap6P, escolha2_cap6P,Phillipy, 0, 0);
    capitulo capitulo7P = new capitulo(cap7P, "", "", Phillipy, 0, 0);
    capitulo capitulo8P = new capitulo(cap8P, "", "", Phillipy, 0, 0);
    capitulo capitulo9P = new capitulo(cap9P, "", "", Phillipy, 0, 0);
    capitulo1J.mostraCap();
    int valor = capitulo1J.escolha(escolha1_cap1J, escolha2_cap1J);
    if(valor == 1){
        capitulo3J.mostraCap();
    }
    else if(valor == 2){
        capitulo2J.mostraCap();
        int valor2 = capitulo5J.escolha(escolha1_cap2J, escolha2_cap2J);
        if(valor2 == 1){
            capitulo4J.mostraCap();
        }
        else if(valor2 == 2){
            capitulo5J.mostraCap();
            int valor3 = capitulo6J.escolha(escolha1_cap5J, escolha2_cap5J);
            if(valor3 == 1){
                capitulo6J.mostraCap();
                int valor4 = capitulo8J.escolha(escolha1_cap6J, escolha2_cap6J);
                if(valor4 == 1){
                    capitulo8J.mostraCap();
                }
                else if(valor4 == 2){
                    capitulo9J.mostraCap();
                }
            }
            else if(valor3 == 2){
                capitulo7J.mostraCap();
            }
        }
    }
    capitulo1P.mostraCap();
    int valor5 = capitulo1P.escolha(escolha1_cap1P, escolha2_cap2P);
    if(valor5 == 1){
        capitulo2P.mostraCap();
        int valor6 = capitulo4P.escolha(escolha1_cap2P, escolha2_cap2P);
        if(valor6 == 1){
            capitulo4P.mostraCap();
            int valor7 = capitulo6P.escolha(escolha1_cap4P, escolha2_cap4P);
            if(valor7 == 1){
                capitulo6P.mostraCap();
                int valor8 = capitulo8P.escolha(escolha1_cap6P, escolha2_cap6P);
                if(valor8 == 1){
                    capitulo8P.mostraCap();
                }
                else if(valor8 == 2){
                    capitulo9P.mostraCap();
                }
            }
            else if(valor7 ==2){
                capitulo7P.mostraCap();
            }
        }
        else if(valor == 2){
            capitulo5P.mostraCap();
        }
    }
    else if(valor5 == 2){
        capitulo3P.mostraCap();
    }
    resposta.close();
    } 
}