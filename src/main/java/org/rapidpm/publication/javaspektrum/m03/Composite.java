package org.rapidpm.publication.javaspektrum.m03;

import org.rapidpm.publication.javaspektrum.m00.component.AbstractComponent;
import org.rapidpm.publication.javaspektrum.m00.component.Component;

public class Composite<T extends AbstractComponent>
    implements Component {

  private final T component;

  public Composite(T component) {
    this.component = component;
  }

  public T getComponent() {
    return (T) component;
  }

  @Override
  public Registration addComponent(Component c) {
    return component.addComponent(c);
  }

  @Override
  public void removeAllComponents() {
    component.removeAllComponents();
  }

}
