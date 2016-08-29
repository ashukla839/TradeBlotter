package tradeBlotter.ejb;

import java.util.List;

import javax.ejb.Local;

import tradeBlotter.jpa.TradeInfo;
import tradeBlotter.jpa.User;

@Local
public interface TradeBlotterLocal {


	public List<User> addUser(String name);
	public List<TradeInfo> displayTradeInformation();
	public boolean checkCredentials(String userId, String password);
	
}
