package com.okinc.uilab.filter;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OKFilterTabBean {
    public static final int $stable = 8;
    private Object extraData;
    private boolean isClickable;
    private boolean isClicked;
    private String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKFilterTabBean copy$default(OKFilterTabBean oKFilterTabBean, String str, Object obj, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = oKFilterTabBean.title;
        }
        if ((i & 2) != 0) {
            obj = oKFilterTabBean.extraData;
        }
        if ((i & 4) != 0) {
            z = oKFilterTabBean.isClickable;
        }
        if ((i & 8) != 0) {
            z2 = oKFilterTabBean.isClicked;
        }
        return oKFilterTabBean.copy(str, obj, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component2() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isClicked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKFilterTabBean copy(@NotNull String str, @NotNull Object obj, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return new OKFilterTabBean(str, obj, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKFilterTabBean)) {
            return false;
        }
        OKFilterTabBean oKFilterTabBean = (OKFilterTabBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) oKFilterTabBean.title) && Intrinsics.EZpvd(this.extraData, oKFilterTabBean.extraData) && this.isClickable == oKFilterTabBean.isClickable && this.isClicked == oKFilterTabBean.isClicked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getExtraData() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.extraData.hashCode()) * 31) + Boolean.hashCode(this.isClickable)) * 31) + Boolean.hashCode(this.isClicked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isClickable() {
        return this.isClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isClicked() {
        return this.isClicked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickable(boolean z) {
        this.isClickable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClicked(boolean z) {
        this.isClicked = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraData(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.extraData = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKFilterTabBean(title=" + this.title + ", extraData=" + this.extraData + ", isClickable=" + this.isClickable + ", isClicked=" + this.isClicked + ")";
    }

    public OKFilterTabBean(@NotNull String str, @NotNull Object obj, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.title = str;
        this.extraData = obj;
        this.isClickable = z;
        this.isClicked = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (r1v0 java.lang.String) : (r2v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.Object, boolean, boolean):void (m)] (LINE:6) call: com.okinc.uilab.filter.OKFilterTabBean.<init>(java.lang.String, java.lang.Object, boolean, boolean):void type: THIS */
    public /* synthetic */ OKFilterTabBean(String str, Object obj, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? str : obj, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }
}
