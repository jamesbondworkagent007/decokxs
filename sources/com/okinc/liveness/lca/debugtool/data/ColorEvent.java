package com.okinc.liveness.lca.debugtool.data;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ColorEvent {
    public static final int $stable = 8;

    @SerializedName("colorEndIndex")
    private Integer colorEndIndex;

    @SerializedName("rgba")
    private final int[] colorRGBA;

    @SerializedName("colorStartIndex")
    private Integer colorStartIndex;

    @SerializedName("colorStartTimestamp")
    private final Long colorStartTimestamp;

    @SerializedName("qc_scores")
    private List<Double> qcScores;

    @SerializedName("stayTime")
    private Long stayTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ColorEvent() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.liveness.lca.debugtool.data.ColorEvent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorEvent copy$default(ColorEvent colorEvent, Long l, Long l2, int[] iArr, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = colorEvent.colorStartTimestamp;
        }
        if ((i & 2) != 0) {
            l2 = colorEvent.stayTime;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            iArr = colorEvent.colorRGBA;
        }
        int[] iArr2 = iArr;
        if ((i & 8) != 0) {
            num = colorEvent.colorStartIndex;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = colorEvent.colorEndIndex;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            list = colorEvent.qcScores;
        }
        return colorEvent.copy(l, l3, iArr2, num3, num4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.colorStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.stayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int[] component3() {
        return this.colorRGBA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.colorStartIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.colorEndIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> component6() {
        return this.qcScores;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorEvent copy(Long l, Long l2, int[] iArr, Integer num, Integer num2, List<Double> list) {
        return new ColorEvent(l, l2, iArr, num, num2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorEvent)) {
            return false;
        }
        ColorEvent colorEvent = (ColorEvent) obj;
        return Intrinsics.EZpvd(this.colorStartTimestamp, colorEvent.colorStartTimestamp) && Intrinsics.EZpvd(this.stayTime, colorEvent.stayTime) && Intrinsics.EZpvd(this.colorRGBA, colorEvent.colorRGBA) && Intrinsics.EZpvd(this.colorStartIndex, colorEvent.colorStartIndex) && Intrinsics.EZpvd(this.colorEndIndex, colorEvent.colorEndIndex) && Intrinsics.EZpvd(this.qcScores, colorEvent.qcScores);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getColorEndIndex() {
        return this.colorEndIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int[] getColorRGBA() {
        return this.colorRGBA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getColorStartIndex() {
        return this.colorStartIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getColorStartTimestamp() {
        return this.colorStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> getQcScores() {
        return this.qcScores;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStayTime() {
        return this.stayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.colorStartTimestamp;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.stayTime;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int[] iArr = this.colorRGBA;
        int iHashCode3 = iArr == null ? 0 : Arrays.hashCode(iArr);
        Integer num = this.colorStartIndex;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.colorEndIndex;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        List<Double> list = this.qcScores;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorEndIndex(Integer num) {
        this.colorEndIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorStartIndex(Integer num) {
        this.colorStartIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQcScores(List<Double> list) {
        this.qcScores = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStayTime(Long l) {
        this.stayTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorEvent(colorStartTimestamp=" + this.colorStartTimestamp + ", stayTime=" + this.stayTime + ", colorRGBA=" + Arrays.toString(this.colorRGBA) + ", colorStartIndex=" + this.colorStartIndex + ", colorEndIndex=" + this.colorEndIndex + ", qcScores=" + this.qcScores + ")";
    }

    public ColorEvent(Long l, Long l2, int[] iArr, Integer num, Integer num2, List<Double> list) {
        this.colorStartTimestamp = l;
        this.stayTime = l2;
        this.colorRGBA = iArr;
        this.colorStartIndex = num;
        this.colorEndIndex = num2;
        this.qcScores = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:int[]:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null int[]) : (r8v0 int[]))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.Long, int[], java.lang.Integer, java.lang.Integer, java.util.List<java.lang.Double>):void (m)] (LINE:8) call: com.okinc.liveness.lca.debugtool.data.ColorEvent.<init>(java.lang.Long, java.lang.Long, int[], java.lang.Integer, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ ColorEvent(Long l, Long l2, int[] iArr, Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : iArr, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : list);
    }
}
