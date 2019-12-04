package org.rapidpm.publication.javaspektrum.m00.component.layout;

public class VerticalLayout
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
