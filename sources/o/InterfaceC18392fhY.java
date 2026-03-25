package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC18379fhL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC18392fhY {
    InterfaceC18379fhL EZpvd();

    boolean OLrzqt();

    /* JADX INFO: renamed from: o.fhY$Application */
    public static final class Application implements InterfaceC18392fhY {
        public final boolean AEQbTJ;
        public final InterfaceC18379fhL.Activity KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, InterfaceC18379fhL.Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activity = application.KWHzl;
            }
            if ((i & 2) != 0) {
                z = application.AEQbTJ;
            }
            return application.OLrzqt(activity, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull InterfaceC18379fhL.Activity activity, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            return new Application(activity, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18392fhY
        public boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/fhL; */
        @Override // o.InterfaceC18392fhY
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public InterfaceC18379fhL.Activity EZpvd() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChainState(network=" + this.KWHzl + ", isSelected=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull InterfaceC18379fhL.Activity activity, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl = activity;
            this.AEQbTJ = z;
        }
    }

    /* JADX INFO: renamed from: o.fhY$ActionBar */
    public static final class ActionBar implements InterfaceC18392fhY {
        public final InterfaceC18379fhL.StateListAnimator KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC18379fhL.StateListAnimator stateListAnimator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                stateListAnimator = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                z = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(stateListAnimator, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull InterfaceC18379fhL.StateListAnimator stateListAnimator, boolean z) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return new ActionBar(stateListAnimator, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18392fhY
        public boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/fhL; */
        @Override // o.InterfaceC18392fhY
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public InterfaceC18379fhL.StateListAnimator EZpvd() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CompatibleChainState(network=" + this.KWHzl + ", isSelected=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull InterfaceC18379fhL.StateListAnimator stateListAnimator, boolean z) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.KWHzl = stateListAnimator;
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.fhY$Activity */
    public static final class Activity implements InterfaceC18392fhY {
        public final boolean AEQbTJ;
        public final InterfaceC18379fhL.ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC18379fhL.ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                actionBar = activity.copydefault;
            }
            if ((i & 2) != 0) {
                z = activity.AEQbTJ;
            }
            return activity.AEQbTJ(actionBar, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull InterfaceC18379fhL.ActionBar actionBar, boolean z) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return new Activity(actionBar, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18392fhY
        public boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/fhL; */
        @Override // o.InterfaceC18392fhY
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public InterfaceC18379fhL.ActionBar EZpvd() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SvmChainState(network=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull InterfaceC18379fhL.ActionBar actionBar, boolean z) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.copydefault = actionBar;
            this.AEQbTJ = z;
        }
    }
}
