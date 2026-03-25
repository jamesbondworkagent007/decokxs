package o;

import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.okimcore.model.im.OKCallCommon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC37171oom {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oom.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC37171oom(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37171oom() {
    }

    /* JADX INFO: renamed from: o.oom$TaskDescription */
    public static final class TaskDescription extends AbstractC37171oom {
        public final OKCallCommon.OKCallDisconnectedReason OLrzqt;
        public final CallStatus copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                callStatus = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                oKCallDisconnectedReason = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(callStatus, oKCallDisconnectedReason);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallStatus AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
            Intrinsics.checkNotNullParameter(callStatus, "");
            return new TaskDescription(callStatus, oKCallDisconnectedReason);
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
            return this.copydefault == taskDescription.copydefault && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason = this.OLrzqt;
            return (iHashCode * 31) + (oKCallDisconnectedReason == null ? 0 : oKCallDisconnectedReason.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StatusChanged(status=" + this.copydefault + ", disconnectReason=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull CallStatus callStatus, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
            super(null);
            Intrinsics.checkNotNullParameter(callStatus, "");
            this.copydefault = callStatus;
            this.OLrzqt = oKCallDisconnectedReason;
        }
    }
}
