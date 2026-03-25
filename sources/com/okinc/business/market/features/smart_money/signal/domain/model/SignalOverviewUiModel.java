package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25382ivf;
import o.C33129mqd;
import o.C52761wXj;
import o.kMU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalOverviewUiModel implements kMU, Parcelable {
    public final String AEQbTJ;
    public final SignalUiModel AYXKKw;
    public final List<SignalUiModel> AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String copydefault;
    public final SignalOverviewKLineUiModel djBIcL;
    public final String ejfBZ;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final long valueOf;
    public final String values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<SignalOverviewUiModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignalOverviewUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalOverviewUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(SignalUiModel.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new SignalOverviewUiModel(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, j, arrayList, SignalUiModel.CREATOR.createFromParcel(parcel), SignalOverviewKLineUiModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalOverviewUiModel[] newArray(int i) {
            return new SignalOverviewUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewUiModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, 262143, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewUiModel AEQbTJ(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @NotNull List<SignalUiModel> list, @NotNull SignalUiModel signalUiModel, @NotNull SignalOverviewKLineUiModel signalOverviewKLineUiModel, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(signalUiModel, "");
        Intrinsics.checkNotNullParameter(signalOverviewKLineUiModel, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new SignalOverviewUiModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, j, list, signalUiModel, signalOverviewKLineUiModel, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewKLineUiModel OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalUiModel> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalOverviewUiModel)) {
            return false;
        }
        SignalOverviewUiModel signalOverviewUiModel = (SignalOverviewUiModel) obj;
        return Intrinsics.EZpvd((Object) this.AkhnZx, (Object) signalOverviewUiModel.AkhnZx) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) signalOverviewUiModel.DbNXlk) && Intrinsics.EZpvd((Object) this.isConnected, (Object) signalOverviewUiModel.isConnected) && Intrinsics.EZpvd((Object) this.values, (Object) signalOverviewUiModel.values) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) signalOverviewUiModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) signalOverviewUiModel.fARcdN) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) signalOverviewUiModel.fIwbmz) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) signalOverviewUiModel.ejfBZ) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signalOverviewUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalOverviewUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalOverviewUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) signalOverviewUiModel.copydefault) && this.valueOf == signalOverviewUiModel.valueOf && Intrinsics.EZpvd(this.AhwBna, signalOverviewUiModel.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, signalOverviewUiModel.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, signalOverviewUiModel.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) signalOverviewUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) signalOverviewUiModel.AuCTel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalUiModel gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AkhnZx.hashCode();
        String str = this.DbNXlk;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.isConnected.hashCode()) * 31) + this.values.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.fARcdN.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Long.hashCode(this.valueOf)) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AuCTel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverviewUiModel(tokenChainId=" + this.AkhnZx + ", tokenCreationTime=" + this.DbNXlk + ", tokenChainLogoUrl=" + this.isConnected + ", tokenChainBWLogoUrl=" + this.values + ", tokenContractAddress=" + this.fetchVPNInfo + ", tokenLogoUrl=" + this.fARcdN + ", tokenName=" + this.fIwbmz + ", tokenSymbol=" + this.ejfBZ + ", highestProfit=" + this.AEQbTJ + ", currentPrice=" + this.KWHzl + ", currentMarketCap=" + this.EZpvd + ", currentHolders=" + this.copydefault + ", lastEventTime=" + this.valueOf + ", signals=" + this.AhwBna + ", selectedSignal=" + this.AYXKKw + ", klineData=" + this.djBIcL + ", maxIncreaseMultiplier=" + this.gEmmrt + ", top10HoldersPercentage=" + this.AuCTel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.values);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeLong(this.valueOf);
        List<SignalUiModel> list = this.AhwBna;
        parcel.writeInt(list.size());
        Iterator<SignalUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.AYXKKw.writeToParcel(parcel, i);
        this.djBIcL.writeToParcel(parcel, i);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AuCTel);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    public SignalOverviewUiModel(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, long j, @NotNull List<SignalUiModel> list, @NotNull SignalUiModel signalUiModel, @NotNull SignalOverviewKLineUiModel signalOverviewKLineUiModel, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(signalUiModel, "");
        Intrinsics.checkNotNullParameter(signalOverviewKLineUiModel, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.AkhnZx = str;
        this.DbNXlk = str2;
        this.isConnected = str3;
        this.values = str4;
        this.fetchVPNInfo = str5;
        this.fARcdN = str6;
        this.fIwbmz = str7;
        this.ejfBZ = str8;
        this.AEQbTJ = str9;
        this.KWHzl = str10;
        this.EZpvd = str11;
        this.copydefault = str12;
        this.valueOf = j;
        this.AhwBna = list;
        this.AYXKKw = signalUiModel;
        this.djBIcL = signalOverviewKLineUiModel;
        this.gEmmrt = str13;
        this.AuCTel = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x012e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r65v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r65v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r65v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r65v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r65v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r65v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r65v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r65v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r65v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r65v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r65v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r65v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0064: ARITH (r65v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r58v0 long))
  (wrap:java.util.List:0x007a: TERNARY null = ((wrap:int:0x006f: ARITH (r65v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r60v0 java.util.List))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel:?: TERNARY null = ((wrap:int:0x007c: ARITH (r65v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bb: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.dexlogic.txs.TxType)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0.0f float)
  false
  (null com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType)
  (null java.lang.String)
  (33554431 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, boolean, com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:28) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, boolean, com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r61v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r65v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ec: CONSTRUCTOR 
  (null com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector)
  (null java.util.List)
  false
  false
  false
  false
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector, java.util.List, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel.<init>(com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector, java.util.List, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r62v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r65v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r65v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel>, com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel, com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List, com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel, com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalOverviewUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, List list, SignalUiModel signalUiModel, SignalOverviewKLineUiModel signalOverviewKLineUiModel, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? 0L : j, (i & 8192) != 0 ? yDY.AhwBna() : list, (i & 16384) != 0 ? new SignalUiModel(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0.0f, false, null, null, 33554431, null) : signalUiModel, (i & 32768) != 0 ? new SignalOverviewKLineUiModel(null, null, false, false, false, false, 63, null) : signalOverviewKLineUiModel, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? "" : str14);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        SignalOverviewUiModel signalOverviewUiModel = kmu instanceof SignalOverviewUiModel ? (SignalOverviewUiModel) kmu : null;
        return signalOverviewUiModel != null && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) signalOverviewUiModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) signalOverviewUiModel.AkhnZx);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SignalOverviewUiModel signalOverviewUiModel = kmu instanceof SignalOverviewUiModel ? (SignalOverviewUiModel) kmu : null;
        if (signalOverviewUiModel == null) {
            return null;
        }
        if (!Intrinsics.EZpvd(this.djBIcL, signalOverviewUiModel.djBIcL)) {
            if (this.djBIcL.gEmmrt() != signalOverviewUiModel.djBIcL.gEmmrt()) {
                linkedHashSet.add("chart_load_more");
            } else {
                linkedHashSet.add("chart");
            }
        }
        if (!Intrinsics.EZpvd(this.AYXKKw, signalOverviewUiModel.AYXKKw)) {
            linkedHashSet.add("trend");
        }
        if (!Intrinsics.EZpvd((Object) this.copydefault, (Object) signalOverviewUiModel.copydefault) || !Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalOverviewUiModel.EZpvd)) {
            linkedHashSet.add("current");
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final int copydefault(@NotNull String str, @NotNull String str2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(str, str2, context, C52761wXj.ActionBar.DCUTEI);
    }

    public final int AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(str, str2, context, C52761wXj.Activity.dvKsVJ);
    }

    public final int copydefault(String str, String str2, Context context, int i) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) str) || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            return C25382ivf.copydefault(C52761wXj.Activity.Dmq, context);
        }
        float fDjBIcL = C33129mqd.djBIcL(str);
        float fDjBIcL2 = C33129mqd.djBIcL(str2);
        if (fDjBIcL2 > fDjBIcL) {
            i = C52761wXj.ActionBar.OuxcSI;
        } else if (fDjBIcL2 >= fDjBIcL) {
            i = C52761wXj.Activity.Dmq;
        }
        return C25382ivf.copydefault(i, context);
    }
}
