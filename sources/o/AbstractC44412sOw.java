package o;

import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC44412sOw {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sOw.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC44412sOw(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC44412sOw() {
    }

    /* JADX INFO: renamed from: o.sOw$Activity */
    public static final class Activity extends AbstractC44412sOw {
        public final GroupEntryCreateVerificationRequestResponse KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupEntryCreateVerificationRequestResponse = activity.KWHzl;
            }
            return activity.copydefault(groupEntryCreateVerificationRequestResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryCreateVerificationRequestResponse KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse) {
            Intrinsics.checkNotNullParameter(groupEntryCreateVerificationRequestResponse, "");
            return new Activity(groupEntryCreateVerificationRequestResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(groupEntryCreateVerificationRequestResponse=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(groupEntryCreateVerificationRequestResponse, "");
            this.KWHzl = groupEntryCreateVerificationRequestResponse;
        }
    }

    /* JADX INFO: renamed from: o.sOw$TaskDescription */
    public static final class TaskDescription extends AbstractC44412sOw {
        public final int AEQbTJ;
        public final java.lang.Throwable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                th = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskDescription(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.AEQbTJ + ", error=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(int i, @NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.AEQbTJ = i;
            this.copydefault = th;
        }
    }
}
