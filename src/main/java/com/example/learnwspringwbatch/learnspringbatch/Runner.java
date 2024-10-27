package com.example.learnwspringwbatch.learnspringbatch;

import org.springframework.batch.core.step.tasklet.CommandRunner;

import java.io.File;
import java.io.IOException;

public class Runner implements CommandRunner {

    @Override
    public Process exec(String[] command, String[] envp, File dir) throws IOException {
        return null;
    }
}
