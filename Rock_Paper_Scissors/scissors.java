public class scissors extends tool{
	public scissors(int s){
		this.strength=s;
		this.type='s';
	}
	public boolean fight(tool t){
		if(t.type=='p')
			this.strength=2*strength;
		else
			this.strength=strength/2;
		if(this.strength>t.strength)
			return true;
		else 
			return false;
	}
}