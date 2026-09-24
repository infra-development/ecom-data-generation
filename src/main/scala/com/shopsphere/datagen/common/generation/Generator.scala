package com.shopsphere.datagen.common.generation

trait Generator[T] {
  def generate(): T
}