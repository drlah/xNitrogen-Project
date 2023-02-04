import java.util.ArrayList;
import java.util.Scanner;

public class TilesShop {
    public static void main(String[] args) {

        int n, choice;
        Scanner in = new Scanner(System.in);

        TilesInfo tile = new TilesInfo();
        BranchesInfo branch = new BranchesInfo();

        System.out.print("\nMAHALAKSHMI CERRAMICS\n=========== =========");
        System.out.print("\n1) Tiles Info");
        System.out.print("\n2) Branches Info\n");
        System.out.print("\nSelect which info you want to work on: ");
        choice = in.nextInt();

        if (choice == 1) {
            System.out.print("\nHow many tiles info you gonna add? ");
            n = in.nextInt();

            tile.addTilesInfo(n);
            tile.showTilesInfo(n);
        }
        else {
            System.out.print("\nHow many branch info you gonna add? ");
            n = in.nextInt();

            branch.createBranch(n);
            branch.showBranchInfo(n);
        }

        in.close(); //Closing Scanner Class
    }
}

class BranchesInfo 
{
    int i;
    String id, name;
    ArrayList<String> branchID = new ArrayList<String>();
    ArrayList<String> managerName = new ArrayList<String>();
    
    Scanner in = new Scanner(System.in);

    void createBranch(int n) 
    {
        System.out.print("\nAdding Branch Info\n`````` ``````` ````");

        for (i = 0; i < n; i++) {
            System.out.printf("\nBranch Detail %d:\n====== ====== ==", i + 1);

            System.out.print("\nBranch ID: ");
            id = in.next();
            branchID.add(id);

            System.out.print("Manager Name: ");
            name = in.next();
            managerName.add(name);
        }
    }
    
    void showBranchInfo(int n) 
    {
        System.out.print("\n\nDisplay Branchs Info\n``````` ````` ````");
    
        for (i = 0; i < n; i++) 
        {
            System.out.printf("\nBranch Detail %d:\n==== ====== ==", i + 1);
    
            id = branchID.get(i);
            name = managerName.get(i);
    
            System.out.printf("\nBranch ID: %s", id);
            System.out.printf("\nManager Name: %s\n", name);
        }
    }
}

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
        System.out.print("\nAdding Tiles Info\n`````` ````` ````");
        
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
        System.out.print("\n\nDisplay Tiles Info\n``````` ````` ````");

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