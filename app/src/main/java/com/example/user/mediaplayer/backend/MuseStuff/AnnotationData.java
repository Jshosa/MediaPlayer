//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.AnnotationFormat;

public final class AnnotationData {
    final String data;
    final AnnotationFormat format;
    final String eventType;
    final String eventId;
    final String parentId;

    public AnnotationData(String data, AnnotationFormat format, String eventType, String eventId, String parentId) {
        this.data = data;
        this.format = format;
        this.eventType = eventType;
        this.eventId = eventId;
        this.parentId = parentId;
    }

    public String getData() {
        return this.data;
    }

    public AnnotationFormat getFormat() {
        return this.format;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getEventId() {
        return this.eventId;
    }

    public String getParentId() {
        return this.parentId;
    }
}
