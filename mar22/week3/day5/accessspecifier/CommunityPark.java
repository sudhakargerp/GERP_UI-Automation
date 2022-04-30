package mar22.week3.day5.accessspecifier;

public class CommunityPark {

	public void publicPark()
	{
		System.out.println("This is a public park");
	}
	
	protected void communityAndRelativePark()
	{
		System.out.println("This is a gated community and relatives of gated community park");
	}
	
	void communityPark()
	{
		System.out.println("This is only for gated community park");
	}
	
	
	private void electricityMeter()
	{
		System.out.println("This can be accessed only by administrators of community park");
	}
	
	public static void main(String[] args) {
		CommunityPark lp = new CommunityPark();
		lp.publicPark();
		lp.communityAndRelativePark();
		lp.communityPark();
		lp.electricityMeter();
		

	}

}
