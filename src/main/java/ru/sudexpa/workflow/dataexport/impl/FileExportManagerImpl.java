package ru.sudexpa.workflow.dataexport.impl;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;
import ru.sudexpa.workflow.dataexport.ExportData;
import ru.sudexpa.workflow.dataexport.IExportManager;

import java.io.File;
import java.io.IOException;

public class FileExportManagerImpl implements IExportManager {

    private String folder;

    public void init() {/**/}

    private File createNewFile() {
        File file = new File(folder + (folder.endsWith("/") ? "" : '/') + System.currentTimeMillis() + ".dt");
        return file.exists() ? createNewFile() : file;
    }

    @Override
    public void exportData(ExportData data) {
        File file = createNewFile();
        try {
            FileUtils.writeByteArrayToFile(file, SerializationUtils.serialize(data));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}
