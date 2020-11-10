package com.ulger.sk.usermanager.springbootstarter;

import com.ulger.sk.usermanager.api.user.core.DefaultUserManager;
import com.ulger.sk.usermanager.api.user.core.UserDao;
import com.ulger.sk.usermanager.api.user.core.UserManager;
import com.ulger.sk.usermanager.api.user.core.UserValidationContextInitializer;
import com.ulger.sk.usermanager.api.user.core.password.DefaultPasswordPolicyManager;
import com.ulger.sk.usermanager.api.user.core.password.PasswordEncoder;

public abstract class UserManagerConfigurerAdapter {

    private UserManagerConfiguration configuration;

    public abstract UserDao userDao();

    public abstract PasswordEncoder passwordEncoder();

    public UserManagerConfigurerAdapter() {
        configuration = new UserManagerConfiguration();
        configuration.setUserDao(userDao());
        configuration.setPasswordEncoder(passwordEncoder());
        configuration.setUserManager(createUserManagerByConfig());
    }

    public UserManagerConfigurerAdapter conf() {
        return this;
    }

    public UserManagerConfigurerAdapter setUserManager(UserManager userManager) {
        configuration.setUserManager(userManager);
        return this;
    }

    private UserManager createUserManagerByConfig() {
        return new DefaultUserManager(
                configuration.getPasswordEncoder(),
                UserValidationContextInitializer.getDefault(new DefaultPasswordPolicyManager()),
                configuration.getUserDao()
        );
    }
}