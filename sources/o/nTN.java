package o;

import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nTN {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTN.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ nTN(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends nTN {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private nTN() {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator extends nTN {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Application extends nTN {
        public static final Application EZpvd = new Application();

        private Application() {
            super(null);
        }
    }

    public static final class Activity extends nTN {
        public static final int OLrzqt = ((GroupInvitationInfoResponse.PaidGroupPreview.$stable | GroupInvitationInfoResponse.GroupOwnerInfo.$stable) | GroupEntryAssetVerificationInfo.$stable) | OfficialTagInfo.$stable;
        public final JoinGroupDisplayModel AEQbTJ;
        public final nTK EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, JoinGroupDisplayModel joinGroupDisplayModel, nTK ntk, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                joinGroupDisplayModel = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                ntk = activity.EZpvd;
            }
            return activity.EZpvd(joinGroupDisplayModel, ntk);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull JoinGroupDisplayModel joinGroupDisplayModel, @NotNull nTK ntk) {
            Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
            Intrinsics.checkNotNullParameter(ntk, "");
            return new Activity(joinGroupDisplayModel, ntk);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final nTK KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JoinGroupDisplayModel copydefault() {
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
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MainContent(model=" + this.AEQbTJ + ", joinGroupStatus=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull JoinGroupDisplayModel joinGroupDisplayModel, @NotNull nTK ntk) {
            super(null);
            Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
            Intrinsics.checkNotNullParameter(ntk, "");
            this.AEQbTJ = joinGroupDisplayModel;
            this.EZpvd = ntk;
        }
    }

    public static final class TaskDescription extends nTN {
        public final java.lang.Throwable AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.Throwable th, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(th, str);
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
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(error=" + this.AEQbTJ + ", toast=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.Throwable th, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = th;
            this.copydefault = str;
        }
    }
}
