//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

public final class MuseVersion {
    final String runningState;
    final String hardwareVersion;
    final String firmwareVersion;
    final String bootloaderVersion;
    final String firmwareBuildNumber;
    final String firmwareType;
    final int protocolVersion;

    public MuseVersion(String runningState, String hardwareVersion, String firmwareVersion, String bootloaderVersion, String firmwareBuildNumber, String firmwareType, int protocolVersion) {
        this.runningState = runningState;
        this.hardwareVersion = hardwareVersion;
        this.firmwareVersion = firmwareVersion;
        this.bootloaderVersion = bootloaderVersion;
        this.firmwareBuildNumber = firmwareBuildNumber;
        this.firmwareType = firmwareType;
        this.protocolVersion = protocolVersion;
    }

    public String getRunningState() {
        return this.runningState;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getBootloaderVersion() {
        return this.bootloaderVersion;
    }

    public String getFirmwareBuildNumber() {
        return this.firmwareBuildNumber;
    }

    public String getFirmwareType() {
        return this.firmwareType;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }
}
