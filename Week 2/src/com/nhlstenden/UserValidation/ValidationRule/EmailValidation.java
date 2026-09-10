package com.nhlstenden.UserValidation.ValidationRule;

import com.nhlstenden.UserValidation.User;

import java.util.List;

public class EmailValidation implements ValidationRule
{
    public EmailValidation()
    {
    }

    @Override
    public boolean Validate(User user, List<User> users)
    {
        String email = user.getEmail();

        return (email.contains("@") && !email.isBlank());
    }
}
