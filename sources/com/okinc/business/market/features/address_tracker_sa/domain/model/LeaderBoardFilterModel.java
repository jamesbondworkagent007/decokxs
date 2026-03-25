package com.okinc.business.market.features.address_tracker_sa.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFilterModel implements Parcelable {
    public static final Parcelable.Creator<LeaderBoardFilterModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final List<MarketChainBean> EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<LeaderBoardFilterModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardFilterModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MarketChainBean.CREATOR.createFromParcel(parcel));
            }
            return new LeaderBoardFilterModel(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardFilterModel[] newArray(int i) {
            return new LeaderBoardFilterModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardFilterModel OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<MarketChainBean> list, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LeaderBoardFilterModel(str, str2, list, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketChainBean> copydefault() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardFilterModel)) {
            return false;
        }
        LeaderBoardFilterModel leaderBoardFilterModel = (LeaderBoardFilterModel) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) leaderBoardFilterModel.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) leaderBoardFilterModel.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, leaderBoardFilterModel.EZpvd) && Intrinsics.EZpvd((Object) this.valueOf, (Object) leaderBoardFilterModel.valueOf) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) leaderBoardFilterModel.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) leaderBoardFilterModel.copydefault) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) leaderBoardFilterModel.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) leaderBoardFilterModel.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) leaderBoardFilterModel.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) leaderBoardFilterModel.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.valueOf.hashCode();
        String str = this.KWHzl;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AYXKKw;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.djBIcL;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AhwBna;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.gEmmrt;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeaderBoardFilterModel(id=" + this.OLrzqt + ", name=" + this.AEQbTJ + ", chainList=" + this.EZpvd + ", selectedChainId=" + this.valueOf + ", roiMin=" + this.KWHzl + ", roiMax=" + this.copydefault + ", winRateMin=" + this.AYXKKw + ", winRateMax=" + this.djBIcL + ", transactionAmountMin=" + this.AhwBna + ", transactionAmountMax=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        List<MarketChainBean> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<MarketChainBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.valueOf);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
    }

    public LeaderBoardFilterModel(@NotNull String str, @NotNull String str2, @NotNull List<MarketChainBean> list, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = list;
        this.valueOf = str3;
        this.KWHzl = str4;
        this.copydefault = str5;
        this.AYXKKw = str6;
        this.djBIcL = str7;
        this.AhwBna = str8;
        this.gEmmrt = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r16v0 java.util.List))
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.main.market.chain.MarketChainBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LeaderBoardFilterModel(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9);
    }

    public final boolean DbNXlk() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        return AkhnZx() && ((str = this.KWHzl) == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) && (((str2 = this.copydefault) == null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) && (((str3 = this.AYXKKw) == null || StringsKt__StringsKt.fARcdN((CharSequence) str3)) && (((str4 = this.djBIcL) == null || StringsKt__StringsKt.fARcdN((CharSequence) str4)) && (((str5 = this.AhwBna) == null || StringsKt__StringsKt.fARcdN((CharSequence) str5)) && ((str6 = this.gEmmrt) == null || StringsKt__StringsKt.fARcdN((CharSequence) str6))))));
    }

    public final boolean AkhnZx() {
        MarketChainBean marketChainBean = (MarketChainBean) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd);
        if (marketChainBean != null) {
            return Intrinsics.EZpvd((Object) this.valueOf, (Object) marketChainBean.getChainId());
        }
        return true;
    }
}
