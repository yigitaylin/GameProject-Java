package Adapter;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entity.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements IPlayerCheckService{

	@Override
	public boolean IsValidPlayer(Player player) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getTcNo()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getBirthYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
		
		
	}
	

}
