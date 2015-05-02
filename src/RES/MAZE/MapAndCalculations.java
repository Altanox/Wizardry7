package RES.MAZE;

import javafx.scene.input.KeyCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class MapAndCalculations
{
    private static final int MAP_HORIZONTAL_LENGTH = 27;
    private static final int MAP_VERTICAL_LENGTH = 28;

    private static char partyFacingDirection = 'N';
    private static char[][] map;

    public static void getMapFromFile()
    {
        Scanner mapScanner = null;
        try
        {
            mapScanner = new Scanner(new File("src/RES/MAZE/maze.dat"));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        char[][] mapAsArray = new char[MAP_HORIZONTAL_LENGTH][MAP_VERTICAL_LENGTH]; //wysokość mapy X szerokość mapy
        for (int i = 0; i < MAP_HORIZONTAL_LENGTH; i++)            //koniecznie wpisac wysokość mapy
        {
            if (mapScanner.hasNextLine())
            {
                String line = mapScanner.nextLine();
                for (int j = 0; j < line.length(); j++)
                {
                    {
                        mapAsArray[i][j] = line.charAt(j);
                    }
                }
            }
        }
        map = mapAsArray;
    }

    public static void printMap()
    {
        for (int i = 0; i < MAP_HORIZONTAL_LENGTH; i++)            //koniecznie wpisac wysokość mapy
        {
            for (int j = 0; j < MAP_VERTICAL_LENGTH; j++)
            {
                {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static int[] getPartyCoords(char map[][])
    {
        int[] coords = new int[2];
        for (int i = 0; i < map.length; i++)
        {
            char[] line = map[i];
            for (int j = 0; j < line.length; j++)
            {
                if (line[j] == 'x')
                {
                    coords[0] = j;
                    coords[1] = i;
                }
            }
        }
        return coords;
    }

    public static void setPartyFacingDirection(KeyCode keycode)
    {
        switch (keycode)
        {
            case LEFT:
            {
                if (partyFacingDirection == 'N')
                {
                    partyFacingDirection = 'E';
                    System.out.println("Facing east");
                    break;
                }
                else if (partyFacingDirection == 'S')
                {
                    partyFacingDirection = 'W';
                    System.out.println("Facing west");
                    break;
                }
                else if (partyFacingDirection == 'W')
                {
                    partyFacingDirection = 'N';
                    System.out.println("Facing north");
                    break;
                }
                else
                {
                    partyFacingDirection = 'S';
                    System.out.println("Facing south");
                    break;
                }
            }
            case RIGHT:
            {
                if (partyFacingDirection == 'N')
                {
                    partyFacingDirection = 'W';
                    System.out.println("Facing west");
                    break;
                }
                else if (partyFacingDirection == 'S')
                {
                    partyFacingDirection = 'E';
                    System.out.println("Facing east");
                    break;
                }
                else if (partyFacingDirection == 'W')
                {
                    partyFacingDirection = 'S';
                    System.out.println("Facing south");
                    break;
                }
                else
                {
                    partyFacingDirection = 'N';
                    System.out.println("Facing north");
                    break;
                }
            }
        }
    }

    public static void setMap(KeyCode keycode)
    {
        switch (keycode)
        {
            case UP:
            {
                int[] partyCoords = getPartyCoords(map);
                int x = partyCoords[0];
                int y = partyCoords[1];
                if (partyFacingDirection == 'N' && map[y - 1][x] == ' ')
                {

                    map[y][x] = ' ';
                    map[y - 1][x] = 'x';
                    System.out.println("Moving forward");
                    break;
                }
                if (partyFacingDirection == 'S' && map[y + 1][x] == ' ')
                {
                    x = partyCoords[0];
                    y = partyCoords[1];
                    map[y][x] = ' ';
                    map[y + 1][x] = 'x';
                    System.out.println("Moving forward");
                    break;
                }
                if (partyFacingDirection == 'E' && map[y][x - 1] == ' ')
                {
                    x = partyCoords[0];
                    y = partyCoords[1];
                    map[y][x] = ' ';
                    map[y][x - 1] = 'x';
                    System.out.println("Moving forward");
                    break;
                }
                if (partyFacingDirection == 'W' && map[y][x + 1] == ' ')
                {
                    x = partyCoords[0];
                    y = partyCoords[1];
                    map[y][x] = ' ';
                    map[y][x + 1] = 'x';
                    System.out.println("Moving forward");
                    break;
                }
                else {break;}
            }
            case DOWN:
            {
                int[] partyCoords = getPartyCoords(map);
                int x = partyCoords[0];
                int y = partyCoords[1];
                if (partyFacingDirection == 'N' && map[y + 1][x] == ' ')
                {
                    map[y][x] = ' ';
                    map[y + 1][x] = 'x';
                    System.out.println("Moving back");

                    break;
                }
                if (partyFacingDirection == 'S' && map[y - 1][x] == ' ')
                {
                    x = partyCoords[0];
                    y = partyCoords[1];
                    map[y][x] = ' ';
                    map[y - 1][x] = 'x';
                    System.out.println("Moving back");
                    break;
                }
                if (partyFacingDirection == 'E' && map[y][x + 1] == ' ')
                {
                    x = partyCoords[0];
                    y = partyCoords[1];
                    map[y][x] = ' ';
                    map[y][x + 1] = 'x';
                    System.out.println("Moving back");
                    break;
                }
                if (partyFacingDirection == 'W' && map[y][x - 1] == ' ')
                {
                    x = partyCoords[0];
                    y = partyCoords[1];
                    map[y][x] = ' ';
                    map[y][x - 1] = 'x';
                    System.out.println("Moving back");
                    break;
                }
                else {break;}
            }
        }
        int[] newCoords = getPartyCoords(map);
        System.out.println("Party x and y coords are: " + newCoords[1] + " and " + newCoords[0]);
    }

    public static char[][] getMapCellsToRender()
    {
        int[] partyCoords = getPartyCoords(map);
        char[][] cellsToRender = new char[5][5];

        switch (partyFacingDirection)
        {
            case 'N':
            {
                int yPosCounter = 0;
                for (int i = 0; i < 5; i++)
                {
                    int xPosCounter = -2;
                    for (int j = 0; j < 5; j++)
                    {
                        int xCounter = partyCoords[0] + xPosCounter;
                        int yCounter = partyCoords[1] + yPosCounter;
                        cellsToRender[i][j] = map[yCounter][xCounter];
                        xPosCounter++;
                    }
                    yPosCounter--;
                }
                break;
            }
            case 'S':
            {
                int yPosCounter = 0;
                for (int i = 0; i < 5; i++)
                {
                    int xPosCounter = 2;
                    for (int j = 0; j < 5; j++)
                    {
                        int xCounter = partyCoords[0] + xPosCounter;
                        int yCounter = partyCoords[1] + yPosCounter;
                        cellsToRender[i][j] = map[yCounter][xCounter];
                        xPosCounter--;
                    }
                    yPosCounter++;
                }
                break;
            }
            case 'W':
            {
                int xPosCounter = 0;
                for (int i = 0; i < 5; i++)
                {
                    int yPosCounter = -2;
                    for (int j = 0; j < 5; j++)
                    {
                        int xCounter = partyCoords[0] + xPosCounter;
                        int yCounter = partyCoords[1] + yPosCounter;
                        cellsToRender[i][j] = map[yCounter][xCounter];
                        yPosCounter++;
                    }
                    xPosCounter++;
                }
                break;
            }
            case 'E':
            {
                int xPosCounter = 0;
                for (int i = 0; i < 5; i++)
                {
                    int yPosCounter = 2;
                    for (int j = 0; j < 5; j++)
                    {
                        int xCounter = partyCoords[0] + xPosCounter;
                        int yCounter = partyCoords[1] + yPosCounter;

                        cellsToRender[i][j] = map[yCounter][xCounter];
                        yPosCounter--;
                    }
                    xPosCounter--;
                }
                break;
            }
            default:
            {
                System.out.println("ERROR: Wrong coordinates!");
                break;
            }
        }
        return cellsToRender;
    }

}
