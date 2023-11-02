package StudentManager;

public class StudentBA extends Student {
	private float scorePm;
	private float scoreBA;
	
	public StudentBA()
	{
		super();
		this.scoreBA = 0;
		this.scorePm = 0;
	}
	public StudentBA(String masv, String name, int age, float scoreBA, float scorePm)
	{
		super(masv, name, age);
		this.scoreBA = scoreBA;
		this.scorePm = scorePm;
	}
	
	@Override
	public String toString() {
		return "[StudentBA" + super.toString() +" scorePm=" + scorePm + ", scoreBA=" + scoreBA + "]";
	}
	public float getScorePm() {
		return scorePm;
	}
	public void setScorePm(float scorePm) {
		this.scorePm = scorePm;
	}
	public float getScoreBA() {
		return scoreBA;
	}
	public void setScoreBA(float scoreBA) {
		this.scoreBA = scoreBA;
	}
	@Override
	public float calculateAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
