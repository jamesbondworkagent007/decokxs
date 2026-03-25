package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC35275nsJ {
    void EZpvd(@NotNull Activity activity);

    /* JADX INFO: renamed from: o.nsJ$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nsJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.nsJ$Activity$StateListAnimator */
        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -764826832;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Confirm";
            }

            private StateListAnimator() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.nsJ$Activity$Activity, reason: collision with other inner class name */
        public static final class C0896Activity extends Activity {
            public static final C0896Activity KWHzl = new C0896Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0896Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1902058506;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Cancel";
            }

            private C0896Activity() {
                super(null);
            }
        }
    }
}
