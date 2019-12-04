package org.rapidpm.publication.javaspektrum.solution.component;

public interface Component {

  interface Registration {
    void remove();
  }

  Registration addComponent(Component c);
  void removeAllComponents();
}
