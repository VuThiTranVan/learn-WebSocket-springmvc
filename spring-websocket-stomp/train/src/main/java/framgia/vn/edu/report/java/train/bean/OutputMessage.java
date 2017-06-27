package framgia.vn.edu.report.java.train.bean;

public class OutputMessage extends Message {
	private String from;
	private String text;
	private String time;

	public OutputMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OutputMessage(final String from, final String text, final String time) {

		this.from = from;
		this.text = text;
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public String getTime() {
		return time;
	}

	public String getFrom() {
		return from;
	}
}
