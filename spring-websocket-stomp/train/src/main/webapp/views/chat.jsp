<html>
<head>
<title>Chat WebSocket</title>

<script src="./assets/js/sockjs-0.3.4.js"></script>
<script src="./assets/js/stomp.js"></script>
<script src="./assets/js/custom-chat.js"></script>

</head>

<body onload="disconnect()">

	<div>
		<div>
			<input type="text" id="from" placeholder="Choose a nickname" />
		</div>
		<br />
		<div>
			<button id="connect" onclick="connect();">Connect</button>
			<button id="disconnect" disabled="disabled" onclick="disconnect();">Disconnect</button>
		</div>
		<br />
		<div id="conversationDiv">
			<input type="text" id="text" placeholder="Write a message..." />
			<button id="sendMessage" onclick="sendMessage();">Send</button>
			<p id="response"></p>
		</div>
	</div>

</body>
</html>