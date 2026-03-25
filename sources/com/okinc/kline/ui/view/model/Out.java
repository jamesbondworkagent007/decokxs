package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Out {
    public static final int $stable = 8;
    private String color;
    private String colorBlk;
    private Double lineWidth;
    private Double transparency;
    private Double value;
    private Boolean visible;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Out() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Out copy$default(Out out, Double d, String str, Double d2, Boolean bool, Double d3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = out.value;
        }
        if ((i & 2) != 0) {
            str = out.color;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            d2 = out.lineWidth;
        }
        Double d4 = d2;
        if ((i & 8) != 0) {
            bool = out.visible;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            d3 = out.transparency;
        }
        Double d5 = d3;
        if ((i & 32) != 0) {
            str2 = out.colorBlk;
        }
        return out.copy(d, str3, d4, bool2, d5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component3() {
        return this.lineWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component5() {
        return this.transparency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.colorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out copy(Double d, String str, Double d2, Boolean bool, Double d3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new Out(d, str, d2, bool, d3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Out)) {
            return false;
        }
        Out out = (Out) obj;
        return Intrinsics.EZpvd(this.value, out.value) && Intrinsics.EZpvd((Object) this.color, (Object) out.color) && Intrinsics.EZpvd(this.lineWidth, out.lineWidth) && Intrinsics.EZpvd(this.visible, out.visible) && Intrinsics.EZpvd(this.transparency, out.transparency) && Intrinsics.EZpvd((Object) this.colorBlk, (Object) out.colorBlk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColorBlk() {
        return this.colorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLineWidth() {
        return this.lineWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getTransparency() {
        return this.transparency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Double d = this.value;
        int iHashCode = d == null ? 0 : d.hashCode();
        String str = this.color;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Double d2 = this.lineWidth;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        Boolean bool = this.visible;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Double d3 = this.transparency;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (d3 != null ? d3.hashCode() : 0)) * 31) + this.colorBlk.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColor(String str) {
        this.color = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorBlk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.colorBlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineWidth(Double d) {
        this.lineWidth = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransparency(Double d) {
        this.transparency = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(Double d) {
        this.value = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Out(value=" + this.value + ", color=" + this.color + ", lineWidth=" + this.lineWidth + ", visible=" + this.visible + ", transparency=" + this.transparency + ", colorBlk=" + this.colorBlk + ")";
    }

    public Out(Double d, String str, Double d2, Boolean bool, Double d3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.value = d;
        this.color = str;
        this.lineWidth = d2;
        this.visible = bool;
        this.transparency = d3;
        this.colorBlk = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r5v0 java.lang.Double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r7v0 java.lang.Double))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.Double) : (null java.lang.Double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(java.lang.Double, java.lang.String, java.lang.Double, java.lang.Boolean, java.lang.Double, java.lang.String):void (m)] (LINE:76) call: com.okinc.kline.ui.view.model.Out.<init>(java.lang.Double, java.lang.String, java.lang.Double, java.lang.Boolean, java.lang.Double, java.lang.String):void type: THIS */
    public /* synthetic */ Out(Double d, String str, Double d2, Boolean bool, Double d3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bool, (i & 16) == 0 ? d3 : null, (i & 32) != 0 ? "" : str2);
    }
}
