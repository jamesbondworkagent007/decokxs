package o;

import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSmartPortfolioDetailPresenter;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.StrategyResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51150vhb;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC48035uCo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wKY extends AbstractC52405wKe<AbstractC48536uVa, BotGuideSmartPortfolioDetailPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final int copydefault = C48033uCm.Activity.DlABUU;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wKY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final wKY KWHzl() {
            return new wKY();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        valueOf();
        gEmmrt();
        KWHzl();
        AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        java.lang.String strAYXKKw;
        C55320xhi c55320xhiKWHzl;
        ((AbstractC48536uVa) gGvvIC()).AEQbTJ.setIndexDesc(C33070mpX.AYXKKw(C55688xof.Application.unregisterCallbackListener));
        C55312xha c55312xhaValueOf = ((AbstractC48536uVa) gGvvIC()).KWHzl.AEQbTJ.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setLineHeight(C55298xhM.dpInt$default(22.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        if (C33492mxV.OLrzqt()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setRccState);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.registerMediaButtonEventReceiver);
        }
        Glide.EZpvd(this).EZpvd(strAYXKKw).KWHzl(C52761wXj.TaskDescription.DuR).fetchVPNInfo().EZpvd(((AbstractC48536uVa) gGvvIC()).KWHzl.EZpvd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((AbstractC48536uVa) gGvvIC()).EZpvd.KWHzl(((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).KWHzl(yDY.AhwBna()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        InterfaceC48035uCo.Activity.setData$default(((AbstractC48536uVa) gGvvIC()).copydefault, null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AYXKKw() {
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).gEmmrt().observe(this, new Activity(new Function1() { // from class: o.wLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKY.KWHzl(this.KWHzl, (BannerOrderDetails) obj);
            }
        }));
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).copydefault().observe(this, new Activity(new Function1() { // from class: o.wLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKY.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        }));
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).AYXKKw().AkhnZx().observe(this, new Activity(new Function1() { // from class: o.wLe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKY.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.wLf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKY.copydefault(this.EZpvd, (java.util.List) obj);
            }
        }));
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wLb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKY.KWHzl(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(wKY wky, BannerOrderDetails bannerOrderDetails) {
        ((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.TRUE, null));
        ((AbstractC48536uVa) wky.gGvvIC()).copydefault.setData(bannerOrderDetails);
        ((AbstractC48536uVa) wky.gGvvIC()).AEQbTJ.setData(((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).EZpvd());
        wky.dismissLoading();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wky, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wKY wky, java.util.List list) {
        ((AbstractC48536uVa) wky.gGvvIC()).AEQbTJ.setData(((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wKY wky, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            wky.showLoading();
        } else {
            wky.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wKY wky, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = wky.getContext();
        if (context != null) {
            ActivityC51150vhb.Application application = ActivityC51150vhb.Companion;
            StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            application.AEQbTJ(context, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "smart_portfolio", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse != null ? strategyResponse.getAlgoId() : null, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(wKY wky, androidx.core.util.Pair pair) {
        java.lang.String message;
        pUU.copydefault(wky.getTAG(), pair.first + " request failed cause by " + ((java.lang.Exception) pair.second).getMessage());
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).valueOf().bB_())) {
            ((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.FALSE, pair.second));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wky, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).KWHzl().bB_())) {
            ((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).copydefault().setValue(null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSmartPortfolioDetailPresenter) wky.dxcTrN()).AYXKKw().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void AEQbTJ() {
        wJK wjkEZpvd = wJK.Companion.EZpvd("smart_portfolio", ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).gEmmrt().getValue(), ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).OLrzqt());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        wjkEZpvd.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void copydefault() {
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).djBIcL();
        ((BotGuideSmartPortfolioDetailPresenter) dxcTrN()).AhwBna();
    }
}
