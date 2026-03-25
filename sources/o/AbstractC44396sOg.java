package o;

import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC44396sOg {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sOg.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC44396sOg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC44396sOg() {
    }

    /* JADX INFO: renamed from: o.sOg$Application */
    public static final class Application extends AbstractC44396sOg {
        public final GroupAddMembersResult AEQbTJ;
        public final GroupInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, GroupInfo groupInfo, GroupAddMembersResult groupAddMembersResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupInfo = application.copydefault;
            }
            if ((i & 2) != 0) {
                groupAddMembersResult = application.AEQbTJ;
            }
            return application.copydefault(groupInfo, groupAddMembersResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupInfo EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupAddMembersResult KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull GroupInfo groupInfo, @NotNull GroupAddMembersResult groupAddMembersResult) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
            return new Application(groupInfo, groupAddMembersResult);
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
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(groupInfo=" + this.copydefault + ", addMembersResult=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull GroupInfo groupInfo, @NotNull GroupAddMembersResult groupAddMembersResult) {
            super(null);
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
            this.copydefault = groupInfo;
            this.AEQbTJ = groupAddMembersResult;
        }
    }

    /* JADX INFO: renamed from: o.sOg$TaskDescription */
    public static final class TaskDescription extends AbstractC44396sOg {
        public final int OLrzqt;
        public final java.lang.Throwable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                th = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskDescription(i, th);
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
            return this.OLrzqt == taskDescription.OLrzqt && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.OLrzqt + ", error=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(int i, @NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt = i;
            this.copydefault = th;
        }
    }
}
