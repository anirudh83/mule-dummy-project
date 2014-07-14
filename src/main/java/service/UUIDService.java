package service;


import java.util.UUID;
import javax.jws.WebService;
import domain.Merchant;

/**
 * Created by anirudh on 2/01/2014.
 */
public class UUIDService {

	public Merchant injectUUID(Merchant merchant) {
		if (merchant.getPilllrTransactionId() == null) {
			merchant.setPilllrTransactionId(UUID.randomUUID().toString());
		}

		return merchant;
	}
	
	public Merchant test(Merchant merchant){
		System.out.println("Helllo");
		return merchant;
	}

}
