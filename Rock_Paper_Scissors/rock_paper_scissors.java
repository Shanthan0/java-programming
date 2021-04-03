class rock_paper_scissors{
	public static void main(String args[]){
		rock r = new rock(10);
		paper p = new paper(10);
		scissors s = new scissors(10);

		System.out.println("Rock vs Paper: "+r.fight(p));
		System.out.println("Paper vs Scissors: "+p.fight(s));
		System.out.println("Scissors vs Rock: "+s.fight(r));
	}
}