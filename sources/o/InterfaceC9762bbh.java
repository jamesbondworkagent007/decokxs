package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC9762bbh {

    /* JADX INFO: renamed from: o.bbh$TaskDescription */
    public static final class TaskDescription implements InterfaceC9762bbh {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.bbh$Application */
    public static final class Application implements InterfaceC9762bbh {
        public static final Application OLrzqt = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.bbh$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC9762bbh {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failure(message=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }
}
