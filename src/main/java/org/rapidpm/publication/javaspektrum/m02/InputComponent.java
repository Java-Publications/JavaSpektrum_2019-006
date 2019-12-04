package org.rapidpm.publication.javaspektrum.m02;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.publication.javaspektrum.m00.component.AbstractComponent;
import org.rapidpm.publication.javaspektrum.m00.component.Button;
import org.rapidpm.publication.javaspektrum.m00.component.TextField;
import org.rapidpm.publication.javaspektrum.m00.component.layout.HorizontalLayout;

public class InputComponent
    extends AbstractComponent
    implements HasLogger {

  private Button    button    = new Button();
  private TextField textField = new TextField();

  public InputComponent() {
    var layout = new HorizontalLayout();
    layout.addComponent(textField);
    layout.addComponent(button);
    addComponent(layout);
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

  // to deep into the framework for EndUser
  public void doFrameworkSpecificThings() {
    logger().info("doFrameworkSpecificThings - " + this.getClass().getSimpleName());
  }
}
