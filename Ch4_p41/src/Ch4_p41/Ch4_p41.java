package Ch4_p41;
//109360142邱少譽
public class Ch4_p41 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehicle
{
	void vShow();
}

interface iMaterial
{
	void mShow();
}

class Car implements iVehicle,iMaterial
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油輛設為"+gas);
	}
	
	public void vShow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	public void mShow()
	{
		System.out.println("車子的材質是鐵");
	}
}