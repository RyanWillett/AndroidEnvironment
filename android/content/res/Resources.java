package android.content.res;

import voss.narrator.R;
import shared.logic.support.Constants;
import shared.roles.Agent;
import shared.roles.Arsonist;
import shared.roles.Blackmailer;
import shared.roles.Bodyguard;
import shared.roles.BusDriver;
import shared.roles.Chauffeur;
import shared.roles.Citizen;
import shared.roles.Consort;
import shared.roles.CultLeader;
import shared.roles.Cultist;
import shared.roles.Detective;
import shared.roles.Doctor;
import shared.roles.Escort;
import shared.roles.Executioner;
import shared.roles.Framer;
import shared.roles.Godfather;
import shared.roles.Janitor;
import shared.roles.Jester;
import shared.roles.Lookout;
import shared.roles.Mafioso;
import shared.roles.MassMurderer;
import shared.roles.Mayor;
import shared.roles.SerialKiller;
import shared.roles.Sheriff;
import shared.roles.Veteran;
import shared.roles.Vigilante;
import shared.roles.Witch;

public class Resources {

	public int getColor(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getStringArray(int id) {
		switch (id){
			case R.array.roles_townRoles:
				return new String[]{Citizen.ROLE_NAME, Sheriff.ROLE_NAME, Detective.ROLE_NAME, Lookout.ROLE_NAME, Doctor.ROLE_NAME, Escort.ROLE_NAME, BusDriver.ROLE_NAME, Bodyguard.ROLE_NAME, Vigilante.ROLE_NAME, Veteran.ROLE_NAME, Mayor.ROLE_NAME};
				
			case R.array.roles_mafiaRoles:
				return new String[]{Godfather.ROLE_NAME, Mafioso.ROLE_NAME, Agent.ROLE_NAME, Blackmailer.ROLE_NAME, Consort.ROLE_NAME, Janitor.ROLE_NAME, Framer.ROLE_NAME, Chauffeur.ROLE_NAME};
				
			case R.array.roles_neutralRoles:
				return new String[]{CultLeader.ROLE_NAME, Cultist.ROLE_NAME, Witch.ROLE_NAME, Arsonist.ROLE_NAME, SerialKiller.ROLE_NAME, MassMurderer.ROLE_NAME, Jester.ROLE_NAME, Executioner.ROLE_NAME};
				
			case R.array.roles_randomRoles:
				return new String[]{Constants.ANY_RANDOM_ROLE_NAME, Constants.TOWN_RANDOM_ROLE_NAME, Constants.TOWN_PROTECTIVE_ROLE_NAME, Constants.TOWN_INVESTIGATIVE_ROLE_NAME, Constants.TOWN_KILLING_ROLE_NAME, Constants.MAFIA_RANDOM_ROLE_NAME, Constants.YAKUZA_RANDOM_ROLE_NAME, Constants.NEUTRAL_RANDOM_ROLE_NAME}; 
		}
		
		return null;
	}

}
