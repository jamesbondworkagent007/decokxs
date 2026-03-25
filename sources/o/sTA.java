package o;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class sTA {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTA.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ sTA(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private sTA() {
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription extends sTA {
        public final LivestreamInfoResponse OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, LivestreamInfoResponse livestreamInfoResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                livestreamInfoResponse = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(livestreamInfoResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LivestreamInfoResponse AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull LivestreamInfoResponse livestreamInfoResponse) {
            Intrinsics.checkNotNullParameter(livestreamInfoResponse, "");
            return new TaskDescription(livestreamInfoResponse);
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
            return "Success(livestreamInfo=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull LivestreamInfoResponse livestreamInfoResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(livestreamInfoResponse, "");
            this.OLrzqt = livestreamInfoResponse;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity extends sTA {
        public final int AEQbTJ;
        public final java.lang.Throwable EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                th = activity.EZpvd;
            }
            if ((i2 & 4) != 0) {
                str = activity.copydefault;
            }
            return activity.AEQbTJ(i, th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i, java.lang.Throwable th, java.lang.String str) {
            return new Activity(i, th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
            java.lang.Throwable th = this.EZpvd;
            int iHashCode2 = th == null ? 0 : th.hashCode();
            java.lang.String str = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.AEQbTJ + ", error=" + this.EZpvd + ", message=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 int)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(int, java.lang.Throwable, java.lang.String):void (m)] (LINE:18) call: o.sTA.Activity.<init>(int, java.lang.Throwable, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(int i, java.lang.Throwable th, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : str);
        }

        public Activity(int i, java.lang.Throwable th, java.lang.String str) {
            super(null);
            this.AEQbTJ = i;
            this.EZpvd = th;
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application extends sTA {
        public static final Application EZpvd = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar extends sTA {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str) {
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
            return "NotFound(channelId=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}
