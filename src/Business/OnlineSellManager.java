package Business;

import Abstract.BaseSellManager;
import Abstract.IPlayerCheckService;
import Abstract.ISellCheckService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class OnlineSellManager extends BaseSellManager {
	
	IPlayerCheckService iPlayerCheckService;
	ISellCheckService iSellCheckService;
	
	
	public OnlineSellManager(IPlayerCheckService iPlayerCheckService,ISellCheckService iSellCheckService) {
		this.iSellCheckService= iSellCheckService;
		this.iPlayerCheckService=iPlayerCheckService;
	}
	
	public void sell(Game game,Player player,Campaign campaign) {
		while(iPlayerCheckService.IsValidPlayer(player)==true) {
		if(iSellCheckService.IsEnoughMoney(game, player,campaign)) {
			super.sell(game, player,campaign);
			break;
		}
	
		else {
			System.out.println("Player couldn't buy this game.Because money not enough");
		}
	}

	}


}
