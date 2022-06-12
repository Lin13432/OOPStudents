package oopstudents;

/**
 * @invar The birectional association.
 * 		| getTeammate() == null || getTeammate().getTeammate() == this
 * @invar | getTeammate() != this
 */
public class OOPStudent {
	
	/**
	 * @invar | teammate == null || teammate.teammate == this
	 * @invar | teammate != this
	 * @peerObject
	 */
	private OOPStudent teammate;
	
	/**
	 * @peerObject
	 * students in one team are peerObject of each other.
	 * not take a copy of teammate, teammate is not a representationObject
	 * representationObject: the client never get reference of this object
	 * 但这里the client give the other 
	 */
	public OOPStudent getTeammate() {
		return teammate;
	}
	
	/**
	 * @post | getTeammate() == null
	 */
	public OOPStudent() {}
	
	/**
	 * @pre | other != null
	 * @pre | other != this
	 * @pre | getTeammate() == null
	 * @pre | other.getTeammate() == null
	 * @mutates | this, other
	 * @post | getTeammate() == other
	 * @post | other.getTeammate() == this
	 */
	public void startCollaboratingWith(OOPStudent other) {
		teammate = other;
		other.teammate = this;
	}
	
	/**
	 * @pre | getTeammate() != null
	 * @mutates | this
	 * 不用写other,因为other在peergroup中
	 * @post | getTeammate() == null
	 * @post | old(getTeammate()).getTeammate() == null
	 */
	public void stopCollaboration() {
		teammate.teammate = null; //注意peerObject
		teammate = null;
	}
}
