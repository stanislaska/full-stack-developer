package com.hcl.hackathon.fullstack.exceptions;

/**
 * Root of the tree of POSC platform specific exceptions.
 * This exception is made unchecked to allow invocation of methods that can throw this exception
 * without surrounding this method by try/catch .
 */
public class FullStackException extends RuntimeException {
  private static final long serialVersionUID = 4945822729353229083L;


  /**
   * Constructor from message.
   *
   * @param message    message.
   */
  public FullStackException(final String message) {
    super(message);
  }

  /**
   * Constructor from cause.
   *
   * @param cause cause
   */
  public FullStackException(final Throwable cause) {
    super(cause);
  }

  /**
   * Constructor from message and cause.
   *
   * @param message    message
   * @param cause      cause
   */
  public FullStackException(final String message, final Throwable cause) {
    super(message, cause);
  }

}