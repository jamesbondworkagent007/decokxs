package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sPj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC44426sPj {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sPj.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC44426sPj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC44426sPj() {
    }

    /* JADX INFO: renamed from: o.sPj$Activity */
    public static final class Activity extends AbstractC44426sPj {
        public final java.lang.String AEQbTJ;
        public final java.lang.Long EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Long l, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str = activity.copydefault;
            }
            if ((i & 4) != 0) {
                str2 = activity.AEQbTJ;
            }
            return activity.AEQbTJ(l, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(java.lang.Long l, java.lang.String str, java.lang.String str2) {
            return new Activity(l, str, str2);
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
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.EZpvd;
            int iHashCode = l == null ? 0 : l.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(id=" + this.EZpvd + ", token=" + this.copydefault + ", channelName=" + this.AEQbTJ + ")";
        }

        public Activity(java.lang.Long l, java.lang.String str, java.lang.String str2) {
            super(null);
            this.EZpvd = l;
            this.copydefault = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: renamed from: o.sPj$StateListAnimator */
    public static final class StateListAnimator extends AbstractC44426sPj {
        public final java.lang.Throwable AEQbTJ;
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.EZpvd;
            }
            if ((i2 & 2) != 0) {
                th = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new StateListAnimator(i, th);
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
            return this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.EZpvd + ", error=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(int i, @NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd = i;
            this.AEQbTJ = th;
        }
    }
}
