package o;

import com.okinc.oklive.app.data.LiveStreamStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class sTB {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTB.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ sTB(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private sTB() {
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription extends sTB {
        public final LiveStreamStatus AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, LiveStreamStatus liveStreamStatus, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                liveStreamStatus = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z = taskDescription.copydefault;
            }
            return taskDescription.copydefault(str, liveStreamStatus, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str, @NotNull LiveStreamStatus liveStreamStatus, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(liveStreamStatus, "");
            return new TaskDescription(str, liveStreamStatus, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.AEQbTJ == taskDescription.AEQbTJ && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(channelId=" + this.EZpvd + ", status=" + this.AEQbTJ + ", allowRecording=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull LiveStreamStatus liveStreamStatus, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(liveStreamStatus, "");
            this.EZpvd = str;
            this.AEQbTJ = liveStreamStatus;
            this.copydefault = z;
        }

        public final boolean copydefault() {
            return this.AEQbTJ == LiveStreamStatus.LIVE;
        }

        public final boolean AYXKKw() {
            return this.AEQbTJ == LiveStreamStatus.SCHEDULED;
        }

        public final boolean EZpvd() {
            return this.AEQbTJ == LiveStreamStatus.ENDED;
        }

        public final boolean djBIcL() {
            return this.AEQbTJ == LiveStreamStatus.PAUSED;
        }

        public final boolean KWHzl() {
            return this.AEQbTJ == LiveStreamStatus.Cancelled;
        }

        public final boolean AEQbTJ() {
            return EZpvd() && this.copydefault;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application extends sTB {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            return application.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Application) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NotFound(shareCode=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator extends sTB {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity extends sTB {
        public final java.lang.String AEQbTJ;
        public final int KWHzl;
        public final java.lang.Throwable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.KWHzl;
            }
            if ((i2 & 2) != 0) {
                th = activity.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                str = activity.AEQbTJ;
            }
            return activity.AEQbTJ(i, th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i, java.lang.Throwable th, java.lang.String str) {
            return new Activity(i, th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.KWHzl == activity.KWHzl && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.KWHzl);
            java.lang.Throwable th = this.OLrzqt;
            int iHashCode2 = th == null ? 0 : th.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.KWHzl + ", error=" + this.OLrzqt + ", message=" + this.AEQbTJ + ")";
        }

        public Activity(int i, java.lang.Throwable th, java.lang.String str) {
            super(null);
            this.KWHzl = i;
            this.OLrzqt = th;
            this.AEQbTJ = str;
        }
    }
}
