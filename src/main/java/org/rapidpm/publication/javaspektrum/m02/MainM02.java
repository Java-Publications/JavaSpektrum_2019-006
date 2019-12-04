package org.rapidpm.publication.javaspektrum.m02;

import org.rapidpm.dependencies.core.logger.HasLogger;

public class MainM02
    implements HasLogger {

  public static void main(String[] args) {
    var inputComponent = new InputComponent();
    inputComponent.setText("Hello Text M02");
    inputComponent.click();

    //critical things
    inputComponent.doFrameworkSpecificThings();
  }
}
