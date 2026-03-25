package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC31272lqr {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lqr.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC31272lqr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC31272lqr() {
    }

    /* JADX INFO: renamed from: o.lqr$TaskDescription */
    public static final class TaskDescription extends AbstractC31272lqr {
        public final java.lang.String AEQbTJ;
        public final JsonElement EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, JsonElement jsonElement, boolean z, boolean z2, boolean z3, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.djBIcL;
            }
            if ((i & 2) != 0) {
                jsonElement = taskDescription.EZpvd;
            }
            JsonElement jsonElement2 = jsonElement;
            if ((i & 4) != 0) {
                z = taskDescription.KWHzl;
            }
            boolean z4 = z;
            if ((i & 8) != 0) {
                z2 = taskDescription.OLrzqt;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = taskDescription.copydefault;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.KWHzl(str, jsonElement2, z4, z5, z6, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, boolean z2, boolean z3, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            return new TaskDescription(str, jsonElement, z, z2, z3, str2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) taskDescription.djBIcL) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.KWHzl == taskDescription.KWHzl && this.OLrzqt == taskDescription.OLrzqt && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.djBIcL.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode4 = java.lang.Boolean.hashCode(this.OLrzqt);
            int iHashCode5 = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.String str = this.AEQbTJ;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PayInfo(uopHash=" + this.djBIcL + ", serverOption=" + this.EZpvd + ", needToDeployContract=" + this.KWHzl + ", need2FA=" + this.OLrzqt + ", needToSyncPasskey=" + this.copydefault + ", mfaSessionId=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, boolean z2, boolean z3, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.djBIcL = str;
            this.EZpvd = jsonElement;
            this.KWHzl = z;
            this.OLrzqt = z2;
            this.copydefault = z3;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: renamed from: o.lqr$Application */
    public static final class Application extends AbstractC31272lqr {
        public final int AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final int OLrzqt;
        public final JsonElement copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, JsonElement jsonElement, boolean z, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = application.AYXKKw;
            }
            if ((i3 & 2) != 0) {
                jsonElement = application.copydefault;
            }
            JsonElement jsonElement2 = jsonElement;
            if ((i3 & 4) != 0) {
                z = application.KWHzl;
            }
            boolean z2 = z;
            if ((i3 & 8) != 0) {
                i = application.OLrzqt;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = application.AEQbTJ;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                str2 = application.EZpvd;
            }
            return application.KWHzl(str, jsonElement2, z2, i4, i5, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, int i, int i2, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            return new Application(str, jsonElement, z, i, i2, str2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.KWHzl == application.KWHzl && this.OLrzqt == application.OLrzqt && this.AEQbTJ == application.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode4 = java.lang.Integer.hashCode(this.OLrzqt);
            int iHashCode5 = java.lang.Integer.hashCode(this.AEQbTJ);
            java.lang.String str = this.EZpvd;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreateCardAuthUopResponse(uopHash=" + this.AYXKKw + ", serverOption=" + this.copydefault + ", needToDeployContract=" + this.KWHzl + ", transactionOperations=" + this.OLrzqt + ", mfaBizType=" + this.AEQbTJ + ", mfaSessionId=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, int i, int i2, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.AYXKKw = str;
            this.copydefault = jsonElement;
            this.KWHzl = z;
            this.OLrzqt = i;
            this.AEQbTJ = i2;
            this.EZpvd = str2;
        }
    }

    /* JADX INFO: renamed from: o.lqr$Activity */
    public static final class Activity extends AbstractC31272lqr {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final boolean EZpvd;
        public final java.lang.Integer KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final JsonElement djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, JsonElement jsonElement, boolean z, boolean z2, boolean z3, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AYXKKw;
            }
            if ((i & 2) != 0) {
                jsonElement = activity.djBIcL;
            }
            JsonElement jsonElement2 = jsonElement;
            if ((i & 4) != 0) {
                z = activity.OLrzqt;
            }
            boolean z4 = z;
            if ((i & 8) != 0) {
                z2 = activity.copydefault;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = activity.EZpvd;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                str2 = activity.AEQbTJ;
            }
            java.lang.String str3 = str2;
            if ((i & 64) != 0) {
                num = activity.KWHzl;
            }
            return activity.copydefault(str, jsonElement2, z4, z5, z6, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, boolean z2, boolean z3, java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            return new Activity(str, jsonElement, z, z2, z3, str2, num);
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
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, activity.djBIcL) && this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault && this.EZpvd == activity.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            int iHashCode2 = this.djBIcL.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.OLrzqt);
            int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
            int iHashCode5 = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str = this.AEQbTJ;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.KWHzl;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OrderInfo(uopHash=" + this.AYXKKw + ", serverOption=" + this.djBIcL + ", needToDeployContract=" + this.OLrzqt + ", needToSyncPasskey=" + this.copydefault + ", need2FA=" + this.EZpvd + ", mfaSessionId=" + this.AEQbTJ + ", mfaBizType=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, boolean z2, boolean z3, java.lang.String str2, java.lang.Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.AYXKKw = str;
            this.djBIcL = jsonElement;
            this.OLrzqt = z;
            this.copydefault = z2;
            this.EZpvd = z3;
            this.AEQbTJ = str2;
            this.KWHzl = num;
        }
    }
}
