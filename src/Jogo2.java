import java.util.Scanner;

public class Jogo2 {
    public static void main(String[] args){
    System.out.println("Diga o nome do seu personagem: ");
    Scanner resposta = new Scanner(System.in);
    personagem principal1 = new personagem(resposta.nextLine());
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
    " e após isso outro presidiário senta junto dele. Phillipy"+principal1.Nome()+" conversa com Phillipy"+
    "e esse o revela que não aguenta mais essa prisão."+principal1.Nome()+" conta para Phillipy seu plano?";

    String cap6J = "Phillipy gosta da ideia e propõe ambos se juntarem para saírem da prisão. Após ouvir as ideias de"+
    "Phillipy, "+principal1.Nome()+" deve decidir se irá se aliar a ele ou não. O que fazer?";

    String cap7J = ""+principal1.Nome()+" recusa o pedido de Phillipy e fracassa na sua fuga da prisão e é detido"+
    "e pega mais 50 anos a mais.(final 4)";

    String cap8J = ""+principal1.Nome()+" decidiu se aliar a Phillipy e isso fez com que ambos conseguissem bolar"+
    "um plano melhor para saírem da prisão.";

    String cap9J = "Na noite do dia 29 ao tentar sair sem a ajuda de outra pessoa, "+principal1.Nome()+" é pego"+
    "pelos guardas e é separado dos outros presos.(Final 3)";
//------------------------------------------------------------------------------------------------------------------------------
    String[] cap1Je = new String[2];
    cap1Je[0] = "fica";
    cap1Je[1] = "foge";
    String[] cap2Je = new String[2];
    cap2Je[0] = "vai para cima dele";
    cap2Je[1] = "apenas ignora";
    String[] cap5Je = new String[2];
    cap5Je[0] = "conta";
    cap5Je[1] = "não conta";
    String[] cap6Je = new String[2];
    cap6Je[0] = "se alia";
    cap6Je[1] = "recusa";
    String[] capFinal = new String[0];
//--------------------------------------------------------------------------------------------------------------------------------
    //código do jogo
    capitulo capitulo1J = new capitulo(cap1J, cap1Je, principal1, 0, 0);
    capitulo capitulo2J = new capitulo(cap2J, cap2Je, principal1, 2, 0);
    capitulo capitulo3J = new capitulo(cap3J, cap2Je, principal1, 0, 0);
    capitulo capitulo4J = new capitulo(cap4J, capFinal, principal1, 0, 2);
    capitulo capitulo5J = new capitulo(cap5J, cap5Je, principal1, 4,0);
    capitulo capitulo6J = new capitulo(cap6J, cap6Je, principal1, 4, 0);
    capitulo capitulo7J = new capitulo(cap7J, capFinal, principal1, 0, 4 );
    capitulo capitulo8J = new capitulo(cap8J, capFinal, principal1, 4, 0);
    capitulo capitulo9J = new capitulo(cap9J, capFinal, principal1, 0, 6);

    capitulo1J.mostraCap();
    int valor = capitulo1J.escolha(cap1Je);
    if(valor == 0){
        capitulo3J.mostraCap();
    }
    else if(valor == 1){
        capitulo2J.mostraCap();
        int valor2 = capitulo5J.escolha(cap2Je);
        if(valor2 == 0){
            capitulo4J.mostraCap();
        }
        else if(valor2 == 1){
            capitulo5J.mostraCap();
            int valor3 = capitulo6J.escolha(cap5Je);
            if(valor3 == 0){
                capitulo6J.mostraCap();
                int valor4 = capitulo8J.escolha(cap6Je);
                if(valor4 == 0){
                    capitulo8J.mostraCap();
                }
                else if(valor4 == 1){
                    capitulo9J.mostraCap();
                }
            }
            else if(valor3 == 1){
                capitulo7J.mostraCap();
            }
        }
    }
    resposta.close();
    } 
}