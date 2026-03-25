package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class ViceInfo {
    public static final int $stable = 0;
    private final String price;
    private final int priceColor;
    private final String range;
    private final int rangeColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViceInfo() {
        this(null, 0, null, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ViceInfo copy$default(ViceInfo viceInfo, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = viceInfo.range;
        }
        if ((i3 & 2) != 0) {
            i = viceInfo.rangeColor;
        }
        if ((i3 & 4) != 0) {
            str2 = viceInfo.price;
        }
        if ((i3 & 8) != 0) {
            i2 = viceInfo.priceColor;
        }
        return viceInfo.copy(str, i, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.rangeColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.priceColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViceInfo copy(@NotNull String str, int i, @NotNull String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ViceInfo(str, i, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViceInfo)) {
            return false;
        }
        ViceInfo viceInfo = (ViceInfo) obj;
        return Intrinsics.EZpvd((Object) this.range, (Object) viceInfo.range) && this.rangeColor == viceInfo.rangeColor && Intrinsics.EZpvd((Object) this.price, (Object) viceInfo.price) && this.priceColor == viceInfo.priceColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriceColor() {
        return this.priceColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRange() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRangeColor() {
        return this.rangeColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.range.hashCode() * 31) + Integer.hashCode(this.rangeColor)) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.priceColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ViceInfo(range=" + this.range + ", rangeColor=" + this.rangeColor + ", price=" + this.price + ", priceColor=" + this.priceColor + ")";
    }

    public ViceInfo(@NotNull String str, int i, @NotNull String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.range = str;
        this.rangeColor = i;
        this.price = str2;
        this.priceColor = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("--") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000d: INVOKE (wrap:int:0x000b: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:69)) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("--") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001c: INVOKE (wrap:int:0x001a: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:71)) : (r5v0 int))
 A[MD:(java.lang.String, int, java.lang.String, int):void (m)] (LINE:67) call: com.okinc.kline.ui.view.model.ViceInfo.<init>(java.lang.String, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ ViceInfo(String str, int i, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "--" : str, (i3 & 2) != 0 ? C33070mpX.copydefault(C52761wXj.Activity.QwvEab) : i, (i3 & 4) != 0 ? "--" : str2, (i3 & 8) != 0 ? C33070mpX.copydefault(C52761wXj.Activity.QwvEab) : i2);
    }
}
