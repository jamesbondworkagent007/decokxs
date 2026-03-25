package com.okinc.business.dex.trade.swap.market.priorityfee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class UIPrioritySelection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UIPrioritySelection> CREATOR = new Creator();
    private final String chainId;
    private final String currentFee;
    private final String estimateGas;
    private final String fastActualFee;
    private final String fastFee;
    private final String feeSymbol;
    private final boolean isEvm;
    private final boolean isOpenMev;
    private final String marketActualFee;
    private final String marketFee;
    private final String maxFee;
    private final String minFee;
    private final String nativeTokenUnitUsd;
    private final SwapPriorityFeeInfo priorityFeeInfo;
    private final PriorityFeeType priorityFeeType;
    private final boolean supportEip1559;
    private final String tokenDecimal;
    private final String turboActualFee;
    private final String turboFee;

    public static final class Creator implements Parcelable.Creator<UIPrioritySelection> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UIPrioritySelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UIPrioritySelection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PriorityFeeType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, SwapPriorityFeeInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UIPrioritySelection[] newArray(int i) {
            return new UIPrioritySelection[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFeeType component12() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isOpenMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapPriorityFeeInfo component15() {
        return this.priorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.estimateGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.nativeTokenUnitUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.marketActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fastActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.turboActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIPrioritySelection copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, PriorityFeeType priorityFeeType, @NotNull String str12, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull String str13, @NotNull String str14, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
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
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new UIPrioritySelection(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, priorityFeeType, str12, z, swapPriorityFeeInfo, str13, str14, z2, z3);
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
        if (!(obj instanceof UIPrioritySelection)) {
            return false;
        }
        UIPrioritySelection uIPrioritySelection = (UIPrioritySelection) obj;
        return Intrinsics.EZpvd((Object) this.feeSymbol, (Object) uIPrioritySelection.feeSymbol) && Intrinsics.EZpvd((Object) this.tokenDecimal, (Object) uIPrioritySelection.tokenDecimal) && Intrinsics.EZpvd((Object) this.marketFee, (Object) uIPrioritySelection.marketFee) && Intrinsics.EZpvd((Object) this.marketActualFee, (Object) uIPrioritySelection.marketActualFee) && Intrinsics.EZpvd((Object) this.fastFee, (Object) uIPrioritySelection.fastFee) && Intrinsics.EZpvd((Object) this.fastActualFee, (Object) uIPrioritySelection.fastActualFee) && Intrinsics.EZpvd((Object) this.turboFee, (Object) uIPrioritySelection.turboFee) && Intrinsics.EZpvd((Object) this.turboActualFee, (Object) uIPrioritySelection.turboActualFee) && Intrinsics.EZpvd((Object) this.minFee, (Object) uIPrioritySelection.minFee) && Intrinsics.EZpvd((Object) this.maxFee, (Object) uIPrioritySelection.maxFee) && Intrinsics.EZpvd((Object) this.currentFee, (Object) uIPrioritySelection.currentFee) && this.priorityFeeType == uIPrioritySelection.priorityFeeType && Intrinsics.EZpvd((Object) this.chainId, (Object) uIPrioritySelection.chainId) && this.isOpenMev == uIPrioritySelection.isOpenMev && Intrinsics.EZpvd(this.priorityFeeInfo, uIPrioritySelection.priorityFeeInfo) && Intrinsics.EZpvd((Object) this.estimateGas, (Object) uIPrioritySelection.estimateGas) && Intrinsics.EZpvd((Object) this.nativeTokenUnitUsd, (Object) uIPrioritySelection.nativeTokenUnitUsd) && this.isEvm == uIPrioritySelection.isEvm && this.supportEip1559 == uIPrioritySelection.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentFee() {
        return this.currentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGas() {
        return this.estimateGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastActualFee() {
        return this.fastActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastFee() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeSymbol() {
        return this.feeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketActualFee() {
        return this.marketActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketFee() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFee() {
        return this.maxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFee() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenUnitUsd() {
        return this.nativeTokenUnitUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapPriorityFeeInfo getPriorityFeeInfo() {
        return this.priorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFeeType getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboActualFee() {
        return this.turboActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboFee() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.feeSymbol.hashCode();
        int iHashCode2 = this.tokenDecimal.hashCode();
        int iHashCode3 = this.marketFee.hashCode();
        int iHashCode4 = this.marketActualFee.hashCode();
        int iHashCode5 = this.fastFee.hashCode();
        int iHashCode6 = this.fastActualFee.hashCode();
        int iHashCode7 = this.turboFee.hashCode();
        int iHashCode8 = this.turboActualFee.hashCode();
        int iHashCode9 = this.minFee.hashCode();
        int iHashCode10 = this.maxFee.hashCode();
        int iHashCode11 = this.currentFee.hashCode();
        PriorityFeeType priorityFeeType = this.priorityFeeType;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (priorityFeeType == null ? 0 : priorityFeeType.hashCode())) * 31) + this.chainId.hashCode()) * 31) + Boolean.hashCode(this.isOpenMev)) * 31) + this.priorityFeeInfo.hashCode()) * 31) + this.estimateGas.hashCode()) * 31) + this.nativeTokenUnitUsd.hashCode()) * 31) + Boolean.hashCode(this.isEvm)) * 31) + Boolean.hashCode(this.supportEip1559);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEvm() {
        return this.isEvm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenMev() {
        return this.isOpenMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UIPrioritySelection(feeSymbol=" + this.feeSymbol + ", tokenDecimal=" + this.tokenDecimal + ", marketFee=" + this.marketFee + ", marketActualFee=" + this.marketActualFee + ", fastFee=" + this.fastFee + ", fastActualFee=" + this.fastActualFee + ", turboFee=" + this.turboFee + ", turboActualFee=" + this.turboActualFee + ", minFee=" + this.minFee + ", maxFee=" + this.maxFee + ", currentFee=" + this.currentFee + ", priorityFeeType=" + this.priorityFeeType + ", chainId=" + this.chainId + ", isOpenMev=" + this.isOpenMev + ", priorityFeeInfo=" + this.priorityFeeInfo + ", estimateGas=" + this.estimateGas + ", nativeTokenUnitUsd=" + this.nativeTokenUnitUsd + ", isEvm=" + this.isEvm + ", supportEip1559=" + this.supportEip1559 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.feeSymbol);
        parcel.writeString(this.tokenDecimal);
        parcel.writeString(this.marketFee);
        parcel.writeString(this.marketActualFee);
        parcel.writeString(this.fastFee);
        parcel.writeString(this.fastActualFee);
        parcel.writeString(this.turboFee);
        parcel.writeString(this.turboActualFee);
        parcel.writeString(this.minFee);
        parcel.writeString(this.maxFee);
        parcel.writeString(this.currentFee);
        PriorityFeeType priorityFeeType = this.priorityFeeType;
        if (priorityFeeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(priorityFeeType.name());
        }
        parcel.writeString(this.chainId);
        parcel.writeInt(this.isOpenMev ? 1 : 0);
        this.priorityFeeInfo.writeToParcel(parcel, i);
        parcel.writeString(this.estimateGas);
        parcel.writeString(this.nativeTokenUnitUsd);
        parcel.writeInt(this.isEvm ? 1 : 0);
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
    }

    public UIPrioritySelection(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, PriorityFeeType priorityFeeType, @NotNull String str12, boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo, @NotNull String str13, @NotNull String str14, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
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
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.feeSymbol = str;
        this.tokenDecimal = str2;
        this.marketFee = str3;
        this.marketActualFee = str4;
        this.fastFee = str5;
        this.fastActualFee = str6;
        this.turboFee = str7;
        this.turboActualFee = str8;
        this.minFee = str9;
        this.maxFee = str10;
        this.currentFee = str11;
        this.priorityFeeType = priorityFeeType;
        this.chainId = str12;
        this.isOpenMev = z;
        this.priorityFeeInfo = swapPriorityFeeInfo;
        this.estimateGas = str13;
        this.nativeTokenUnitUsd = str14;
        this.isEvm = z2;
        this.supportEip1559 = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r43v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.PriorityFeeType:?: TERNARY null = ((wrap:int:0x005c: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.PriorityFeeType) : (r35v0 com.okinc.business.dexlogic.bean.PriorityFeeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006e: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (r38v0 com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (32768 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (65536 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (131072 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0099: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.PriorityFeeType, java.lang.String, boolean, com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:12) call: com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.UIPrioritySelection.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.PriorityFeeType, java.lang.String, boolean, com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ UIPrioritySelection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PriorityFeeType priorityFeeType, String str12, boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo, String str13, String str14, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? null : priorityFeeType, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? false : z, swapPriorityFeeInfo, (32768 & i) != 0 ? "" : str13, (65536 & i) != 0 ? "" : str14, (131072 & i) != 0 ? false : z2, (i & 262144) != 0 ? false : z3);
    }
}
