package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceFrgParam implements Parcelable {
    public static final Parcelable.Creator<DexEntranceFrgParam> CREATOR = new Creator();
    public final long AEQbTJ;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<DexEntranceFrgParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEntranceFrgParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexEntranceFrgParam(parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEntranceFrgParam[] newArray(int i) {
            return new DexEntranceFrgParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexEntranceFrgParam copy$default(DexEntranceFrgParam dexEntranceFrgParam, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dexEntranceFrgParam.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = dexEntranceFrgParam.OLrzqt;
        }
        return dexEntranceFrgParam.EZpvd(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexEntranceFrgParam EZpvd(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DexEntranceFrgParam(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexEntranceFrgParam)) {
            return false;
        }
        DexEntranceFrgParam dexEntranceFrgParam = (DexEntranceFrgParam) obj;
        return this.AEQbTJ == dexEntranceFrgParam.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dexEntranceFrgParam.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.AEQbTJ) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexEntranceFrgParam(chainId=" + this.AEQbTJ + ", tokenAddress=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
    }

    public DexEntranceFrgParam(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = j;
        this.OLrzqt = str;
    }
}
