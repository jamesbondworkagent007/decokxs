package com.engagelab.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new a();
    private String defaultHost;
    private String defaultIp;
    private int defaultPort;
    private String defaultReportUrl;
    private String[] sisHostArray;
    private String[] sisIpArray;
    private int sisPort;

    public static final class a implements Parcelable.Creator<Address> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Address createFromParcel(Parcel parcel) {
            return new Address(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Address[] newArray(int i) {
            return new Address[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Address() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDefaultHost() {
        return this.defaultHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDefaultIp() {
        return this.defaultIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDefaultPort() {
        return this.defaultPort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDefaultReportUrl() {
        return this.defaultReportUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getSisHostArray() {
        return this.sisHostArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getSisIpArray() {
        return this.sisIpArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSisPort() {
        return this.sisPort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setDefaultHost(String str) {
        this.defaultHost = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setDefaultIp(String str) {
        this.defaultIp = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setDefaultPort(int i) {
        this.defaultPort = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setDefaultReportUrl(String str) {
        this.defaultReportUrl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setSisHostArray(String... strArr) {
        this.sisHostArray = strArr;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setSisIpArray(String... strArr) {
        this.sisIpArray = strArr;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Address setSisPort(int i) {
        this.sisPort = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  sisHostArray=" + this.sisHostArray + ",\n  sisIpArray=" + this.sisIpArray + ",\n  sisPort=" + this.sisPort + ",\n  defaultHost=" + this.defaultHost + ",\n  defaultIp=" + this.defaultIp + ",\n  defaultHost=" + this.defaultHost + ",\n  defaultPort=" + this.defaultPort + ",\n  defaultReportUrl=" + this.defaultReportUrl + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.sisHostArray);
        parcel.writeStringArray(this.sisIpArray);
        parcel.writeInt(this.sisPort);
        parcel.writeString(this.defaultHost);
        parcel.writeString(this.defaultIp);
        parcel.writeInt(this.defaultPort);
        parcel.writeString(this.defaultReportUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Address(Parcel parcel) {
        this.sisHostArray = parcel.createStringArray();
        this.sisIpArray = parcel.createStringArray();
        this.sisPort = parcel.readInt();
        this.defaultHost = parcel.readString();
        this.defaultIp = parcel.readString();
        this.defaultPort = parcel.readInt();
        this.defaultReportUrl = parcel.readString();
    }
}
