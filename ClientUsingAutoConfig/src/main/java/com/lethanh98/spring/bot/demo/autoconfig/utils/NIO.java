package com.lethanh98.spring.bot.demo.autoconfig.utils;

import java.util.Arrays;
import java.util.List;

public class NIO {
    public static void runMultilTaskSync(Runnable... runnables) {
        List<Runnable> runnableList = Arrays.asList(runnables);
        runnableList.parallelStream().forEach(Runnable::run);
    }

    public static void runMultilTaskSync(List<Runnable> runnables) {
        runnables.parallelStream().forEach(Runnable::run);
    }
}
