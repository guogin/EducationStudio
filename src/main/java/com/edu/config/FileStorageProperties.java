package com.edu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "file.storage")
public class FileStorageProperties {
    private String location = "upload-dir";

    public String getRootDirectory() {
        return location;
    }

    public void setRootDirectory(String location) {
        this.location = location;
    }
}
