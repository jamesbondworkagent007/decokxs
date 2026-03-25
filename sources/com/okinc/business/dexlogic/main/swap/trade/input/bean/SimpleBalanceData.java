package com.okinc.business.dexlogic.main.swap.trade.input.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SimpleBalanceData {
    public static final int $stable = 8;
    private final String balance;
    private final String balanceData;
    private String content;
    private final boolean error;
    private final String errorContent;
    private final String inputData;
    private final boolean isBalanceNotEnough;
    private boolean showAddFunds;
    private final boolean showMax;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleBalanceData() {
        this(null, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.showAddFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.showMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.errorContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isBalanceNotEnough;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleBalanceData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SimpleBalanceData(str, str2, str3, str4, z, z2, str5, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleBalanceData)) {
            return false;
        }
        SimpleBalanceData simpleBalanceData = (SimpleBalanceData) obj;
        return Intrinsics.EZpvd((Object) this.inputData, (Object) simpleBalanceData.inputData) && Intrinsics.EZpvd((Object) this.content, (Object) simpleBalanceData.content) && Intrinsics.EZpvd((Object) this.balance, (Object) simpleBalanceData.balance) && Intrinsics.EZpvd((Object) this.balanceData, (Object) simpleBalanceData.balanceData) && this.showAddFunds == simpleBalanceData.showAddFunds && this.showMax == simpleBalanceData.showMax && Intrinsics.EZpvd((Object) this.errorContent, (Object) simpleBalanceData.errorContent) && this.error == simpleBalanceData.error && this.isBalanceNotEnough == simpleBalanceData.isBalanceNotEnough;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceData() {
        return this.balanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorContent() {
        return this.errorContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowAddFunds() {
        return this.showAddFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowMax() {
        return this.showMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.inputData.hashCode() * 31) + this.content.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.balanceData.hashCode()) * 31) + Boolean.hashCode(this.showAddFunds)) * 31) + Boolean.hashCode(this.showMax)) * 31) + this.errorContent.hashCode()) * 31) + Boolean.hashCode(this.error)) * 31) + Boolean.hashCode(this.isBalanceNotEnough);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBalanceNotEnough() {
        return this.isBalanceNotEnough;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAddFunds(boolean z) {
        this.showAddFunds = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleBalanceData(inputData=" + this.inputData + ", content=" + this.content + ", balance=" + this.balance + ", balanceData=" + this.balanceData + ", showAddFunds=" + this.showAddFunds + ", showMax=" + this.showMax + ", errorContent=" + this.errorContent + ", error=" + this.error + ", isBalanceNotEnough=" + this.isBalanceNotEnough + ")";
    }

    public SimpleBalanceData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.inputData = str;
        this.content = str2;
        this.balance = str3;
        this.balanceData = str4;
        this.showAddFunds = z;
        this.showMax = z2;
        this.errorContent = str5;
        this.error = z3;
        this.isBalanceNotEnough = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r20v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:19) call: com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ SimpleBalanceData(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? str5 : "", (i & 128) != 0 ? false : z3, (i & 256) == 0 ? z4 : false);
    }
}
