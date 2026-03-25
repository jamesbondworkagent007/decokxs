package com.okinc.kline.data;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LineFibDataBean {
    public static final int $stable = 8;
    private String id;
    private String linkKey;
    private String ownerSource;
    private List<LinePointsBean> points;
    private LineFibStateBean state;
    private String timeStamp;
    private String type;
    private int version;
    private int zorder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LineFibDataBean() {
        this(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineFibStateBean component3() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LinePointsBean> component4() {
        return this.points;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.zorder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ownerSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.linkKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineFibDataBean copy(@NotNull String str, @NotNull String str2, @NotNull LineFibStateBean lineFibStateBean, @NotNull List<LinePointsBean> list, int i, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(lineFibStateBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LineFibDataBean(str, str2, lineFibStateBean, list, i, str3, str4, i2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineFibDataBean)) {
            return false;
        }
        LineFibDataBean lineFibDataBean = (LineFibDataBean) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) lineFibDataBean.type) && Intrinsics.EZpvd((Object) this.id, (Object) lineFibDataBean.id) && Intrinsics.EZpvd(this.state, lineFibDataBean.state) && Intrinsics.EZpvd(this.points, lineFibDataBean.points) && this.zorder == lineFibDataBean.zorder && Intrinsics.EZpvd((Object) this.ownerSource, (Object) lineFibDataBean.ownerSource) && Intrinsics.EZpvd((Object) this.linkKey, (Object) lineFibDataBean.linkKey) && this.version == lineFibDataBean.version && Intrinsics.EZpvd((Object) this.timeStamp, (Object) lineFibDataBean.timeStamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkKey() {
        return this.linkKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerSource() {
        return this.ownerSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LinePointsBean> getPoints() {
        return this.points;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineFibStateBean getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getZorder() {
        return this.zorder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.state.hashCode()) * 31) + this.points.hashCode()) * 31) + Integer.hashCode(this.zorder)) * 31) + this.ownerSource.hashCode()) * 31) + this.linkKey.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.timeStamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linkKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwnerSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ownerSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPoints(@NotNull List<LinePointsBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.points = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull LineFibStateBean lineFibStateBean) {
        Intrinsics.checkNotNullParameter(lineFibStateBean, "");
        this.state = lineFibStateBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeStamp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeStamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(int i) {
        this.version = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZorder(int i) {
        this.zorder = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LineFibDataBean(type=" + this.type + ", id=" + this.id + ", state=" + this.state + ", points=" + this.points + ", zorder=" + this.zorder + ", ownerSource=" + this.ownerSource + ", linkKey=" + this.linkKey + ", version=" + this.version + ", timeStamp=" + this.timeStamp + ")";
    }

    public LineFibDataBean(@NotNull String str, @NotNull String str2, @NotNull LineFibStateBean lineFibStateBean, @NotNull List<LinePointsBean> list, int i, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(lineFibStateBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.id = str2;
        this.state = lineFibStateBean;
        this.points = list;
        this.zorder = i;
        this.ownerSource = str3;
        this.linkKey = str4;
        this.version = i2;
        this.timeStamp = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r57v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r57v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:com.okinc.kline.data.LineFibStateBean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r57v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  (0 int)
  false
  false
  (null java.lang.String)
  false
  false
  false
  (0 int)
  false
  false
  false
  false
  false
  (0 int)
  (null com.okinc.kline.data.TrendlineBean)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (-1 int)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, int, int, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, int, com.okinc.kline.data.TrendlineBean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:50) call: com.okinc.kline.data.LineFibStateBean.<init>(java.lang.String, java.lang.String, int, int, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, int, com.okinc.kline.data.TrendlineBean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r50v0 com.okinc.kline.data.LineFibStateBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0069: ARITH (r57v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r51v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0074: ARITH (r57v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-15000 int) : (r52v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r57v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("kline") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r57v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("Z6pdpLNRePmr") : (r54v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008f: ARITH (r57v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r55v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (r57v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r56v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.kline.data.LineFibStateBean, java.util.List<com.okinc.kline.data.LinePointsBean>, int, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:47) call: com.okinc.kline.data.LineFibDataBean.<init>(java.lang.String, java.lang.String, com.okinc.kline.data.LineFibStateBean, java.util.List, int, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ LineFibDataBean(String str, String str2, LineFibStateBean lineFibStateBean, List list, int i, String str3, String str4, int i2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? new LineFibStateBean(null, null, 0, 0, false, false, null, false, false, false, 0, false, false, false, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null) : lineFibStateBean, (i3 & 8) != 0 ? yDY.AhwBna() : list, (i3 & 16) != 0 ? -15000 : i, (i3 & 32) != 0 ? "kline" : str3, (i3 & 64) != 0 ? "Z6pdpLNRePmr" : str4, (i3 & 128) != 0 ? 2 : i2, (i3 & 256) == 0 ? str5 : "");
    }
}
