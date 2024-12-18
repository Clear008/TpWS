package client;

import proxy.BanqueS;
import proxy.BanqueService;
import proxy.Compte;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueS().getBanqueServicePort();
        System.out.println(proxy.convertionEuroToMad(800));
        Compte compte = proxy.getCompte(4);
        System.out.println("********************************");
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());
        System.out.println(compte.getCode());
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c->{
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
            System.out.println(c.getCode());
            System.out.println("********************************");
        });
    }
}
