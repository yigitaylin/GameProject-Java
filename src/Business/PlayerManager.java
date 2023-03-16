package Business;

import Abstract.BasePlayerManager;
import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entity.Player;

public class PlayerManager extends BasePlayerManager{
	
	IPlayerCheckService iPlayerCheckService;
	
	public PlayerManager(IPlayerCheckService iPlayerCheckService) {
		this.iPlayerCheckService=iPlayerCheckService;
		
	}

	@Override
	public void add(Player player) {
		if(iPlayerCheckService.IsValidPlayer(player)) {
			super.add(player);
		}
		else {
			System.out.println("Player didn't add");
		}
				
	}

	@Override
	public void update(Player player) {
		super.update(player);
	}

	@Override
	public void delete(Player player) {
		super.delete(player);
		
	}

	
}
