package ru.plum.polybooru.models;

public class Image {
    private String name;
    private String extension;
    private Long size;
    private byte[] bytes;

    public Image(String name, String extension, Long size, byte[] bytes) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.bytes = bytes;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public Long getSize() {
        return size;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
