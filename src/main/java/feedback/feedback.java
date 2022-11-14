package feedback;

public class feedback {
	private int id;
	private String cid;
	private String name;
	private String feedback;
	
	public feedback (int id, String cid, String name, String feedback) {
		super();
		this.id = id;
		this.cid = cid;
		this.name = name;
		this.feedback = feedback;
	}

	public int getId() {
		return id;
	}
	
	public String getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public String getFeedback() {
		return feedback;
	}
	
}
