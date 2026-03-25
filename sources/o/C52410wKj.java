package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractDcaFragment$subscribeOnUIChange$13;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractDcaPresenter;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C52402wKb;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52410wKj extends AbstractC52405wKe<uUY, BotGuideContractDcaPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final int EZpvd = C48033uCm.Activity.DfrfUJ;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wKm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52410wKj.isConnected();
        }
    });
    public final Function2<C47988uAv, java.lang.String, Unit> AEQbTJ = new Function2() { // from class: o.wKv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C52410wKj.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    /* JADX INFO: renamed from: o.wKj$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotGuideContractDcaPresenter copydefault(C52410wKj c52410wKj) {
        return (BotGuideContractDcaPresenter) c52410wKj.dxcTrN();
    }

    private final C43316rmw fetchVPNInfo() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52410wKj c52410wKj, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = ((uUY) c52410wKj.gGvvIC()).djBIcL;
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        Intrinsics.copydefault(c47988uAv2);
        c52410wKj.KWHzl(c47988uAv2, c47988uAv2.fARcdN());
        c52410wKj.values();
        c52410wKj.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wKj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wKj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C52410wKj KWHzl() {
            return new C52410wKj();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        gEmmrt();
        fIwbmz();
        ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = ((uUY) gGvvIC()).KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.NRYds));
        }
        fetchVPNInfo().register(BotParamColorItemData.class, new C51261vjg());
        fetchVPNInfo().register(BotParamTickerData.class, new C51269vjo(null, 1, 0 == true ? 1 : 0));
        RecyclerView recyclerView = ((uUY) gGvvIC()).DbNXlk;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(fetchVPNInfo());
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        C49960uyR.OLrzqt(this, ((uUY) gGvvIC()).copydefault, java.lang.Integer.valueOf(C48033uCm.Application.RgaQzq), ((uUY) gGvvIC()).djBIcL, C55298xhM.dpInt$default(120, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AkhnZx() {
        java.lang.String quoteSymbol;
        int iAhwBna;
        java.lang.String instType;
        java.lang.String marginDig;
        java.lang.String instFamily;
        C50189vFe c50189vFe = ((uUY) gGvvIC()).AhwBna;
        c50189vFe.setOnLeverChangeCallback(new Function1() { // from class: o.wKu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        });
        c50189vFe.setOnClickListener(new Application(c50189vFe, 1000L, this));
        BizInstrument bizInstrumentAhwBna = ((BotGuideContractDcaPresenter) dxcTrN()).fvQaOB().AhwBna();
        C53539wnR c53539wnR = ((uUY) gGvvIC()).copydefault;
        java.lang.String str = "";
        if (bizInstrumentAhwBna == null || (quoteSymbol = bizInstrumentAhwBna.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        c53539wnR.setTransferCoin(quoteSymbol);
        final C47988uAv c47988uAv = ((uUY) gGvvIC()).djBIcL;
        c47988uAv.setInputUnit(bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getQuoteSymbol() : null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            iAhwBna = 2;
        } else {
            if (bizInstrumentAhwBna == null || (instType = bizInstrumentAhwBna.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrumentAhwBna != null && (instFamily = bizInstrumentAhwBna.getInstFamily()) != null) {
                    str = instFamily;
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(str);
                if (idxConfigAkhnZx != null && (marginDig = idxConfigAkhnZx.getMarginDig()) != null) {
                    iAhwBna = C33129mqd.AhwBna(marginDig);
                }
            }
        }
        c47988uAv.setMaxDecimal(iAhwBna);
        c47988uAv.setOnTextChangeCallback(this.AEQbTJ);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.AEQbTJ(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52410wKj c52410wKj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).copydefault(str);
        c52410wKj.djBIcL();
        C47988uAv c47988uAv = ((uUY) c52410wKj.gGvvIC()).djBIcL;
        Intrinsics.copydefault(c47988uAv);
        c52410wKj.KWHzl(c47988uAv, c47988uAv.fARcdN());
        c52410wKj.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C47988uAv c47988uAv, C52410wKj c52410wKj, float f) {
        java.lang.String safeString$default;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            xMV xmvKWHzl = ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).fvQaOB().KWHzl();
            if (xmvKWHzl == null || (c54536xMLOLrzqt = xmvKWHzl.OLrzqt(C33129mqd.mulS$default(java.lang.Float.valueOf(c47988uAv.fJNWhG()), ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).zLjUOn().getValue(), null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) {
                safeString$default = "";
            }
            C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
            Intrinsics.copydefault(c47988uAv);
            c52410wKj.KWHzl(c47988uAv, c47988uAv.fARcdN());
            c52410wKj.values();
            c52410wKj.AYXKKw();
            c47988uAv.setOnTextChangeCallback(c52410wKj.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.wKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52410wKj.OLrzqt(this.EZpvd, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(C52410wKj c52410wKj, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        pUU.KWHzl("Order", "BotGuideContractDcaFragment Order have Voucher");
        ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataValueOf = ((BotGuideContractDcaPresenter) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.copydefault(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wKi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.KWHzl(this.KWHzl, (xMJ.Application) obj);
            }
        }));
        C56111xwe<LossInsuranceDisplayData> c56111xweHDKMBd = ((BotGuideContractDcaPresenter) dxcTrN()).hDKMBd();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweHDKMBd.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.wKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.AEQbTJ(this.KWHzl, (LossInsuranceDisplayData) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweGEmmrt = ((BotGuideContractDcaPresenter) dxcTrN()).gEmmrt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweGEmmrt.observe(viewLifecycleOwner4, new StateListAnimator(new Function1() { // from class: o.wKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.AEQbTJ(this.EZpvd, (StrategyResponse) obj);
            }
        }));
        ((BotGuideContractDcaPresenter) dxcTrN()).AubY().AkhnZx().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<BotAggregatedInfoBean> tradeLiveDataAkhnZx = ((BotGuideContractDcaPresenter) dxcTrN()).AkhnZx();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner5, new StateListAnimator(new Function1() { // from class: o.wKq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.AEQbTJ(this.OLrzqt, (BotAggregatedInfoBean) obj);
            }
        }));
        ((BotGuideContractDcaPresenter) dxcTrN()).DbNXlk().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Boolean> c56109xwcAuCTel = ((BotGuideContractDcaPresenter) dxcTrN()).AuCTel().AuCTel();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56109xwcAuCTel.observe(viewLifecycleOwner6, new StateListAnimator(new Function1() { // from class: o.wKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56109xwc<kotlin.Pair<java.lang.String, java.lang.Exception>> c56109xwcFARcdN = ((BotGuideContractDcaPresenter) dxcTrN()).AuCTel().fARcdN();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56109xwcFARcdN.observe(viewLifecycleOwner7, new StateListAnimator(new Function1() { // from class: o.wKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.KWHzl(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
        ((BotGuideContractDcaPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.copydefault(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        C56111xwe<java.util.List<BotGuideCoinItem>> c56111xweEjfBZ = ((BotGuideContractDcaPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56111xweEjfBZ.observe(viewLifecycleOwner8, new StateListAnimator(new Function1() { // from class: o.wKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        C56111xwe<Unit> c56111xweFJNWhG = ((BotGuideContractDcaPresenter) dxcTrN()).fJNWhG();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56111xweFJNWhG.observe(viewLifecycleOwner9, new StateListAnimator(new Function1() { // from class: o.wKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.OLrzqt(this.AEQbTJ, (Unit) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner10), null, null, new BotGuideContractDcaFragment$subscribeOnUIChange$13(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.wKj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52410wKj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52410wKj c52410wKj) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c52410wKj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            BotRangeConfig lever;
            BotRangeConfig lever2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C50189vFe c50189vFe = (C50189vFe) this.AEQbTJ;
                java.lang.String strGEmmrt = C52410wKj.copydefault(this.copydefault).fvQaOB().gEmmrt();
                java.lang.String strDjBIcL = C52410wKj.copydefault(this.copydefault).fvQaOB().djBIcL();
                StrategyConfigInfo value = C52410wKj.copydefault(this.copydefault).valueOf().getValue();
                java.lang.String max = null;
                java.lang.String leveragePercents = value != null ? value.getLeveragePercents() : null;
                StrategyConfigInfo value2 = C52410wKj.copydefault(this.copydefault).valueOf().getValue();
                java.lang.String min = (value2 == null || (lever2 = value2.getLever()) == null) ? null : lever2.getMin();
                StrategyConfigInfo value3 = C52410wKj.copydefault(this.copydefault).valueOf().getValue();
                if (value3 != null && (lever = value3.getLever()) != null) {
                    max = lever.getMax();
                }
                java.lang.String direction = C52410wKj.copydefault(this.copydefault).fIwbmz().getDirection();
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c50189vFe.copydefault(strGEmmrt, strDjBIcL, leveragePercents, min, max, direction, "cross", childFragmentManager, "contract_dca");
            }
        }
    }

    public static final Unit copydefault(C52410wKj c52410wKj, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c52410wKj.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52410wKj c52410wKj, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        c52410wKj.djBIcL();
        C47988uAv c47988uAv = ((uUY) c52410wKj.gGvvIC()).djBIcL;
        Intrinsics.copydefault(c47988uAv);
        c52410wKj.KWHzl(c47988uAv, c47988uAv.fARcdN());
        c52410wKj.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52410wKj c52410wKj, LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        c52410wKj.valueOf();
        ((uUY) c52410wKj.gGvvIC()).AYXKKw.setData(lossInsuranceDisplayData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52410wKj c52410wKj, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        FragmentActivity activity = c52410wKj.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "contract_dca", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52410wKj c52410wKj, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c52410wKj.showLoading();
        } else {
            c52410wKj.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52410wKj c52410wKj, BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        ((uUY) c52410wKj.gGvvIC()).gEmmrt.copydefault(((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).KWHzl(botAggregatedInfoBean));
        ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.TRUE, null));
        c52410wKj.dismissLoading();
        c52410wKj.valueOf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52410wKj c52410wKj, java.util.List list) {
        uUY uuy = (uUY) c52410wKj.gGvvIC();
        uuy.valueOf.setData(((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).getFieldNames());
        C50189vFe c50189vFe = uuy.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c50189vFe, "");
        c50189vFe.setVisibility(((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).zuBGHE() ^ true ? 0 : 8);
        uuy.AhwBna.EZpvd(((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).fIwbmz().getLever());
        android.widget.TextView textView = uuy.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).zuBGHE() ? 0 : 8);
        android.widget.TextView textView2 = uuy.EZpvd;
        java.lang.String lever = ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).fIwbmz().getLever();
        if (lever == null) {
            lever = "5";
        }
        textView2.setText(C56033xvF.getBotLever$default(lever, false, 2, null));
        C43316rmw c43316rmwFetchVPNInfo = c52410wKj.fetchVPNInfo();
        Intrinsics.copydefault(list);
        C33064mpR.OLrzqt(c43316rmwFetchVPNInfo, (java.util.List<? extends java.lang.Object>) list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52410wKj, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52410wKj c52410wKj, boolean z) {
        java.lang.String value;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        if (z && (value = ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).zLjUOn().getValue()) != null) {
            xMV xmvKWHzl = ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).fvQaOB().KWHzl();
            java.lang.String safeString$default = null;
            if (xmvKWHzl != null && (c54536xMLCopydefault = xmvKWHzl.copydefault(value)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
            ((uUY) c52410wKj.gGvvIC()).copydefault.setFooterAvaValue(safeString$default);
            c52410wKj.valueOf();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52410wKj c52410wKj, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ((uUY) c52410wKj.gGvvIC()).copydefault.setFooterAvaValue("--");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52410wKj c52410wKj, androidx.core.util.Pair pair) {
        java.lang.String message;
        pUU.copydefault(c52410wKj.getTAG(), pair.first + " request failed cause by " + ((java.lang.Exception) pair.second).getMessage());
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).zsXlph().bB_())) {
            ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.FALSE, pair.second));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52410wKj, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).getNewProxyInstance().bB_())) {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toast$default(message2, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractDcaPresenter) c52410wKj.dxcTrN()).AubY().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final C52410wKj c52410wKj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list) && list.size() > 1) {
            ((uUY) c52410wKj.gGvvIC()).gEmmrt.setCoinSwitchEnable(new Function0() { // from class: o.wKl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52410wKj.KWHzl(this.AEQbTJ);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52410wKj c52410wKj) {
        FragmentKt.setFragmentResult(c52410wKj, "key_switch_coin", new android.os.Bundle());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52410wKj c52410wKj, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ((uUY) c52410wKj.gGvvIC()).gEmmrt.setTitleArrow(false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void AEQbTJ() {
        LossInsuranceBean voucherInformation;
        java.lang.String tag = getTAG();
        BotAggregatedInfoBean value = ((BotGuideContractDcaPresenter) dxcTrN()).AkhnZx().getValue();
        pUU.EZpvd(tag, "onCreateClick voucher type: " + ((value == null || (voucherInformation = value.getVoucherInformation()) == null) ? null : voucherInformation.getVoucherType()));
        ((BotGuideContractDcaPresenter) dxcTrN()).isConnected();
        C47988uAv c47988uAv = ((uUY) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        KWHzl(c47988uAv, ((uUY) gGvvIC()).djBIcL.fARcdN());
        AppCompatTextView appCompatTextView = ((uUY) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if (appCompatTextView.getVisibility() == 0) {
            C56002xub.KWHzl.OLrzqt();
            return;
        }
        C52402wKb.Activity activity = C52402wKb.Companion;
        DcaOrderReq dcaOrderReqFIwbmz = ((BotGuideContractDcaPresenter) dxcTrN()).fIwbmz();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        activity.EZpvd(dcaOrderReqFIwbmz, childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void copydefault() {
        AkhnZx();
        C54782xVc.AEQbTJ.AhwBna(((BotGuideContractDcaPresenter) dxcTrN()).fvQaOB().AhwBna());
        ((BotGuideContractDcaPresenter) dxcTrN()).AwvSrB();
        ((BotGuideContractDcaPresenter) dxcTrN()).sSMYrx();
        ((BotGuideContractDcaPresenter) dxcTrN()).AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        StrategyConfigInfo value = ((BotGuideContractDcaPresenter) dxcTrN()).valueOf().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uUY) gGvvIC()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.copydefault(c54154wyx, value);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        java.lang.String strAuCTelauCTel = ((BotGuideContractDcaPresenter) dxcTrN()).AuCTelauCTel();
        C47988uAv c47988uAv = ((uUY) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        setInputRange$default(this, c47988uAv, new BotRangeConfig(strAuCTelauCTel, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 62, (DefaultConstructorMarker) null), null, null, new Function1() { // from class: o.wKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52410wKj.AEQbTJ((java.lang.String) obj);
            }
        }, 12, null);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.copydefault(str);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        java.lang.String value = ((BotGuideContractDcaPresenter) dxcTrN()).zLjUOn().getValue();
        java.lang.String strAuCTelauCTel = ((BotGuideContractDcaPresenter) dxcTrN()).AuCTelauCTel();
        boolean z = ((BotGuideContractDcaPresenter) dxcTrN()).hDKMBd().getValue() != null;
        BotAggregatedInfoBean value2 = ((BotGuideContractDcaPresenter) dxcTrN()).AkhnZx().getValue();
        StgyParam botParam = value2 != null ? value2.getBotParam() : null;
        if (value == null || !C33129mqd.OLrzqt((java.lang.CharSequence) strAuCTelauCTel) || C33129mqd.OLrzqt(C33129mqd.EZpvd(strAuCTelauCTel), "0") || !z || botParam == null) {
            return;
        }
        C47988uAv.setInputContent$default(((uUY) gGvvIC()).djBIcL, ((BotGuideContractDcaPresenter) dxcTrN()).EZpvd(value), false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        ((uUY) gGvvIC()).AEQbTJ.setVisibility(C33129mqd.AEQbTJ(((BotGuideContractDcaPresenter) dxcTrN()).fIwbmz().getInvestmentAmt(), ((BotGuideContractDcaPresenter) dxcTrN()).zLjUOn().getValue()) ? 0 : 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw() {
        IBotGuidePresenter.ButtonState.Generic generic;
        uUY uuy = (uUY) gGvvIC();
        C56111xwe<IBotGuidePresenter.ButtonState> c56111xweFARcdN = ((BotGuideContractDcaPresenter) dxcTrN()).fARcdN();
        if (uuy.djBIcL.AkhnZx().length() <= 0 || uuy.djBIcL.getFieldNames()) {
            generic = IBotGuidePresenter.ButtonState.Generic.Disabled;
        } else {
            AppCompatTextView appCompatTextView = uuy.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            if (appCompatTextView.getVisibility() != 0) {
                generic = IBotGuidePresenter.ButtonState.Generic.Enabled;
            }
        }
        c56111xweFARcdN.setValue(generic);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.wKj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInputRange$default(C52410wKj c52410wKj, C47988uAv c47988uAv, BotRangeConfig botRangeConfig, java.lang.String str, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        c52410wKj.EZpvd(c47988uAv, botRangeConfig, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : function1, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(C47988uAv c47988uAv, BotRangeConfig botRangeConfig, java.lang.String str, Function1<? super java.lang.String, java.lang.String> function1, Function1<? super java.lang.String, java.lang.String> function12) {
        java.lang.String min;
        java.lang.String str2;
        int i = C48033uCm.Application.setSplitBackgroundDrawable;
        if (str == null) {
            min = botRangeConfig != null ? botRangeConfig.getMin() : null;
        } else {
            min = str;
        }
        c47988uAv.setTag(i, min);
        c47988uAv.setTag(C48033uCm.Application.setNavigationMode, botRangeConfig != null ? botRangeConfig.getMax() : null);
        java.lang.String max = botRangeConfig != null ? botRangeConfig.getMax() : null;
        if (max == null || max.length() == 0) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invalidateMenu);
            java.lang.String strInvoke = function12.invoke(str);
            if (strInvoke == null) {
                strInvoke = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
            }
            C47988uAv.setInputLabel$default(c47988uAv, strAYXKKw + " " + strInvoke, null, 2, null);
        } else {
            if (!C33129mqd.gEmmrt(botRangeConfig != null ? botRangeConfig.getMax() : null, botRangeConfig != null ? botRangeConfig.getMin() : null)) {
                java.lang.String strInvoke2 = function12.invoke(str);
                if (strInvoke2 == null) {
                    strInvoke2 = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
                }
                C47988uAv.setInputLabel$default(c47988uAv, strInvoke2 + "-" + ((java.lang.Object) function12.invoke(botRangeConfig != null ? botRangeConfig.getMax() : null)), null, 2, null);
            }
        }
        if (C33129mqd.AEQbTJ(botRangeConfig != null ? botRangeConfig.getDefault() : null, 0)) {
            if (function1 == null) {
                str2 = botRangeConfig != null ? botRangeConfig.getDefault() : null;
            } else {
                java.lang.String strInvoke3 = function1.invoke(botRangeConfig != null ? botRangeConfig.getDefault() : null);
                if (strInvoke3 != null) {
                    str2 = strInvoke3;
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, str2, false, false, 6, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strCopydefault;
        ((BotGuideContractDcaPresenter) dxcTrN()).fIwbmz().setInvestmentAmt(c47988uAv.AkhnZx());
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setSplitBackgroundDrawable));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setNavigationMode));
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        if (C33129mqd.AEQbTJ(strGEmmrt2, 0) && C33129mqd.AEQbTJ(strAkhnZx, strGEmmrt2)) {
            strCopydefault = C33069mpW.copydefault(((BotGuideContractDcaPresenter) dxcTrN()).KWHzl(true), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt2)), C56390yDp.OLrzqt("unit", str)));
        } else {
            strCopydefault = (strAkhnZx.length() == 0 || C33129mqd.gEmmrt(strAkhnZx, strGEmmrt)) ? C33069mpW.copydefault(((BotGuideContractDcaPresenter) dxcTrN()).KWHzl(false), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt)), C56390yDp.OLrzqt("unit", str))) : "";
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAv.AkhnZx()) || strCopydefault.length() == 0) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(strCopydefault);
        }
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54782xVc.AEQbTJ.AYXKKw();
    }
}
