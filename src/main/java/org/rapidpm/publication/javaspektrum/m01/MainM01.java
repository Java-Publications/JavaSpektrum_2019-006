package org.rapidpm.publication.javaspektrum.m01;

import org.rapidpm.dependencies.core.logger.HasLogger;

public class MainM01 implements HasLogger {

  public static void main(String[] args) {
    var inputComponent = new InputComponent();
    inputComponent.setText("Hello Text M01");
    inputComponent.click();

    //critical things
    inputComponent.doSomethingLayoutSpecific();
    inputComponent.horizontalSpecific();
    inputComponent.doFrameworkSpecificThings();
  }
}
