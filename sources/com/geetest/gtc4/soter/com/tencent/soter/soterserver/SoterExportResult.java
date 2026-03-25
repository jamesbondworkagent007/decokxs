package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.z6;

/* JADX INFO: loaded from: classes21.dex */
public class SoterExportResult implements Parcelable {
    public static final Parcelable.Creator<SoterExportResult> CREATOR = new z6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f507a;
    public final byte[] b;
    public final int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SoterExportResult(Parcel parcel) {
        this.f507a = parcel.readInt();
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f507a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
    }
}
