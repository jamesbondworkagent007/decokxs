package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC3252AiT {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AiT.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC3252AiT(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3252AiT() {
    }

    /* JADX INFO: renamed from: o.AiT$StateListAnimator */
    public static final class StateListAnimator extends AbstractC3252AiT {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AiT$Activity */
    public static final class Activity extends AbstractC3252AiT {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AiT$TaskDescription */
    public static final class TaskDescription extends AbstractC3252AiT {
        public static final int $stable = 8;
        public final C60231zyo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C60231zyo c60231zyo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c60231zyo = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(c60231zyo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull C60231zyo c60231zyo) {
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            return new TaskDescription(c60231zyo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C60231zyo KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(error=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C60231zyo c60231zyo) {
            super(null);
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            this.OLrzqt = c60231zyo;
        }
    }
}
