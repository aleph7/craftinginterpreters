package com.craftinginterpreters.vox;

class Local {
  final Local previous;
  final String name;
  Object value;

  Local(Local previous, String name, Object value) {
    this.previous = previous;
    this.name = name;
    this.value = value;
  }
}
