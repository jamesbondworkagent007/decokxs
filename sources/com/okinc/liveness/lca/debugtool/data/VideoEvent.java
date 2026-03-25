package com.okinc.liveness.lca.debugtool.data;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoEvent {
    public static final int $stable = 0;

    @SerializedName("farEndIndex")
    private final Integer farEndIndex;

    @SerializedName("farStartIndex")
    private final Integer farStartIndex;

    @SerializedName("farStartTimestamp")
    private final Long farStartTimestamp;

    @SerializedName("stayTime")
    private final Long stayTime;

    @SerializedName("videoEndTimeStamp")
    private final Long videoEndTimeStamp;

    @SerializedName("videoStartTimestamp")
    private final Long videoStartTimestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VideoEvent() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoEvent copy$default(VideoEvent videoEvent, Long l, Long l2, Long l3, Long l4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = videoEvent.videoStartTimestamp;
        }
        if ((i & 2) != 0) {
            l2 = videoEvent.videoEndTimeStamp;
        }
        Long l5 = l2;
        if ((i & 4) != 0) {
            l3 = videoEvent.farStartTimestamp;
        }
        Long l6 = l3;
        if ((i & 8) != 0) {
            l4 = videoEvent.stayTime;
        }
        Long l7 = l4;
        if ((i & 16) != 0) {
            num = videoEvent.farStartIndex;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = videoEvent.farEndIndex;
        }
        return videoEvent.copy(l, l5, l6, l7, num3, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.videoStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.videoEndTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.farStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.stayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.farStartIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.farEndIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoEvent copy(Long l, Long l2, Long l3, Long l4, Integer num, Integer num2) {
        return new VideoEvent(l, l2, l3, l4, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEvent)) {
            return false;
        }
        VideoEvent videoEvent = (VideoEvent) obj;
        return Intrinsics.EZpvd(this.videoStartTimestamp, videoEvent.videoStartTimestamp) && Intrinsics.EZpvd(this.videoEndTimeStamp, videoEvent.videoEndTimeStamp) && Intrinsics.EZpvd(this.farStartTimestamp, videoEvent.farStartTimestamp) && Intrinsics.EZpvd(this.stayTime, videoEvent.stayTime) && Intrinsics.EZpvd(this.farStartIndex, videoEvent.farStartIndex) && Intrinsics.EZpvd(this.farEndIndex, videoEvent.farEndIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFarEndIndex() {
        return this.farEndIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFarStartIndex() {
        return this.farStartIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFarStartTimestamp() {
        return this.farStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStayTime() {
        return this.stayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVideoEndTimeStamp() {
        return this.videoEndTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.videoStartTimestamp;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.videoEndTimeStamp;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.farStartTimestamp;
        int iHashCode3 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.stayTime;
        int iHashCode4 = l4 == null ? 0 : l4.hashCode();
        Integer num = this.farStartIndex;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.farEndIndex;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoEvent(videoStartTimestamp=" + this.videoStartTimestamp + ", videoEndTimeStamp=" + this.videoEndTimeStamp + ", farStartTimestamp=" + this.farStartTimestamp + ", stayTime=" + this.stayTime + ", farStartIndex=" + this.farStartIndex + ", farEndIndex=" + this.farEndIndex + ")";
    }

    public VideoEvent(Long l, Long l2, Long l3, Long l4, Integer num, Integer num2) {
        this.videoStartTimestamp = l;
        this.videoEndTimeStamp = l2;
        this.farStartTimestamp = l3;
        this.stayTime = l4;
        this.farStartIndex = num;
        this.farEndIndex = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer):void (m)] (LINE:18) call: com.okinc.liveness.lca.debugtool.data.VideoEvent.<init>(java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ VideoEvent(Long l, Long l2, Long l3, Long l4, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
