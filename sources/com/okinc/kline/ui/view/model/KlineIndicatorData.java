package com.okinc.kline.ui.view.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineIndicatorData {
    public static final int $stable = 8;
    private List<KlineIndicatorBean> indicatorDetailVos;
    private String timeVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineIndicatorData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.ui.view.model.KlineIndicatorData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KlineIndicatorData copy$default(KlineIndicatorData klineIndicatorData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = klineIndicatorData.indicatorDetailVos;
        }
        if ((i & 2) != 0) {
            str = klineIndicatorData.timeVersion;
        }
        return klineIndicatorData.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineIndicatorBean> component1() {
        return this.indicatorDetailVos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.timeVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineIndicatorData copy(@NotNull List<KlineIndicatorBean> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new KlineIndicatorData(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineIndicatorData)) {
            return false;
        }
        KlineIndicatorData klineIndicatorData = (KlineIndicatorData) obj;
        return Intrinsics.EZpvd(this.indicatorDetailVos, klineIndicatorData.indicatorDetailVos) && Intrinsics.EZpvd((Object) this.timeVersion, (Object) klineIndicatorData.timeVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineIndicatorBean> getIndicatorDetailVos() {
        return this.indicatorDetailVos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeVersion() {
        return this.timeVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.indicatorDetailVos.hashCode() * 31) + this.timeVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndicatorDetailVos(@NotNull List<KlineIndicatorBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.indicatorDetailVos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineIndicatorData(indicatorDetailVos=" + this.indicatorDetailVos + ", timeVersion=" + this.timeVersion + ")";
    }

    public KlineIndicatorData(@NotNull List<KlineIndicatorBean> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.indicatorDetailVos = list;
        this.timeVersion = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:7) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.kline.ui.view.model.KlineIndicatorBean>, java.lang.String):void (m)] (LINE:6) call: com.okinc.kline.ui.view.model.KlineIndicatorData.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ KlineIndicatorData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str);
    }
}
