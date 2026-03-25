package o;

import com.okinc.ok_kyc_core.data.NavOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class rFW {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rFW.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ rFW(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private rFW() {
    }

    public static final class TaskDescription extends rFW {
        public final android.os.Bundle AEQbTJ;
        public final int EZpvd;
        public final NavOptions KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, android.os.Bundle bundle, NavOptions navOptions, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.EZpvd;
            }
            if ((i2 & 2) != 0) {
                bundle = taskDescription.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                navOptions = taskDescription.KWHzl;
            }
            return taskDescription.KWHzl(i, bundle, navOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NavOptions AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.os.Bundle EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i, android.os.Bundle bundle, @NotNull NavOptions navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "");
            return new TaskDescription(i, bundle, navOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
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
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
            android.os.Bundle bundle = this.AEQbTJ;
            return (((iHashCode * 31) + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToDirection(directionsId=" + this.EZpvd + ", bundle=" + this.AEQbTJ + ", navOptions=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(int i, android.os.Bundle bundle, @NotNull NavOptions navOptions) {
            super(null);
            Intrinsics.checkNotNullParameter(navOptions, "");
            this.EZpvd = i;
            this.AEQbTJ = bundle;
            this.KWHzl = navOptions;
        }
    }

    public static final class StateListAnimator extends rFW {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }
}
