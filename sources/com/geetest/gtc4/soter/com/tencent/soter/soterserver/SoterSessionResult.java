package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.f7;

/* JADX INFO: loaded from: classes21.dex */
public class SoterSessionResult implements Parcelable {
    public static final Parcelable.Creator<SoterSessionResult> CREATOR = new f7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f509a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SoterSessionResult(Parcel parcel) {
        this.f509a = parcel.readLong();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f509a);
        parcel.writeInt(this.b);
    }
}
