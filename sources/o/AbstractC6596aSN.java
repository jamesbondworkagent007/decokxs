package o;

import com.okinc.account.api.model.security.otp.OtpInputType;
import com.okinc.account.api.model.uploadpersonalinfo.PersonalInfo;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC6596aSN {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aSN.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC6596aSN(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6596aSN() {
    }

    /* JADX INFO: renamed from: o.aSN$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends AbstractC6596aSN {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str) {
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
            return "RequiredMfaVerification(businessId=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.aSN$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends AbstractC6596aSN {
        public static final int copydefault = UploadPersonalInfoEntryPoint.$stable | PersonalInfo.$stable;
        public final PersonalInfo AEQbTJ;
        public final UploadPersonalInfoEntryPoint EZpvd;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, PersonalInfo personalInfo, UploadPersonalInfoEntryPoint uploadPersonalInfoEntryPoint, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personalInfo = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                uploadPersonalInfoEntryPoint = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                z = activity.KWHzl;
            }
            return activity.EZpvd(personalInfo, uploadPersonalInfoEntryPoint, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PersonalInfo AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoEntryPoint EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull PersonalInfo personalInfo, @NotNull UploadPersonalInfoEntryPoint uploadPersonalInfoEntryPoint, boolean z) {
            Intrinsics.checkNotNullParameter(personalInfo, "");
            Intrinsics.checkNotNullParameter(uploadPersonalInfoEntryPoint, "");
            return new Activity(personalInfo, uploadPersonalInfoEntryPoint, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
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
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RequiredUploadDocuments(personalInfo=" + this.AEQbTJ + ", uploadPersonalInfoEntryPoint=" + this.EZpvd + ", isWithSelfie=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull PersonalInfo personalInfo, @NotNull UploadPersonalInfoEntryPoint uploadPersonalInfoEntryPoint, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(personalInfo, "");
            Intrinsics.checkNotNullParameter(uploadPersonalInfoEntryPoint, "");
            this.AEQbTJ = personalInfo;
            this.EZpvd = uploadPersonalInfoEntryPoint;
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.aSN$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends AbstractC6596aSN {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aSN$Dialog */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Dialog extends AbstractC6596aSN {
        public static final Dialog OLrzqt = new Dialog();

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aSN$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends AbstractC6596aSN {
        public final java.lang.String EZpvd;
        public final OtpInputType KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, OtpInputType otpInputType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                otpInputType = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(str, otpInputType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull OtpInputType otpInputType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(otpInputType, "");
            return new TaskDescription(str, otpInputType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OtpInputType copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LinkNewMfa(workFlowToken=" + this.EZpvd + ", verifyType=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull OtpInputType otpInputType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(otpInputType, "");
            this.EZpvd = str;
            this.KWHzl = otpInputType;
        }
    }

    /* JADX INFO: renamed from: o.aSN$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends AbstractC6596aSN {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super(null);
        }
    }
}
