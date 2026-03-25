package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24232iZu {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iZu.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC24232iZu(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24232iZu() {
    }

    /* JADX INFO: renamed from: o.iZu$StateListAnimator */
    public static final class StateListAnimator extends AbstractC24232iZu {
        public final java.lang.String AEQbTJ;
        public final C24229iZr EZpvd;
        public final java.lang.String KWHzl;
        public final java.util.List<C24224iZm> OLrzqt;
        public final java.util.List<C24228iZq> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iZu$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, java.util.List list2, C24229iZr c24229iZr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                list2 = stateListAnimator.copydefault;
            }
            java.util.List list3 = list2;
            if ((i & 4) != 0) {
                c24229iZr = stateListAnimator.EZpvd;
            }
            C24229iZr c24229iZr2 = c24229iZr;
            if ((i & 8) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            java.lang.String str3 = str;
            if ((i & 16) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.EZpvd(list, list3, c24229iZr2, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24229iZr AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C24224iZm> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.util.List<C24224iZm> list, java.util.List<C24228iZq> list2, C24229iZr c24229iZr, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list, list2, c24229iZr, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C24228iZq> OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            java.util.List<C24228iZq> list = this.copydefault;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            C24229iZr c24229iZr = this.EZpvd;
            int iHashCode3 = c24229iZr == null ? 0 : c24229iZr.hashCode();
            java.lang.String str = this.AEQbTJ;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Basic(assetsSections=" + this.OLrzqt + ", extraFields=" + this.copydefault + ", claimableRewards=" + this.EZpvd + ", tradingPair=" + this.AEQbTJ + ", pnl=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.util.List<C24224iZm> list, java.util.List<C24228iZq> list2, C24229iZr c24229iZr, java.lang.String str, java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.copydefault = list2;
            this.EZpvd = c24229iZr;
            this.AEQbTJ = str;
            this.KWHzl = str2;
        }
    }

    /* JADX INFO: renamed from: o.iZu$Activity */
    public static final class Activity extends AbstractC24232iZu {
        public final java.util.List<C24224iZm> EZpvd;
        public final C24224iZm KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iZu$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, C24224iZm c24224iZm, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                c24224iZm = activity.KWHzl;
            }
            return activity.EZpvd(list, c24224iZm);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C24224iZm> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.util.List<C24224iZm> list, C24224iZm c24224iZm) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list, c24224iZm);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24224iZm copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            C24224iZm c24224iZm = this.KWHzl;
            return (iHashCode * 31) + (c24224iZm == null ? 0 : c24224iZm.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenV3Position(assetsSections=" + this.EZpvd + ", unclaimedFeeSection=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.util.List<C24224iZm> list, C24224iZm c24224iZm) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            this.KWHzl = c24224iZm;
        }
    }

    /* JADX INFO: renamed from: o.iZu$Application */
    public static final class Application extends AbstractC24232iZu {
        public final C24229iZr EZpvd;
        public final java.util.List<C24228iZq> OLrzqt;
        public final java.util.List<C24224iZm> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iZu$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, java.util.List list2, C24229iZr c24229iZr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.copydefault;
            }
            if ((i & 2) != 0) {
                list2 = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                c24229iZr = application.EZpvd;
            }
            return application.EZpvd(list, list2, c24229iZr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.util.List<C24224iZm> list, java.util.List<C24228iZq> list2, C24229iZr c24229iZr) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list, list2, c24229iZr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C24224iZm> OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.util.List<C24228iZq> list = this.OLrzqt;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            C24229iZr c24229iZr = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (c24229iZr != null ? c24229iZr.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExpiryPosition(assetsSections=" + this.copydefault + ", extraFields=" + this.OLrzqt + ", claimableRewards=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.util.List<C24224iZm> list, java.util.List<C24228iZq> list2, C24229iZr c24229iZr) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
            this.OLrzqt = list2;
            this.EZpvd = c24229iZr;
        }
    }
}
