import java.util.Scanner;
public class Jogo2 {
    public static void main(String[] args) {
        System.out.println("Diga o nome do seu personagem: ");
        Scanner scanner = new Scanner(System.in);
        personagem personagemPrincipal = new personagem(scanner.nextLine());

        capitulo capitulo1J = new capitulo("INTRODUÇÃO " + personagemPrincipal.getNome() + ": " + personagemPrincipal.getNome() + " é um presidiário da penitenciária de segurança máxima de veridium, "
                + "onde trabalha na parte de metalúrgica dela, ele está preso por roubo ao banco central da cidade Serenópolis "
                + "junto com alguns parceiros como Kenny, porém por um deslize de " + personagemPrincipal.getNome()
                + " todos acabaram presos. Mas na noite do" + " dia 28 de outubro de 1995, " + personagemPrincipal.getNome()
                + " está pensando se ele deve tentar fugir de uma vez por todas ou continuar" + "ali até a sua sentença ser completa. O Que você decide fazer?", personagemPrincipal, 0, 0);

        capitulo capitulo2J = new capitulo("Você decide sair e decide colocar seu plano em prática na manhã seguinte."
                + "Durante a manhã do dia 29, " + personagemPrincipal.getNome() + ""
                + "se encontra no refeitório e isso acaba lhe dando uma ideia, ele decide pegar duas colheres para usar uma para fabricar uma chave"
                + " para sair de sua sela. Após passar na mesa onde Kenny estava, esse o atacou, o que " + personagemPrincipal.getNome() + " deve fazer?", personagemPrincipal, 2, 0);

        capitulo capitulo3J = new capitulo("" + personagemPrincipal.getNome()
                + " decide apenas cumprir sua sentença, porém já com seus 45 anos"
                + " e sua sentença sendo de 50 anos, " + personagemPrincipal.getNome() + " acabou falecendo na prisão. (final 1)", personagemPrincipal, 0, 0);

        capitulo capitulo4J = new capitulo("Kenny pega a faca que estava na mão e esfaqueia " + personagemPrincipal.getNome() + " até a morte.(Final 2)", personagemPrincipal, 0, 2);

        capitulo capitulo5J = new capitulo("" + personagemPrincipal.getNome() + " resolve sentar bem longe de Kenny, e com isso senta em uma mesa vazia"
                + " e após isso outro presidiário senta junto dele. Phillipy" + personagemPrincipal.getNome()
                + " conversa com Phillipy" + personagemPrincipal.getNome()
                + "e esse o revela que não aguenta mais essa prisão." + personagemPrincipal.getNome() + " conta para Phillipy seu plano?", personagemPrincipal, 4, 0);

        capitulo capitulo6J = new capitulo("Phillipy gosta da ideia e propõe ambos se juntarem para saírem da prisão. Após ouvir as ideias de"
                + "Phillipy, " + personagemPrincipal.getNome() + " deve decidir se irá se aliar a ele ou não. O que fazer?", personagemPrincipal, 4, 0);

        capitulo capitulo7J = new capitulo("" + personagemPrincipal.getNome()
                + " recusa o pedido de Phillipy e fracassa na sua fuga da prisão e é detido"
                + "e pega mais 50 anos a mais.(final 4)", personagemPrincipal, 0, 4);

        capitulo capitulo8J = new capitulo("" + personagemPrincipal.getNome()
                + " decidiu se aliar a Phillipy e isso fez com que ambos conseguissem bolar"
                + "um plano melhor para saírem da prisão.", personagemPrincipal, 4, 0);

        capitulo capitulo9J = new capitulo("Na noite do dia 29 ao tentar sair sem a ajuda de outra pessoa, " + personagemPrincipal.getNome() + " é pego"
                + "pelos guardas e é separado dos outros presos.(Final 3)", personagemPrincipal, 0, 6);

        Escolha[] cap1Je = new Escolha[2];
        cap1Je[0] = new Escolha("fica", capitulo3J);
        cap1Je[1] = new Escolha("foge", capitulo2J);

        Escolha[] cap2Je = new Escolha[2];
        cap2Je[0] = new Escolha("vai para cima dele", capitulo4J);
        cap2Je[1] = new Escolha("apenas ignora", capitulo5J);

        Escolha[] cap5Je = new Escolha[2];
        cap5Je[0] = new Escolha("conta", capitulo6J);
        cap5Je[1] = new Escolha("não conta", capitulo7J);

        Escolha[] cap6Je = new Escolha[2];
        cap6Je[0] = new Escolha("se alia", capitulo8J);
        cap6Je[1] = new Escolha("recusa", capitulo9J);

        Escolha[] capFinal = new Escolha[0];

        capitulo1J.setEscolhas(cap1Je);
        capitulo2J.setEscolhas(cap2Je);
        capitulo5J.setEscolhas(cap5Je);
        capitulo6J.setEscolhas(cap6Je);

        capitulo raiz = capitulo1J;
        raiz.executar();
        scanner.close();
    }
}