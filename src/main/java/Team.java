public class Team {


    public static void main(String[] args) {

        String tempWinEvent = " победил";
        String tempLossEvent = " проиграл";
        String eventName;
        String eventResult;

        float runLength = 250;

        Persons nameTeam = new Persons("Jackson",15,250);

        Persons[] team = {
                nameTeam,
                new Persons("Tom", 25,200),
        new Persons("Jack", 28,150),
        new Persons("Mark", 20,300),
        new Persons("John", 27,250),

    };

        getAllPersonsInTeam(team);
        System.out.println(" ");

        for (int i = 0; i < team.length; i++) {
            String nameString = team[i].getTeam() + " " + team[i].getName() + " может ";

            eventName = "пробежать на " + team[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = team[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);
        }
    }

    private static void result(String nameTeam, String event, float eventLength, String resultEvent) {
        System.out.println(nameTeam + event + eventLength + " м и он" + resultEvent);
    }

    private static void getAllPersonsInTeam(Persons[] team) {
        System.out.println("All person: ");
        for (int i = 0; i < team.length; i++)
            System.out.println((i + 1) + " " + team[i].getFullInfo());
    }
}
