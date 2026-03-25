package o;

import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertPromptType;
import com.okinc.business.market.data.model.alert.AlertRepeatType;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.alert.create.coinselect.tokenlist.data.AlertMarketCapUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public interface jGT {

    public static final class ActionBar implements jGT {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class Fragment implements jGT {
        public static final int AEQbTJ = TokenInfoForAlert.EZpvd;
        public final TokenInfoForAlert AYXKKw;
        public final AlertMarketCapUnit AhwBna;
        public final AlertPromptType EZpvd;
        public final boolean KWHzl;
        public final AlertRepeatType OLrzqt;
        public final AlertType copydefault;
        public final boolean djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlertRepeatType AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlertMarketCapUnit AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenInfoForAlert AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlertPromptType EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlertType copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault(@NotNull TokenInfoForAlert tokenInfoForAlert, @NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AlertRepeatType alertRepeatType, boolean z, boolean z2, @NotNull AlertMarketCapUnit alertMarketCapUnit) {
            Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
            Intrinsics.checkNotNullParameter(alertType, "");
            Intrinsics.checkNotNullParameter(alertPromptType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(alertRepeatType, "");
            Intrinsics.checkNotNullParameter(alertMarketCapUnit, "");
            return new Fragment(tokenInfoForAlert, alertType, alertPromptType, str, str2, alertRepeatType, z, z2, alertMarketCapUnit);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return Intrinsics.EZpvd(this.AYXKKw, fragment.AYXKKw) && this.copydefault == fragment.copydefault && this.EZpvd == fragment.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) fragment.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) fragment.gEmmrt) && this.OLrzqt == fragment.OLrzqt && this.djBIcL == fragment.djBIcL && this.KWHzl == fragment.KWHzl && this.AhwBna == fragment.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.AYXKKw.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.AhwBna.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(tokenInfo=" + this.AYXKKw + ", alertType=" + this.copydefault + ", alertPromptType=" + this.EZpvd + ", marketPrice=" + this.valueOf + ", inputValue=" + this.gEmmrt + ", alertFrequency=" + this.OLrzqt + ", resetButtonEnabled=" + this.djBIcL + ", addAlertEnabled=" + this.KWHzl + ", marketCapUnit=" + this.AhwBna + ")";
        }

        public Fragment(@NotNull TokenInfoForAlert tokenInfoForAlert, @NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AlertRepeatType alertRepeatType, boolean z, boolean z2, @NotNull AlertMarketCapUnit alertMarketCapUnit) {
            Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
            Intrinsics.checkNotNullParameter(alertType, "");
            Intrinsics.checkNotNullParameter(alertPromptType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(alertRepeatType, "");
            Intrinsics.checkNotNullParameter(alertMarketCapUnit, "");
            this.AYXKKw = tokenInfoForAlert;
            this.copydefault = alertType;
            this.EZpvd = alertPromptType;
            this.valueOf = str;
            this.gEmmrt = str2;
            this.OLrzqt = alertRepeatType;
            this.djBIcL = z;
            this.KWHzl = z2;
            this.AhwBna = alertMarketCapUnit;
        }
    }

    public static final class StateListAnimator implements jGT {
        public final AlertDataUiItem copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, AlertDataUiItem alertDataUiItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                alertDataUiItem = stateListAnimator.copydefault;
            }
            return stateListAnimator.KWHzl(alertDataUiItem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull AlertDataUiItem alertDataUiItem) {
            Intrinsics.checkNotNullParameter(alertDataUiItem, "");
            return new StateListAnimator(alertDataUiItem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlertDataUiItem OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AlertCreateSuccess(alertDataUiItem=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull AlertDataUiItem alertDataUiItem) {
            Intrinsics.checkNotNullParameter(alertDataUiItem, "");
            this.copydefault = alertDataUiItem;
        }
    }

    public static final class Application implements jGT {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    public static final class TaskDescription implements jGT {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class Activity implements jGT {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }
}
