package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public abstract class zJJ {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zJJ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ zJJ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private zJJ() {
    }

    public static final class StateListAnimator extends zJJ {
        public static final int $stable = 0;
        public final java.lang.String EZpvd;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                j = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.copydefault(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TrustedDevice(deviceName=" + this.EZpvd + ", lastActiveTime=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = j;
        }
    }

    public static final class TaskDescription extends zJJ {
        public static final int $stable = 8;
        public final java.util.List<AbstractC58950zVm> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zJJ$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AbstractC58950zVm> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.util.List<? extends AbstractC58950zVm> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MultipleOtp(otpTypes=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.zVm> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull java.util.List<? extends AbstractC58950zVm> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }
    }

    public static final class ActionBar extends zJJ {
        public static final int $stable = 8;
        public final java.util.List<AbstractC58950zVm> AEQbTJ;
        public final AbstractC58950zVm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zJJ$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AbstractC58950zVm abstractC58950zVm, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC58950zVm = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                list = actionBar.AEQbTJ;
            }
            return actionBar.copydefault(abstractC58950zVm, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AbstractC58950zVm> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC58950zVm KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list) {
            Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(abstractC58950zVm, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SingleOtp(otpType=" + this.copydefault + ", availableOtpTypes=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.zVm> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = abstractC58950zVm;
            this.AEQbTJ = list;
        }
    }
}
