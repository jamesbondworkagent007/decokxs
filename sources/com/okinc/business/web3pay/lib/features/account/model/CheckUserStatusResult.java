package com.okinc.business.web3pay.lib.features.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CheckUserStatusResult implements Parcelable {
    public static final Parcelable.Creator<CheckUserStatusResult> CREATOR = new Creator();
    public final boolean EZpvd;
    public final List<FreezeScene> KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<CheckUserStatusResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckUserStatusResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FreezeScene.valueOf(parcel.readString()));
            }
            return new CheckUserStatusResult(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckUserStatusResult[] newArray(int i) {
            return new CheckUserStatusResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.account.model.CheckUserStatusResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckUserStatusResult copy$default(CheckUserStatusResult checkUserStatusResult, List list, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = checkUserStatusResult.KWHzl;
        }
        if ((i & 2) != 0) {
            z = checkUserStatusResult.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = checkUserStatusResult.OLrzqt;
        }
        if ((i & 8) != 0) {
            z3 = checkUserStatusResult.EZpvd;
        }
        return checkUserStatusResult.EZpvd(list, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckUserStatusResult EZpvd(@NotNull List<? extends FreezeScene> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CheckUserStatusResult(list, z, z2, z3);
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
        if (!(obj instanceof CheckUserStatusResult)) {
            return false;
        }
        CheckUserStatusResult checkUserStatusResult = (CheckUserStatusResult) obj;
        return Intrinsics.EZpvd(this.KWHzl, checkUserStatusResult.KWHzl) && this.copydefault == checkUserStatusResult.copydefault && this.OLrzqt == checkUserStatusResult.OLrzqt && this.EZpvd == checkUserStatusResult.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckUserStatusResult(freezeScenes=" + this.KWHzl + ", validCefiStatus=" + this.copydefault + ", validEmail=" + this.OLrzqt + ", hasEmail=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FreezeScene> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<FreezeScene> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.web3pay.lib.features.account.model.FreezeScene> */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckUserStatusResult(@NotNull List<? extends FreezeScene> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        this.copydefault = z;
        this.OLrzqt = z2;
        this.EZpvd = z3;
    }
}
