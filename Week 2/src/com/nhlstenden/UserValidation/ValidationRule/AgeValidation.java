package com.nhlstenden.UserValidation.ValidationRule;

import com.nhlstenden.UserValidation.User;

import java.util.List;

public class AgeValidation implements ValidationRule
{
    private int minimumAge;

    public AgeValidation(int minimumAge)
    {
        this.setMinimumAge(minimumAge);
    }

    public int getMinimumAge()
    {
        return this.minimumAge;
    }

    public void setMinimumAge(int minimumAge)
    {
        if (minimumAge < 0)
        {
            return;
        }

        this.minimumAge = minimumAge;
    }

    @Override
    public boolean Validate(User user, List<User> users)
    {
        return user.getAge() >= this.minimumAge;
    }
}
