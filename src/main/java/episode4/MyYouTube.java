package episode4;

public class MyYouTube {
	public static void main(String[] args) {
		
		YouTuber yt = new YouTuber();
		String shared =  yt.shareVideo();
		System.out.println(shared);
		yt.createVideo();
		
		
		
	}

}
