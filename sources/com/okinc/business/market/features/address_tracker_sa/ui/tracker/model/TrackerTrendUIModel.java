package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerTrendUIModel implements kMU, Parcelable {
    public static final Parcelable.Creator<TrackerTrendUIModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final int EZpvd;
    public final int KWHzl;
    public final String OLrzqt;
    public boolean copydefault;
    public final int djBIcL;
    public final String fARcdN;
    public final List<TrendTraderUIModel> fJNWhG;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final long values;

    public static final class Creator implements Parcelable.Creator<TrackerTrendUIModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerTrendUIModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string6 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList.add(TrendTraderUIModel.CREATOR.createFromParcel(parcel));
            }
            return new TrackerTrendUIModel(string, string2, string3, j, string4, string5, i, i2, i3, string6, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerTrendUIModel[] newArray(int i) {
            return new TrackerTrendUIModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerTrendUIModel() {
        this(null, null, null, 0L, null, null, 0, 0, 0, null, null, false, null, null, null, null, false, null, 262143, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TrendTraderUIModel> AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTrendUIModel copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, int i, int i2, int i3, @NotNull String str6, @NotNull List<TrendTraderUIModel> list, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z2, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new TrackerTrendUIModel(str, str2, str3, j, str4, str5, i, i2, i3, str6, list, z, str7, str8, str9, str10, z2, str11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTrendUIModel)) {
            return false;
        }
        TrackerTrendUIModel trackerTrendUIModel = (TrackerTrendUIModel) obj;
        return Intrinsics.EZpvd((Object) this.AkhnZx, (Object) trackerTrendUIModel.AkhnZx) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) trackerTrendUIModel.DbNXlk) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) trackerTrendUIModel.fetchVPNInfo) && this.values == trackerTrendUIModel.values && Intrinsics.EZpvd((Object) this.valueOf, (Object) trackerTrendUIModel.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) trackerTrendUIModel.AhwBna) && this.djBIcL == trackerTrendUIModel.djBIcL && this.EZpvd == trackerTrendUIModel.EZpvd && this.KWHzl == trackerTrendUIModel.KWHzl && Intrinsics.EZpvd((Object) this.fARcdN, (Object) trackerTrendUIModel.fARcdN) && Intrinsics.EZpvd(this.fJNWhG, trackerTrendUIModel.fJNWhG) && this.gEmmrt == trackerTrendUIModel.gEmmrt && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) trackerTrendUIModel.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) trackerTrendUIModel.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) trackerTrendUIModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.isConnected, (Object) trackerTrendUIModel.isConnected) && this.copydefault == trackerTrendUIModel.copydefault && Intrinsics.EZpvd((Object) this.AuCTel, (Object) trackerTrendUIModel.AuCTel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.AkhnZx.hashCode() * 31) + this.DbNXlk.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + Long.hashCode(this.values)) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Integer.hashCode(this.djBIcL)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.fARcdN.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.AuCTel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTrendUIModel(tokenIconUrl=" + this.AkhnZx + ", tokenName=" + this.DbNXlk + ", tokenSymbol=" + this.fetchVPNInfo + ", tokenCreationTime=" + this.values + ", marketCapValue=" + this.valueOf + ", platformIcon=" + this.AhwBna + ", startGradient=" + this.djBIcL + ", endGradient=" + this.EZpvd + ", addressesCount=" + this.KWHzl + ", totalBoughtAmount=" + this.fARcdN + ", traderList=" + this.fJNWhG + ", showExpandButton=" + this.gEmmrt + ", tokenContractAddress=" + this.AYXKKw + ", chainId=" + this.OLrzqt + ", chainName=" + this.AEQbTJ + ", tokenLogoUrl=" + this.isConnected + ", isFiat=" + this.copydefault + ", uniqueId=" + this.AuCTel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeLong(this.values);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.djBIcL);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.fARcdN);
        List<TrendTraderUIModel> list = this.fJNWhG;
        parcel.writeInt(list.size());
        Iterator<TrendTraderUIModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.isConnected);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.AuCTel);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public TrackerTrendUIModel(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, int i, int i2, int i3, @NotNull String str6, @NotNull List<TrendTraderUIModel> list, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z2, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
        this.fetchVPNInfo = str3;
        this.values = j;
        this.valueOf = str4;
        this.AhwBna = str5;
        this.djBIcL = i;
        this.EZpvd = i2;
        this.KWHzl = i3;
        this.fARcdN = str6;
        this.fJNWhG = list;
        this.gEmmrt = z;
        this.AYXKKw = str7;
        this.OLrzqt = str8;
        this.AEQbTJ = str9;
        this.isConnected = str10;
        this.copydefault = z2;
        this.AuCTel = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ce: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0046: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0056: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r32v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r33v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0094: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? true : (r38v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel>, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TrackerTrendUIModel(String str, String str2, String str3, long j, String str4, String str5, int i, int i2, int i3, String str6, List list, boolean z, String str7, String str8, String str9, String str10, boolean z2, String str11, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? "" : str6, (i4 & 1024) != 0 ? yDY.AhwBna() : list, (i4 & 2048) == 0 ? z : false, (i4 & 4096) != 0 ? "" : str7, (i4 & 8192) != 0 ? "" : str8, (i4 & 16384) != 0 ? "" : str9, (i4 & 32768) != 0 ? "" : str10, (i4 & 65536) != 0 ? true : z2, (i4 & 131072) != 0 ? "" : str11);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        if (kmu instanceof TrackerTrendUIModel) {
            return Intrinsics.EZpvd((Object) this.AuCTel, (Object) ((TrackerTrendUIModel) kmu).AuCTel);
        }
        return false;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        if (kmu instanceof TrackerTrendUIModel) {
            return Intrinsics.EZpvd(this, kmu);
        }
        return false;
    }
}
