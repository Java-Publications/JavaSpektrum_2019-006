package org.rapidpm.publication.javaspektrum.solution.component.layout;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.publication.javaspektrum.solution.component.AbstractComponent;

public abstract class Layout
    extends AbstractComponent
    implements HasLogger {

  public void doSomethingLayoutSpecific(){
    logger().info("doSomethingLayoutSpecific");
  }

  public abstract void reOrganizeChildComponents();

}
