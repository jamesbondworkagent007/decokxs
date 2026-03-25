package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.a7;

/* JADX INFO: loaded from: classes21.dex */
public class SoterExtraParam implements Parcelable {
    public static final Parcelable.Creator<SoterExtraParam> CREATOR = new a7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f508a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SoterExtraParam(Parcel parcel) {
        this.f508a = parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f508a);
    }
}
