package com.okinc.business.dexui.main.swap.route.dag.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RouteEdgeNew {
    public static final int $stable = 0;
    private final String dexName;
    private final String fromAddress;
    private final int fromIndex;
    private final String okLinkUrl;
    private final String pairAddress;
    private final String percentDisplay;
    private final String toAddress;
    private final int toIndex;
    private final float weightSort;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.fromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.toIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.percentDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component6() {
        return this.weightSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.okLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pairAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteEdgeNew copy(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, float f, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new RouteEdgeNew(i, i2, str, str2, str3, f, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEdgeNew)) {
            return false;
        }
        RouteEdgeNew routeEdgeNew = (RouteEdgeNew) obj;
        return this.fromIndex == routeEdgeNew.fromIndex && this.toIndex == routeEdgeNew.toIndex && Intrinsics.EZpvd((Object) this.fromAddress, (Object) routeEdgeNew.fromAddress) && Intrinsics.EZpvd((Object) this.toAddress, (Object) routeEdgeNew.toAddress) && Intrinsics.EZpvd((Object) this.percentDisplay, (Object) routeEdgeNew.percentDisplay) && Float.compare(this.weightSort, routeEdgeNew.weightSort) == 0 && Intrinsics.EZpvd((Object) this.okLinkUrl, (Object) routeEdgeNew.okLinkUrl) && Intrinsics.EZpvd((Object) this.dexName, (Object) routeEdgeNew.dexName) && Intrinsics.EZpvd((Object) this.pairAddress, (Object) routeEdgeNew.pairAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexName() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFromIndex() {
        return this.fromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkLinkUrl() {
        return this.okLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairAddress() {
        return this.pairAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercentDisplay() {
        return this.percentDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getToIndex() {
        return this.toIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getWeightSort() {
        return this.weightSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.fromIndex) * 31) + Integer.hashCode(this.toIndex)) * 31) + this.fromAddress.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.percentDisplay.hashCode()) * 31) + Float.hashCode(this.weightSort)) * 31) + this.okLinkUrl.hashCode()) * 31) + this.dexName.hashCode()) * 31) + this.pairAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RouteEdgeNew(fromIndex=" + this.fromIndex + ", toIndex=" + this.toIndex + ", fromAddress=" + this.fromAddress + ", toAddress=" + this.toAddress + ", percentDisplay=" + this.percentDisplay + ", weightSort=" + this.weightSort + ", okLinkUrl=" + this.okLinkUrl + ", dexName=" + this.dexName + ", pairAddress=" + this.pairAddress + ")";
    }

    public RouteEdgeNew(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, float f, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.fromIndex = i;
        this.toIndex = i2;
        this.fromAddress = str;
        this.toAddress = str2;
        this.percentDisplay = str3;
        this.weightSort = f;
        this.okLinkUrl = str4;
        this.dexName = str5;
        this.pairAddress = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r14v0 int)
  (r15v0 int)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 float)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:70) call: com.okinc.business.dexui.main.swap.route.dag.model.RouteEdgeNew.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RouteEdgeNew(int i, int i2, String str, String str2, String str3, float f, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3, f, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? "" : str6);
    }
}
