//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

public final class ComputingDeviceConfiguration {
    final String osType;
    final String osVersion;
    final String hardwareModelName;
    final String hardwareModelId;
    final String processorName;
    final String processorSpeed;
    final int numberOfProcessors;
    final String memorySize;
    final String bluetoothVersion;
    final String timeZone;
    final int timeZoneOffsetSeconds;

    public ComputingDeviceConfiguration(String osType, String osVersion, String hardwareModelName, String hardwareModelId, String processorName, String processorSpeed, int numberOfProcessors, String memorySize, String bluetoothVersion, String timeZone, int timeZoneOffsetSeconds) {
        this.osType = osType;
        this.osVersion = osVersion;
        this.hardwareModelName = hardwareModelName;
        this.hardwareModelId = hardwareModelId;
        this.processorName = processorName;
        this.processorSpeed = processorSpeed;
        this.numberOfProcessors = numberOfProcessors;
        this.memorySize = memorySize;
        this.bluetoothVersion = bluetoothVersion;
        this.timeZone = timeZone;
        this.timeZoneOffsetSeconds = timeZoneOffsetSeconds;
    }

    public String getOsType() {
        return this.osType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getHardwareModelName() {
        return this.hardwareModelName;
    }

    public String getHardwareModelId() {
        return this.hardwareModelId;
    }

    public String getProcessorName() {
        return this.processorName;
    }

    public String getProcessorSpeed() {
        return this.processorSpeed;
    }

    public int getNumberOfProcessors() {
        return this.numberOfProcessors;
    }

    public String getMemorySize() {
        return this.memorySize;
    }

    public String getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public int getTimeZoneOffsetSeconds() {
        return this.timeZoneOffsetSeconds;
    }
}
