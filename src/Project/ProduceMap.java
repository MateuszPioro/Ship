package Project;
import java.util.Random;

class ProduceMap {
    private int enemyShip;
    private String[][] mapShip;

    public void generate(int x) {
        mapShip = new String[x][x];
        for (int i = 0; i < mapShip.length; i++) {
            for (int j = 0; j < mapShip.length; j++) {
                mapShip[i][j] = "*";
            }
        }
    }
    void showMap() {  //
        for (String[] strings : mapShip) {
            for (int j = 0; j < mapShip.length; j++) {
                if (strings[j].equals("w")) {
                    System.out.print("* ");
                } else
                    System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
    public void generateEnemyShip(int enemyShip) {
        Random random = new Random();
        this.enemyShip = enemyShip;
        for (int i = 0; i < enemyShip; i++) {
            mapShip[random.nextInt(mapShip.length)][random.nextInt(mapShip.length)] = "w";
        }
    }
    void playerMove(int x, int y) {
        if (mapShip[x][y] == "w") {
            mapShip[x][y] = "x";
            enemyShip--;

        } else if (mapShip[x][y] == "*") {
            mapShip[x][y] = "o";
        }
    }
}


