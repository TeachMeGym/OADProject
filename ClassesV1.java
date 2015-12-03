	
/**** JAVA CLASSES  ****/

	public class GymMember{
		private String userEmail;
		private String userName;
		private int Weight;
		private List<Playlist> memberPlaylist;
		
		public void GymMember(String userE, String userN, int nbF, int W){
			List<Playlist> memberPlaylist = new ArrayList<Playlist>();
			userEmail=userE;
			userName=userN;
			nbFollower=nbF;
			Weight=W;
		}
		
		public String getUserEmail()({
			return userEmail;
		}
		
		public String getUserName(){
			return userName
		}
		
		public String getWeight(){
			return Weight;
		}
		
		public ArrayList<Playlist> getMemberPlaylist(){
			return memberPlaylist;
		}

	}
	
	

	public class Playlist{
		private String playlistName
		private String playlistDescription
		private String playlistCategory
		private String playlistLevel
		
		private ArrayList<Video> playlistVideos;
		
		public void Playlist(String nameP, String playlistD, String playlistC, String playlistL){
		
			List<Video> playlistVideos = new ArrayList<Video>();
			
			playlistName = nameP;
			playlistDescription = playlistD;
			playlistCategory = playlistC;
			playlistLevel = playlistL;
		}
		
		public String getPlaylistName(){
			return playlistName;
		}
		
		public String getPlaylistDescription(){
			return playlistDescription;
		}
		
		public String getPlaylistCategory(){
			return playlistCategory;
		}
		
		public String getPlaylistLevel(){
			return playlistLevel;
		}
		
		public ArrayList<Video> getPlaylistVideos(){
			return PlaylistVideos;
		}
		
		public void addVideo(Video video){
			playlistVideos.add(video);
		}
	}
	
	
	
	public class Video{
		private String videoTitle
		private String videoDescription
		
		public void Video(String videoT, String videoD){
		
			List<Video> playlistvideo = new ArrayList<Video>();
			videoTitle = videoT;
			videoDescription = videoD;
		}
		
		public String getVideoTitle(){
			return PlaylistVideos;
		}
		
		public String getVideoDescription(){
			return PlaylistVideos;
		}
	}
	




