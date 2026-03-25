package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC43697ruF {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ruF.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC43697ruF(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC43697ruF() {
    }

    /* JADX INFO: renamed from: o.ruF$TaskDescription */
    public static final class TaskDescription extends AbstractC43697ruF {
        public final java.lang.String AEQbTJ;
        public final VendorEvent EZpvd;
        public final MultiVendorResultStatus KWHzl;
        public final java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruF$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, MultiVendorResultStatus multiVendorResultStatus, VendorEvent vendorEvent, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                multiVendorResultStatus = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                vendorEvent = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 8) != 0) {
                map = taskDescription.copydefault;
            }
            return taskDescription.copydefault(multiVendorResultStatus, vendorEvent, str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull MultiVendorResultStatus multiVendorResultStatus, @NotNull VendorEvent vendorEvent, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(multiVendorResultStatus, "");
            Intrinsics.checkNotNullParameter(vendorEvent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new TaskDescription(multiVendorResultStatus, vendorEvent, str, map);
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
            return this.KWHzl == taskDescription.KWHzl && this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Complete(status=" + this.KWHzl + ", eventCode=" + this.EZpvd + ", resultTarget=" + this.AEQbTJ + ", ctaValue=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull MultiVendorResultStatus multiVendorResultStatus, @NotNull VendorEvent vendorEvent, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(multiVendorResultStatus, "");
            Intrinsics.checkNotNullParameter(vendorEvent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.KWHzl = multiVendorResultStatus;
            this.EZpvd = vendorEvent;
            this.AEQbTJ = str;
            this.copydefault = map;
        }
    }

    /* JADX INFO: renamed from: o.ruF$StateListAnimator */
    public static final class StateListAnimator extends AbstractC43697ruF {
        public final VendorEvent EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruF$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, VendorEvent vendorEvent, java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                vendorEvent = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                map = stateListAnimator.copydefault;
            }
            if ((i & 8) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(vendorEvent, str, map, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VendorEvent KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull VendorEvent vendorEvent, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(vendorEvent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new StateListAnimator(vendorEvent, str, map, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            java.lang.String str = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(eventCode=" + this.EZpvd + ", resultTarget=" + this.KWHzl + ", ctaValue=" + this.copydefault + ", message=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull VendorEvent vendorEvent, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(vendorEvent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.EZpvd = vendorEvent;
            this.KWHzl = str;
            this.copydefault = map;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: renamed from: o.ruF$Activity */
    public static final class Activity extends AbstractC43697ruF {
        public final java.lang.String AEQbTJ;
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public final VendorEvent copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruF$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, VendorEvent vendorEvent, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                vendorEvent = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 4) != 0) {
                map = activity.OLrzqt;
            }
            return activity.EZpvd(vendorEvent, str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VendorEvent AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull VendorEvent vendorEvent, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(vendorEvent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new Activity(vendorEvent, str, map);
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
            return this.copydefault == activity.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Cancelled(eventCode=" + this.copydefault + ", resultTarget=" + this.AEQbTJ + ", ctaValue=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull VendorEvent vendorEvent, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(vendorEvent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = vendorEvent;
            this.AEQbTJ = str;
            this.OLrzqt = map;
        }
    }
}
