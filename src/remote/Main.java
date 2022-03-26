package remote;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Remote_Control remote = new Remote_Control();
		
		AC myAirConditioner = new AC();
		AC_Command ac_command = new AC_Command(myAirConditioner, remote);
		remote.setACCommand(ac_command);
		
		GarageDoor myGarageDoor = new GarageDoor();
		GarageDoorCommand gd_command = new GarageDoorCommand(myGarageDoor, remote);
		remote.setGarageDoorCommand(gd_command);
		
		LivingRoomLights myLivingRoomLights = new LivingRoomLights();
		LivingRoomLightsCommand lrl_command = new LivingRoomLightsCommand(myLivingRoomLights, remote);
		remote.setLivingRoomLightsCommand(lrl_command);
		
		OutdoorLights myOutdoorLights = new OutdoorLights();
		OutdoorLightsCommand odl_command = new OutdoorLightsCommand(myOutdoorLights, remote);
		remote.setOutdoorLightsCommand(odl_command);
		
		AllLightsCommand all_command = new AllLightsCommand(myOutdoorLights, myLivingRoomLights, remote);
		remote.setAllLightsCommand(all_command);
				
		Scanner input = new Scanner(System.in);
		int userChoice;
		
		System.out.println("\t---Remote Control---");
		do{
			System.out.println("\nPlease Select an Option:");
			System.out.println("\t1. Air Conditioner Slot");
			System.out.println("\t2. Garage Door Slot");
			System.out.println("\t3. Living Room Lights Slot");
			System.out.println("\t4. Outdoor Lights Slot");
			System.out.println("\t5. All Lights Slot");
			System.out.println("\t6. Unused Slot");
			System.out.println("\t7. Undo Button");
			System.out.println("\t8. Reset All Button");
			System.out.println("----------------------------");
			System.out.println("\t9. Program Unused Slot");
			System.out.println("\t0. Reprogram All Slots");
			System.out.println("\tE: Exit Remote");
			
			userChoice = input.nextInt();
			
			switch(userChoice) {
			case 1:
				remote.AC_slot.execute();
				break;
			case 2:
				remote.Garage_slot.execute();
				break;
			case 3:
				remote.LivingRoomLights_slot.execute();
				break;
			case 4: 
				remote.OutdoorLights_slot.execute();
				break;
			case 5: 
				remote.AllLights_slot.execute();
				break;
			case 6:
				remote.Unused_slot.execute();
				break;
			case 7: 
				remote.UndoCommand.execute();
				break;
			case 8:
				remote.ResetCommand.execute();
				break;
			case 9:
				System.out.println("Reprogramming unused slot with a second Air Conditioner...");
				AC newAC = new AC();
				AC_Command ac_cmd = new AC_Command(newAC, remote);
				remote.setUnusedCommand(ac_cmd);
				System.out.println("Success! Unused Slot now controls a second Air Conditioner.");
				break;
			case 0:
				System.out.println("Reprogramming ALL slots with their original receivers...");
				remote.setACCommand(ac_command);
				remote.setGarageDoorCommand(gd_command);
				remote.setLivingRoomLightsCommand(lrl_command);
				remote.setOutdoorLightsCommand(odl_command);
				remote.setUnusedCommand(new EmptyCommand());
				remote.setAllLightsCommand(all_command);
				System.out.println("Success! ALL slots reprogrammed with their original receivers.");
				break;
			case 69:	//E
			case 101:	//e
				System.out.println("Exiting... Goodbye!");
				break;
			default:
				System.out.println("Invalid Choice - Please try again");
				break;			
			}
					
			
		} while (userChoice != 'E' && userChoice != 'e');
		input.close();
	}

}
