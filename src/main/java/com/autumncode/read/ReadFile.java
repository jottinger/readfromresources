package com.autumncode.read;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
    public static void main(String[] args) {
        ReadFile rf=new ReadFile();
        System.out.println(rf.data);
    }

    List<String> data=new ArrayList<>();
    ReadFile() {
        InputStream is=ReadFile.class.getResourceAsStream("/conf.txt");
        if(is==null) {
            is=ReadFile.class.getResourceAsStream("/config/conf.txt");
        }
        if(is==null) {
            is=ReadFile.class.getResourceAsStream("conf.txt");
        }
        data =
                new BufferedReader(new InputStreamReader(is,
                        StandardCharsets.UTF_8)).lines().collect(Collectors.toList());
    }
}
