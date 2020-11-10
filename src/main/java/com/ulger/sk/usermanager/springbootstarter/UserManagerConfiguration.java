package com.ulger.sk.usermanager.springbootstarter;

import com.ulger.sk.usermanager.api.user.core.UserDao;
import com.ulger.sk.usermanager.api.user.core.UserManager;
import com.ulger.sk.usermanager.api.user.core.password.PasswordEncoder;
import com.ulger.sk.usermanager.api.user.core.password.PasswordPolicyManager;
import com.ulger.sk.usermanager.localization.I18NHelper;

public class UserManagerConfiguration {

    private UserManager userManager;
    private UserDao userDao;
    private PasswordEncoder passwordEncoder;
    private PasswordPolicyManager passwordPolicyManager;
    private I18NHelper i18NHelper;

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public PasswordPolicyManager getPasswordPolicyManager() {
        return passwordPolicyManager;
    }

    public void setPasswordPolicyManager(PasswordPolicyManager passwordPolicyManager) {
        this.passwordPolicyManager = passwordPolicyManager;
    }

    public I18NHelper getI18NHelper() {
        return i18NHelper;
    }

    public void setI18NHelper(I18NHelper i18NHelper) {
        this.i18NHelper = i18NHelper;
    }
}