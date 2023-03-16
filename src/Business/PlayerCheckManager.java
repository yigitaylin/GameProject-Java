package Business;

import Abstract.IPlayerCheckService;
import Entity.Player;

public class PlayerCheckManager implements IPlayerCheckService{

	@Override
	public boolean IsValidPlayer(Player player) {
		return true;
	}

}
