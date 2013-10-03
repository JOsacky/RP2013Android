import java.net.URL;
import java.util.Date;

public class Sessions {

    private Date startTime;
    private URL webUrl;
    private String id;
    private Speakers speakers;
    private String title;
    private String eventId;
    private String space;
    private Date endTime;
    private URL otherUrl;
    private String talkSummary;
    
    
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public URL getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(URL webUrl) {
		this.webUrl = webUrl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Speakers getSpeakers() {
		return speakers;
	}
	public void setSpeakers(Speakers speakers) {
		this.speakers = speakers;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public URL getOtherUrl() {
		return otherUrl;
	}
	public void setOtherUrl(URL otherUrl) {
		this.otherUrl = otherUrl;
	}
	public String getTalkSummary() {
		return talkSummary;
	}
	public void setTalkSummary(String talkSummary) {
		this.talkSummary = talkSummary;
	}


}
