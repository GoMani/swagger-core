package com.wordnik.swagger.auth.service;

public class TokenScope {
  public static final ThreadLocal userThreadLocal = new ThreadLocal();

  public static void setUsername(String username) {
    userThreadLocal.set(username);
  }

  public static Long getUsername() {
    return (Long)userThreadLocal.get();
  }

  public static void unsetUsername() {
    userThreadLocal.remove();
  }
}
