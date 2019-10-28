package SecondLv2andLv3;
class Pai {
      void Allcard(){
        String[] pai = new String[54];
        createCard card = new createCard();
        pai=card.Card();
        for (int i = 0; i < 54; i++) {
            if(i==13||i==26||i==39||i==52)
                System.out.println();
            System.out.print(pai[i]+" ");
        }
    }
}
