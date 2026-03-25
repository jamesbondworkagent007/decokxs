package o;

import com.okinc.okimcore.feature.message.utility.MemoryTracker$startTrackingWithFlow$job$1;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMR {
    public static final sMR EZpvd = new sMR();
    public static final DecimalFormat KWHzl = new DecimalFormat("#.##");
    public static final int copydefault = 8;

    public final double copydefault(long j) {
        return j / 1048576.0d;
    }

    private sMR() {
    }

    public static final class Activity {
        public final double AEQbTJ;
        public final double AYXKKw;
        public final double EZpvd;
        public final double KWHzl;
        public final double OLrzqt;
        public final double copydefault;
        public final int djBIcL;
        public final double valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
            return new Activity(i, d, d2, d3, d4, d5, d6, d7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.djBIcL == activity.djBIcL && java.lang.Double.compare(this.valueOf, activity.valueOf) == 0 && java.lang.Double.compare(this.AYXKKw, activity.AYXKKw) == 0 && java.lang.Double.compare(this.EZpvd, activity.EZpvd) == 0 && java.lang.Double.compare(this.OLrzqt, activity.OLrzqt) == 0 && java.lang.Double.compare(this.copydefault, activity.copydefault) == 0 && java.lang.Double.compare(this.KWHzl, activity.KWHzl) == 0 && java.lang.Double.compare(this.AEQbTJ, activity.AEQbTJ) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((java.lang.Integer.hashCode(this.djBIcL) * 31) + java.lang.Double.hashCode(this.valueOf)) * 31) + java.lang.Double.hashCode(this.AYXKKw)) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + java.lang.Double.hashCode(this.OLrzqt)) * 31) + java.lang.Double.hashCode(this.copydefault)) * 31) + java.lang.Double.hashCode(this.KWHzl)) * 31) + java.lang.Double.hashCode(this.AEQbTJ);
        }

        public Activity(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
            this.djBIcL = i;
            this.valueOf = d;
            this.AYXKKw = d2;
            this.EZpvd = d3;
            this.OLrzqt = d4;
            this.copydefault = d5;
            this.KWHzl = d6;
            this.AEQbTJ = d7;
        }

        public java.lang.String toString() {
            return "MemorySnapshot(snapshotCount=" + this.djBIcL + ", peak used=" + C33129mqd.AhwBna(java.lang.Double.valueOf(this.AEQbTJ)) + "%, avg used=" + C33129mqd.AhwBna(java.lang.Double.valueOf(this.KWHzl)) + "%, current used=" + sMR.KWHzl.format(this.valueOf) + "MB, current total=" + sMR.KWHzl.format(this.AYXKKw) + "MB, current free=" + sMR.KWHzl.format(this.EZpvd) + "MB, current usage=" + sMR.KWHzl.format(this.copydefault) + "%)";
        }
    }

    public final kotlin.Pair<SharedFlow<Activity>, Job> KWHzl(@NotNull java.lang.String str, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        pUU.KWHzl("MemoryTracker", "[IMMemory tracking] started");
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        return C56390yDp.OLrzqt(FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default), BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MemoryTracker$startTrackingWithFlow$job$1(str, mutableSharedFlowMutableSharedFlow$default, null), 3, null));
    }

    public final Activity AEQbTJ(Activity activity) {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long j = runtime.totalMemory();
        long jFreeMemory = runtime.freeMemory();
        long j2 = j - jFreeMemory;
        double dCopydefault = copydefault(jMaxMemory);
        double dCopydefault2 = copydefault(j);
        double dCopydefault3 = copydefault(jFreeMemory);
        double d = 100.0d * (j2 / jMaxMemory);
        return new Activity(activity == null ? 1 : activity.copydefault() + 1, copydefault(j2), dCopydefault2, dCopydefault3, dCopydefault, d, activity == null ? d : ((activity.EZpvd() * ((double) activity.copydefault())) + d) / ((double) (activity.copydefault() + 1)), activity == null ? d : java.lang.Math.max(activity.KWHzl(), d));
    }
}
