public class personagem {
    String nome;
    int  pctSucesso = 0;

public personagem(String nome){
    this.nome = nome;
}
public String Nome(){
    return nome;
}
public void GanhaPct(int pct){
     pctSucesso = pct + pctSucesso;
   
   if(pct!=0) { if(pctSucesso<100){
    System.out.println(nome+" ganhou "+ pct+"% de chance de sucesso!\n"+
    "Sua chance de fuga agora é de "+ pctSucesso+"%");}
    else{
        System.out.println(nome+" ganhou "+ pct+"% de chance de sucesso!\n"+
        "Sua chance de fuga agora é de "+ pctSucesso+"%\n"+
        "Conseguiu fugir!");}     
    } 
}
public void PerdePct(int pct){
     pctSucesso =  pctSucesso - pct;
   if (pct != 0) {System.out.println(nome+" perdeu "+ pct+"% de chance de sucesso!\n"+
    "Sua chance de fuga agora é de "+ pctSucesso+"%");}
}
}
