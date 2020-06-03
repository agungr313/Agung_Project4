package com.Agung.TProject4.repository;

import com.Agung.TProject4.R;
import com.Agung.TProject4.model.CastAndCrew;
import com.Agung.TProject4.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance(){
        if (instance == null){
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> getSpiderManFarromHome(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto1, "Tom Holland"));
        al.add(new CastAndCrew(R.drawable.foto2, "Samuel L. Jackson"));
        al.add(new CastAndCrew(R.drawable.foto3, "Jake Gyllenhaal"));
        al.add(new CastAndCrew(R.drawable.foto4, "Marisa Tomei"));
        al.add(new CastAndCrew(R.drawable.foto5, "Jon Favreau"));
        al.add(new CastAndCrew(R.drawable.foto6, "Zendaya"));
        al.add(new CastAndCrew(R.drawable.foto7, "Jacob Batalon"));
        al.add(new CastAndCrew(R.drawable.foto8, "Tony Revolori"));
        return al;
    }

    public List<CastAndCrew> getMarvelsAgentsofSHIELD(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto101, "Clark Gregg"));
        al.add(new CastAndCrew(R.drawable.foto102, "Ming-Na Wen"));
        al.add(new CastAndCrew(R.drawable.foto103, "Chloe Bennet"));
        al.add(new CastAndCrew(R.drawable.foto104, "Iain De Caestecker"));
        al.add(new CastAndCrew(R.drawable.foto105, "Elizabeth Henstridge"));
        return al;
    }

    public List<CastAndCrew> getlost(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto96, "Matthew Fox"));
        al.add(new CastAndCrew(R.drawable.foto97, "Evangeline Lilly"));
        al.add(new CastAndCrew(R.drawable.foto98, "Josh Holloway"));
        al.add(new CastAndCrew(R.drawable.foto99, "Naveen Andrews"));
        al.add(new CastAndCrew(R.drawable.foto100, "Terry O'Quinn"));
        return al;
    }

    public List<CastAndCrew> getBreakingBad(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto86, "Bryan Cranston"));
        al.add(new CastAndCrew(R.drawable.foto87, "Aaron Paul"));
        al.add(new CastAndCrew(R.drawable.foto88, "Anna Gunn"));
        al.add(new CastAndCrew(R.drawable.foto89, "Dean Norris"));
        al.add(new CastAndCrew(R.drawable.foto90, "Betsy Brandt"));
        return al;
    }

    public List<CastAndCrew> getRickandMorty(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto76, "Justin Roiland"));
        al.add(new CastAndCrew(R.drawable.foto77, "Chris Parnell"));
        al.add(new CastAndCrew(R.drawable.foto78, "Sarah Chalke"));
        al.add(new CastAndCrew(R.drawable.foto79, "Brandon Johnson"));
        al.add(new CastAndCrew(R.drawable.foto80, "Kari Wahlgren"));
        return al;
    }

    public List<CastAndCrew> getGreysAnatomy(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto66, "Ellen Pompeo"));
        al.add(new CastAndCrew(R.drawable.foto67, "Justin Chambers"));
        al.add(new CastAndCrew(R.drawable.foto68, "James Pickens Jr."));
        al.add(new CastAndCrew(R.drawable.foto69, "Chandra Wilson"));
        al.add(new CastAndCrew(R.drawable.foto70, "Patrick Dempsey"));
        return al;
    }

    public List<CastAndCrew> getSupergirl(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto56, "Melissa Benoist"));
        al.add(new CastAndCrew(R.drawable.foto57, "Chyler Leigh"));
        al.add(new CastAndCrew(R.drawable.foto58, "David Harewood"));
        al.add(new CastAndCrew(R.drawable.foto59, "Mehcad Brooks"));
        al.add(new CastAndCrew(R.drawable.foto60, "Jeremy Jordan"));
        return al;
    }

    public List<CastAndCrew> getWonderWoman(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto46, "Gal Gadot"));
        al.add(new CastAndCrew(R.drawable.foto47, "Chris Pine"));
        al.add(new CastAndCrew(R.drawable.foto48, "Connie Nielsen"));
        al.add(new CastAndCrew(R.drawable.foto49, "Robin Wright"));
        al.add(new CastAndCrew(R.drawable.foto50, "Danny Huston"));
        return al;
    }

    public List<CastAndCrew> getSnowpiercer(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto36, "Jennifer Connelly"));
        al.add(new CastAndCrew(R.drawable.foto37, "Daveed Diggs"));
        al.add(new CastAndCrew(R.drawable.foto38, "Mickey Sumner"));
        al.add(new CastAndCrew(R.drawable.foto39, "Susan Park"));
        al.add(new CastAndCrew(R.drawable.foto40, "Benjamin Haigh"));
        return al;
    }

    public List<CastAndCrew> getDeadpool(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto26, "Ryan Reynolds"));
        al.add(new CastAndCrew(R.drawable.foto27, "Karan Soni"));
        al.add(new CastAndCrew(R.drawable.foto28, "Ed Skrein"));
        al.add(new CastAndCrew(R.drawable.foto29, "Michael Benyaer"));
        al.add(new CastAndCrew(R.drawable.foto30, "Stefan Kapičić"));
        return al;
    }

    public List<CastAndCrew> getMyNeighborTotoro(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto16, "Noriko Hidaka"));
        al.add(new CastAndCrew(R.drawable.foto17, "Hitoshi Takagi"));
        al.add(new CastAndCrew(R.drawable.foto18, "Chika Sakamoto"));
        al.add(new CastAndCrew(R.drawable.foto19, "Marisa Tomei"));
        al.add(new CastAndCrew(R.drawable.foto20, "Sumi Shimamoto"));
        return al;
    }

    public List<CastAndCrew> getvikings(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto91, "Katheryn Winnick"));
        al.add(new CastAndCrew(R.drawable.foto92, "Peter Franzén"));
        al.add(new CastAndCrew(R.drawable.foto93, "Alexander Ludwig"));
        al.add(new CastAndCrew(R.drawable.foto94, "Jasper Pääkkönen"));
        al.add(new CastAndCrew(R.drawable.foto95, "Moe Dunford"));
        return al;
    }

    public List<CastAndCrew> getExtraction(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto81, "Chris Hemsworth"));
        al.add(new CastAndCrew(R.drawable.foto82, "Randeep Hooda"));
        al.add(new CastAndCrew(R.drawable.foto83, "Rudhraksh Jaiswal"));
        al.add(new CastAndCrew(R.drawable.foto84, "Golshifteh Farahani"));
        al.add(new CastAndCrew(R.drawable.foto85, "Pankaj Tripathi"));
        return al;
    }

    public List<CastAndCrew> getFamilyGuy(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto71, "Seth MacFarlane"));
        al.add(new CastAndCrew(R.drawable.foto72, "Alex Borstein"));
        al.add(new CastAndCrew(R.drawable.foto73, "Seth Green"));
        al.add(new CastAndCrew(R.drawable.foto74, "Mila Kunis"));
        al.add(new CastAndCrew(R.drawable.foto75, "Mike Henry"));
        return al;
    }

    public List<CastAndCrew> getRiverdale (){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto61, "K.J. Apa"));
        al.add(new CastAndCrew(R.drawable.foto62, "Camila Mendes"));
        al.add(new CastAndCrew(R.drawable.foto63, "Lili Reinhart"));
        al.add(new CastAndCrew(R.drawable.foto64, "Cole Sprouse"));
        al.add(new CastAndCrew(R.drawable.foto65, "Madelaine Petsch"));
        return al;
    }

    public List<CastAndCrew> getFriends(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto51, "Matthew Perry"));
        al.add(new CastAndCrew(R.drawable.foto52, "Matt LeBlanc"));
        al.add(new CastAndCrew(R.drawable.foto53, "Courteney Cox"));
        al.add(new CastAndCrew(R.drawable.foto54, "David Schwimmer"));
        al.add(new CastAndCrew(R.drawable.foto55, "Jennifer Aniston"));
        return al;
    }

    public List<CastAndCrew> getSpaceForc(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto41, "Steve Carell"));
        al.add(new CastAndCrew(R.drawable.foto42, "John Malkovich"));
        al.add(new CastAndCrew(R.drawable.foto43, "Ben Schwartz"));
        al.add(new CastAndCrew(R.drawable.foto44, "Diana Silvers"));
        al.add(new CastAndCrew(R.drawable.foto45, "Tawny Newsome"));
        return al;
    }

    public List<CastAndCrew> getGotham(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto31, "Tom Holland"));
        al.add(new CastAndCrew(R.drawable.foto32, "Donal Logue"));
        al.add(new CastAndCrew(R.drawable.foto33, "David Mazouz"));
        al.add(new CastAndCrew(R.drawable.foto34, "Sean Pertwee"));
        al.add(new CastAndCrew(R.drawable.foto35, "Robin Lord Taylor"));
        return al;
    }

    public List<CastAndCrew> getTheHungerGames(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto21, "Jennifer Lawrence"));
        al.add(new CastAndCrew(R.drawable.foto22, "Josh Hutcherson"));
        al.add(new CastAndCrew(R.drawable.foto23, "Liam Hemsworth"));
        al.add(new CastAndCrew(R.drawable.foto24, "Woody Harrelson"));
        al.add(new CastAndCrew(R.drawable.foto25, "Elizabeth Banks"));
        return al;
    }

    public List<CastAndCrew> getLucifer(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew(R.drawable.foto11, "Tom Ellis"));
        al.add(new CastAndCrew(R.drawable.foto1, "Lauren German"));
        al.add(new CastAndCrew(R.drawable.foto13, "Kevin Alejandro"));
        al.add(new CastAndCrew(R.drawable.foto14, "D.B. Woodside"));
        al.add(new CastAndCrew(R.drawable.foto15, "Lesley-Ann Brandt"));
        return al;
    }

    public void init(){
        list.add(new Movies(R.drawable.gambar1,"Spider-Man: Far from Home (2019)","Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.","Action, Adventure, Science Fiction","2h 9m","Chris Mc Kenna","2019", getSpiderManFarromHome()));
        list.add(new Movies(R.drawable.gambar02,"Marvel's Agents of S.H.I.E.L.D. (2013)","Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.","Adventure, Fantasy","43m","Maurissa Tancharoen","2013", getMarvelsAgentsofSHIELD()));
        list.add(new Movies(R.drawable.gambar03,"Lost (2004)","Stripped of everything, the survivors of a horrific plane crash must work together to stay alive. But the island holds many secrets.","Adventure,Drama, Mystery","45m","J.J.Abrams","2004", getlost()));
        list.add(new Movies(R.drawable.gambar04,"Breaking Bad (2008)","When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.","Drama","45m","Vince Gilingan","2008", getBreakingBad()));
        list.add(new Movies(R.drawable.gambar05,"Rick and Morty (2013)","Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.","Animation, Comedy, Sci-Fi & Fantasy, Action & Adventure","22m","Justin Roiland","2013", getRickandMorty()));
        list.add(new Movies(R.drawable.gambar06,"Grey's Anatomy (2005)","Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.","Drama","43m","Shonda Rhimes","2005", getGreysAnatomy()));
        list.add(new Movies(R.drawable.gambar07,"Supergirl (2015)","Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.","Action, Adventure, Drama, Science Fiction","42m","Greg Berlanti","2015", getSupergirl()));
        list.add(new Movies(R.drawable.gambar08,"Wonder Woman (2017)","An Amazon princess comes to the world of Man in the grips of the First World War to confront the forces of evil and bring an end to human conflict.","Action, Adventure, Fantasy","2h 21m","Allan Heinberg","2017", getWonderWoman()));
        list.add(new Movies(R.drawable.gambar09,"Snowpiercer (2020)","Set more than seven years after the world has become a frozen wasteland, the remnants of humanity inhabit a gigantic, perpetually-moving train that circles the globe as class warfare, social injustice and the politics of survival play out.","Sci-Fi & Fantasy","50m","Graeme Manson","2020", getSnowpiercer()));
        list.add(new Movies(R.drawable.gambar010,"Deadpool (2016)","Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.","Action, Adventure, Comedy","1h 48m","Tim Miller","2016", getDeadpool()));
        list.add(new Movies(R.drawable.gambar011,"My Neighbor Totoro (1988)","Two sisters move to the country with their father in order to be closer to their hospitalized mother, and discover the surrounding trees are inhabited by Totoros, magical spirits of the forest. When the youngest runs away from home, the older sister seeks help from the spirits to find her.","Fantasy, Animation, Family","1h 26m","Hayao Miyazaki","1998", getMyNeighborTotoro()));
        list.add(new Movies(R.drawable.gambar012,"Vikings (2013)","The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.","Action & Adventure, Drama","44m","Michael Hirst","2003", getvikings()));
        list.add(new Movies(R.drawable.gambar013,"Extraction (2020)","Tyler Rake, a fearless mercenary who offers his services on the black market, embarks on a dangerous mission when he is hired to rescue the kidnapped son of a Mumbai crime lord","Drama, Action, Thriller","1h 56m","Sam Hargrave","2020", getExtraction()));
        list.add(new Movies(R.drawable.gambar014,"Family Guy (1999)","Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.","Animation, Comedy","22m","Seth MacFarlane","1999", getFamilyGuy()));
        list.add(new Movies(R.drawable.gambar015,"Riverdale (2017)","Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.","Drama, Mystery","45m","Roberto Aguirre-Sacasa","2017", getRiverdale ()));
        list.add(new Movies(R.drawable.gambar016,"Friends (1994)","The misadventures of a group of friends as they navigate the pitfalls of work, life and love in Manhattan.","Comedy, Drama","25m","Marta Kauffman","1994", getFriends()));
        list.add(new Movies(R.drawable.gambar017,"Space Force (2020)","A four-star general begrudgingly teams up with an eccentric scientist to get the U.S. military's newest agency — Space Force — ready for lift-off.","Comedy","30m","Steve Carell","2020", getSpaceForc()));
        list.add(new Movies(R.drawable.gambar018,"Gotham (2014)","Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?","Drama, Fantasy, Crime","43m","Bruno Heller","2014", getGotham()));
        list.add(new Movies(R.drawable.gambar019,"The Hunger Games: Mockingjay - Part 1 (2014)","Katniss Everdeen reluctantly becomes the symbol of a mass rebellion against the autocratic Capitol.","Science Fiction, Adventure, Thriller","2h 3m","Francis Lawrence","2014",  getTheHungerGames()));
        list.add(new Movies(R.drawable.gambar020,"Lucifer (2016)","Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.","Crime, Sci-Fi & Fantasy","45m","Tom Kapinos","2016", getLucifer()));
    }

    public List<Movies> getData(){
        return list;
    }


    public void removeIndex(int index){
        list.remove(index);
    }

    public void clearData(){
        list.clear();
    }
}
