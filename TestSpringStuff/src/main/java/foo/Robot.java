package foo;

public class Robot {
	
	private int firePower;
	private String name;
	private Weapon weapon;
	
	
	public void setWeapon(Weapon w){
		System.out.println("arm robot with a weapon:" + w.hashCode());
		weapon = w;
	}
	
	
	public void setFirePower(int fp){
		System.out.println("setting firepower to:" + fp);
		firePower = fp;
	}
	
	public void setName(String nme){
		System.out.println("name is:" + nme);
		name = nme;
	}
	
	
	
	public void dem(){
		System.out.println("destroy will robinson... lol");
	}

}
