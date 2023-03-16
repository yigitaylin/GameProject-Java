package Abstract;

import Entity.Campaign;
import Entity.Game;

public abstract class BaseCampaignManager{
	public void add(Campaign campaign) {
		System.out.println("Campaign has been added"+campaign.getName());
		
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getId()+"Campaign has been updated.");
	
	}

	public void delete(Campaign campaign) {
		System.out.println(campaign.getId()+"Campaign has been deleted.");
	}
}
