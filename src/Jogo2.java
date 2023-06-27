import java.util.Scanner;

public class Jogo2 {
    public static void main(String[] args){
    System.out.println("Diga o nome do seu personagem: ");
    Scanner resposta = new Scanner(System.in);
    personagem principal1 = new personagem(resposta.nextLine());
    personagem Phillipy = new personagem("Phillipy");
    String cap2J = "Você decide sair e decide colocar seu plano em prática na manhã seguinte.";

    String cap3J = ""+principal1.Nome()+" decide apenas cumprir sua sentença, porém já com seus 45 anos"+
    " e sua sentença sendo de 50 anos, "+principal1.Nome()+" acabou falecendo na prisão. (final 1)";

    String cap4J = "Kenny pega a faca que estava na mão e esfaqueia "+principal1.Nome()+" até a morte.(Final 2)";

    String cap5J = ""+principal1.Nome()+" resolve sentar bem longe de Kenny, e com isso senta em uma mesa vazia"+
    " e após isso outro presidiário senta junto dele, "+Phillipy.Nome()+".";

    String cap6J = ""+Phillipy.Nome()+" gosta da ideia e propõe ambos se juntarem para saírem da prisão.";

    String cap7J = ""+principal1.Nome()+" recusa o pedido de "+Phillipy.Nome()+" e fracassa na sua fuga da prisão e é detido"+
    "e pega mais 50 anos a mais.(final 4)";

    String cap8J = ""+principal1.Nome()+" decidiu se aliar a "+Phillipy.Nome()+" e isso fez com que ambos conseguissem bolar"+
    "um plano melhor para saírem da prisão.";

    String cap9J = "Na noite do dia 29 ao tentar sair sem a ajuda de outra pessoa, "+principal1.Nome()+" é pego"+
    "pelos guardas e é separado dos outros presos.(Final 3)";

    String cap2P = "Ao chegar no refeitório ele vê que um detento   "+principal1.Nome()+" está sendo provocado,"+
    "e por saber que "+principal1.Nome()+" sabe muito de chaves pois ele era assaltante de bancos, decide fazer "+
    "amizade com ele.";

    String cap3P = ""+Phillipy.Nome()+" é pego pelos policiais e é jogado na solitária durante 2 meses. (Final 1)";

    String cap4P = "Após vê que "+principal1.Nome()+" decidiu ignorar Kenny e se sentar em uma mesa distante, ele vai até lá.";

    String cap5P = "Após atacar Kenny eles começam uma briga e isso acaba chamando a atenção"+
    "dos que acabam levando os dois para a solitária por um longo período. (Final 2)";

    String cap6P = "Ele pede desculpas e segui para a mesa de "+principal1.Nome()+".";

    String cap7P = "Por não decidir chamar "+principal1.Nome()+", o plano de "+Phillipy.Nome()+" se saí muito bem, e esse"+
    "acaba se dando muito mal.(final 3)";

    String cap8P = ""+Phillipy.Nome()+" chama "+principal1.Nome()+" para saírem daquela cadeia juntos";
    
    String cap9P = "Por não decidir chamar "+principal1.Nome()+", o plano de "+Phillipy.Nome()+" se saí muito bem, e esse acaba "+
    "se dando muito mal.(final 3)";

    //código do jogo
    System.out.println("INTRODUÇÃO "+principal1.Nome()+":"+principal1.Nome()+" é um presidiário da penitenciária de segurança máxima de veridium, "+
    "onde trabalha na parte de metalúrgica dela, ele está preso por roubo ao banco central da cidade Serenópolis "+
    "junto com alguns parceiros como Kenny, porém por um deslize de "+principal1.Nome()+" todos acabaram presos. Mas na noite do"+
    " dia 28 de outubro de 1995, "+principal1.Nome()+" está pensando se ele deve tentar fugir de uma vez por todas ou continuar"+
    "ali até a sua sentença ser completa. O Que você decide fazer?");
    System.out.println("-fica");
    System.out.println("-foge");
    String resposta1 = resposta.nextLine();
    boolean continuar =   true;
    if(resposta1.equalsIgnoreCase("foge")){
        System.out.println(cap2J);
        principal1.GanhaPct(2);
        System.out.println("Durante a manhã do dia 29, "+principal1.Nome()+" se encontra no refeitório e isso acaba lhe dando uma "+
        "ideia, ele decide pegar duas colheres para usar uma para fabricar uma chave para sair de sua sela. Após"+
        " passar na mesa onde Kenny estava, esse o atacou, o que "+principal1.Nome()+" deve fazer?");
        System.out.println("-vai para cima dele");
        System.out.println("-apenas ignora");
        String resposta2 = resposta.nextLine();
        if(resposta2.equalsIgnoreCase("apenas ignora")){
            System.out.println(cap5J);
            System.out.println(""+principal1.Nome()+" conversa com "+Phillipy.Nome()+" e esse o revela que não aguenta mais essa prisão."+
            " "+principal1.Nome()+" conta para "+Phillipy.Nome()+" seu plano?");
            System.out.println("-conta");
            System.out.println("-não conta");
            String resposta3 = resposta.nextLine();
            if(resposta3.equalsIgnoreCase("conta")){
                System.out.println(cap6J);
                principal1.GanhaPct(4);
                System.out.println("Após ouvir as ideias de "+Phillipy.Nome()+", "+principal1.Nome()+" deve decidir se irá se aliar a ele ou não. O que fazer?");
                System.out.println("-se alia");
                System.out.println("-recusa");
                String resposta4 = resposta.nextLine();
                if(resposta4.equalsIgnoreCase("se alia")){
                    System.out.println(cap8J);
                    principal1.GanhaPct(4);
                }else{
                    System.out.println(cap9J);
                    principal1.PerdePct(6);
                    continuar = false;
                }
            }else{
                System.out.println(cap7J);
                continuar = false;
            }
        }else{
            System.out.println(cap4J);
            principal1.PerdePct(2);
            continuar = false;
        }
    }else{
        System.out.println(cap3J);   
        continuar = false;
    }
    if(continuar){
        System.out.println("INTRODUÇÃO "+Phillipy.Nome()+": "+Phillipy.Nome()+" é outro detento presidiário da penitenciária"+
    " de segurança máxima de veridium, trabalha na parte da prisão que cria placas para carros, e já"+
    " faz um bom tempo que ele vem pensando em fugir. O Motivo dele está ali é o sequestro da filha de"+
    " um cara rico. Após a chegada do dia 29 de outubro de 1995, na manhã desse dia os presos devem se"+
    "dirigir ao refeitório, porém "+Phillipy.Nome()+" pensa se deve ir para o refeitório ou tentar fugir pela"+
    "lavanderia onde ele sabe que há um duto de ventilação que dá do lado de fora da prisão.");
    System.out.println("-refeitorio");
    System.out.println("-lavanderia");
    String resposta5 = resposta.nextLine();
    if(resposta5.equalsIgnoreCase("refeitorio")){
        System.out.println(cap2P);
        System.out.println(""+principal1.Nome()+" deve decidir se ele espera "+principal1.Nome()+" tomar uma providência ou se ele deve"+
        "atacar Kenny e defender "+principal1.Nome()+".");
        System.out.println("-ignora");
        System.out.println("-luta");
        String resposta6 = resposta.nextLine();
        if(resposta6.equalsIgnoreCase("ignora")){
            System.out.println(cap4P);
            System.out.println("Durante o caminho Kenny o para e pergunta o que ele estava olhando"+
            "durante a discursão, "+Phillipy.Nome()+" manda ele se ferrar ou pede desculpas e segue em frente?");
            System.out.println("-pede desculpas");
            System.out.println("-manda se ferrar");
            String resposta7 = resposta.nextLine();
            if(resposta7.equalsIgnoreCase("pede desculpas")){
                System.out.println(cap6P);
                System.out.println("Após seguir em frente, ele senta na mesa de "+principal1.Nome()+", "+principal1.Nome()+" acaba "+
                "contando o seu plano, "+Phillipy.Nome()+" deve chamar "+principal1.Nome()+" para fugirem juntos?");
                System.out.println("-chama");
                System.out.println("-se recusa");
                String resposta8 = resposta.nextLine();
                if(resposta8.equalsIgnoreCase("chama")){
                    System.out.println(cap8P);
                }else{
                    System.out.println(cap9P);   
                }
            }else{
                System.out.println(cap7P);
            }
        }else{
            System.out.println(cap5P);
        }
    }else{
        System.out.println(cap3P);
    }
    resposta.close();
    } }
}