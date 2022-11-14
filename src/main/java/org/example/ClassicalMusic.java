package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}