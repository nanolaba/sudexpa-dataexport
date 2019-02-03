package ru.sudexpa.workflow.dataexport;

import java.io.Serializable;
import java.util.Arrays;

public class FileData implements Serializable {

    private static final long serialVersionUID = 7550276225182025680L;

    private String filename;
    private String contentType;
    private byte[] data;

    public FileData() {/**/}

    public FileData(String filename, String contentType, byte[] data) {
        this.filename = filename;
        this.contentType = contentType;
        this.data = data;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileData fileData = (FileData) o;

        if (contentType != null ? !contentType.equals(fileData.contentType) : fileData.contentType != null)
            return false;
        if (!Arrays.equals(data, fileData.data)) return false;
        if (filename != null ? !filename.equals(fileData.filename) : fileData.filename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filename != null ? filename.hashCode() : 0;
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (data != null ? Arrays.hashCode(data) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "filename='" + filename + '\'' +
                ", contentType='" + contentType + '\'' +
                ", data=" + data +
                '}';
    }
}
