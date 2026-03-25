package com.okinc.dexkline.market.features.overview.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dexkline.market.domain.model.coininfo.Social;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Overview implements Parcelable {
    public static final Parcelable.Creator<Overview> CREATOR = new Creator();
    public final BasicInfo AEQbTJ;
    public final MarketInfo EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final MemeInfo copydefault;
    public final String djBIcL;
    public final TransactionInfo gEmmrt;
    public final List<Social> valueOf;

    public static final class Creator implements Parcelable.Creator<Overview> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Overview createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TransactionInfo transactionInfoCreateFromParcel = TransactionInfo.CREATOR.createFromParcel(parcel);
            MemeInfo memeInfoCreateFromParcel = MemeInfo.CREATOR.createFromParcel(parcel);
            BasicInfo basicInfoCreateFromParcel = BasicInfo.CREATOR.createFromParcel(parcel);
            MarketInfo marketInfoCreateFromParcel = MarketInfo.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Social.CREATOR.createFromParcel(parcel));
            }
            return new Overview(transactionInfoCreateFromParcel, memeInfoCreateFromParcel, basicInfoCreateFromParcel, marketInfoCreateFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Overview[] newArray(int i) {
            return new Overview[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfo AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeInfo EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfo KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Overview OLrzqt(@NotNull TransactionInfo transactionInfo, @NotNull MemeInfo memeInfo, @NotNull BasicInfo basicInfo, @NotNull MarketInfo marketInfo, @NotNull List<Social> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(transactionInfo, "");
        Intrinsics.checkNotNullParameter(memeInfo, "");
        Intrinsics.checkNotNullParameter(basicInfo, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Overview(transactionInfo, memeInfo, basicInfo, marketInfo, list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Social> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Overview)) {
            return false;
        }
        Overview overview = (Overview) obj;
        return Intrinsics.EZpvd(this.gEmmrt, overview.gEmmrt) && Intrinsics.EZpvd(this.copydefault, overview.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, overview.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, overview.EZpvd) && Intrinsics.EZpvd(this.valueOf, overview.valueOf) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) overview.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) overview.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) overview.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.gEmmrt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Overview(transactionInfo=" + this.gEmmrt + ", memeInfo=" + this.copydefault + ", basicInfo=" + this.AEQbTJ + ", marketInfo=" + this.EZpvd + ", socialMedia=" + this.valueOf + ", bundleHoldingRatio=" + this.KWHzl + ", devHoldingRatio=" + this.OLrzqt + ", suspiciousHoldingRatio=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.gEmmrt.writeToParcel(parcel, i);
        this.copydefault.writeToParcel(parcel, i);
        this.AEQbTJ.writeToParcel(parcel, i);
        this.EZpvd.writeToParcel(parcel, i);
        List<Social> list = this.valueOf;
        parcel.writeInt(list.size());
        Iterator<Social> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
    }

    public Overview(@NotNull TransactionInfo transactionInfo, @NotNull MemeInfo memeInfo, @NotNull BasicInfo basicInfo, @NotNull MarketInfo marketInfo, @NotNull List<Social> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(transactionInfo, "");
        Intrinsics.checkNotNullParameter(memeInfo, "");
        Intrinsics.checkNotNullParameter(basicInfo, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.gEmmrt = transactionInfo;
        this.copydefault = memeInfo;
        this.AEQbTJ = basicInfo;
        this.EZpvd = marketInfo;
        this.valueOf = list;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.djBIcL = str3;
    }
}
