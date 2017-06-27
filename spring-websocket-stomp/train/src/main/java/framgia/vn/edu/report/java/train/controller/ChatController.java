package framgia.vn.edu.report.java.train.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import framgia.vn.edu.report.java.train.bean.Message;
import framgia.vn.edu.report.java.train.bean.OutputMessage;

@Controller
@RequestMapping("/")
public class ChatController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewApplication() {
		return "chat";
	}

	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(final Message message) throws Exception {

		logger.info("Message sent");
		final String time = new SimpleDateFormat("HH:mm").format(new Date());
		return new OutputMessage(message.getFrom(), message.getText(), time);
	}

	private Logger logger = LoggerFactory.getLogger(getClass());

}
