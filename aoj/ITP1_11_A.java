import java.util.Scanner;

class Dice {
    int pips1, pips2, pips3, pips4, pips5, pips6;

    public Dice(int pips1, int pips2, int pips3, int pips4, int pips5, int pips6) {
        this.pips1 = pips1;//top
        this.pips2 = pips2;//south
        this.pips3 = pips3;//east
        this.pips4 = pips4;//west
        this.pips5 = pips5;//north
        this.pips6 = pips6;//bottom
    }

    void roll(char direction) {
        int tmp;//botoomになる
        switch (direction) {
            case 'E': // 東に転がす
                tmp = pips3;
                pips3 = pips1;
                pips1 = pips4;
                pips4 = pips6;
                pips6 = tmp;
                break;
            case 'N': // 北に転がす
                tmp = pips5;
                pips5 = pips1;
                pips1 = pips2;
                pips2 = pips6;
                pips6 = tmp;
                break;
            case 'S': // 南に転がす
                tmp = pips2;
                pips2 = pips1;
                pips1 = pips5;
                pips5 = pips6;
                pips6 = tmp;
                break;
            case 'W': // 西に転がす
                tmp = pips4;
                pips4 = pips1;
                pips1 = pips3;
                pips3 = pips6;
                pips6 = tmp;
                break;
        }
    }

    int getTop() {
        return pips1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = sc.nextInt();
        int front = sc.nextInt();
        int right = sc.nextInt();
        int left = sc.nextInt();
        int back = sc.nextInt();
        int bottom = sc.nextInt();
        Dice dice = new Dice(top, front, right, left, back, bottom);

        String commands = sc.next();
        for (char command : commands.toCharArray()) {
            dice.roll(command);
        }
        System.out.println(dice.getTop());

        

        sc.close();
    }
}
