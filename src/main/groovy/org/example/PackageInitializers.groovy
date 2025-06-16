package org.example

import groovy.transform.PackageScope

class person{
    String name
}

class Man{
    @PackageScope String name1
}

println(person.name)

println(Man.name1)