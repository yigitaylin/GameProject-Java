import Abstract.BasePlayerManager;
import Abstract.BaseSellManager;
import Adapter.MernisCheckService;
import Business.ManuelSellManager;
import Business.OnlineSellManager;
import Business.PlayerManager;
import Business.SellCheckManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class Main {

	public static void main(String[] args) {
		
		 Player player=new Player("Aylin","Yiğit",1993,"13810116304");
		 player.setMoney(600);
		 BasePlayerManager playerManager=new PlayerManager(new MernisCheckService());
		 playerManager.add(player);
		 
		 Game game=new Game();
		 game.setPrice(500);
		
		 
		 Campaign campaign=new Campaign();
		 campaign.setDiscount(0.5);
		 	 
		 BaseSellManager sellManuel=new ManuelSellManager(new MernisCheckService(),new SellCheckManager());
		 sellManuel.sell(game, player);
		 
		 BaseSellManager sellOnline=new OnlineSellManager(new MernisCheckService(),new SellCheckManager());
		 sellOnline.sell(game, player,campaign);
		 
		 
	}

}
