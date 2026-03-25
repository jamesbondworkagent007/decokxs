package com.okinc.dexkline.market.features.overview.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinLabelInfo implements Parcelable {
    public static final Parcelable.Creator<CoinLabelInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AhwBna;
    public final String EZpvd;
    public final CoinInfoGridCellId KWHzl;
    public final int OLrzqt;
    public final String copydefault;
    public final Integer djBIcL;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<CoinLabelInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinLabelInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinLabelInfo(CoinInfoGridCellId.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinLabelInfo[] newArray(int i) {
            return new CoinLabelInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinLabelInfo KWHzl(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @ColorInt int i, @DrawableRes Integer num) {
        Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CoinLabelInfo(coinInfoGridCellId, str, str2, str3, str4, str5, i, num);
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
        if (!(obj instanceof CoinLabelInfo)) {
            return false;
        }
        CoinLabelInfo coinLabelInfo = (CoinLabelInfo) obj;
        return this.KWHzl == coinLabelInfo.KWHzl && Intrinsics.EZpvd((Object) this.AhwBna, (Object) coinLabelInfo.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) coinLabelInfo.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) coinLabelInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) coinLabelInfo.EZpvd) && Intrinsics.EZpvd((Object) this.valueOf, (Object) coinLabelInfo.valueOf) && this.OLrzqt == coinLabelInfo.OLrzqt && Intrinsics.EZpvd(this.djBIcL, coinLabelInfo.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.EZpvd.hashCode();
        int iHashCode6 = this.valueOf.hashCode();
        int iHashCode7 = Integer.hashCode(this.OLrzqt);
        Integer num = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinLabelInfo(id=" + this.KWHzl + ", title=" + this.AhwBna + ", description=" + this.copydefault + ", label=" + this.AEQbTJ + ", content=" + this.EZpvd + ", leadingIconUrl=" + this.valueOf + ", iconTint=" + this.OLrzqt + ", leadingIconRes=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.OLrzqt);
        Integer num = this.djBIcL;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public CoinLabelInfo(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @ColorInt int i, @DrawableRes Integer num) {
        Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = coinInfoGridCellId;
        this.AhwBna = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
        this.valueOf = str5;
        this.OLrzqt = i;
        this.djBIcL = num;
    }
}
