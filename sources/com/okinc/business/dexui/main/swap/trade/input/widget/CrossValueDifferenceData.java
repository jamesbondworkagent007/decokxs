package com.okinc.business.dexui.main.swap.trade.input.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CrossValueDifferenceData {
    public static final int $stable = 8;
    private String bridgeFee;
    private String bridgeName;
    private String chainFee;
    private String chainName;
    private final boolean isIntentBridge;
    private final boolean openServiceFee;
    private String priceChain;
    private String pricebridge;
    private String symbolOne;
    private String symbolTwo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CrossValueDifferenceData() {
        this(false, false, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isIntentBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.symbolTwo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.openServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pricebridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bridgeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.symbolOne;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CrossValueDifferenceData copy(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CrossValueDifferenceData(z, z2, str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossValueDifferenceData)) {
            return false;
        }
        CrossValueDifferenceData crossValueDifferenceData = (CrossValueDifferenceData) obj;
        return this.isIntentBridge == crossValueDifferenceData.isIntentBridge && this.openServiceFee == crossValueDifferenceData.openServiceFee && Intrinsics.EZpvd((Object) this.pricebridge, (Object) crossValueDifferenceData.pricebridge) && Intrinsics.EZpvd((Object) this.bridgeFee, (Object) crossValueDifferenceData.bridgeFee) && Intrinsics.EZpvd((Object) this.priceChain, (Object) crossValueDifferenceData.priceChain) && Intrinsics.EZpvd((Object) this.chainFee, (Object) crossValueDifferenceData.chainFee) && Intrinsics.EZpvd((Object) this.chainName, (Object) crossValueDifferenceData.chainName) && Intrinsics.EZpvd((Object) this.bridgeName, (Object) crossValueDifferenceData.bridgeName) && Intrinsics.EZpvd((Object) this.symbolOne, (Object) crossValueDifferenceData.symbolOne) && Intrinsics.EZpvd((Object) this.symbolTwo, (Object) crossValueDifferenceData.symbolTwo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeFee() {
        return this.bridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeName() {
        return this.bridgeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainFee() {
        return this.chainFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenServiceFee() {
        return this.openServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChain() {
        return this.priceChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPricebridge() {
        return this.pricebridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbolOne() {
        return this.symbolOne;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbolTwo() {
        return this.symbolTwo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.isIntentBridge) * 31) + Boolean.hashCode(this.openServiceFee)) * 31) + this.pricebridge.hashCode()) * 31) + this.bridgeFee.hashCode()) * 31) + this.priceChain.hashCode()) * 31) + this.chainFee.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.bridgeName.hashCode()) * 31) + this.symbolOne.hashCode()) * 31) + this.symbolTwo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isIntentBridge() {
        return this.isIntentBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPricebridge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pricebridge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbolOne(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbolOne = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbolTwo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbolTwo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CrossValueDifferenceData(isIntentBridge=" + this.isIntentBridge + ", openServiceFee=" + this.openServiceFee + ", pricebridge=" + this.pricebridge + ", bridgeFee=" + this.bridgeFee + ", priceChain=" + this.priceChain + ", chainFee=" + this.chainFee + ", chainName=" + this.chainName + ", bridgeName=" + this.bridgeName + ", symbolOne=" + this.symbolOne + ", symbolTwo=" + this.symbolTwo + ")";
    }

    public CrossValueDifferenceData(boolean z, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.isIntentBridge = z;
        this.openServiceFee = z2;
        this.pricebridge = str;
        this.bridgeFee = str2;
        this.priceChain = str3;
        this.chainFee = str4;
        this.chainName = str5;
        this.bridgeName = str6;
        this.symbolOne = str7;
        this.symbolTwo = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r13v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.business.dexui.main.swap.trade.input.widget.CrossValueDifferenceData.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CrossValueDifferenceData(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) == 0 ? str8 : "");
    }
}
