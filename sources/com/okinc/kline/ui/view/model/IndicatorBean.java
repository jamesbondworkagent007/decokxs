package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class IndicatorBean {
    public static final int $stable = 8;
    private String id;
    private boolean main;
    private Params params;
    private Boolean visible;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndicatorBean() {
        this(null, false, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IndicatorBean copy$default(IndicatorBean indicatorBean, String str, boolean z, Params params, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorBean.id;
        }
        if ((i & 2) != 0) {
            z = indicatorBean.main;
        }
        if ((i & 4) != 0) {
            params = indicatorBean.params;
        }
        if ((i & 8) != 0) {
            bool = indicatorBean.visible;
        }
        return indicatorBean.copy(str, z, params, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Params component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndicatorBean copy(@NotNull String str, boolean z, Params params, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IndicatorBean(str, z, params, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorBean)) {
            return false;
        }
        IndicatorBean indicatorBean = (IndicatorBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) indicatorBean.id) && this.main == indicatorBean.main && Intrinsics.EZpvd(this.params, indicatorBean.params) && Intrinsics.EZpvd(this.visible, indicatorBean.visible);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMain() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Params getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Boolean.hashCode(this.main);
        Params params = this.params;
        int iHashCode3 = params == null ? 0 : params.hashCode();
        Boolean bool = this.visible;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMain(boolean z) {
        this.main = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParams(Params params) {
        this.params = params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndicatorBean(id=" + this.id + ", main=" + this.main + ", params=" + this.params + ", visible=" + this.visible + ")";
    }

    public IndicatorBean(@NotNull String str, boolean z, Params params, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.main = z;
        this.params = params;
        this.visible = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:com.okinc.kline.ui.view.model.Params:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Params) : (r4v0 com.okinc.kline.ui.view.model.Params))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, boolean, com.okinc.kline.ui.view.model.Params, java.lang.Boolean):void (m)] (LINE:18) call: com.okinc.kline.ui.view.model.IndicatorBean.<init>(java.lang.String, boolean, com.okinc.kline.ui.view.model.Params, java.lang.Boolean):void type: THIS */
    public /* synthetic */ IndicatorBean(String str, boolean z, Params params, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : params, (i & 8) != 0 ? null : bool);
    }
}
