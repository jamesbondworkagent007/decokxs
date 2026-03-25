package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.dcd.ui.fragment.DcdCreateManualFragment$initAdvanceView$1$1$1;
import com.okinc.tradingbot.impl.order.strategy.dcd.ui.fragment.DcdCreateManualFragment$initAdvanceView$1$2$1;
import com.okinc.tradingbot.impl.order.strategy.dcd.ui.fragment.DcdCreateManualFragment$pxPercentTextChange$1$1$1;
import com.okinc.unify_trade.biz.DcdRecommendedParams;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.dcd.presenter.DcdCreateManualPresenter;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC50353vLg;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.vLB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vLO extends AbstractC48165uHj<AbstractC50784vag, DcdCreateManualPresenter> {
    public DcdRecommendedParams KWHzl;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault = new Function2() { // from class: o.vLX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return vLO.copydefault(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vLT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vLO.fetchVPNInfo(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vLU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vLO.values(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vLW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vLO.isConnected(this.KWHzl);
        }
    });
    public final Function2<C47988uAv, java.lang.String, Unit> djBIcL = new Function2() { // from class: o.vLV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return vLO.KWHzl(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.QfZsXX;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC50784vag AYXKKw(vLO vlo) {
        return (AbstractC50784vag) vlo.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DcdCreateManualPresenter AhwBna(vLO vlo) {
        return (DcdCreateManualPresenter) vlo.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vLO vlo, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        ((DcdCreateManualPresenter) vlo.dxcTrN()).EZpvd(c47988uAv.AkhnZx());
        vlo.EZpvd();
        C52693wUw.debounce$default(C52693wUw.copydefault, 0L, new DcdCreateManualFragment$pxPercentTextChange$1$1$1(vlo, null), 1, null);
        return Unit.INSTANCE;
    }

    public final C53518wmx djBIcL() {
        return (C53518wmx) this.AEQbTJ.getValue();
    }

    public static final C53518wmx fetchVPNInfo(vLO vlo) {
        android.content.Context contextRequireContext = vlo.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C53518wmx c53518wmx = new C53518wmx(contextRequireContext, null, 0, 6, null);
        c53518wmx.setText(C33070mpX.AYXKKw(C55688xof.Application.emit));
        c53518wmx.setContentDescription("findProductButton");
        return c53518wmx;
    }

    public static final C50391vMr values(vLO vlo) {
        android.content.Context contextRequireContext = vlo.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C50391vMr(contextRequireContext, null, 2, null);
    }

    public final C50391vMr KWHzl() {
        return (C50391vMr) this.OLrzqt.getValue();
    }

    public final DcdProductListReq valueOf() {
        return (DcdProductListReq) this.EZpvd.getValue();
    }

    public static final DcdProductListReq isConnected(vLO vlo) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = vlo.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("bot_copy_req", DcdProductListReq.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("bot_copy_req");
            parcelable = (DcdProductListReq) (parcelable2 instanceof DcdProductListReq ? parcelable2 : null);
        }
        return (DcdProductListReq) parcelable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public android.view.View gEmmrt() {
        return Intrinsics.EZpvd((java.lang.Object) ((DcdCreateManualPresenter) dxcTrN()).AYXKKw(), (java.lang.Object) TacticsUiConst.ActionBar.EZpvd.copydefault()) ? djBIcL() : KWHzl();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        AYXKKw();
        getNewProxyInstance();
        ejfBZ();
        EZpvd(TacticsUiConst.ActionBar.EZpvd.copydefault());
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "DcdCreateManualFragment", new kotlin.Pair[0], null, 8, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        ((AbstractC50784vag) gGvvIC()).EZpvd.setOnTextChangeCallback(this.djBIcL);
        ((AbstractC50784vag) gGvvIC()).EZpvd.setInputUnit(((DcdCreateManualPresenter) dxcTrN()).djBIcL());
        ((AbstractC50784vag) gGvvIC()).EZpvd.setMaxDecimal(((DcdCreateManualPresenter) dxcTrN()).fARcdN());
        ((DcdCreateManualPresenter) dxcTrN()).fJNWhG();
    }

    private final void getNewProxyInstance() {
        isConnected();
        values();
        fetchVPNInfo();
        iwGUEr();
        hDKMBd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(vLO vlo, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        ((DcdCreateManualPresenter) vlo.dxcTrN()).copydefault(c47988uAv.AkhnZx());
        vlo.AEQbTJ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        if (((DcdCreateManualPresenter) dxcTrN()).OLrzqt() || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((AbstractC50784vag) gGvvIC()).EZpvd.AkhnZx())) {
            ((AbstractC50784vag) gGvvIC()).EZpvd.copydefault();
        } else {
            ((AbstractC50784vag) gGvvIC()).EZpvd.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.DcMfJK, C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", ((DcdCreateManualPresenter) dxcTrN()).AEQbTJ(false)), C56390yDp.OLrzqt("unit", ((DcdCreateManualPresenter) dxcTrN()).djBIcL()))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        super.bt_();
        DcdCreateManualPresenter dcdCreateManualPresenter = (DcdCreateManualPresenter) dxcTrN();
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String strAYXKKw = c56059xvf.AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        java.lang.String strDjBIcL = c56059xvf.djBIcL();
        dcdCreateManualPresenter.OLrzqt(strAYXKKw, strDjBIcL != null ? strDjBIcL : "");
        ((DcdCreateManualPresenter) dxcTrN()).AEQbTJ();
        DcdCreateManualPresenter dcdCreateManualPresenter2 = (DcdCreateManualPresenter) dxcTrN();
        DcdProductListReq dcdProductListReqValueOf = valueOf();
        java.lang.String minAnnualYieldPercentage = dcdProductListReqValueOf != null ? dcdProductListReqValueOf.getMinAnnualYieldPercentage() : null;
        DcdProductListReq dcdProductListReqValueOf2 = valueOf();
        dcdCreateManualPresenter2.KWHzl(minAnnualYieldPercentage, dcdProductListReqValueOf2 != null ? dcdProductListReqValueOf2.getMaxSettlementDay() : null);
        fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        java.lang.String strikePercentage;
        C50387vMn c50387vMn = ((AbstractC50784vag) gGvvIC()).copydefault;
        c50387vMn.setRecommendValue("0.001", "0.01", "0.05");
        c50387vMn.setPercentDigit(1);
        c50387vMn.setPxChangeListener(this.copydefault);
        DcdProductListReq dcdProductListReqValueOf = valueOf();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (dcdProductListReqValueOf != null ? dcdProductListReqValueOf.getStrikePercentage() : null))) {
            DcdProductListReq dcdProductListReqValueOf2 = valueOf();
            if (dcdProductListReqValueOf2 == null || (strikePercentage = dcdProductListReqValueOf2.getStrikePercentage()) == null) {
                strikePercentage = "";
            }
            c50387vMn.setPxPercentageData(strikePercentage);
            return;
        }
        c50387vMn.copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        vMD vmd = ((AbstractC50784vag) gGvvIC()).AEQbTJ;
        vmd.setApyChangeListener(new Function1() { // from class: o.vMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        });
        vmd.setCycleChangeListener(new Function1() { // from class: o.vMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.valueOf(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vLO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vLO vlo) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = vlo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.util.List<ProductItemResp> value = vLO.AhwBna(this.OLrzqt).EZpvd().getValue();
                if (C33129mqd.AEQbTJ(value != null ? java.lang.Integer.valueOf(value.size()) : null, 0)) {
                    java.util.List<ProductItemResp> value2 = vLO.AhwBna(this.OLrzqt).EZpvd().getValue();
                    if ((value2 != null ? (ProductItemResp) CollectionsKt___CollectionsKt.AuCTelauCTel(value2) : null) != null) {
                        android.content.Context context = this.OLrzqt.getContext();
                        if (context != null) {
                            ActivityC50353vLg.Application application = ActivityC50353vLg.Companion;
                            java.util.List<ProductItemResp> value3 = vLO.AhwBna(this.OLrzqt).EZpvd().getValue();
                            application.copydefault(context, value3 != null ? (ProductItemResp) CollectionsKt___CollectionsKt.AuCTelauCTel(value3) : null, vLO.AhwBna(this.OLrzqt).KWHzl().AEQbTJ(), true);
                            return;
                        }
                        return;
                    }
                }
                vLO.AhwBna(this.OLrzqt).iwGUEr();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vLO OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vLO vlo) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = vlo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                vMM vmm = new vMM();
                vmm.OLrzqt(this.OLrzqt.new ActionBar());
                vmm.show(this.OLrzqt.getChildFragmentManager(), C56524yIo.AEQbTJ(vMM.class).valueOf());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(vLO vlo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((DcdCreateManualPresenter) vlo.dxcTrN()).AhwBna(str);
        C52693wUw.debounce$default(C52693wUw.copydefault, 0L, new DcdCreateManualFragment$initAdvanceView$1$1$1(vlo, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(vLO vlo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((DcdCreateManualPresenter) vlo.dxcTrN()).djBIcL(str);
        C52693wUw.debounce$default(C52693wUw.copydefault, 0L, new DcdCreateManualFragment$initAdvanceView$1$2$1(vlo, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        vMC.setMatchResult$default(((AbstractC50784vag) gGvvIC()).KWHzl, "2", null, null, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@androidx.annotation.StringRes int i) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A);
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("viewMore", strAYXKKw)));
        ((AbstractC50784vag) gGvvIC()).djBIcL.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView = ((AbstractC50784vag) gGvvIC()).djBIcL;
        final android.content.Context context = getContext();
        textView.setText(context != null ? C49965uyW.EZpvd.copydefault(yDY.copydefault(strAYXKKw), strCopydefault, context, C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), true, new Function1() { // from class: o.vMl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.KWHzl(context, ((java.lang.Integer) obj).intValue());
            }
        }) : null);
    }

    public static final Unit KWHzl(android.content.Context context, int i) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.aCSzUz))), null, 4, null);
        return Unit.INSTANCE;
    }

    private final void getFieldNames() {
        getParentFragmentManager().setFragmentResultListener("copy_to_manual_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vLO.OLrzqt(this.copydefault, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void iwGUEr() {
        getFieldNames();
        C53518wmx c53518wmxDjBIcL = djBIcL();
        c53518wmxDjBIcL.setOnClickListener(new Activity(c53518wmxDjBIcL, 1000L, this));
        C50391vMr c50391vMrKWHzl = KWHzl();
        c50391vMrKWHzl.setPrincipleClickListener(new Function0() { // from class: o.vLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vLO.DbNXlk(this.KWHzl);
            }
        });
        c50391vMrKWHzl.setBtnClickListener(new Function0() { // from class: o.vLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vLO.AkhnZx(this.OLrzqt);
            }
        });
        C55052xcf c55052xcf = ((AbstractC50784vag) gGvvIC()).OLrzqt;
        c55052xcf.setOnClickListener(new Application(c55052xcf, 1000L, this));
    }

    public static final Unit DbNXlk(vLO vlo) {
        C32866mlf.onEvent$default("DCDBot_PlaceOrder_Fullbutton_Click", (TrackChannel[]) null, new Function1() { // from class: o.vLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C50354vLh c50354vLh = new C50354vLh();
        androidx.fragment.app.FragmentManager childFragmentManager = vlo.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c50354vLh.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "education", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AkhnZx(vLO vlo) {
        if (!vlo.copydefault()) {
            return Unit.INSTANCE;
        }
        if (((AbstractC50784vag) vlo.gGvvIC()).EZpvd.getFieldNames() || ((AbstractC50784vag) vlo.gGvvIC()).AEQbTJ.djBIcL()) {
            return Unit.INSTANCE;
        }
        ((DcdCreateManualPresenter) vlo.dxcTrN()).uzCIH();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function2<java.lang.String, java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.lang.String str2) {
            AEQbTJ(str, str2);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            vLO.this.EZpvd(str2);
            vLO.AYXKKw(vLO.this).OLrzqt.setTitle(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean copydefault() {
        AbstractC50784vag abstractC50784vag = (AbstractC50784vag) gGvvIC();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) abstractC50784vag.EZpvd.AkhnZx())) {
            C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", abstractC50784vag.EZpvd.values())));
            abstractC50784vag.EZpvd.zsXlph();
            return false;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) abstractC50784vag.AEQbTJ.AEQbTJ().AkhnZx())) {
            C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.RIuxYh))));
            abstractC50784vag.AEQbTJ.AEQbTJ().zsXlph();
            return false;
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) abstractC50784vag.AEQbTJ.AYXKKw().AkhnZx())) {
            return true;
        }
        C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.RTWSvT))));
        abstractC50784vag.AEQbTJ.AYXKKw().zsXlph();
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        android.view.ViewGroup viewGroupValues;
        android.view.ViewGroup viewGroupValues2;
        TacticsUiConst.ActionBar actionBar = TacticsUiConst.ActionBar.EZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.copydefault())) {
            AbstractC50784vag abstractC50784vag = (AbstractC50784vag) gGvvIC();
            C50387vMn c50387vMn = abstractC50784vag.copydefault;
            Intrinsics.checkNotNullExpressionValue(c50387vMn, "");
            c50387vMn.setVisibility(0);
            vMC vmc = abstractC50784vag.KWHzl;
            Intrinsics.checkNotNullExpressionValue(vmc, "");
            vmc.setVisibility(0);
            C47988uAv c47988uAv = abstractC50784vag.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            c47988uAv.setVisibility(8);
            abstractC50784vag.OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.hrjNmC));
            KWHzl(C48033uCm.Fragment.alsFma);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.AEQbTJ())) {
            AbstractC50784vag abstractC50784vag2 = (AbstractC50784vag) gGvvIC();
            C50387vMn c50387vMn2 = abstractC50784vag2.copydefault;
            Intrinsics.checkNotNullExpressionValue(c50387vMn2, "");
            c50387vMn2.setVisibility(8);
            vMC vmc2 = abstractC50784vag2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(vmc2, "");
            vmc2.setVisibility(8);
            C47988uAv c47988uAv2 = abstractC50784vag2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
            c47988uAv2.setVisibility(0);
            abstractC50784vag2.OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.cBPFI));
            KWHzl(C48033uCm.Fragment.akftKQ);
        }
        ((DcdCreateManualPresenter) dxcTrN()).AYXKKw(str);
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC55882xsN interfaceC55882xsN = activity instanceof InterfaceC55882xsN ? (InterfaceC55882xsN) activity : null;
        if (interfaceC55882xsN != null && (viewGroupValues2 = interfaceC55882xsN.values()) != null) {
            viewGroupValues2.removeAllViews();
        }
        android.view.View viewGEmmrt = gEmmrt();
        KeyEventDispatcher.Component activity2 = getActivity();
        InterfaceC55882xsN interfaceC55882xsN2 = activity2 instanceof InterfaceC55882xsN ? (InterfaceC55882xsN) activity2 : null;
        if (interfaceC55882xsN2 == null || (viewGroupValues = interfaceC55882xsN2.values()) == null) {
            return;
        }
        viewGroupValues.addView(viewGEmmrt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        if (Intrinsics.EZpvd((java.lang.Object) ((DcdCreateManualPresenter) dxcTrN()).AYXKKw(), (java.lang.Object) TacticsUiConst.ActionBar.EZpvd.copydefault())) {
            ((DcdCreateManualPresenter) dxcTrN()).ejfBZ();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        ((AbstractC50784vag) gGvvIC()).AEQbTJ.OLrzqt(((DcdCreateManualPresenter) dxcTrN()).AhwBna(), ((DcdCreateManualPresenter) dxcTrN()).gEmmrt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        C47988uAv c47988uAvKWHzl = ((AbstractC50784vag) gGvvIC()).copydefault.KWHzl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAvKWHzl.AkhnZx())) {
            c47988uAvKWHzl.copydefault();
        } else if (!((DcdCreateManualPresenter) dxcTrN()).AEQbTJ(c47988uAvKWHzl.AkhnZx()) || !((DcdCreateManualPresenter) dxcTrN()).OLrzqt(c47988uAvKWHzl.AkhnZx())) {
            c47988uAvKWHzl.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.RSDDiY, C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", ((DcdCreateManualPresenter) dxcTrN()).KWHzl("0.001")), C56390yDp.OLrzqt("max", ((DcdCreateManualPresenter) dxcTrN()).KWHzl("0.50")))));
        } else {
            c47988uAvKWHzl.copydefault();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        if (z) {
            ((DcdCreateManualPresenter) dxcTrN()).AEQbTJ();
            ((AbstractC50784vag) gGvvIC()).EZpvd.setInputUnit(((DcdCreateManualPresenter) dxcTrN()).djBIcL());
            ((AbstractC50784vag) gGvvIC()).EZpvd.setMaxDecimal(((DcdCreateManualPresenter) dxcTrN()).fARcdN());
            OLrzqt(((DcdCreateManualPresenter) dxcTrN()).AYXKKw());
        }
        ((DcdCreateManualPresenter) dxcTrN()).fJNWhG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str) {
        TacticsUiConst.ActionBar actionBar = TacticsUiConst.ActionBar.EZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.copydefault())) {
            ((DcdCreateManualPresenter) dxcTrN()).KWHzl(null, null);
            ((AbstractC50784vag) gGvvIC()).copydefault.copydefault();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.AEQbTJ())) {
            C47988uAv.setInputContent$default(((AbstractC50784vag) gGvvIC()).EZpvd, "", false, false, 6, null);
        }
        ((AbstractC50784vag) gGvvIC()).AEQbTJ.OLrzqt("0.01", "35");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        ((DcdCreateManualPresenter) dxcTrN()).valueOf().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.OLrzqt(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        ((DcdCreateManualPresenter) dxcTrN()).getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.EZpvd(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweValues = ((DcdCreateManualPresenter) dxcTrN()).values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweValues.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.AhwBna(this.KWHzl, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweFetchVPNInfo = ((DcdCreateManualPresenter) dxcTrN()).fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweFetchVPNInfo.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.vLY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.util.List<DcdRecommendedParams>> c56111xweAkhnZx = ((DcdCreateManualPresenter) dxcTrN()).AkhnZx();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweAkhnZx.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.vMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }));
        ((DcdCreateManualPresenter) dxcTrN()).fIwbmz().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.KWHzl(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        ((DcdCreateManualPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.OLrzqt(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vLO vlo, java.util.ArrayList arrayList) {
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 0)) {
            vMC.setMatchResult$default(((AbstractC50784vag) vlo.gGvvIC()).KWHzl, "0", ((DcdCreateManualPresenter) vlo.dxcTrN()).valueOf().getValue(), null, 4, null);
        } else {
            vMC.setMatchResult$default(((AbstractC50784vag) vlo.gGvvIC()).KWHzl, "2", null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vLO vlo, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((DcdCreateManualPresenter) vlo.dxcTrN()).KWHzl().bB_()) && ((java.lang.Boolean) pair.second).booleanValue()) {
            vMC.setMatchResult$default(((AbstractC50784vag) vlo.gGvvIC()).KWHzl, "1", null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(vLO vlo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.AEQbTJ(str, 0)) {
            vLB.ActionBar actionBar = vLB.Companion;
            android.content.Context contextRequireContext = vlo.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            actionBar.EZpvd(contextRequireContext, ((DcdCreateManualPresenter) vlo.dxcTrN()).isConnected().KWHzl());
        } else {
            ((DcdCreateManualPresenter) vlo.dxcTrN()).iwGUEr();
        }
        C32866mlf.onEvent$default("DCDBot_PlaceOrder_FindProducts_Click", (TrackChannel[]) null, new Function1() { // from class: o.vMm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLO.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", C33129mqd.AEQbTJ(str, 0) ? "available" : "unavailable", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(vLO vlo, java.lang.String str) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String value = ((DcdCreateManualPresenter) vlo.dxcTrN()).fetchVPNInfo().getValue();
        if (value != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value)) {
            str2 = "≥ " + ((DcdCreateManualPresenter) vlo.dxcTrN()).AEQbTJ(false);
        }
        C47988uAv.setInputLabel$default(((AbstractC50784vag) vlo.gGvvIC()).EZpvd, str2, null, 2, null);
        vlo.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vLO vlo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vlo.KWHzl = (DcdRecommendedParams) CollectionsKt___CollectionsKt.firstOrNull(list);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final vLO vlo, java.util.ArrayList arrayList) {
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 0)) {
            vLG vlgKWHzl = vLG.Companion.KWHzl(((DcdCreateManualPresenter) vlo.dxcTrN()).fIwbmz().getValue());
            vlgKWHzl.EZpvd(new Function0() { // from class: o.vMj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return vLO.fIwbmz(this.copydefault);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = vlo.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            vlgKWHzl.show(childFragmentManager);
        } else {
            vLG vlgKWHzl2 = vLG.Companion.KWHzl(((DcdCreateManualPresenter) vlo.dxcTrN()).fIwbmz().getValue());
            vlgKWHzl2.EZpvd(new Function0() { // from class: o.vMk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return vLO.AuCTel(this.KWHzl);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager2 = vlo.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            vlgKWHzl2.show(childFragmentManager2);
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.geLlBI), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(vLO vlo) {
        vlo.AuCTel();
        vlo.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(vLO vlo) {
        vlo.AuCTel();
        vlo.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v10, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r6v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vLO vlo, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DcdCreateManualPresenter) vlo.dxcTrN()).KWHzl().bB_())) {
            vMC.setMatchResult$default(((AbstractC50784vag) vlo.gGvvIC()).KWHzl, "2", null, null, 6, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DcdCreateManualPresenter) vlo.dxcTrN()).DbNXlk().bB_())) {
            ((DcdCreateManualPresenter) vlo.dxcTrN()).fetchVPNInfo().setValue("");
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DcdCreateManualPresenter) vlo.dxcTrN()).isConnected().bB_())) {
            C32866mlf.onEvent$default("DCDBot_PlaceOrder_FindProducts_Click", (TrackChannel[]) null, new Function1() { // from class: o.vMi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vLO.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((DcdCreateManualPresenter) vlo.dxcTrN()).AuCTel().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", "false", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        java.lang.String strikePercentage;
        java.lang.String strAYXKKw = ((DcdCreateManualPresenter) dxcTrN()).AYXKKw();
        TacticsUiConst.ActionBar actionBar = TacticsUiConst.ActionBar.EZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) actionBar.copydefault())) {
            C50387vMn c50387vMn = ((AbstractC50784vag) gGvvIC()).copydefault;
            DcdRecommendedParams dcdRecommendedParams = this.KWHzl;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (dcdRecommendedParams != null ? dcdRecommendedParams.getStrikePercentage() : null))) {
                DcdRecommendedParams dcdRecommendedParams2 = this.KWHzl;
                if (dcdRecommendedParams2 == null || (strikePercentage = dcdRecommendedParams2.getStrikePercentage()) == null) {
                    strikePercentage = "";
                }
                c50387vMn.setPxPercentageData(strikePercentage);
            } else {
                c50387vMn.copydefault();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) actionBar.AEQbTJ())) {
            C47988uAv c47988uAv = ((AbstractC50784vag) gGvvIC()).EZpvd;
            DcdRecommendedParams dcdRecommendedParams3 = this.KWHzl;
            C47988uAv.setInputContent$default(c47988uAv, dcdRecommendedParams3 != null ? dcdRecommendedParams3.getStrike() : null, false, false, 6, null);
        }
        DcdCreateManualPresenter dcdCreateManualPresenter = (DcdCreateManualPresenter) dxcTrN();
        DcdRecommendedParams dcdRecommendedParams4 = this.KWHzl;
        java.lang.String minAnnualYieldPercentage = dcdRecommendedParams4 != null ? dcdRecommendedParams4.getMinAnnualYieldPercentage() : null;
        DcdRecommendedParams dcdRecommendedParams5 = this.KWHzl;
        dcdCreateManualPresenter.KWHzl(minAnnualYieldPercentage, dcdRecommendedParams5 != null ? dcdRecommendedParams5.getMaxSettlementDay() : null);
        fIwbmz();
    }

    public final void fJNWhG() {
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(gEmmrt(), C33070mpX.AYXKKw(C55688xof.Application.getRccTransportControlFlagsFromActions));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getRccTransportControlFlagsFromActions));
            c55284xgzKWHzl.AEQbTJ(gEmmrt());
            c55284xgzKWHzl.hDKMBd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        android.view.ViewGroup viewGroupValues;
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC55882xsN interfaceC55882xsN = activity instanceof InterfaceC55882xsN ? (InterfaceC55882xsN) activity : null;
        if (interfaceC55882xsN != null && (viewGroupValues = interfaceC55882xsN.values()) != null) {
            viewGroupValues.removeAllViews();
        }
        super.onVisible();
        if (Intrinsics.EZpvd((java.lang.Object) ((DcdCreateManualPresenter) dxcTrN()).AYXKKw(), (java.lang.Object) TacticsUiConst.ActionBar.EZpvd.copydefault())) {
            djBIcL().OLrzqt();
        } else {
            KWHzl().AEQbTJ();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((AbstractC50784vag) gGvvIC()).copydefault.OLrzqt();
        ((AbstractC50784vag) gGvvIC()).EZpvd.setOnTextChangeCallback(null);
    }

    public static final void OLrzqt(vLO vlo, java.lang.String str, android.os.Bundle bundle) {
        java.lang.Object parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("bot_copy_req", DcdRecommendedParams.class);
        } else {
            java.lang.Object parcelable2 = bundle.getParcelable("bot_copy_req");
            if (!(parcelable2 instanceof DcdRecommendedParams)) {
                parcelable2 = null;
            }
            parcelable = (DcdRecommendedParams) parcelable2;
        }
        DcdRecommendedParams dcdRecommendedParams = (DcdRecommendedParams) parcelable;
        vlo.KWHzl = dcdRecommendedParams;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (dcdRecommendedParams != null ? dcdRecommendedParams.getStrikePercentage() : null))) {
            vlo.EZpvd(TacticsUiConst.ActionBar.EZpvd.copydefault());
        } else {
            DcdRecommendedParams dcdRecommendedParams2 = vlo.KWHzl;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (dcdRecommendedParams2 != null ? dcdRecommendedParams2.getStrike() : null))) {
                vlo.EZpvd(TacticsUiConst.ActionBar.EZpvd.AEQbTJ());
            } else {
                vlo.EZpvd(TacticsUiConst.ActionBar.EZpvd.copydefault());
            }
        }
        vlo.AuCTel();
    }
}
