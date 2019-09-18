
public class Photo {
	
	protected String url, type;
	
	public Photo() {
		this.url = " ";
		this.type = " ";
	}

	public Photo(String url, String type) {
		super();
		this.url = url;
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
