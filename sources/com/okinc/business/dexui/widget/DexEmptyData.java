package com.okinc.business.dexui.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEmptyData implements kMU {
    public static final int $stable = 0;
    private final String btnText;
    private final Integer emptyType;
    private final int marginBottom;
    private final int marginTop;
    private final String subTitle;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexEmptyData() {
        this(null, null, null, null, 0, 0, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexEmptyData copy$default(DexEmptyData dexEmptyData, Integer num, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = dexEmptyData.emptyType;
        }
        if ((i3 & 2) != 0) {
            str = dexEmptyData.title;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = dexEmptyData.subTitle;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = dexEmptyData.btnText;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i = dexEmptyData.marginTop;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = dexEmptyData.marginBottom;
        }
        return dexEmptyData.copy(num, str4, str5, str6, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.emptyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.btnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexEmptyData copy(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DexEmptyData(num, str, str2, str3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexEmptyData)) {
            return false;
        }
        DexEmptyData dexEmptyData = (DexEmptyData) obj;
        return Intrinsics.EZpvd(this.emptyType, dexEmptyData.emptyType) && Intrinsics.EZpvd((Object) this.title, (Object) dexEmptyData.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) dexEmptyData.subTitle) && Intrinsics.EZpvd((Object) this.btnText, (Object) dexEmptyData.btnText) && this.marginTop == dexEmptyData.marginTop && this.marginBottom == dexEmptyData.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtnText() {
        return this.btnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEmptyType() {
        return this.emptyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMarginBottom() {
        return this.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMarginTop() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.emptyType;
        return ((((((((((num == null ? 0 : num.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.btnText.hashCode()) * 31) + Integer.hashCode(this.marginTop)) * 31) + Integer.hashCode(this.marginBottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexEmptyData(emptyType=" + this.emptyType + ", title=" + this.title + ", subTitle=" + this.subTitle + ", btnText=" + this.btnText + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
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

    public DexEmptyData(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.emptyType = num;
        this.title = str;
        this.subTitle = str2;
        this.btnText = str3;
        this.marginTop = i;
        this.marginBottom = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r5v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:int:0x002b: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0027: INVOKE (20.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:66)) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int):void (m)] (LINE:61) call: com.okinc.business.dexui.widget.DexEmptyData.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ DexEmptyData(Integer num, String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : num, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) == 0 ? str3 : "", (i3 & 16) != 0 ? C55298xhM.dp2px$default(20.0f, null, 1, null) : i, (i3 & 32) != 0 ? 0 : i2);
    }
}
