package ua.skillsup.practice.junit.service;

import ua.skillsup.practice.junit.model.SessionId;
import ua.skillsup.practice.junit.model.SessionInfo;

/**
 * Hold information regarding all sessions in the cinema
 */
public interface SessionRegistry {

	/**
	 * Checks and responds with a full information regarding concrete session
	 *
	 * @param sessionId an identifier of exact session
	 * @return information regarding session
	 */
	SessionInfo getSessionInfo(SessionId sessionId);
}
