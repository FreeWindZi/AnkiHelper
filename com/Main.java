package com;

import com.google.gson.Gson;

public class Main {

    public static void main(String []argv){
        Word word = new Word();
        word.name = "state";

        Type noun = new Type();
        noun.name = "n";
        Definition definition = new Definition();
        definition.meaning = "国家";
        Example example1 = new Example();
        example1.content = "the Baltic States\n" +
                "波罗的海诸国";
        Example example2 = new Example();
        example2.content = "European Union member states\n" +
                "欧盟成员国";
        definition.examples.add(example1);
        definition.examples.add(example2);
        noun.definitions.add(definition);

        Type adj = new Type();
        adj.name = "adj";

        Type v = new Type();
        v.name = "v";

        word.types.add(noun);
        word.types.add(adj);
        word.types.add(v);

        String json = new Gson().toJson(word);
        System.out.println(json);

    }

}
