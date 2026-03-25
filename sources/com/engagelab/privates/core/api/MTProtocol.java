package com.engagelab.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class MTProtocol implements Parcelable {
    public static final Parcelable.Creator<MTProtocol> CREATOR = new a();
    private byte[] body;
    private int command;
    private long rid;
    private String threadName;
    private int version;

    public static final class a implements Parcelable.Creator<MTProtocol> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MTProtocol createFromParcel(Parcel parcel) {
            return new MTProtocol(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MTProtocol[] newArray(int i) {
            return new MTProtocol[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MTProtocol() {
        this.rid = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getCommand() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getRid() {
        return this.rid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getThreadName() {
        return this.threadName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MTProtocol setBody(byte[] bArr) {
        this.body = bArr;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MTProtocol setCommand(int i) {
        this.command = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MTProtocol setRid(long j) {
        this.rid = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MTProtocol setThreadName(String str) {
        this.threadName = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MTProtocol setVersion(int i) {
        this.version = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  rid=" + this.rid + ",\n  command=" + this.command + ",\n  version=" + this.version + ",\n  body=" + this.body + ",\n  threadName=" + this.threadName + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.rid);
        parcel.writeInt(this.command);
        parcel.writeInt(this.version);
        parcel.writeByteArray(this.body);
        parcel.writeString(this.threadName);
    }

    public MTProtocol(Parcel parcel) {
        this.rid = 0L;
        this.rid = parcel.readInt();
        this.command = parcel.readInt();
        this.version = parcel.readInt();
        this.body = parcel.createByteArray();
        this.threadName = parcel.readString();
    }
}
