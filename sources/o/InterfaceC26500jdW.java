package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26500jdW {

    /* JADX INFO: renamed from: o.jdW$Activity */
    public static final class Activity implements InterfaceC26500jdW {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jdW$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements InterfaceC26500jdW {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.jdW$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC26500jdW {
        public final C26502jdY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C26502jdY c26502jdY, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c26502jdY = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(c26502jdY);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull C26502jdY c26502jdY) {
            Intrinsics.checkNotNullParameter(c26502jdY, "");
            return new StateListAnimator(c26502jdY);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C26502jdY OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(content=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull C26502jdY c26502jdY) {
            Intrinsics.checkNotNullParameter(c26502jdY, "");
            this.OLrzqt = c26502jdY;
        }
    }
}
