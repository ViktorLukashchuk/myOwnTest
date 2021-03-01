package com.test.ui;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pages.Constructors;
import pages.Position;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Position> result = mapper.readValue(new File("standing.json"), new TypeReference<List<Position>>(){});

        System.out.println(result);
    }
}
