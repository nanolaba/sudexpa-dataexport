package ru.sudexpa.workflow.dataexport.impl;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;
import ru.sudexpa.workflow.dataexport.ExportData;
import ru.sudexpa.workflow.dataexport.IImportManager;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public abstract class FileImportManagerImpl implements IImportManager {

    private boolean daemon = true;
    private long interval = 30000;
    private String folder;


    public void init() {
        Timer timer = new Timer(daemon);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                checkFolder();
            }
        }, 0L, interval);
    }

    private synchronized void checkFolder() {
        if (folder != null) {
            File folderFile = new File(folder);
            File[] files = folderFile.listFiles();
            if (files != null) {
                for (File f : files) {
                    try {
                        Object deserialize = SerializationUtils.deserialize(FileUtils.readFileToByteArray(f));
                        importData((ExportData) deserialize);
                        FileUtils.forceDelete(f);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public boolean isDaemon() {
        return daemon;
    }

    public void setDaemon(boolean daemon) {
        this.daemon = daemon;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}
