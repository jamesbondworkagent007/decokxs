package com.okinc.business.invest_biz.ui.screens.base_transaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25478ixV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TransactionConfig implements Parcelable {
    public static final Parcelable.Creator<TransactionConfig> CREATOR = new Creator();
    public final long AEQbTJ;
    public final boolean AYXKKw;
    public final int AhwBna;
    public final boolean AkhnZx;
    public final String AuCTel;
    public final int DbNXlk;
    public final InvestPageSource EZpvd;
    public final DeFiTradeExecutorType KWHzl;
    public final long OLrzqt;
    public final InvestAssetPositionType copydefault;
    public final InvestOrder djBIcL;
    public final Long ejfBZ;
    public final String fARcdN;
    public final long fIwbmz;
    public final boolean fJNWhG;
    public final boolean fetchVPNInfo;
    public final int gEmmrt;
    public final boolean getFieldNames;
    public final TransactionMethod getNewProxyInstance;
    public final Integer hDKMBd;
    public final Boolean isConnected;
    public final int iwGUEr;
    public final String uzCIH;
    public final ArrayList<InvestInputData> valueOf;
    public final long values;

    public static final class Creator implements Parcelable.Creator<TransactionConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            long j = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(InvestInputData.CREATOR.createFromParcel(parcel));
            }
            return new TransactionConfig(i, i2, j, z, j2, j3, string, string2, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : InvestOrder.CREATOR.createFromParcel(parcel), TransactionMethod.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InvestAssetPositionType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0, parcel.readInt() != 0, InvestPageSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DeFiTradeExecutorType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionConfig[] newArray(int i) {
            return new TransactionConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionConfig AEQbTJ(int i, int i2, long j, boolean z, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull ArrayList<InvestInputData> arrayList, int i3, Integer num, long j4, int i4, @NotNull String str3, InvestOrder investOrder, @NotNull TransactionMethod transactionMethod, InvestAssetPositionType investAssetPositionType, Boolean bool, boolean z2, boolean z3, @NotNull InvestPageSource investPageSource, DeFiTradeExecutorType deFiTradeExecutorType, boolean z4, boolean z5, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        return new TransactionConfig(i, i2, j, z, j2, j3, str, str2, arrayList, i3, num, j4, i4, str3, investOrder, transactionMethod, investAssetPositionType, bool, z2, z3, investPageSource, deFiTradeExecutorType, z4, z5, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPageSource AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestOrder AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.DbNXlk == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        int i;
        return this.DbNXlk == 4 && ((i = this.iwGUEr) == 9 || i == 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AwvSrB() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiTradeExecutorType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionConfig)) {
            return false;
        }
        TransactionConfig transactionConfig = (TransactionConfig) obj;
        return this.gEmmrt == transactionConfig.gEmmrt && this.iwGUEr == transactionConfig.iwGUEr && this.values == transactionConfig.values && this.AkhnZx == transactionConfig.AkhnZx && this.fIwbmz == transactionConfig.fIwbmz && this.AEQbTJ == transactionConfig.AEQbTJ && Intrinsics.EZpvd((Object) this.AuCTel, (Object) transactionConfig.AuCTel) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) transactionConfig.fARcdN) && Intrinsics.EZpvd(this.valueOf, transactionConfig.valueOf) && this.DbNXlk == transactionConfig.DbNXlk && Intrinsics.EZpvd(this.hDKMBd, transactionConfig.hDKMBd) && this.OLrzqt == transactionConfig.OLrzqt && this.AhwBna == transactionConfig.AhwBna && Intrinsics.EZpvd((Object) this.uzCIH, (Object) transactionConfig.uzCIH) && Intrinsics.EZpvd(this.djBIcL, transactionConfig.djBIcL) && this.getNewProxyInstance == transactionConfig.getNewProxyInstance && this.copydefault == transactionConfig.copydefault && Intrinsics.EZpvd(this.isConnected, transactionConfig.isConnected) && this.fJNWhG == transactionConfig.fJNWhG && this.AYXKKw == transactionConfig.AYXKKw && this.EZpvd == transactionConfig.EZpvd && this.KWHzl == transactionConfig.KWHzl && this.fetchVPNInfo == transactionConfig.fetchVPNInfo && this.getFieldNames == transactionConfig.getFieldNames && Intrinsics.EZpvd(this.ejfBZ, transactionConfig.ejfBZ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return this.iwGUEr == 10 && this.DbNXlk != 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.iwGUEr == 17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        int i = this.iwGUEr;
        return i == 14 || i == 13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean hDKMBd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.gEmmrt);
        int iHashCode2 = Integer.hashCode(this.iwGUEr);
        int iHashCode3 = Long.hashCode(this.values);
        int iHashCode4 = Boolean.hashCode(this.AkhnZx);
        int iHashCode5 = Long.hashCode(this.fIwbmz);
        int iHashCode6 = Long.hashCode(this.AEQbTJ);
        int iHashCode7 = this.AuCTel.hashCode();
        int iHashCode8 = this.fARcdN.hashCode();
        int iHashCode9 = this.valueOf.hashCode();
        int iHashCode10 = Integer.hashCode(this.DbNXlk);
        Integer num = this.hDKMBd;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        int iHashCode12 = Long.hashCode(this.OLrzqt);
        int iHashCode13 = Integer.hashCode(this.AhwBna);
        int iHashCode14 = this.uzCIH.hashCode();
        InvestOrder investOrder = this.djBIcL;
        int iHashCode15 = investOrder == null ? 0 : investOrder.hashCode();
        int iHashCode16 = this.getNewProxyInstance.hashCode();
        InvestAssetPositionType investAssetPositionType = this.copydefault;
        int iHashCode17 = investAssetPositionType == null ? 0 : investAssetPositionType.hashCode();
        Boolean bool = this.isConnected;
        int iHashCode18 = bool == null ? 0 : bool.hashCode();
        int iHashCode19 = Boolean.hashCode(this.fJNWhG);
        int iHashCode20 = Boolean.hashCode(this.AYXKKw);
        int iHashCode21 = this.EZpvd.hashCode();
        DeFiTradeExecutorType deFiTradeExecutorType = this.KWHzl;
        int iHashCode22 = deFiTradeExecutorType == null ? 0 : deFiTradeExecutorType.hashCode();
        int iHashCode23 = Boolean.hashCode(this.fetchVPNInfo);
        int iHashCode24 = Boolean.hashCode(this.getFieldNames);
        Long l = this.ejfBZ;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionConfig(investmentCategory=" + this.gEmmrt + ", type=" + this.iwGUEr + ", investmentId=" + this.values + ", isSingle=" + this.AkhnZx + ", relatedInvestmentId=" + this.fIwbmz + ", chainId=" + this.AEQbTJ + ", poolId=" + this.AuCTel + ", source=" + this.fARcdN + ", inputList=" + this.valueOf + ", mode=" + this.DbNXlk + ", transactionType=" + this.hDKMBd + ", analysisPlatformId=" + this.OLrzqt + ", investType=" + this.AhwBna + ", tokenId=" + this.uzCIH + ", investOrder=" + this.djBIcL + ", transactionMethod=" + this.getNewProxyInstance + ", assetPositionType=" + this.copydefault + ", isBorrowSupply=" + this.isConnected + ", skipInput=" + this.fJNWhG + ", hasMultiProtocol=" + this.AYXKKw + ", fromSource=" + this.EZpvd + ", executorType=" + this.KWHzl + ", openZap=" + this.fetchVPNInfo + ", zapSingleSwap=" + this.getFieldNames + ", stakeId=" + this.ejfBZ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InvestInputData> valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.gEmmrt);
        parcel.writeInt(this.iwGUEr);
        parcel.writeLong(this.values);
        parcel.writeInt(this.AkhnZx ? 1 : 0);
        parcel.writeLong(this.fIwbmz);
        parcel.writeLong(this.AEQbTJ);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.fARcdN);
        ArrayList<InvestInputData> arrayList = this.valueOf;
        parcel.writeInt(arrayList.size());
        Iterator<InvestInputData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.DbNXlk);
        Integer num = this.hDKMBd;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeLong(this.OLrzqt);
        parcel.writeInt(this.AhwBna);
        parcel.writeString(this.uzCIH);
        InvestOrder investOrder = this.djBIcL;
        if (investOrder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investOrder.writeToParcel(parcel, i);
        }
        parcel.writeString(this.getNewProxyInstance.name());
        InvestAssetPositionType investAssetPositionType = this.copydefault;
        if (investAssetPositionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(investAssetPositionType.name());
        }
        Boolean bool = this.isConnected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.fJNWhG ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeString(this.EZpvd.name());
        DeFiTradeExecutorType deFiTradeExecutorType = this.KWHzl;
        if (deFiTradeExecutorType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(deFiTradeExecutorType.name());
        }
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeInt(this.getFieldNames ? 1 : 0);
        Long l = this.ejfBZ;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        int i = this.iwGUEr;
        return i == 8 || i == 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        int i;
        return this.DbNXlk == 4 && ((i = this.iwGUEr) == 12 || i == 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuBGHE() {
        return !this.AkhnZx;
    }

    public TransactionConfig(int i, int i2, long j, boolean z, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull ArrayList<InvestInputData> arrayList, int i3, Integer num, long j4, int i4, @NotNull String str3, InvestOrder investOrder, @NotNull TransactionMethod transactionMethod, InvestAssetPositionType investAssetPositionType, Boolean bool, boolean z2, boolean z3, @NotNull InvestPageSource investPageSource, DeFiTradeExecutorType deFiTradeExecutorType, boolean z4, boolean z5, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(transactionMethod, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        this.gEmmrt = i;
        this.iwGUEr = i2;
        this.values = j;
        this.AkhnZx = z;
        this.fIwbmz = j2;
        this.AEQbTJ = j3;
        this.AuCTel = str;
        this.fARcdN = str2;
        this.valueOf = arrayList;
        this.DbNXlk = i3;
        this.hDKMBd = num;
        this.OLrzqt = j4;
        this.AhwBna = i4;
        this.uzCIH = str3;
        this.djBIcL = investOrder;
        this.getNewProxyInstance = transactionMethod;
        this.copydefault = investAssetPositionType;
        this.isConnected = bool;
        this.fJNWhG = z2;
        this.AYXKKw = z3;
        this.EZpvd = investPageSource;
        this.KWHzl = deFiTradeExecutorType;
        this.fetchVPNInfo = z4;
        this.getFieldNames = z5;
        this.ejfBZ = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d7: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r63v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (r35v0 int)
  (r36v0 long)
  (r38v0 boolean)
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r63v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r39v0 long))
  (r41v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r63v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r63v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (r45v0 java.util.ArrayList)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r63v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r46v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0031: ARITH (r63v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r47v0 java.lang.Integer))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003b: ARITH (r63v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r48v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r63v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r50v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r63v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestOrder:?: TERNARY null = ((wrap:int:0x0057: ARITH (r63v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestOrder) : (r52v0 com.okinc.business.invest_biz.data.bean.InvestOrder))
  (wrap:com.okinc.business.invest_biz.data.bean.TransactionMethod:?: TERNARY null = ((wrap:int:0x0063: ARITH (32768 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: SGET  A[WRAPPED] (LINE:37) com.okinc.business.invest_biz.data.bean.TransactionMethod.UNKNOWN com.okinc.business.invest_biz.data.bean.TransactionMethod) : (r53v0 com.okinc.business.invest_biz.data.bean.TransactionMethod))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x006f: ARITH (65536 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (r54v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0079: ARITH (131072 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r55v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0083: ARITH (262144 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? false : (r56v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (524288 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? false : (r57v0 boolean))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource:?: TERNARY null = ((wrap:int:0x0097: ARITH (1048576 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009c: SGET  A[WRAPPED] (LINE:42) com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.Default com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource) : (r58v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType:?: TERNARY null = ((wrap:int:0x00a3: ARITH (2097152 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a8: SGET  A[WRAPPED] (LINE:43) com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType.NONE com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType) : (r59v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00af: ARITH (4194304 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? false : (r60v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b9: ARITH (8388608 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r63v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r62v0 java.lang.Long))
 A[MD:(int, int, long, boolean, long, long, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData>, int, java.lang.Integer, long, int, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestOrder, com.okinc.business.invest_biz.data.bean.TransactionMethod, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.lang.Boolean, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType, boolean, boolean, java.lang.Long):void (m)] (LINE:21) call: com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig.<init>(int, int, long, boolean, long, long, java.lang.String, java.lang.String, java.util.ArrayList, int, java.lang.Integer, long, int, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestOrder, com.okinc.business.invest_biz.data.bean.TransactionMethod, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.lang.Boolean, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType, boolean, boolean, java.lang.Long):void type: THIS */
    public /* synthetic */ TransactionConfig(int i, int i2, long j, boolean z, long j2, long j3, String str, String str2, ArrayList arrayList, int i3, Integer num, long j4, int i4, String str3, InvestOrder investOrder, TransactionMethod transactionMethod, InvestAssetPositionType investAssetPositionType, Boolean bool, boolean z2, boolean z3, InvestPageSource investPageSource, DeFiTradeExecutorType deFiTradeExecutorType, boolean z4, boolean z5, Long l, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, i2, j, z, (i5 & 16) != 0 ? 0L : j2, j3, (i5 & 64) != 0 ? "" : str, (i5 & 128) != 0 ? "" : str2, arrayList, (i5 & 512) != 0 ? -1 : i3, (i5 & 1024) != 0 ? null : num, (i5 & 2048) != 0 ? 0L : j4, (i5 & 4096) != 0 ? 1 : i4, (i5 & 8192) != 0 ? "" : str3, (i5 & 16384) != 0 ? null : investOrder, (32768 & i5) != 0 ? TransactionMethod.UNKNOWN : transactionMethod, (65536 & i5) != 0 ? null : investAssetPositionType, (131072 & i5) != 0 ? null : bool, (262144 & i5) != 0 ? false : z2, (524288 & i5) != 0 ? false : z3, (1048576 & i5) != 0 ? InvestPageSource.Default : investPageSource, (2097152 & i5) != 0 ? DeFiTradeExecutorType.NONE : deFiTradeExecutorType, (4194304 & i5) != 0 ? false : z4, (8388608 & i5) != 0 ? false : z5, (i5 & 16777216) != 0 ? null : l);
    }

    public final boolean OcIXYQ() {
        return ((this.AhwBna == 2 && this.getNewProxyInstance == TransactionMethod.BOTH) || !this.AkhnZx || AuCTelauCTel() || zLjUOn()) ? false : true;
    }

    public final boolean wlaJM() {
        return C25478ixV.AEQbTJ(this.iwGUEr);
    }

    public final boolean AxsJAY() {
        return C25478ixV.KWHzl(this.iwGUEr);
    }

    public final boolean QOLQEE() {
        return C25478ixV.OLrzqt(this.iwGUEr);
    }

    public final boolean ORxRYg() {
        return C25478ixV.OLrzqt(this.iwGUEr) || C25478ixV.EZpvd(this.iwGUEr);
    }

    public final boolean sSMYrx() {
        Integer num = this.hDKMBd;
        return num != null && num.intValue() == 1;
    }

    public final boolean iwGUEr() {
        return InvestPageSource.Boost == this.EZpvd;
    }

    public final Long AEQbTJ() {
        if (iwGUEr()) {
            return this.ejfBZ;
        }
        return null;
    }
}
