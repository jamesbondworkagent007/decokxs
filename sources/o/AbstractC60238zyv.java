package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC60238zyv {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zyv.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC60238zyv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC60238zyv() {
    }

    /* JADX INFO: renamed from: o.zyv$StateListAnimator */
    public static final class StateListAnimator extends AbstractC60238zyv {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zyv$TaskDescription */
    public static final class TaskDescription extends AbstractC60238zyv {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zyv$ActionBar */
    public static final class ActionBar extends AbstractC60238zyv {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zyv$Activity */
    public static final class Activity extends AbstractC60238zyv {
        public static final int $stable = 8;
        public final C60231zyo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, C60231zyo c60231zyo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c60231zyo = activity.EZpvd;
            }
            return activity.AEQbTJ(c60231zyo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C60231zyo AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull C60231zyo c60231zyo) {
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            return new Activity(c60231zyo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(error=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C60231zyo c60231zyo) {
            super(null);
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            this.EZpvd = c60231zyo;
        }
    }
}
