package applicationEnum;

import java.util.Date;

import entities.enums.OrderStatus;
import entitiesEnum.Order;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);//imprime Order [id=1080, moment=Fri Aug 11 11:00:51 BRT 2023, status=PENDING_PAYMENT]
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);//imprime DELIVERED
		System.out.println(os2);//imprime DELIVERED

	}

}
