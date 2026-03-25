package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC5699aBR {

    /* JADX INFO: renamed from: o.aBR$Application */
    public static final class Application implements InterfaceC5699aBR {
        public final C5700aBS OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, C5700aBS c5700aBS, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c5700aBS = application.OLrzqt;
            }
            return application.copydefault(c5700aBS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5700aBS KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull C5700aBS c5700aBS) {
            Intrinsics.checkNotNullParameter(c5700aBS, "");
            return new Application(c5700aBS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(userKeyPair=" + this.OLrzqt + ")";
        }

        public Application(@NotNull C5700aBS c5700aBS) {
            Intrinsics.checkNotNullParameter(c5700aBS, "");
            this.OLrzqt = c5700aBS;
        }
    }

    /* JADX INFO: renamed from: o.aBR$TaskDescription */
    public static final class TaskDescription implements InterfaceC5699aBR {
        public final C5700aBS AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C5700aBS c5700aBS, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c5700aBS = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(c5700aBS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull C5700aBS c5700aBS) {
            Intrinsics.checkNotNullParameter(c5700aBS, "");
            return new TaskDescription(c5700aBS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AlreadyExisted(userKeyPair=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull C5700aBS c5700aBS) {
            Intrinsics.checkNotNullParameter(c5700aBS, "");
            this.AEQbTJ = c5700aBS;
        }
    }

    /* JADX INFO: renamed from: o.aBR$Activity */
    public static final class Activity implements InterfaceC5699aBR {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.aBR$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5699aBR {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            return stateListAnimator.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(java.lang.String str) {
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((StateListAnimator) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.copydefault + ")";
        }

        public StateListAnimator(java.lang.String str) {
            this.copydefault = str;
        }
    }
}
