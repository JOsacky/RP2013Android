import java.net.URL;

import android.graphics.Bitmap;


public class Speakers {
	
	private Bitmap headshot;
	private String bio;
	private String role;
	private String name;
	private String twitterHandle;
	private String speakerBio;
	private URL webUrl;
	
	public Bitmap getHeadshot() {
		return headshot;
	}
	public void setHeadshot(Bitmap headshot) {
		this.headshot = headshot;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTwitterHandle() {
		return twitterHandle;
	}
	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	public String getSpeakerBio() {
		return speakerBio;
	}
	public void setSpeakerBio(String speakerBio) {
		this.speakerBio = speakerBio;
	}
	public URL getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(URL webUrl) {
		this.webUrl = webUrl;
	}
}
