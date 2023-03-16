package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public abstract class BaseSellManager implements ISellService{
	@Override
	public void sell(Game game, Player player,Campaign campaign) {
		System.out.println("Game price: "+game.getPrice()+"\nDiscount:"+campaign.getDiscount()+"\nOnline Payment: "+game.getPrice()*campaign.getDiscount());
		System.out.println("-------------------------");
	}

	public void sell(Game game,Player player) {
		System.out.println("Game price: "+game.getPrice()+"\nManuel Payment: "+game.getPrice());
		System.out.println("-------------------------");
	}

}
