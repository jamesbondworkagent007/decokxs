package o;

import com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29065kmc {
    CoinInfoGridCellId copydefault();

    /* JADX INFO: renamed from: o.kmc$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC29065kmc {
        public final CoinInfoGridCellId EZpvd;
        public final int KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, CoinInfoGridCellId coinInfoGridCellId, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                coinInfoGridCellId = stateListAnimator.EZpvd;
            }
            if ((i3 & 2) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            if ((i3 & 4) != 0) {
                i2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(coinInfoGridCellId, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull CoinInfoGridCellId coinInfoGridCellId, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            return new StateListAnimator(coinInfoGridCellId, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC29065kmc
        public CoinInfoGridCellId copydefault() {
            return this.EZpvd;
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
            return this.EZpvd == stateListAnimator.EZpvd && this.OLrzqt == stateListAnimator.OLrzqt && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LabelClick(cellId=" + this.EZpvd + ", titleRes=" + this.OLrzqt + ", descRes=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull CoinInfoGridCellId coinInfoGridCellId, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            this.EZpvd = coinInfoGridCellId;
            this.OLrzqt = i;
            this.KWHzl = i2;
        }
    }

    /* JADX INFO: renamed from: o.kmc$ActionBar */
    public static final class ActionBar implements InterfaceC29065kmc {
        public final CoinInfoGridCellId AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, CoinInfoGridCellId coinInfoGridCellId, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                coinInfoGridCellId = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = actionBar.EZpvd;
            }
            return actionBar.KWHzl(coinInfoGridCellId, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(coinInfoGridCellId, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC29065kmc
        public CoinInfoGridCellId copydefault() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DynamicLabelClick(cellId=" + this.AEQbTJ + ", title=" + this.OLrzqt + ", desc=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = coinInfoGridCellId;
            this.OLrzqt = str;
            this.EZpvd = str2;
        }
    }

    /* JADX INFO: renamed from: o.kmc$TaskDescription */
    public static final class TaskDescription implements InterfaceC29065kmc {
        public final int AEQbTJ;
        public final CoinInfoGridCellId KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, CoinInfoGridCellId coinInfoGridCellId, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                coinInfoGridCellId = taskDescription.KWHzl;
            }
            if ((i3 & 2) != 0) {
                i = taskDescription.AEQbTJ;
            }
            if ((i3 & 4) != 0) {
                i2 = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(coinInfoGridCellId, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull CoinInfoGridCellId coinInfoGridCellId, int i, int i2) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            return new TaskDescription(coinInfoGridCellId, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC29065kmc
        public CoinInfoGridCellId copydefault() {
            return this.KWHzl;
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
            return this.KWHzl == taskDescription.KWHzl && this.AEQbTJ == taskDescription.AEQbTJ && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Redirect(cellId=" + this.KWHzl + ", tabId=" + this.AEQbTJ + ", sectionId=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull CoinInfoGridCellId coinInfoGridCellId, int i, int i2) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            this.KWHzl = coinInfoGridCellId;
            this.AEQbTJ = i;
            this.OLrzqt = i2;
        }
    }

    /* JADX INFO: renamed from: o.kmc$Activity */
    public static final class Activity implements InterfaceC29065kmc {
        public final CoinInfoGridCellId AEQbTJ;
        public final java.lang.String EZpvd;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, CoinInfoGridCellId coinInfoGridCellId, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                coinInfoGridCellId = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = activity.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                str = activity.EZpvd;
            }
            return activity.KWHzl(coinInfoGridCellId, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull CoinInfoGridCellId coinInfoGridCellId, @androidx.annotation.StringRes int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(coinInfoGridCellId, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC29065kmc
        public CoinInfoGridCellId copydefault() {
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
            return this.AEQbTJ == activity.AEQbTJ && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Copy(cellId=" + this.AEQbTJ + ", labelRes=" + this.OLrzqt + ", value=" + this.EZpvd + ")";
        }

        public Activity(@NotNull CoinInfoGridCellId coinInfoGridCellId, @androidx.annotation.StringRes int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = coinInfoGridCellId;
            this.OLrzqt = i;
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.kmc$Application */
    public static final class Application implements InterfaceC29065kmc {
        public final Function0<Unit> AEQbTJ;
        public final CoinInfoGridCellId EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kmc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, CoinInfoGridCellId coinInfoGridCellId, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                coinInfoGridCellId = application.EZpvd;
            }
            if ((i & 2) != 0) {
                function0 = application.AEQbTJ;
            }
            return application.copydefault(coinInfoGridCellId, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC29065kmc
        public CoinInfoGridCellId copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return new Application(coinInfoGridCellId, function0);
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
            return this.EZpvd == application.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Custom(cellId=" + this.EZpvd + ", callback=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.EZpvd = coinInfoGridCellId;
            this.AEQbTJ = function0;
        }
    }
}
