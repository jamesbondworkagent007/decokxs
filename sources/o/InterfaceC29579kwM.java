package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29579kwM {

    /* JADX INFO: renamed from: o.kwM$Fragment */
    public static final class Fragment implements InterfaceC29579kwM {
        public final SignalUiModel KWHzl;
        public final MemeQuickPopUpSource OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, SignalUiModel signalUiModel, MemeQuickPopUpSource memeQuickPopUpSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalUiModel = fragment.KWHzl;
            }
            if ((i & 2) != 0) {
                memeQuickPopUpSource = fragment.OLrzqt;
            }
            return fragment.copydefault(signalUiModel, memeQuickPopUpSource);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeQuickPopUpSource AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalUiModel KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault(@NotNull SignalUiModel signalUiModel, @NotNull MemeQuickPopUpSource memeQuickPopUpSource) {
            Intrinsics.checkNotNullParameter(signalUiModel, "");
            Intrinsics.checkNotNullParameter(memeQuickPopUpSource, "");
            return new Fragment(signalUiModel, memeQuickPopUpSource);
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
            return Intrinsics.EZpvd(this.KWHzl, fragment.KWHzl) && this.OLrzqt == fragment.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TradeSignal(signal=" + this.KWHzl + ", popupSource=" + this.OLrzqt + ")";
        }

        public Fragment(@NotNull SignalUiModel signalUiModel, @NotNull MemeQuickPopUpSource memeQuickPopUpSource) {
            Intrinsics.checkNotNullParameter(signalUiModel, "");
            Intrinsics.checkNotNullParameter(memeQuickPopUpSource, "");
            this.KWHzl = signalUiModel;
            this.OLrzqt = memeQuickPopUpSource;
        }
    }

    /* JADX INFO: renamed from: o.kwM$LoaderManager */
    public static final class LoaderManager implements InterfaceC29579kwM {
        public final SignalUiModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, SignalUiModel signalUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalUiModel = loaderManager.KWHzl;
            }
            return loaderManager.AEQbTJ(signalUiModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager AEQbTJ(@NotNull SignalUiModel signalUiModel) {
            Intrinsics.checkNotNullParameter(signalUiModel, "");
            return new LoaderManager(signalUiModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalUiModel KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.KWHzl, ((LoaderManager) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewSmartMoneyAddresses(signal=" + this.KWHzl + ")";
        }

        public LoaderManager(@NotNull SignalUiModel signalUiModel) {
            Intrinsics.checkNotNullParameter(signalUiModel, "");
            this.KWHzl = signalUiModel;
        }
    }

    /* JADX INFO: renamed from: o.kwM$Activity */
    public static final class Activity implements InterfaceC29579kwM {
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            return activity.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GoToWalletPnL(walletAddress=" + this.KWHzl + ", chainId=" + this.EZpvd + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
        }
    }

    /* JADX INFO: renamed from: o.kwM$Application */
    public static final class Application implements InterfaceC29579kwM {
        public static final int EZpvd = TokenBase.$stable;
        public final SignalUiModel AEQbTJ;
        public final int KWHzl;
        public final java.lang.String OLrzqt;
        public final TokenBase copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, SignalUiModel signalUiModel, int i, TokenBase tokenBase, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                signalUiModel = application.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = application.KWHzl;
            }
            if ((i2 & 4) != 0) {
                tokenBase = application.copydefault;
            }
            if ((i2 & 8) != 0) {
                str = application.OLrzqt;
            }
            return application.KWHzl(signalUiModel, i, tokenBase, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenBase AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalUiModel KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(SignalUiModel signalUiModel, int i, @NotNull TokenBase tokenBase, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(signalUiModel, i, tokenBase, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
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
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            SignalUiModel signalUiModel = this.AEQbTJ;
            return ((((((signalUiModel == null ? 0 : signalUiModel.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpenTokenDetails(item=" + this.AEQbTJ + ", position=" + this.KWHzl + ", tokenDetails=" + this.copydefault + ", pageFrom=" + this.OLrzqt + ")";
        }

        public Application(SignalUiModel signalUiModel, int i, @NotNull TokenBase tokenBase, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = signalUiModel;
            this.KWHzl = i;
            this.copydefault = tokenBase;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel) : (r1v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (r3v0 com.okinc.business.dex.api.bean.TokenBase)
  (r4v0 java.lang.String)
 A[MD:(com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel, int, com.okinc.business.dex.api.bean.TokenBase, java.lang.String):void (m)] (LINE:29) call: o.kwM.Application.<init>(com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel, int, com.okinc.business.dex.api.bean.TokenBase, java.lang.String):void type: THIS */
        public /* synthetic */ Application(SignalUiModel signalUiModel, int i, TokenBase tokenBase, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : signalUiModel, (i2 & 2) != 0 ? 0 : i, tokenBase, str);
        }
    }

    /* JADX INFO: renamed from: o.kwM$ActionBar */
    public static final class ActionBar implements InterfaceC29579kwM {
        public final SignalOverviewUiModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SignalOverviewUiModel signalOverviewUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalOverviewUiModel = actionBar.KWHzl;
            }
            return actionBar.KWHzl(signalOverviewUiModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull SignalOverviewUiModel signalOverviewUiModel) {
            Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
            return new ActionBar(signalOverviewUiModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalOverviewUiModel copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpenOverviewDetailPage(item=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull SignalOverviewUiModel signalOverviewUiModel) {
            Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
            this.KWHzl = signalOverviewUiModel;
        }
    }

    /* JADX INFO: renamed from: o.kwM$TaskDescription */
    public static final class TaskDescription implements InterfaceC29579kwM {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kwM$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC29579kwM {
        public final java.lang.String AEQbTJ;
        public final TimeIntervalSelector EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, TimeIntervalSelector timeIntervalSelector, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                timeIntervalSelector = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(str, str2, timeIntervalSelector);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimeIntervalSelector EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TimeIntervalSelector timeIntervalSelector) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
            return new StateListAnimator(str, str2, timeIntervalSelector);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToggleChartGranularity(chainId=" + this.copydefault + ", tokenContractAddress=" + this.AEQbTJ + ", timeIntervalSelector=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TimeIntervalSelector timeIntervalSelector) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.EZpvd = timeIntervalSelector;
        }
    }

    /* JADX INFO: renamed from: o.kwM$FragmentManager */
    public static final class FragmentManager implements InterfaceC29579kwM {
        public final BuySellMarker AEQbTJ;
        public final boolean EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, BuySellMarker buySellMarker, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                buySellMarker = fragmentManager.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = fragmentManager.EZpvd;
            }
            if ((i & 4) != 0) {
                z2 = fragmentManager.OLrzqt;
            }
            return fragmentManager.EZpvd(buySellMarker, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuySellMarker EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager EZpvd(@NotNull BuySellMarker buySellMarker, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(buySellMarker, "");
            return new FragmentManager(buySellMarker, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, fragmentManager.AEQbTJ) && this.EZpvd == fragmentManager.EZpvd && this.OLrzqt == fragmentManager.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToggleChartTrend(buySellMarker=" + this.AEQbTJ + ", isFromBottomSheet=" + this.EZpvd + ", isFromUser=" + this.OLrzqt + ")";
        }

        public FragmentManager(@NotNull BuySellMarker buySellMarker, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(buySellMarker, "");
            this.AEQbTJ = buySellMarker;
            this.EZpvd = z;
            this.OLrzqt = z2;
        }
    }

    /* JADX INFO: renamed from: o.kwM$Dialog */
    public static final class Dialog implements InterfaceC29579kwM {
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = dialog.EZpvd;
            }
            return dialog.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Dialog(str, str2);
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
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialog.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dialog.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewSignalAlertHistory(chainId=" + this.OLrzqt + ", tokenContractAddress=" + this.EZpvd + ")";
        }

        public Dialog(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
        }
    }
}
