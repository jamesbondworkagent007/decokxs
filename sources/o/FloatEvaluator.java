package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class FloatEvaluator {
    public static final ActionBar EZpvd = new ActionBar(null);
    public static final java.util.List<FloatEvaluator> OLrzqt = yDY.gEmmrt(Application.KWHzl, TaskDescription.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FloatEvaluator.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FloatEvaluator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String OLrzqt();

    private FloatEvaluator() {
    }

    public static final class Application extends FloatEvaluator {
        public static final Application KWHzl = new Application();
        public static final java.lang.String copydefault = "BLOCK";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FloatEvaluator
        public java.lang.String OLrzqt() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Block";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends FloatEvaluator {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String AEQbTJ = "NO_ACTION";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FloatEvaluator
        public java.lang.String OLrzqt() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoAction";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Activity extends FloatEvaluator {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            return activity.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FloatEvaluator
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FloatEvaluator.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final FloatEvaluator EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BLOCK") ? Application.KWHzl : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "NO_ACTION") ? TaskDescription.KWHzl : new Activity(str);
        }
    }
}
