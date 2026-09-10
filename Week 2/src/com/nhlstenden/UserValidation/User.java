package com.nhlstenden.UserValidation;

public class User
{
    private String password;
    private int age;
    private String email;
    private String username;

    public User(String password, int age, String email, String username)
    {
        this.setPassword(password);
        this.setAge(age);
        this.setEmail(email);
        this.setUsername(username);
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        if (null == password || password.isBlank())
        {
            return;
        }

        this.password = password;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        if (age < 0)
        {
            return;
        }

        this.age = age;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        if (null == email || email.isBlank())
        {
            return;
        }

        this.email = email;
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        if (null == username || username.isBlank())
        {
            return;
        }

        this.username = username;
    }
}
