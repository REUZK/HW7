package de.uni.koeln.sse.se.t2;

public class Client {

    public static void main(String[] args) {
        Composite olympicsTeams = new Composite("OlympicsTeams");

        Composite asiaTeam = new Composite("AsiaTeam");
        olympicsTeams.add(asiaTeam);
        Composite chinaTeam = new Composite("ChinaTeam");
        asiaTeam.add(chinaTeam);

        Composite chinaWomenTeam = new Composite("China-Women's-Team");
        chinaTeam.add(chinaWomenTeam);
        Leaf womenTaekwondo = new Leaf("Taekwondo",4,2);
        chinaWomenTeam.add(womenTaekwondo);
        Leaf womenWaterpolo = new Leaf("Waterpolo",9,3);
        chinaWomenTeam.add(womenWaterpolo);
        Leaf womenArtisticGymnastics = new Leaf("Artistic Gymnastics",6,4);
        chinaWomenTeam.add(womenArtisticGymnastics);

        Composite chinaMenTeam = new Composite("China Men's Team");
        chinaTeam.add(chinaMenTeam);
        Leaf menShooting = new Leaf("Shooting", 5, 3);
        chinaMenTeam.add(menShooting);

        Leaf afghanistanTeam = new Leaf("Afghanistan Team",8, 1);
        asiaTeam.add(afghanistanTeam);

        Leaf africaTeam = new Leaf("Africa Team", 12, 6);
        olympicsTeams.add(africaTeam);

        Composite europeTeam = new Composite("Europe Team");
        olympicsTeams.add(europeTeam);
        Composite germanyTeam = new Composite("Germany Team");
        europeTeam.add(germanyTeam);

        Composite womenGermany = new Composite("Germany Women's Team");
        germanyTeam.add(womenGermany);
        Leaf womenCycling = new Leaf("Cycling",8,4);
        womenGermany.add(womenCycling);
        Leaf womenTennis = new Leaf("Tennis",9,5);
        womenGermany.add(womenTennis);

        Composite menGermany = new Composite("Germany Men's Team");
        germanyTeam.add(menGermany);
        Leaf menTableTennis = new Leaf("Table Tennis",11,6);
        menGermany.add(menTableTennis);
        Leaf menFootball = new Leaf("Team Football",16,16);
        menGermany.add(menFootball);

        Composite italyTeam = new Composite("Germany Team");
        europeTeam.add(italyTeam);
        Composite womenItaly = new Composite("Italy Women's Team");
        italyTeam.add(womenItaly);
        Leaf womenAlpineSky = new Leaf("Alpine Sky",20,9);
        womenItaly.add(womenAlpineSky);
        Composite menItaly = new Composite("Italy Men's Team");
        italyTeam.add(menItaly);
        Leaf menItalyFootball = new Leaf("Football",16,0);
        menItaly.add(menItalyFootball);
        Leaf menSwimmingTeam = new Leaf("Swimming",5,2);
        menItaly.add(menSwimmingTeam);

        Leaf southAmericaTeam = new Leaf("South America Team", 25, 10);
        olympicsTeams.add(southAmericaTeam);


        AthletesVisitor athletesvisitor = new AthletesVisitor();
        GoldMedalVisitor goldmedalvisitor = new GoldMedalVisitor();

        System.out.println("Name of the Teams and Number of Athletes of Germany Men’s Team");
        menGermany.accept(athletesvisitor);
        System.out.println( "\n \n");
        System.out.println("Name of the Teams and Number of Gold Medals of Germany");
        germanyTeam.accept(goldmedalvisitor);
        System.out.println( "\n \n");
        System.out.println("Name of the Teams and Number of Gold Medals of Asia’s Team");
        asiaTeam.accept(goldmedalvisitor);
        System.out.println( "\n \n");
        System.out.println("Name and Number of athletes of teams in the Olympic 2024!");
        olympicsTeams.accept(athletesvisitor);
    }
}
