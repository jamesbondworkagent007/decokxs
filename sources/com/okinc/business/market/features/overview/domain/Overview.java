package com.okinc.business.market.features.overview.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.domain.model.coininfo.Social;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Overview implements Parcelable {
    public static final Parcelable.Creator<Overview> CREATOR = new Creator();
    public final MemeInfo AEQbTJ;
    public final List<Social> AYXKKw;
    public final RwaTradingStatus AhwBna;
    public final String EZpvd;
    public final MarketInfo KWHzl;
    public final String OLrzqt;
    public final BasicInfo copydefault;
    public final String djBIcL;
    public final StockInfo gEmmrt;
    public final TransactionInfo isConnected;
    public final List<MemeSocialMediaData> valueOf;

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
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(MemeSocialMediaData.CREATOR.createFromParcel(parcel));
            }
            return new Overview(transactionInfoCreateFromParcel, memeInfoCreateFromParcel, basicInfoCreateFromParcel, marketInfoCreateFromParcel, arrayList, string, string2, string3, arrayList2, parcel.readInt() == 0 ? null : RwaTradingStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StockInfo.CREATOR.createFromParcel(parcel) : null);
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
    public final MarketInfo AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemeSocialMediaData> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfo AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeInfo OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Overview OLrzqt(@NotNull TransactionInfo transactionInfo, @NotNull MemeInfo memeInfo, @NotNull BasicInfo basicInfo, @NotNull MarketInfo marketInfo, @NotNull List<Social> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<MemeSocialMediaData> list2, RwaTradingStatus rwaTradingStatus, StockInfo stockInfo) {
        Intrinsics.checkNotNullParameter(transactionInfo, "");
        Intrinsics.checkNotNullParameter(memeInfo, "");
        Intrinsics.checkNotNullParameter(basicInfo, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new Overview(transactionInfo, memeInfo, basicInfo, marketInfo, list, str, str2, str3, list2, rwaTradingStatus, stockInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StockInfo djBIcL() {
        return this.gEmmrt;
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
        return Intrinsics.EZpvd(this.isConnected, overview.isConnected) && Intrinsics.EZpvd(this.AEQbTJ, overview.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, overview.copydefault) && Intrinsics.EZpvd(this.KWHzl, overview.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, overview.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) overview.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) overview.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) overview.djBIcL) && Intrinsics.EZpvd(this.valueOf, overview.valueOf) && Intrinsics.EZpvd(this.AhwBna, overview.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, overview.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.isConnected.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = this.EZpvd.hashCode();
        int iHashCode7 = this.OLrzqt.hashCode();
        int iHashCode8 = this.djBIcL.hashCode();
        int iHashCode9 = this.valueOf.hashCode();
        RwaTradingStatus rwaTradingStatus = this.AhwBna;
        int iHashCode10 = rwaTradingStatus == null ? 0 : rwaTradingStatus.hashCode();
        StockInfo stockInfo = this.gEmmrt;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (stockInfo != null ? stockInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Overview(transactionInfo=" + this.isConnected + ", memeInfo=" + this.AEQbTJ + ", basicInfo=" + this.copydefault + ", marketInfo=" + this.KWHzl + ", socialMedia=" + this.AYXKKw + ", bundleHoldingRatio=" + this.EZpvd + ", devHoldingRatio=" + this.OLrzqt + ", suspiciousHoldingRatio=" + this.djBIcL + ", memeSocials=" + this.valueOf + ", rwaTradingInfo=" + this.AhwBna + ", stockInfo=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Social> valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.isConnected.writeToParcel(parcel, i);
        this.AEQbTJ.writeToParcel(parcel, i);
        this.copydefault.writeToParcel(parcel, i);
        this.KWHzl.writeToParcel(parcel, i);
        List<Social> list = this.AYXKKw;
        parcel.writeInt(list.size());
        Iterator<Social> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
        List<MemeSocialMediaData> list2 = this.valueOf;
        parcel.writeInt(list2.size());
        Iterator<MemeSocialMediaData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        RwaTradingStatus rwaTradingStatus = this.AhwBna;
        if (rwaTradingStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rwaTradingStatus.writeToParcel(parcel, i);
        }
        StockInfo stockInfo = this.gEmmrt;
        if (stockInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stockInfo.writeToParcel(parcel, i);
        }
    }

    public Overview(@NotNull TransactionInfo transactionInfo, @NotNull MemeInfo memeInfo, @NotNull BasicInfo basicInfo, @NotNull MarketInfo marketInfo, @NotNull List<Social> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<MemeSocialMediaData> list2, RwaTradingStatus rwaTradingStatus, StockInfo stockInfo) {
        Intrinsics.checkNotNullParameter(transactionInfo, "");
        Intrinsics.checkNotNullParameter(memeInfo, "");
        Intrinsics.checkNotNullParameter(basicInfo, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.isConnected = transactionInfo;
        this.AEQbTJ = memeInfo;
        this.copydefault = basicInfo;
        this.KWHzl = marketInfo;
        this.AYXKKw = list;
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.djBIcL = str3;
        this.valueOf = list2;
        this.AhwBna = rwaTradingStatus;
        this.gEmmrt = stockInfo;
    }
}
