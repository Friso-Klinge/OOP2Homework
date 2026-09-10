package com.nhlstenden.UserValidation;

import com.nhlstenden.UserValidation.ValidationRule.*;

import java.util.ArrayList;
import java.util.List;

public class UserValidation
{
    private List<User> users;
    private List<ValidationRule> validationRules;

    public UserValidation(List<ValidationRule> validationRules)
    {
        this.setUsers(new ArrayList<>());
        this.setValidationRules(validationRules);
    }

    public List<User> getUsers()
    {
        return this.users;
    }

    private void setUsers(List<User> users)
    {
        this.users = users;
    }

    private void addUsers(User user)
    {
        this.users.add(user);
    }

    public List<ValidationRule> getValidationRules()
    {
        return this.validationRules;
    }

    public void setValidationRules(List<ValidationRule> validationRules)
    {
        this.validationRules = validationRules;
    }

    private Boolean validateUser(User user)
    {
        for (ValidationRule validationRule : validationRules)
        {
            if (!validationRule.Validate(user, this.getUsers()))
            {
               return false;
            }
        }

        return true;
    }

    public void storeUser(User user)
    {
        if (validateUser(user))
        {
            addUsers(user);
        }
    }
}
