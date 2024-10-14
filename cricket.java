import java.util.*;
 class CricketPlayer {
    String pnm;
    int ing,notout,totruns;
    int bavg;
    CricketPlayer()
    {
        pnm="Virat";
        ing=100;
        notout=50;
        totruns=12000;
    }
public static CricketPlayer[]sortPlayers(CricketPlayer players[])
{
    CricketPlayer temp;
    for(int i=0;i<players.length;i++)
    {
        for(int j=i+1;j<players.length;j++)
        {
            if(players[i].bavg<players[j].bavg)
            {
                temp=players[i];
                players[i]=players[j];
                players[j]=temp;
            
            }
        }
    }
    return players;
}
public static  CricketPlayer []avg(CricketPlayer players[])
{
    int i;
    for(i=0;i<players.length;i++)
    {
        players[i].bavg=players[i].totruns/players[i].ing;
    
    }
    return players;
}
public void accept()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Player Name:");
    pnm=sc.next();
    System.out.println("Enter Number of Innings:");
    ing=sc.nextInt();
    if(ing<=0)
    {
        System.out.println("Innings cant be zero");
    }
    System.out.println("Enter total runs");
    totruns=sc.nextInt();
    System.out.println("Enter number of times runout");
    notout=sc.nextInt();
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    CricketPlayer players[];
    System.out.println("How many Players you want:");
    int n=sc.nextInt();
    players=new CricketPlayer[n];
    for(int i=0;i<n;i++)
    {
        players[i]=new CricketPlayer();
        players[i].accept();
    }
    CricketPlayer.avg(players);
    System.out.println("-----Player------");
    System.out.println("Name\t\tInnings\t\tRuns\t\tNotout\t\tBat avg");
    for(int i=0;i<players.length;i++)
    {
        System.out.println(players[i].pnm+"\t\t"+players[i].ing+"\t\t"+players[i].totruns+"\t\t"+players[i].notout+"\t\t"+players[i].bavg);
    }
    CricketPlayer.sortPlayers(players);
    System.out.println("----------LeaderBoard----------");
     System.out.println("Name\t\tInnings\t\tRuns\t\tNotout\t\tBat avg");
      for(int i=0;i<players.length;i++)
    {
       System.out.println(players[i].pnm+"\t\t"+players[i].ing+"\t\t"+players[i].totruns+"\t\t"+players[i].notout+"\t\t"+players[i].bavg);
    }
}
}