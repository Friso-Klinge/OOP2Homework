package com.nhlstenden.UserValidation.ValidationRule;

import com.nhlstenden.UserValidation.User;

import java.util.List;

public class UsernameValidation implements ValidationRule
{
    public UsernameValidation()
    {
    }

    @Override
    public boolean Validate(User user, List<User> users)
    {
        for (User currentUser : users)
        {
            if (currentUser.getUsername().equals(user.getUsername()))
            {
                return false;
            }
        }

        return true;
    }
}
