package tradeBlotter.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="USER")
	public class User implements Serializable {
		
	    private static final long serialVersionUID = 1L;
	    
	    @Id
		private String traderId;
	    
		private String password;
		public String getTraderId() {
			return traderId;
		}
		public void setTraderId(String traderId) {
			this.traderId = traderId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}