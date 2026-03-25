package com.engagelab.privates.analysis.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class Config implements Parcelable {
    public static final Parcelable.Creator<Config> CREATOR = new a();
    public static final int NETWORK_TYPE_ALL = 0;
    public static final int NETWORK_TYPE_MOBILE = 2;
    public static final int NETWORK_TYPE_WIFI = 1;
    private int reportNetworkState;
    private boolean reportTestState;

    public static final class a implements Parcelable.Creator<Config> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Config createFromParcel(Parcel parcel) {
            return new Config(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Config[] newArray(int i) {
            return new Config[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Config() {
        this.reportNetworkState = 0;
        this.reportTestState = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getReportNetworkState() {
        return this.reportNetworkState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public int getReportNetworkType() {
        return this.reportNetworkState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getReportTestState() {
        return this.reportTestState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public boolean getTestReportEnable() {
        return this.reportTestState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Config setReportNetworkState(int i) {
        this.reportNetworkState = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public Config setReportNetworkType(int i) {
        if (i >= 0 && i <= 2) {
            this.reportNetworkState = i;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Config setReportTestState(boolean z) {
        this.reportTestState = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public Config setTestReportEnable(boolean z) {
        this.reportTestState = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  reportNetworkState='" + this.reportNetworkState + ",\n  reportTestState=" + this.reportTestState + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reportNetworkState);
        parcel.writeByte(this.reportTestState ? (byte) 1 : (byte) 0);
    }

    public Config(Parcel parcel) {
        this.reportNetworkState = 0;
        this.reportTestState = false;
        this.reportNetworkState = parcel.readInt();
        this.reportTestState = parcel.readByte() != 0;
    }
}
