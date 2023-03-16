package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public interface ISellCheckService {
	boolean IsEnoughMoney(Game game,Player player,Campaign campaign);

	boolean IsEnoughMoney(Game game, Player player);

}
