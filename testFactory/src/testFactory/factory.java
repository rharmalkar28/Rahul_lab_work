package testFactory;

public class factory {
	

	public Message getMessage(String MessageType) {
		if(MessageType == null)
		{
			return null;
		}
		
		if(MessageType.equalsIgnoreCase("whatsApp")){
			return new whatsApp();
		}
		
		if(MessageType.equalsIgnoreCase("hike")){
			return new hikeMessage();
		}
		
		return null;
	}


}
