package o;

import com.okinc.okex.lite.onboarding.ui.WelcomeDataType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC45791sxk {
    public final WelcomeDataType copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.okex.lite.onboarding.ui.WelcomeDataType) A[MD:(com.okinc.okex.lite.onboarding.ui.WelcomeDataType):void (m)] call: o.sxk.<init>(com.okinc.okex.lite.onboarding.ui.WelcomeDataType):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC45791sxk(WelcomeDataType welcomeDataType, DefaultConstructorMarker defaultConstructorMarker) {
        this(welcomeDataType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WelcomeDataType EZpvd() {
        return this.copydefault;
    }

    public AbstractC45791sxk(WelcomeDataType welcomeDataType) {
        this.copydefault = welcomeDataType;
    }

    /* JADX INFO: renamed from: o.sxk$StateListAnimator */
    public static final class StateListAnimator extends AbstractC45791sxk {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = stateListAnimator.KWHzl;
            }
            if ((i & 8) != 0) {
                str4 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.copydefault(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StateListAnimator(str, str2, str3, str4);
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WelcomeHeaderData(title=" + this.EZpvd + ", subTitle=" + this.AEQbTJ + ", iconDark=" + this.KWHzl + ", iconLight=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            super(WelcomeDataType.HEADER, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
            this.OLrzqt = str4;
        }
    }

    /* JADX INFO: renamed from: o.sxk$Activity */
    public static final class Activity extends AbstractC45791sxk {
        public final boolean AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AhwBna;
            }
            if ((i & 2) != 0) {
                str2 = activity.AYXKKw;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                z = activity.AEQbTJ;
            }
            boolean z5 = z;
            if ((i & 8) != 0) {
                z2 = activity.KWHzl;
            }
            boolean z6 = z2;
            if ((i & 16) != 0) {
                z3 = activity.EZpvd;
            }
            boolean z7 = z3;
            if ((i & 32) != 0) {
                z4 = activity.OLrzqt;
            }
            boolean z8 = z4;
            if ((i & 64) != 0) {
                str3 = activity.djBIcL;
            }
            return activity.EZpvd(str, str4, z5, z6, z7, z8, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            return new Activity(str, str2, z, z2, z3, z4, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && this.AEQbTJ == activity.AEQbTJ && this.KWHzl == activity.KWHzl && this.EZpvd == activity.EZpvd && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) activity.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AhwBna;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AYXKKw;
            return (((((((((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WelcomeStepViewData(title=" + this.AhwBna + ", subTitle=" + this.AYXKKw + ", isActive=" + this.AEQbTJ + ", isComplete=" + this.KWHzl + ", isFirst=" + this.EZpvd + ", isLast=" + this.OLrzqt + ", stepIndex=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str3) {
            super(WelcomeDataType.STEP, null);
            Intrinsics.checkNotNullParameter(str3, "");
            this.AhwBna = str;
            this.AYXKKw = str2;
            this.AEQbTJ = z;
            this.KWHzl = z2;
            this.EZpvd = z3;
            this.OLrzqt = z4;
            this.djBIcL = str3;
        }
    }
}
