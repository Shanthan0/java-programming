public class paper extends tool{
	public paper(int s){
		this.strength=s;
		this.type='p';
	}
	public boolean fight(tool t){
		if(t.type=='s')
			this.strength=2*strength;
		else
			this.strength=strength/2;
		if(this.strength>t.strength)
			return true;
		else 
			return false;
	}
}