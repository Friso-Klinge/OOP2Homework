package com.nhlstenden.UserValidation.ValidationRule;

import com.nhlstenden.UserValidation.User;

import java.util.List;
import java.util.regex.Pattern;

public class PasswordValidation implements ValidationRule
{
    private boolean requireNoSpaces;
    private boolean requireSpecialChar;
    private boolean requireNumbers;
    private boolean requireUpperCase;
    private boolean requireLowerCase;

    public PasswordValidation(boolean requireNoSpaces, boolean requireSpecialChar, boolean requireNumbers, boolean requireUpperCase, boolean requireLowerCase)
    {
        this.setRequireNoSpaces(requireNoSpaces);
        this.setRequireSpecialChar(requireSpecialChar);
        this.setRequireNumbers(requireNumbers);
        this.setRequireUpperCase(requireUpperCase);
        this.setRequireLowerCase(requireLowerCase);
    }

    public boolean isRequireNoSpaces()
    {
        return this.requireNoSpaces;
    }

    public void setRequireNoSpaces(boolean requireNoSpaces)
    {
        this.requireNoSpaces = requireNoSpaces;
    }

    public boolean isRequireSpecialChar()
    {
        return this.requireSpecialChar;
    }

    public void setRequireSpecialChar(boolean requireSpecialChar)
    {
        this.requireSpecialChar = requireSpecialChar;
    }

    public boolean isRequireNumbers()
    {
        return this.requireNumbers;
    }

    public void setRequireNumbers(boolean requireNumbers)
    {
        this.requireNumbers = requireNumbers;
    }

    public boolean isRequireUpperCase()
    {
        return this.requireUpperCase;
    }

    public void setRequireUpperCase(boolean requireUpperCase)
    {
        this.requireUpperCase = requireUpperCase;
    }

    public boolean isRequireLowerCase()
    {
        return this.requireLowerCase;
    }

    public void setRequireLowerCase(boolean requireLowerCase)
    {
        this.requireLowerCase = requireLowerCase;
    }

    @Override
    public boolean Validate(User user, List<User> users)
    {
        if (!validateSpaces(user.getPassword())){return false;}
        if (!validateSpecialCharacters(user.getPassword())){return false;}
        if (!validateNumbers(user.getPassword())){return false;}
        if (!validateLowerCase(user.getPassword())){return false;}
        if (!validateUpperCase(user.getPassword())){return false;}

        return true;
    }

    private boolean validateSpaces(String password)
    {
        if (!this.isRequireNoSpaces())
        {
            return true;
        }

        return !password.contains(" ");
    }

    private boolean validateSpecialCharacters(String password)
    {
        if (!this.isRequireSpecialChar())
        {
            return true;
        }

        if(Pattern.compile("[^A-Za-z0-9]").matcher(password).find())
        {
            return true;
        }

        return false;
    }

    private boolean validateNumbers(String password)
    {
        if (!this.isRequireNumbers())
        {
            return true;
        }

        if(Pattern.compile("[0-9]").matcher(password).find())
        {
            return true;
        }

        return false;
    }

    private boolean validateLowerCase(String password)
    {
        if (!this.isRequireLowerCase())
        {
            return true;
        }

        if(Pattern.compile("[a-z]").matcher(password).find())
        {
            return true;
        }

        return false;
    }

    private boolean validateUpperCase(String password)
    {
        if (!this.isRequireUpperCase())
        {
            return true;
        }

        if(Pattern.compile("[A-Z]").matcher(password).find())
        {
            return true;
        }

        return false;
    }
}
