import java.util.ArrayList;
import java.util.Scanner;

public class TilesShop {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);

        TilesInfo tile = new TilesInfo();
        // BranchesInfo branch = new BranchesInfo();

        System.out.print("\nHow many tiles info you gonna add? ");
        n = in.nextInt();

        tile.addTilesInfo(n);
        tile.showTilesInfo(n);

        in.close(); //Closing Scanner Class
    }
}

// class BranchesInfo {
    
//     void createBranch() {
        
//     }
// }

class TilesInfo 
{

    int i;
    String id, design, size;
    ArrayList<String> tileID = new ArrayList<String>();
    ArrayList<String> tileDesign = new ArrayList<String>();
    // ArrayList<String> tileSize = new ArrayList<String>();
    // ArrayList<String> tileType = new ArrayList<String>();
    // ArrayList<String> brandID = new ArrayList<String>();

    Scanner in = new Scanner(System.in);

    void addTilesInfo(int n) 
    {
        System.out.println("\nAdding Tiles Info\n`````` ````` ````");
        
        for (i = 0; i < n; i++) 
        {
            System.out.printf("\nTile Detail %d:\n==== ====== ==", i + 1);

            System.out.print("\nTile ID: ");
            id = in.next();
            tileID.add(id);

            System.out.print("Tile Design: ");
            design = in.next();
            tileDesign.add(design);
        }
    }
    
    void showTilesInfo(int n) 
    {
        System.out.println("\n\nDisplay Tiles Info\n``````` ````` ````");

        for (i = 0; i < n; i++) 
        {
            System.out.printf("\nTile Detail %d:\n==== ====== ==", i + 1);

            id = tileID.get(i);
            design = tileDesign.get(i);

            System.out.printf("\nTile ID: %s", id);
            System.out.printf("\nTile Design: %s\n", design);
        }
    }
}