//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.user.mediaplayer.backend.MuseStuff;

import com.example.user.mediaplayer.backend.MuseStuff.MusePreset;
import com.example.user.mediaplayer.backend.MuseStuff.NotchFrequency;

public final class MuseConfiguration {
    final MusePreset preset;
    final int eegChannelCount;
    final int afeGain;
    final int downsampleRate;
    final int seroutMode;
    final int outputFrequency;
    final int adcFrequency;
    final boolean notchFilterEnabled;
    final NotchFrequency notchFilter;
    final int accelerometerSampleFrequency;
    final boolean batteryDataEnabled;
    final boolean drlRefEnabled;
    final int drlRefFrequency;
    final double batteryPercentRemaining;
    final String bluetoothMac;
    final String serialNumber;

    public MuseConfiguration(MusePreset preset, int eegChannelCount, int afeGain, int downsampleRate, int seroutMode, int outputFrequency, int adcFrequency, boolean notchFilterEnabled, NotchFrequency notchFilter, int accelerometerSampleFrequency, boolean batteryDataEnabled, boolean drlRefEnabled, int drlRefFrequency, double batteryPercentRemaining, String bluetoothMac, String serialNumber) {
        this.preset = preset;
        this.eegChannelCount = eegChannelCount;
        this.afeGain = afeGain;
        this.downsampleRate = downsampleRate;
        this.seroutMode = seroutMode;
        this.outputFrequency = outputFrequency;
        this.adcFrequency = adcFrequency;
        this.notchFilterEnabled = notchFilterEnabled;
        this.notchFilter = notchFilter;
        this.accelerometerSampleFrequency = accelerometerSampleFrequency;
        this.batteryDataEnabled = batteryDataEnabled;
        this.drlRefEnabled = drlRefEnabled;
        this.drlRefFrequency = drlRefFrequency;
        this.batteryPercentRemaining = batteryPercentRemaining;
        this.bluetoothMac = bluetoothMac;
        this.serialNumber = serialNumber;
    }

    public MusePreset getPreset() {
        return this.preset;
    }

    public int getEegChannelCount() {
        return this.eegChannelCount;
    }

    public int getAfeGain() {
        return this.afeGain;
    }

    public int getDownsampleRate() {
        return this.downsampleRate;
    }

    public int getSeroutMode() {
        return this.seroutMode;
    }

    public int getOutputFrequency() {
        return this.outputFrequency;
    }

    public int getAdcFrequency() {
        return this.adcFrequency;
    }

    public boolean getNotchFilterEnabled() {
        return this.notchFilterEnabled;
    }

    public NotchFrequency getNotchFilter() {
        return this.notchFilter;
    }

    public int getAccelerometerSampleFrequency() {
        return this.accelerometerSampleFrequency;
    }

    public boolean getBatteryDataEnabled() {
        return this.batteryDataEnabled;
    }

    public boolean getDrlRefEnabled() {
        return this.drlRefEnabled;
    }

    public int getDrlRefFrequency() {
        return this.drlRefFrequency;
    }

    public double getBatteryPercentRemaining() {
        return this.batteryPercentRemaining;
    }

    public String getBluetoothMac() {
        return this.bluetoothMac;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}
