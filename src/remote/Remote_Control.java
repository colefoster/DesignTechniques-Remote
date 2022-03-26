package remote;

public class Remote_Control {
	Command AC_slot;
	void setACCommand(Command acc) {
		AC_slot = acc;
	}
	
	Command Garage_slot;
	void setGarageDoorCommand(Command gdc) {
		Garage_slot = gdc;
	}
	
	Command LivingRoomLights_slot;
	void setLivingRoomLightsCommand(Command lrlc) {
		LivingRoomLights_slot = lrlc;
	}
	
	Command OutdoorLights_slot;
	void setOutdoorLightsCommand(Command odl) {
		OutdoorLights_slot = odl;
	}
	
	Command AllLights_slot;
	void setAllLightsCommand(Command alc) {
		AllLights_slot = alc;
	}
	
	Command Unused_slot = new EmptyCommand();
	void setUnusedCommand(Command unused) {
		Unused_slot = unused;
	}
	
	Command UndoCommand = new UndoCommand(this);
	Command lastUsedCommand = new EmptyCommand();
	void setLastUsedCommand(Command last) {
		lastUsedCommand = last;
	}
	
	Command ResetCommand = new ResetCommand(this);
}
	
