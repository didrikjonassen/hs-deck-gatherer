package me.didrik.hs_deck_gatherer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileParser {

    static Card[] parse(File file) throws IOException {

        return Files.lines(file.toPath()).map((s) -> {
            String[] list = s.split(",");
            return new Card(list[0].trim(), list[1].trim());
        }).toArray(size -> new Card[size]);

    }
}
