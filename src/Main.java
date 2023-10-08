
public class Main {

    public static void main(String[] args) {
        //Задача 1
        int a = 6000;
        System.out.println("Значение переменной с типом int равно " + a );
        byte b = 100;
        System.out.println("Значение переменной с типом byte равно " +  b);
        short c = 24647;
        System.out.println("Значение переменной с типом short равно " +  c);
        long d = 262461231;
        System.out.println("Значение переменной с типом long равно " +  d);
        float e = 7.4534f;
        System.out.println("Значение переменной с типом float равно " +  e);
        double f = 13.64651816516518151f;
        System.out.println("Значение переменной с типом double равно " +  f);

        //Задача 2
        float voter = 27.12f;
        System.out.println(voter);
        long i = 987678965549L;
        System.out.println(i);
        float y = 2.786f;
        System.out.println(y);
        short r = 569;
        System.out.println(r);
        short t = -159;
        System.out.println(t);
        short u = 27897;
        System.out.println(u);
        byte p = 67;
        System.out.println(p);
        
        // Задача 3

        byte lyudmila = 23;
        byte anna = 27;
        byte catherine = 30;
        short paper = 480;
        int willReceive = (lyudmila * anna * catherine) / paper ;
        System.out.println( "На каждого ученика расчитанно "+willReceive+" листов бумаги " );

        // Задача 4

        byte bottles = 16;  //16 бутылок за 2 минуты
        byte tame1 = 20; //20 минут
        short tame2 = 1440; // 1 сутки
        short tame3 = 4320; // 3 суток
        int tame4 = 43200; // 30 суток
        int bottles1 = (bottles * tame1);
        int bottles2 = (bottles * tame2);
        int bottles3 = (bottles * tame3);
        int bottles4 = (bottles * tame4);
        System.out.println("За " + tame1 + " машина произвела " + bottles1 + " штук бутылок");
        System.out.println("За " + tame2 + " машина произвела " + bottles2 + " штук бутылок");
        System.out.println("За " + tame3 + " машина произвела " + bottles3 + " штук бутылок");
        System.out.println("За " + tame4 + " машина произвела " + bottles4 + " штук бутылок");

        // Задача 5

        byte jar = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int class1 =  jar / (whitePaint + brownPaint); //классов окрашено
        int whitePaint1 = whitePaint * class1;
        int brownPaint1 = brownPaint * class1;
        System.out.println("В школе, где " + class1 + " классов, нужно " + whitePaint1 +
                " банок белой краски " + brownPaint1 + " банок коричневой краски "  );

        // Задача 6

        byte banany = 5; // по 80 грамм
        short milk = 105; // 100мл = 105 грамм
        byte iceCream = 2; //по 100грамм
        byte eggs = 4; // по 70 грамм
        int banany1 = banany * 80;
        int milk1 = milk * 2;
        int iceCream1 = iceCream * 2;
        int eggs1 = eggs * 70;
        float gr = banany1 + milk1 + iceCream1 + eggs1;
        short kg1 = 1000;
        float kg = gr/ (float) kg1;
        System.out.println( "кол-во граммов " + gr + " и " + kg + "кг" );

        // Задача 7
        short ves1 = 250;
        short ves2 = 500;
        short rez = 7000; // 7 кг
        int rez1 = rez / ves1;
        int rez2 = rez / ves2;
        System.out.println( rez1 + "дней, если теряет по 250 гр в сутки" + rez2 +
                " дней, если теряет 500 гр в сутки" ) ;


        // Задача 8

        double masha= 67_760;
        double denis = 83_690;
        double kris= 76_230;

        double promotionMasha = masha* 1.1;
        double promotionDenis = denis* 1.1;
        double promotionKris = kris* 1.1;

        double mashaYear = masha* 12;
        double denisYear = denis* 12;
        double krisYear = kris* 12;

        double promotionMashaYear = promotionMasha* 12;
        double promotionDenisYear = promotionDenis* 12;
        double promotionKrisYear = promotionKris* 12;

        System.out.println("Маша теперь получает "+promotionMasha+ "рублей " +
                "годовой доход вырос до"+ (promotionMashaYear - mashaYear ) );
        System.out.println("Маша теперь получает "+promotionDenis+ "рублей " +
                "годовой доход вырос до"+ (promotionDenisYear - denisYear ) );
        System.out.println("Маша теперь получает "+promotionKris+ "рублей " +
                "годовой доход вырос до"+ (promotionKrisYear - krisYear ) );
    }


}