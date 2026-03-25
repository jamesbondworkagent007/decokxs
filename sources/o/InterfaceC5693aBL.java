package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC5693aBL {

    /* JADX INFO: renamed from: o.aBL$TaskDescription */
    public static final class TaskDescription implements InterfaceC5693aBL {
        public final java.security.Signature EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.security.Signature signature, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signature = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(signature);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.security.Signature KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.security.Signature signature) {
            Intrinsics.checkNotNullParameter(signature, "");
            return new TaskDescription(signature);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success";
        }

        public TaskDescription(@NotNull java.security.Signature signature) {
            Intrinsics.checkNotNullParameter(signature, "");
            this.EZpvd = signature;
        }
    }

    /* JADX INFO: renamed from: o.aBL$StateListAnimator */
    public interface StateListAnimator extends InterfaceC5693aBL {

        /* JADX INFO: renamed from: o.aBL$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription EZpvd = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NotEnrolled";
            }

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.aBL$StateListAnimator$Application */
        public static final class Application implements StateListAnimator {
            public static final Application EZpvd = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "KeyInvalidated";
            }

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.aBL$StateListAnimator$Activity */
        public static final class Activity implements StateListAnimator {
            public static final Activity copydefault = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "UserCancelled";
            }

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: o.aBL$StateListAnimator$ActionBar */
        public static final class ActionBar implements StateListAnimator {
            public final java.lang.String AEQbTJ;
            public final java.lang.Integer copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    num = actionBar.copydefault;
                }
                if ((i & 2) != 0) {
                    str = actionBar.AEQbTJ;
                }
                return actionBar.OLrzqt(num, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Integer AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(java.lang.Integer num, java.lang.String str) {
                return new ActionBar(num, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.Integer num = this.copydefault;
                int iHashCode = num == null ? 0 : num.hashCode();
                java.lang.String str = this.AEQbTJ;
                return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
            }

            public ActionBar(java.lang.Integer num, java.lang.String str) {
                this.copydefault = num;
                this.AEQbTJ = str;
            }

            public java.lang.String toString() {
                return "OtherError(reason=" + this.copydefault + ", message=" + this.AEQbTJ + ")";
            }
        }
    }
}
