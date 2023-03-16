package Business;

import Abstract.ISellCheckService;
import Abstract.ISellService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class SellCheckManager implements ISellCheckService{

	@Override
	public boolean IsEnoughMoney(Game game, Player player,Campaign campaign) {
		while(campaign.getDiscount()>0) {
		if(player.getMoney()>=game.getPrice() || player.getMoney()>=game.getPrice()*campaign.getDiscount()) {
			return true;
		}
	}
		return false;


	}
	public boolean IsEnoughMoney(Game game, Player player) {
		
		if(player.getMoney()>=game.getPrice()) {
			return true;
		}
	
		else {
			return false;
		}


	}
	

}
