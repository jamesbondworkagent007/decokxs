package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class svM {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.svM.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ svM(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends svM {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(localPath=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    private svM() {
    }

    public static final class Application extends svM {
        public final int EZpvd;
        public final C45709svE OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, C45709svE c45709svE, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = application.EZpvd;
            }
            if ((i2 & 2) != 0) {
                c45709svE = application.OLrzqt;
            }
            return application.AEQbTJ(i, c45709svE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(int i, @NotNull C45709svE c45709svE) {
            Intrinsics.checkNotNullParameter(c45709svE, "");
            return new Application(i, c45709svE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.EZpvd == application.EZpvd && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Progress(progress=" + this.EZpvd + ", message=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(int i, @NotNull C45709svE c45709svE) {
            super(null);
            Intrinsics.checkNotNullParameter(c45709svE, "");
            this.EZpvd = i;
            this.OLrzqt = c45709svE;
        }
    }

    public static final class Activity extends svM {
        public final java.lang.Exception AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = activity.AEQbTJ;
            }
            return activity.KWHzl(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return new Activity(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(exception=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.Exception exc) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            this.AEQbTJ = exc;
        }
    }

    public static final class TaskDescription extends svM {
        public final java.lang.Exception OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return new TaskDescription(exc);
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
            return "Expired(exception=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.Exception exc) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            this.OLrzqt = exc;
        }
    }
}
