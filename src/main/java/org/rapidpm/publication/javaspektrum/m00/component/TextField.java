package org.rapidpm.publication.javaspektrum.m00.component;

import org.rapidpm.dependencies.core.logger.HasLogger;

public class TextField
    extends AbstractComponent
    implements HasLogger {

  private String text;

  public void setText(String text) {
    this.text = text;
    logger().info("setText .. " + this.text);
  }

  public String getText() {
    logger().info("getText .. " + text);
    return text;
  }

  public void doFrameworkSpecificThings() {
    logger().info("doFrameworkSpecificThings - " + this.getClass().getSimpleName());
  }
}
