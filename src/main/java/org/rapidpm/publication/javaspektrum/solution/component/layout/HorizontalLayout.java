package org.rapidpm.publication.javaspektrum.solution.component.layout;

public final class HorizontalLayout
    extends Layout {
  @Override
  public void reOrganizeChildComponents() {
    logger().info("reOrganizeChildComponents - HorizontalWay");
  }

  public void horizontalSpecific() {}

  public void doFrameworkSpecificThings() {
    logger().info("doFrameworkSpecificThings - " + this.getClass().getSimpleName());
  }
}
