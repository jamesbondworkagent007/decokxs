package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.txs.TxType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalUiModel implements kMU, Parcelable {
    public static final Parcelable.Creator<SignalUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final InfluencerType AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final int ejfBZ;
    public final float fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String getFieldNames;
    public final TxType getNewProxyInstance;
    public final String hDKMBd;
    public final String isConnected;
    public final String iwGUEr;
    public final String uzCIH;
    public final String valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<SignalUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TxType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() != 0, InfluencerType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalUiModel[] newArray(int i) {
            return new SignalUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalUiModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0.0f, false, null, null, 33554431, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalUiModel EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull TxType txType, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, float f, boolean z, @NotNull InfluencerType influencerType, @NotNull String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(influencerType, "");
        Intrinsics.checkNotNullParameter(str20, "");
        return new SignalUiModel(str, str2, str3, str4, str5, str6, str7, txType, str8, str9, str10, str11, i, str12, str13, str14, str15, str16, str17, str18, str19, f, z, influencerType, str20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.djBIcL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType ejfBZ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalUiModel)) {
            return false;
        }
        SignalUiModel signalUiModel = (SignalUiModel) obj;
        return Intrinsics.EZpvd((Object) this.isConnected, (Object) signalUiModel.isConnected) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) signalUiModel.fJNWhG) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) signalUiModel.AYXKKw) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) signalUiModel.copydefault) && this.getNewProxyInstance == signalUiModel.getNewProxyInstance && Intrinsics.EZpvd((Object) this.valueOf, (Object) signalUiModel.valueOf) && Intrinsics.EZpvd((Object) this.uzCIH, (Object) signalUiModel.uzCIH) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) signalUiModel.djBIcL) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signalUiModel.AEQbTJ) && this.ejfBZ == signalUiModel.ejfBZ && Intrinsics.EZpvd((Object) this.iwGUEr, (Object) signalUiModel.iwGUEr) && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) signalUiModel.hDKMBd) && Intrinsics.EZpvd((Object) this.getFieldNames, (Object) signalUiModel.getFieldNames) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) signalUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) signalUiModel.DbNXlk) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) signalUiModel.AuCTel) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) signalUiModel.AhwBna) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) signalUiModel.fetchVPNInfo) && Float.compare(this.fARcdN, signalUiModel.fARcdN) == 0 && this.values == signalUiModel.values && this.AkhnZx == signalUiModel.AkhnZx && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) signalUiModel.fIwbmz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.isConnected.hashCode() * 31) + this.fJNWhG.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.getNewProxyInstance.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.uzCIH.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Integer.hashCode(this.ejfBZ)) * 31) + this.iwGUEr.hashCode()) * 31) + this.hDKMBd.hashCode()) * 31) + this.getFieldNames.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + Float.hashCode(this.fARcdN)) * 31) + Boolean.hashCode(this.values)) * 31) + this.AkhnZx.hashCode()) * 31) + this.fIwbmz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalUiModel(id=" + this.isConnected + ", tokenContractAddress=" + this.fJNWhG + ", chainId=" + this.AYXKKw + ", batchId=" + this.KWHzl + ", batchIndex=" + this.OLrzqt + ", addresses=" + this.EZpvd + ", addressesNum=" + this.copydefault + ", trend=" + this.getNewProxyInstance + ", createdAt=" + this.valueOf + ", tokenLogoUrl=" + this.uzCIH + ", chainLogoUrl=" + this.djBIcL + ", chainBWLogoUrl=" + this.AEQbTJ + ", smartMoneyAddresses=" + this.ejfBZ + ", tokenSymbol=" + this.iwGUEr + ", tokenName=" + this.hDKMBd + ", volume=" + this.getFieldNames + ", entryPrice=" + this.gEmmrt + ", liquidity=" + this.DbNXlk + ", marketCap=" + this.AuCTel + ", duration=" + this.AhwBna + ", holders=" + this.fetchVPNInfo + ", sellRatio=" + this.fARcdN + ", isExpired=" + this.values + ", influencerType=" + this.AkhnZx + ", protocolId=" + this.fIwbmz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InfluencerType valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.isConnected);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        this.getNewProxyInstance.writeToParcel(parcel, i);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.uzCIH);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.ejfBZ);
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.getFieldNames);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeFloat(this.fARcdN);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeString(this.AkhnZx.name());
        parcel.writeString(this.fIwbmz);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public SignalUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull TxType txType, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, float f, boolean z, @NotNull InfluencerType influencerType, @NotNull String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(influencerType, "");
        Intrinsics.checkNotNullParameter(str20, "");
        this.isConnected = str;
        this.fJNWhG = str2;
        this.AYXKKw = str3;
        this.KWHzl = str4;
        this.OLrzqt = str5;
        this.EZpvd = str6;
        this.copydefault = str7;
        this.getNewProxyInstance = txType;
        this.valueOf = str8;
        this.uzCIH = str9;
        this.djBIcL = str10;
        this.AEQbTJ = str11;
        this.ejfBZ = i;
        this.iwGUEr = str12;
        this.hDKMBd = str13;
        this.getFieldNames = str14;
        this.gEmmrt = str15;
        this.DbNXlk = str16;
        this.AuCTel = str17;
        this.AhwBna = str18;
        this.fetchVPNInfo = str19;
        this.fARcdN = f;
        this.values = z;
        this.AkhnZx = influencerType;
        this.fIwbmz = str20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0123: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.txs.TxType:?: TERNARY null = ((wrap:int:0x003c: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: SGET  A[WRAPPED] (LINE:17) com.okinc.business.dexlogic.txs.TxType.ALL com.okinc.business.dexlogic.txs.TxType) : (r34v0 com.okinc.business.dexlogic.txs.TxType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r48v0 float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType:?: TERNARY null = ((wrap:int:0x00db: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00df: SGET  A[WRAPPED] (LINE:33) com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType.SMART_MONEY com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType) : (r50v0 com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, boolean, com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, boolean, com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType, java.lang.String):void type: THIS */
    public /* synthetic */ SignalUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, TxType txType, String str8, String str9, String str10, String str11, int i, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, float f, boolean z, InfluencerType influencerType, String str20, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? TxType.ALL : txType, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? "" : str15, (i2 & 131072) != 0 ? "" : str16, (i2 & 262144) != 0 ? "" : str17, (i2 & 524288) != 0 ? "" : str18, (i2 & 1048576) != 0 ? "" : str19, (i2 & 2097152) != 0 ? 0.0f : f, (i2 & 4194304) != 0 ? false : z, (i2 & 8388608) != 0 ? InfluencerType.SMART_MONEY : influencerType, (i2 & 16777216) != 0 ? "" : str20);
    }
}
