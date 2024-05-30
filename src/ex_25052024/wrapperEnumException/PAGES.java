package ex_25052024.wrapperEnumException;

public enum PAGES {
	LOGIN("https://app.vwo.com/#/login","LoginPage"),
	HOME("https://app.vwo.com/#/home","HomePage"),
	DASHBORARD("https://app.vwo.com/#/Dashboard","DashboardPage");
	
	String url;
	String page;
	
	PAGES(String url, String page)
	{
		this.url = url;
		this.page = page;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	

}
