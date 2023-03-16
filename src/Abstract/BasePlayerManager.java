package Abstract;

import Entity.Player;

public abstract class BasePlayerManager implements IPlayerService {
	
	public void add(Player player) {
		System.out.println("Player has been added to database"+player.getFirstName());
	}
	
	public void update(Player player) {
		System.out.println(player.getId()+"Player iformation has been updated.");
	}

	public void delete(Player player) {
		System.out.println(player.getId()+"Player has been deleted from database.");
	}
}
