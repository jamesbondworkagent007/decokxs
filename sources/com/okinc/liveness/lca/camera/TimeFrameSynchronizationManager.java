package com.okinc.liveness.lca.camera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class TimeFrameSynchronizationManager {
    public static final long DELAY = 50;
    public static final String TAG = "LCA Liveness Color";
    public final List<TimeFrame> actionTimeFrames = new ArrayList();
    public int currentFrameIndex;
    public Long startTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentFrameIndex() {
        return this.currentFrameIndex;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.camera.TimeFrameSynchronizationManager.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class TimeFrame {
        public static final int $stable = 8;
        public Integer frameIndex;
        public final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TimeFrame copy$default(TimeFrame timeFrame, long j, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeFrame.timestamp;
            }
            if ((i & 2) != 0) {
                num = timeFrame.frameIndex;
            }
            return timeFrame.copy(j, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.frameIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimeFrame copy(long j, Integer num) {
            return new TimeFrame(j, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeFrame)) {
                return false;
            }
            TimeFrame timeFrame = (TimeFrame) obj;
            return this.timestamp == timeFrame.timestamp && Intrinsics.EZpvd(this.frameIndex, timeFrame.frameIndex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getFrameIndex() {
            return this.frameIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.timestamp);
            Integer num = this.frameIndex;
            return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFrameIndex(Integer num) {
            this.frameIndex = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TimeFrame(timestamp=" + this.timestamp + ", frameIndex=" + this.frameIndex + ")";
        }

        public TimeFrame(long j, Integer num) {
            this.timestamp = j;
            this.frameIndex = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(long, java.lang.Integer):void (m)] (LINE:12) call: com.okinc.liveness.lca.camera.TimeFrameSynchronizationManager.TimeFrame.<init>(long, java.lang.Integer):void type: THIS */
        public /* synthetic */ TimeFrame(long j, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : num);
        }
    }

    public final void onActionChange(long j) {
        pUU.KWHzl(TAG, "onActionChange, time: " + j);
        synchronized (this.actionTimeFrames) {
            this.actionTimeFrames.add(new TimeFrame(j, null, 2, null));
        }
    }

    public final void onEnd(long j) {
        pUU.KWHzl(TAG, "onEnd, time: " + j + " " + this.currentFrameIndex);
        synchronized (this.actionTimeFrames) {
            this.actionTimeFrames.add(new TimeFrame(j, Integer.valueOf(this.currentFrameIndex)));
        }
    }

    public final void onCameraFrame(long j) {
        this.currentFrameIndex++;
        synchronized (this.actionTimeFrames) {
            for (TimeFrame timeFrame : this.actionTimeFrames) {
                if (timeFrame.getFrameIndex() == null && j > timeFrame.getTimestamp()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    pUU.KWHzl(TAG, "onCameraFrame, frame time: " + j + ", offset: " + (jCurrentTimeMillis - j) + " action.timestamp: " + timeFrame + ".timestamp action.frameIndex: " + this.currentFrameIndex);
                    timeFrame.setFrameIndex(Integer.valueOf(this.currentFrameIndex));
                    return;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Integer getFrameIndex(long j) {
        Object next;
        Iterator<T> it = this.actionTimeFrames.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TimeFrame) next).getTimestamp() == j) {
                break;
            }
        }
        TimeFrame timeFrame = (TimeFrame) next;
        if (timeFrame != null) {
            return timeFrame.getFrameIndex();
        }
        return null;
    }

    public final void start() {
        this.startTime = Long.valueOf(System.currentTimeMillis());
    }
}
