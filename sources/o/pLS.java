package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLS {
    public static final int $stable = 8;

    @SerializedName("deeplinks")
    private final java.util.List<java.lang.String> deeplinks;

    @SerializedName("handler")
    private final java.util.List<java.lang.String> handler;

    @SerializedName("modes")
    private final java.util.List<java.lang.String> modes;

    @SerializedName(MetricsSQLiteCacheKt.METRICS_PARAMS)
    private final java.util.List<C43240rlZ> params;

    @SerializedName("path")
    private final java.lang.String path;

    @SerializedName("requireAuth")
    private final boolean requireAuth;

    @SerializedName("screenshotUrl")
    private final java.lang.String screenshotUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.pLS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pLS copy$default(pLS pls, java.lang.String str, java.util.List list, boolean z, java.util.List list2, java.util.List list3, java.lang.String str2, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pls.path;
        }
        if ((i & 2) != 0) {
            list = pls.modes;
        }
        java.util.List list5 = list;
        if ((i & 4) != 0) {
            z = pls.requireAuth;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list2 = pls.params;
        }
        java.util.List list6 = list2;
        if ((i & 16) != 0) {
            list3 = pls.deeplinks;
        }
        java.util.List list7 = list3;
        if ((i & 32) != 0) {
            str2 = pls.screenshotUrl;
        }
        java.lang.String str3 = str2;
        if ((i & 64) != 0) {
            list4 = pls.handler;
        }
        return pls.AEQbTJ(str, list5, z2, list6, list7, str3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pLS AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull java.util.List<C43240rlZ> list2, @NotNull java.util.List<java.lang.String> list3, java.lang.String str2, @NotNull java.util.List<java.lang.String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new pLS(str, list, z, list2, list3, str2, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pLS)) {
            return false;
        }
        pLS pls = (pLS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.path, (java.lang.Object) pls.path) && Intrinsics.EZpvd(this.modes, pls.modes) && this.requireAuth == pls.requireAuth && Intrinsics.EZpvd(this.params, pls.params) && Intrinsics.EZpvd(this.deeplinks, pls.deeplinks) && Intrinsics.EZpvd((java.lang.Object) this.screenshotUrl, (java.lang.Object) pls.screenshotUrl) && Intrinsics.EZpvd(this.handler, pls.handler);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.path.hashCode();
        int iHashCode2 = this.modes.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.requireAuth);
        int iHashCode4 = this.params.hashCode();
        int iHashCode5 = this.deeplinks.hashCode();
        java.lang.String str = this.screenshotUrl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.handler.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeeplinkItemDataJson(path=" + this.path + ", modes=" + this.modes + ", requireAuth=" + this.requireAuth + ", params=" + this.params + ", deeplinks=" + this.deeplinks + ", screenshotUrl=" + this.screenshotUrl + ", handler=" + this.handler + ")";
    }

    public pLS(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull java.util.List<C43240rlZ> list2, @NotNull java.util.List<java.lang.String> list3, java.lang.String str2, @NotNull java.util.List<java.lang.String> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.path = str;
        this.modes = list;
        this.requireAuth = z;
        this.params = list2;
        this.deeplinks = list3;
        this.screenshotUrl = str2;
        this.handler = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.util.List)
  (r12v0 boolean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r13v0 java.util.List))
  (r14v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:44)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, boolean, java.util.List<o.rlZ>, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:37) call: o.pLS.<init>(java.lang.String, java.util.List, boolean, java.util.List, java.util.List, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ pLS(java.lang.String str, java.util.List list, boolean z, java.util.List list2, java.util.List list3, java.lang.String str2, java.util.List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, (i & 8) != 0 ? yDY.AhwBna() : list2, list3, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? yDY.AhwBna() : list4);
    }
}
