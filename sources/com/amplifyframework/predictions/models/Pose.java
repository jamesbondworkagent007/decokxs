package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes21.dex */
public final class Pose {
    private final double pitch;
    private final double roll;
    private final double yaw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getPitch() {
        return this.pitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getRoll() {
        return this.roll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getYaw() {
        return this.yaw;
    }

    public Pose(double d, double d2, double d3) {
        this.pitch = d;
        this.roll = d2;
        this.yaw = d3;
    }
}
