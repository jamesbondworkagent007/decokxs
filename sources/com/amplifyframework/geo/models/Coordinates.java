package com.amplifyframework.geo.models;

import androidx.camera.video.AudioStats;
import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class Coordinates implements Geometry {
    private double latitude;
    private double longitude;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getLatitude() {
        return this.latitude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getLongitude() {
        return this.longitude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLatitude(double d) {
        this.latitude = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLongitude(double d) {
        this.longitude = d;
    }

    public Coordinates() {
        this(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public Coordinates(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public double centralAngle(Coordinates coordinates) {
        double radians = Math.toRadians(this.latitude - coordinates.latitude);
        double radians2 = Math.toRadians(this.longitude - coordinates.longitude);
        double d = radians / 2.0d;
        double dSin = Math.sin(d);
        double dSin2 = Math.sin(d);
        double d2 = radians2 / 2.0d;
        double dSin3 = Math.sin(d2);
        double dSin4 = Math.sin(d2);
        double dCos = (dSin * dSin2) + (dSin3 * dSin4 * Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(coordinates.latitude)));
        return Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 2.0d;
    }

    public String toString() {
        return "Coordinates{latitude=" + this.latitude + ", longitude=" + this.longitude + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Coordinates.class != obj.getClass()) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return ObjectsCompat.equals(Double.valueOf(this.latitude), Double.valueOf(coordinates.latitude)) && ObjectsCompat.equals(Double.valueOf(this.longitude), Double.valueOf(coordinates.longitude));
    }

    public int hashCode() {
        return ObjectsCompat.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }
}
