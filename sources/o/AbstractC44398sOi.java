package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC44398sOi {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sOi.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC44398sOi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC44398sOi() {
    }

    /* JADX INFO: renamed from: o.sOi$StateListAnimator */
    public static final class StateListAnimator extends AbstractC44398sOi {
        public final long AEQbTJ;
        public final long EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                j = stateListAnimator.AEQbTJ;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = stateListAnimator.copydefault;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                j2 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(str, j3, str4, str5, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new StateListAnimator(str, j, str2, str3, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.OLrzqt.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Long.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(invitationId=" + this.OLrzqt + ", groupId=" + this.AEQbTJ + ", inviterUid=" + this.KWHzl + ", invitationLink=" + this.copydefault + ", expireTime=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.OLrzqt = str;
            this.AEQbTJ = j;
            this.KWHzl = str2;
            this.copydefault = str3;
            this.EZpvd = j2;
        }
    }

    /* JADX INFO: renamed from: o.sOi$Activity */
    public static final class Activity extends AbstractC44398sOi {
        public final int AEQbTJ;
        public final java.lang.Throwable KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                th = activity.KWHzl;
            }
            return activity.KWHzl(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
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
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.AEQbTJ + ", error=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(int i, @NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.AEQbTJ = i;
            this.KWHzl = th;
        }
    }
}
