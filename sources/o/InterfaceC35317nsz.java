package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35317nsz {
    void OLrzqt(@NotNull StateListAnimator stateListAnimator);

    /* JADX INFO: renamed from: o.nsz$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nsz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.nsz$StateListAnimator$Fragment */
        public static final class Fragment extends StateListAnimator {
            public static final Fragment EZpvd = new Fragment();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fragment)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -110419287;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "TakePicture";
            }

            private Fragment() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.nsz$StateListAnimator$Application */
        public static final class Application extends StateListAnimator {
            public static final Application OLrzqt = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 177842883;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RecordStart";
            }

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.nsz$StateListAnimator$ActionBar */
        public static final class ActionBar extends StateListAnimator {
            public final long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = actionBar.OLrzqt;
                }
                return actionBar.EZpvd(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(long j) {
                return new ActionBar(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.OLrzqt == ((ActionBar) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Long.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RecordEnd(durationMs=" + this.OLrzqt + ")";
            }

            public ActionBar(long j) {
                super(null);
                this.OLrzqt = j;
            }
        }

        /* JADX INFO: renamed from: o.nsz$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0897StateListAnimator extends StateListAnimator {
            public final long AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0897StateListAnimator copy$default(C0897StateListAnimator c0897StateListAnimator, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = c0897StateListAnimator.AEQbTJ;
                }
                return c0897StateListAnimator.EZpvd(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0897StateListAnimator EZpvd(long j) {
                return new C0897StateListAnimator(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0897StateListAnimator) && this.AEQbTJ == ((C0897StateListAnimator) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Long.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RecordTooShort(durationMs=" + this.AEQbTJ + ")";
            }

            public C0897StateListAnimator(long j) {
                super(null);
                this.AEQbTJ = j;
            }
        }

        /* JADX INFO: renamed from: o.nsz$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public final float copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, float f, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    f = taskDescription.copydefault;
                }
                return taskDescription.KWHzl(f);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(float f) {
                return new TaskDescription(f);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && java.lang.Float.compare(this.copydefault, ((TaskDescription) obj).copydefault) == 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Float.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RecordZoom(zoomDelta=" + this.copydefault + ")";
            }

            public TaskDescription(float f) {
                super(null);
                this.copydefault = f;
            }
        }

        /* JADX INFO: renamed from: o.nsz$StateListAnimator$Activity */
        /* JADX INFO: loaded from: classes15.dex */
        public static final class Activity extends StateListAnimator {
            public static final Activity copydefault = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 164870249;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RecordError";
            }

            private Activity() {
                super(null);
            }
        }
    }
}
