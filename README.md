# Read Me

The original idea is from  
https://medium.com/@mbanaee61/understanding-yaml-inheritance-and-its-implementation-in-spring-boot-with-junit-tests-6b39d9474dc8

# Understanding YAML Inheritance

YAML allows for defining reusable structures and hierarchies through anchors (&) and aliases (*). Here's a deeper dive
into these concepts:

Anchors (&): Anchors are used to mark a YAML element for future reference. They serve as unique identifiers for specific
data structures.
Aliases (*): Aliases are references to previously defined anchors. They allow you to reuse the content defined by an
anchor elsewhere in the YAML document.

For example

```
# Define a base configuration
base-config: &base
  key1: value1
  key2: value2

# Inherit from the base configuration and override a property
derived-config:
  <<: *base
  key2: overridden_value
```