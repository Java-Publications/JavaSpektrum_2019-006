package org.rapidpm.publication.javaspektrum.m00.component;

import org.rapidpm.dependencies.core.logger.HasLogger;

public class Button
    extends AbstractComponent
    implements HasLogger {

  public void click() {
    logger().info("button was clicked");
  }

  public void doFrameworkSpecificThings() {
    logger().info("doFrameworkSpecificThings - " + this.getClass().getSimpleName());
  }

}
