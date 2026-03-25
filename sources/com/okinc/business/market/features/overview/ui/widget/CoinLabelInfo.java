package com.okinc.business.market.features.overview.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CoinLabelInfo implements Parcelable {
    public static final Parcelable.Creator<CoinLabelInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Integer AhwBna;
    public final String EZpvd;
    public final int KWHzl;
    public final CoinInfoGridCellId OLrzqt;
    public final String copydefault;
    public final String gEmmrt;
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
    public final CoinLabelInfo OLrzqt(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @ColorInt int i, @DrawableRes Integer num) {
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
        return this.OLrzqt == coinLabelInfo.OLrzqt && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) coinLabelInfo.gEmmrt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) coinLabelInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) coinLabelInfo.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) coinLabelInfo.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) coinLabelInfo.valueOf) && this.KWHzl == coinLabelInfo.KWHzl && Intrinsics.EZpvd(this.AhwBna, coinLabelInfo.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        int iHashCode6 = this.valueOf.hashCode();
        int iHashCode7 = Integer.hashCode(this.KWHzl);
        Integer num = this.AhwBna;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinLabelInfo(id=" + this.OLrzqt + ", title=" + this.gEmmrt + ", description=" + this.AEQbTJ + ", label=" + this.EZpvd + ", content=" + this.copydefault + ", leadingIconUrl=" + this.valueOf + ", iconTint=" + this.KWHzl + ", leadingIconRes=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.KWHzl);
        Integer num = this.AhwBna;
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
        this.OLrzqt = coinInfoGridCellId;
        this.gEmmrt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.valueOf = str5;
        this.KWHzl = i;
        this.AhwBna = num;
    }
}
