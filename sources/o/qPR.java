package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.features.navigation.coins.model.NavSearchCoinPageVo;
import com.okinc.market.search.features.navigation.options.NavSearchOptionsFragment;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qPR extends InterfaceC40518qYv {
    java.lang.String KWHzl();

    java.lang.String OLrzqt();

    public static final class Activity {
        public static boolean OLrzqt(@NotNull qPR qpr, @NotNull InterfaceC40518qYv interfaceC40518qYv) {
            Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
            return Intrinsics.EZpvd(qpr, interfaceC40518qYv);
        }

        public static boolean AEQbTJ(@NotNull qPR qpr, @NotNull InterfaceC40518qYv interfaceC40518qYv) {
            Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
            return Intrinsics.EZpvd(qpr, interfaceC40518qYv);
        }
    }

    public static final class ActionBar implements qPR {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String KWHzl = "Watchlist";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        private ActionBar() {
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return new C40139qKu();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx);
        }
    }

    public static final class PendingIntent implements qPR {
        public static final PendingIntent copydefault = new PendingIntent();
        public static final java.lang.String OLrzqt = "SPOT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return OLrzqt;
        }

        private PendingIntent() {
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return new C40321qRn();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return C33070mpX.AYXKKw(qZH.PendingIntent.OrsvgJ);
        }
    }

    public static final class Dialog implements qPR {
        public static final Dialog KWHzl = new Dialog();
        public static final java.lang.String EZpvd = "SWAP";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return EZpvd;
        }

        private Dialog() {
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return new C40151qLf();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return C33070mpX.AYXKKw(qZH.PendingIntent.DQnQnb);
        }
    }

    public static final class TaskDescription implements qPR {
        public static final TaskDescription copydefault = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return "CEDEFI";
        }

        private TaskDescription() {
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return new qJJ();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz);
        }
    }

    public static final class FragmentManager implements qPR {
        public static final FragmentManager OLrzqt = new FragmentManager();
        public static final java.lang.String copydefault = "OPTION";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return copydefault;
        }

        private FragmentManager() {
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return new NavSearchOptionsFragment();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return C33070mpX.AYXKKw(qZH.PendingIntent.iZzfmt);
        }
    }

    public static final class StateListAnimator implements qPR {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "Derivatives";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return AEQbTJ;
        }

        private StateListAnimator() {
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return qJE.Companion.copydefault();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return C33070mpX.AYXKKw(qZH.PendingIntent.OqCbbx);
        }
    }

    public static final class Application implements qPR {
        public static final int KWHzl = CategoryGroupVo.KWHzl;
        public final NavSearchCoinPageVo OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, NavSearchCoinPageVo navSearchCoinPageVo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navSearchCoinPageVo = application.OLrzqt;
            }
            return application.KWHzl(navSearchCoinPageVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NavSearchCoinPageVo AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qPR
        public java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull NavSearchCoinPageVo navSearchCoinPageVo) {
            Intrinsics.checkNotNullParameter(navSearchCoinPageVo, "");
            return new Application(navSearchCoinPageVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CoinPage(coinPageVo=" + this.OLrzqt + ")";
        }

        public Application(@NotNull NavSearchCoinPageVo navSearchCoinPageVo) {
            Intrinsics.checkNotNullParameter(navSearchCoinPageVo, "");
            this.OLrzqt = navSearchCoinPageVo;
            this.copydefault = "COIN";
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.AEQbTJ(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return Activity.OLrzqt(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return this.OLrzqt.createFragment();
        }

        @Override // o.qPR
        public java.lang.String OLrzqt() {
            return this.OLrzqt.AEQbTJ();
        }
    }
}
