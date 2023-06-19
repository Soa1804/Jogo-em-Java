import java.util.Scanner;

public class jogo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String String1 = "SIM";
        String String2 = "NAO";
        String String3 = "1";
        String String4 = "2";

        System.out.println("Este Jogo se basea em um apocalipse zumbie"+
        "onde suas escolhas afetam o seu destino no game! As respostas são em SIM e NAO ou 1 e 2");


        System.out.println("Introdução: Você era um morador de Rosewood,"+
        "e sofreu um acidente de carro. Antes disso você era um policial.");

        System.out.println("Você sofreu um acidaente de carro e acabou "+
        "internado no hospital de Rosewood. Após 2 meses internado você "+
        "acorda e vê que não há ninguém no hospital. Você vai sair do Hospital?");

        System.out.println("Você sai do hospital(SIM), Você fica no hospital(NAO)");
        String resposta1 = scanner.nextLine();
        if(resposta1.equalsIgnoreCase(String1)){
            System.out.println("Você saiu do Hospital para tentar entender o que Houve. "+
            "Após sair do Hospital você se depara com várias pessoas mortas do lado de fora. "+
            "Depois de alguns minutos você chega na sua casa e procura sua esposa e filha, " +
            "mas não acha ninguém. Após sair de casa você foi atacado por uma criança e seu pai, "+
            "eles levam você para casa deles porém lhe mantém amarrado. Depois de acordar eles "+
            "perguntam o que você estava fazendo ali sozinho. O que você responde? "+
            "diz a verdade(SIM), menti(NAO) ");

            String resposta2 = scanner.nextLine();
            if(resposta2.equalsIgnoreCase(String1)){
                System.out.println("Você disse a verdade e que estava atrás de sua família e pede "+
                "ajuda e abrigo, pelo menos para aquela noite");

                System.out.println("Durante a refeição o homem se apresenta como Willian, e ele lhe "+
                "explica que a sociedade caiu, o mundo agora é dos mortos, ou seja, você se encontra "+
                "em um apocalipse zombie. Após amanhecer vocês tem que escolher ir para sua casa onde "+
                "você possui armas por você ser um policial, para assim poder se defender contra os "+
                "zombies(sim) ou reforçar a casa que estão(NAO). Qual sua decisão?");

                String resposta3 = scanner.nextLine();
                if(resposta3.equalsIgnoreCase(String1)){
                    System.out.println("Você decidiu ir para sua casa junto de willian e seu filho, "+
                    "lá se armaram e acabaram se separando. Willian voltou para casa dele para reforçar "+
                    "ela e ficar mais uns dias antes de seguir viajem.");

                    System.out.println("Após se separar, voce decide ir atrás da sua familia pois Willian "+
                    "disse que tem um centro que acolhe os sobreviventes e talvez sua familia esteja lá. "+
                    "Após chegar na cidade você é atacado por alguns zumbiese tem que decidir: Correr para "+
                    "se esconder(1) ou Atirar neles(2)");

                    String resposta4 = scanner.nextLine();
                    if(resposta4.equalsIgnoreCase(String3)){
                        System.out.println("Você decidiu correr, e no meio do caminho ajudou um homem que "+
                        "se apresentou como Dom");

                        System.out.println("Após vocês se esconderem, Dom lhe chama para entrar no grupoi dele. "+
                        "Você aceita? (SIM) ou (NAO)");

                        String resposta5 = scanner.nextLine();
                        if(resposta5.equalsIgnoreCase(String1)){
                            System.out.println("Você decidiu aceitar o convite, estando agora no grupo de Dom, "+
                            "você senti que agora será mais fácil de achar sua familia.");

                            System.out.println("FINAL 6, Bom! Mas ainda não acabou, CONTINUA...");
                        }
                    }if(resposta4.equalsIgnoreCase(String4)){
                        System.out.println("Você decidiu atirar, com isso outros zumbies lhe ouviram e "+
                        "acabaram indo até você, você correu até um beco e ficou encurralado e morreu! ");

                        System.out.println("FINAL 4");
                    }
                }if(resposta3.equalsIgnoreCase(String2)){
                    System.out.println("Alguns zumbies invadiram a casa, por não estarem armados vocês foram mortos!");

                    System.out.println("FINAL 3");
                }
            }if(resposta2.equalsIgnoreCase(String2)){
                System.out.println("Você mentiu, porém eles escutaram você chamando por sua esposa e filha e com "+
                "isso eles começam a lhe interrogar. Você vai contar a verdade? (SIM) ou (NAO)");
                String resposta6 = scanner.nextLine();

                if(resposta6.equalsIgnoreCase(String1)){
                    System.out.println("Você explica toda a situação e qual o motivo de ter mentido na "+
                    "primeira vez, eles entendem sua preocupação, até por que não se pode confiar em qualquer "+
                    "um nos dias de hoje. Eles lhe oferecem abrigo e comida!");

                    System.out.println("Durante a refeição o homem se apresenta como Willian, e ele lhe "+
                    "explica que a sociedade caiu, o mundo agora é dos mortos, ou seja, você se encontra "+
                    "em um apocalipse zombie. Após amanhecer vocês tem que escolher ir para sua casa onde "+
                    "você possui armas por você ser um policial, para assim poder se defender contra os "+
                    "zombies(sim) ou reforçar a casa que estão(NAO). Qual sua decisão?");

                    String resposta7 = scanner.nextLine();
                    if(resposta7.equalsIgnoreCase(String1)){
                        System.out.println("Você decidiu ir para sua casa junto de willian e seu filho, "+
                        "lá se armaram e acabaram se separando. Willian voltou para casa dele para reforçar "+
                        "ela e ficar mais uns dias antes de seguir viajem.");

                        System.out.println("Após se separar, voce decide ir atrás da sua familia pois Willian "+
                    "disse que tem um centro que acolhe os sobreviventes e talvez sua familia esteja lá. "+
                    "Após chegar na cidade você é atacado por alguns zumbiese tem que decidir: Correr para "+
                    "se esconder(1) ou Atirar neles(2)");

                    String resposta8 = scanner.nextLine();
                    if(resposta8.equalsIgnoreCase(String3)){
                        System.out.println("Você decidiu correr, e no meio do caminho ajudou um homem que "+
                        "se apresentou como Dom");

                        System.out.println("Após vocês se esconderem, Dom lhe chama para entrar no grupoi dele. "+
                        "Você aceita? (SIM) ou (NAO)");

                        String resposta9 = scanner.nextLine();
                        if(resposta9.equalsIgnoreCase(String1)){
                            System.out.println("Você decidiu aceitar o convite, estando agora no grupo de Dom, "+
                            "você senti que agora será mais fácil de achar sua familia.");

                            System.out.println("Final Bom! Mas ainda não acabou, CONTINUA...");
                        }
                    }if(resposta8.equalsIgnoreCase(String4)){
                        System.out.println("Você recusa o pedido de Dom, com isso vocês se separam, dias "+
                        "depois você fica severamente doente, e por está sozinho e muito fraco acaba morrendo. ");

                        System.out.println("FINAL 5");
                    }
                    }
                }if(resposta6.equalsIgnoreCase(String2)){
                    System.out.println("Após ser interrogado, você decide mentir mais uma vez, eles perdem a "+
                    "paciência e se estressam, você é morto.");
                    System.out.println("FINAL 2");
                }
            }
        }if(resposta1.equalsIgnoreCase(String2)){
            System.out.println("Você decidiu ficar no hospital por medo, depois de um tempo algumas pessoas "+
            "chegaram e lhe mataram sem explicações. FINAL 1!");
        }
    }
}
