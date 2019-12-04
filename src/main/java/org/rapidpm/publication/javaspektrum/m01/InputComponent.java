package org.rapidpm.publication.javaspektrum.m01;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.publication.javaspektrum.m00.component.Button;
import org.rapidpm.publication.javaspektrum.m00.component.TextField;
import org.rapidpm.publication.javaspektrum.m00.component.layout.HorizontalLayout;

public class InputComponent
    extends HorizontalLayout //Layout is abstract
    implements HasLogger {

  private Button    button    = new Button();
  private TextField textField = new TextField();

  public InputComponent() {
    addComponent(textField);
    addComponent(button);
  }

  public void click() {
    button.click();
  }

  public void setText(String text) {
    textField.setText(text);
  }

  public String getText() {
    return textField.getText();
  }


}
