package org.rapidpm.publication.javaspektrum.m00.component;

public interface Component {

  interface Registration {
    void remove();
  }

  Registration addComponent(Component c);
  void removeAllComponents();
}
