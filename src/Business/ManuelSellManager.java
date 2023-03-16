package Business;

import Abstract.BaseSellManager;
import Abstract.IPlayerCheckService;
import Abstract.ISellCheckService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;


public  class ManuelSellManager extends BaseSellManager{
	
	ISellCheckService iSellCheckService;
	IPlayerCheckService iPlayerCheckService;
	
	
	
	public ManuelSellManager(IPlayerCheckService iPlayerCheckService,ISellCheckService iSellCheckService) {
		this.iSellCheckService=iSellCheckService;
		this.iPlayerCheckService=iPlayerCheckService;
		
	}
	
	public void sell(Game game,Player player) {
		while(iPlayerCheckService.IsValidPlayer(player)==true) {
		if(iSellCheckService.IsEnoughMoney(game, player)) {
			super.sell(game, player);
			break;
		}
		else {
			System.out.println("Player couldn't buy this game.Because money not enough");
		}
	}
		
	}

	
	


}
