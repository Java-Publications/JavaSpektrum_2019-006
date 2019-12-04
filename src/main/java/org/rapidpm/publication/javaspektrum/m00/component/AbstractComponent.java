package org.rapidpm.publication.javaspektrum.m00.component;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComponent implements Component {

  private final List<Component> componentList = new ArrayList<>();

  @Override
  public Registration addComponent(Component c) {
    componentList.add(c);
    return () -> componentList.remove(c);
  }

  @Override
  public void removeAllComponents(){
    componentList.forEach(Component::removeAllComponents);
  }

  //technical things
  public abstract void doFrameworkSpecificThings();

}
