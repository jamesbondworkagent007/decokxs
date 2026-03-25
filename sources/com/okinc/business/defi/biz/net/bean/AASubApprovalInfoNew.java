package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AASubApprovalInfoNew implements Parcelable {
    public static final Parcelable.Creator<AASubApprovalInfoNew> CREATOR = new Creator();
    public String AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final int KWHzl;
    public final String OLrzqt;
    public String copydefault;
    public boolean gEmmrt;

    public static final class Creator implements Parcelable.Creator<AASubApprovalInfoNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AASubApprovalInfoNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AASubApprovalInfoNew(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AASubApprovalInfoNew[] newArray(int i) {
            return new AASubApprovalInfoNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.OLrzqt);
    }

    public AASubApprovalInfoNew(boolean z, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, int i, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.gEmmrt = z;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.AYXKKw = str4;
        this.KWHzl = i;
        this.OLrzqt = str5;
    }
}
