package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26469jcs {

    /* JADX INFO: renamed from: o.jcs$ActionBar */
    public static final class ActionBar implements InterfaceC26469jcs {
        public final C26468jcr AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C26468jcr c26468jcr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c26468jcr = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(c26468jcr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull C26468jcr c26468jcr) {
            Intrinsics.checkNotNullParameter(c26468jcr, "");
            return new ActionBar(c26468jcr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C26468jcr OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Data(productInfo=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull C26468jcr c26468jcr) {
            Intrinsics.checkNotNullParameter(c26468jcr, "");
            this.AEQbTJ = c26468jcr;
        }
    }

    /* JADX INFO: renamed from: o.jcs$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26469jcs {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jcs$TaskDescription */
    public static final class TaskDescription implements InterfaceC26469jcs {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }
}
