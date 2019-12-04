package org.rapidpm.publication.javaspektrum.solution.component.layout;

public final class VerticalLayout
    extends Layout {

  @Override
  public void reOrganizeChildComponents() {
    logger().info("reOrganizeChildComponents - VerticalWay");
  }

  public void verticalSpecific(){}

  public void doFrameworkSpecificThings() {
    logger().info("doFrameworkSpecificThings - " + this.getClass().getSimpleName());
  }
}
