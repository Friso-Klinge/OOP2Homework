package com.nhlstenden.UserValidation.ValidationRule;

import com.nhlstenden.UserValidation.User;

import java.util.List;

public interface ValidationRule
{
    public boolean Validate(User user, List<User> users);
}
