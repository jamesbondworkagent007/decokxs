package com.okinc.dex;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TPSLItemData implements Parcelable {
    public static final Parcelable.Creator<TPSLItemData> CREATOR = new Creator();
    public final DexTPSLLabelType AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final DexTPSLLabelType OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<TPSLItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TPSLItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<DexTPSLLabelType> creator = DexTPSLLabelType.CREATOR;
            return new TPSLItemData(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TPSLItemData[] newArray(int i) {
            return new TPSLItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TPSLItemData copy$default(TPSLItemData tPSLItemData, DexTPSLLabelType dexTPSLLabelType, DexTPSLLabelType dexTPSLLabelType2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            dexTPSLLabelType = tPSLItemData.AEQbTJ;
        }
        if ((i & 2) != 0) {
            dexTPSLLabelType2 = tPSLItemData.OLrzqt;
        }
        DexTPSLLabelType dexTPSLLabelType3 = dexTPSLLabelType2;
        if ((i & 4) != 0) {
            str = tPSLItemData.EZpvd;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = tPSLItemData.copydefault;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = tPSLItemData.KWHzl;
        }
        return tPSLItemData.copydefault(dexTPSLLabelType, dexTPSLLabelType3, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TPSLItemData copydefault(@NotNull DexTPSLLabelType dexTPSLLabelType, @NotNull DexTPSLLabelType dexTPSLLabelType2, @NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(dexTPSLLabelType, "");
        Intrinsics.checkNotNullParameter(dexTPSLLabelType2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TPSLItemData(dexTPSLLabelType, dexTPSLLabelType2, str, str2, str3);
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
        if (!(obj instanceof TPSLItemData)) {
            return false;
        }
        TPSLItemData tPSLItemData = (TPSLItemData) obj;
        return this.AEQbTJ == tPSLItemData.AEQbTJ && this.OLrzqt == tPSLItemData.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tPSLItemData.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tPSLItemData.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tPSLItemData.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        String str = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TPSLItemData(tpSlType=" + this.AEQbTJ + ", sellBuyType=" + this.OLrzqt + ", tpSlValue=" + this.EZpvd + ", sellBuyValue=" + this.copydefault + ", orderId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AEQbTJ.writeToParcel(parcel, i);
        this.OLrzqt.writeToParcel(parcel, i);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
    }

    public TPSLItemData(@NotNull DexTPSLLabelType dexTPSLLabelType, @NotNull DexTPSLLabelType dexTPSLLabelType2, @NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(dexTPSLLabelType, "");
        Intrinsics.checkNotNullParameter(dexTPSLLabelType2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = dexTPSLLabelType;
        this.OLrzqt = dexTPSLLabelType2;
        this.EZpvd = str;
        this.copydefault = str2;
        this.KWHzl = str3;
    }
}
