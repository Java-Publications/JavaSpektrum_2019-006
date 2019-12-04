package org.rapidpm.publication.javaspektrum.m00.component.layout;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.publication.javaspektrum.m00.component.AbstractComponent;

public abstract class Layout
    extends AbstractComponent implements HasLogger {

  public void doSomethingLayoutSpecific(){
    logger().info("doSomethingLayoutSpecific");
  }

  public abstract void reOrganizeChildComponents();

}
