package com.okinc.kline.data;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LineDataBean {
    public static final int $stable = 8;
    private String id;
    private String linkKey;
    private String ownerSource;
    private List<LinePointsBean> points;
    private LineStateBean state;
    private String timeStamp;
    private String type;
    private int version;
    private int zorder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LineDataBean() {
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
    public final LineStateBean component3() {
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
    public final LineDataBean copy(@NotNull String str, @NotNull String str2, @NotNull LineStateBean lineStateBean, @NotNull List<LinePointsBean> list, int i, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(lineStateBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LineDataBean(str, str2, lineStateBean, list, i, str3, str4, i2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineDataBean)) {
            return false;
        }
        LineDataBean lineDataBean = (LineDataBean) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) lineDataBean.type) && Intrinsics.EZpvd((Object) this.id, (Object) lineDataBean.id) && Intrinsics.EZpvd(this.state, lineDataBean.state) && Intrinsics.EZpvd(this.points, lineDataBean.points) && this.zorder == lineDataBean.zorder && Intrinsics.EZpvd((Object) this.ownerSource, (Object) lineDataBean.ownerSource) && Intrinsics.EZpvd((Object) this.linkKey, (Object) lineDataBean.linkKey) && this.version == lineDataBean.version && Intrinsics.EZpvd((Object) this.timeStamp, (Object) lineDataBean.timeStamp);
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
    public final LineStateBean getState() {
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
    public final void setState(@NotNull LineStateBean lineStateBean) {
        Intrinsics.checkNotNullParameter(lineStateBean, "");
        this.state = lineStateBean;
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
        return "LineDataBean(type=" + this.type + ", id=" + this.id + ", state=" + this.state + ", points=" + this.points + ", zorder=" + this.zorder + ", ownerSource=" + this.ownerSource + ", linkKey=" + this.linkKey + ", version=" + this.version + ", timeStamp=" + this.timeStamp + ")";
    }

    public LineDataBean(@NotNull String str, @NotNull String str2, @NotNull LineStateBean lineStateBean, @NotNull List<LinePointsBean> list, int i, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(lineStateBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.id = str2;
        this.state = lineStateBean;
        this.points = list;
        this.zorder = i;
        this.ownerSource = str3;
        this.linkKey = str4;
        this.version = i2;
        this.timeStamp = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:com.okinc.kline.data.LineStateBean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  (0 int)
  false
  false
  (0 int)
  (0 int)
  false
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  false
  false
  false
  false
  false
  false
  false
  false
  false
  false
  (0 int)
  (0 int)
  (0 int)
  false
  false
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.kline.data.IntervalsVisibilitiesBean)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (-1 int)
  (31 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, int, int, boolean, boolean, int, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.data.IntervalsVisibilitiesBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:37) call: com.okinc.kline.data.LineStateBean.<init>(java.lang.String, java.lang.String, int, int, boolean, boolean, int, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.data.IntervalsVisibilitiesBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r49v0 com.okinc.kline.data.LineStateBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0067: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:38)) : (r50v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0072: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-15000 int) : (r51v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("kline") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("Z6pdpLNRePmr") : (r53v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008d: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r54v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0095: ARITH (r56v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r55v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.kline.data.LineStateBean, java.util.List<com.okinc.kline.data.LinePointsBean>, int, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:34) call: com.okinc.kline.data.LineDataBean.<init>(java.lang.String, java.lang.String, com.okinc.kline.data.LineStateBean, java.util.List, int, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ LineDataBean(String str, String str2, LineStateBean lineStateBean, List list, int i, String str3, String str4, int i2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? new LineStateBean(null, null, 0, 0, false, false, 0, 0, false, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, -1, 31, null) : lineStateBean, (i3 & 8) != 0 ? yDY.AhwBna() : list, (i3 & 16) != 0 ? -15000 : i, (i3 & 32) != 0 ? "kline" : str3, (i3 & 64) != 0 ? "Z6pdpLNRePmr" : str4, (i3 & 128) != 0 ? 2 : i2, (i3 & 256) == 0 ? str5 : "");
    }
}
