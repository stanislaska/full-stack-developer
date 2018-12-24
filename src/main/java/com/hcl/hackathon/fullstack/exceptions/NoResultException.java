package com.hcl.hackathon.fullstack.exceptions;

/**
 * Exception thrown by service methods performing lookup for resources when resources was not found.
 */
public class NoResultException extends FullStackException {

  private static final long serialVersionUID = 3694452011390771501L;

  /**
   * Constructor from message.
   *
   * @param message    message
   */
  public NoResultException(final String message) {
    super(message);
  }

  /**
   * Constructor from cause.
   *
   * @param cause    cause
   */
  public NoResultException(final Throwable cause) {
    super(cause);
  }

  /**
   * Constructor from message and cause.
   *
   * @param message    message
   * @param cause      cause
   */
  public NoResultException(final String message, final Throwable cause) {
    super(message, cause);
  }
}