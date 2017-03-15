package service.interfaces;

import service.session.UserSession;

/**
 * Created by simon on 12/03/17.
 */
public interface BaseService {
    default UserSession getCurrentUser(){
        return UserSession.thisSession;
    }
}
