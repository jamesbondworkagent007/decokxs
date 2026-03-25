package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideSpotGridFragment$subscribeOnUIChange$11;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSpotGridPresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52435wLh extends AbstractC52405wKe<AbstractC48324uNg, BotGuideSpotGridPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final int OLrzqt = C48033uCm.Activity.QbewEr;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wLu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52435wLh.AYXKKw();
        }
    });

    /* JADX INFO: renamed from: o.wLh$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSpotGridPresenter) (wrap:Presenter:0x0000: INVOKE (r0v0 o.wLh) VIRTUAL call: o.xKx.dxcTrN():com.okinc.unify_trade.refactor.presenter.AbsPresenter A[MD:():Presenter extends com.okinc.unify_trade.refactor.presenter.AbsPresenter (m), WRAPPED] (LINE:58)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotGuideSpotGridPresenter KWHzl(C52435wLh c52435wLh) {
        return (BotGuideSpotGridPresenter) c52435wLh.dxcTrN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    private final C43316rmw AkhnZx() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.wLh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wLh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C52435wLh copydefault() {
            return new C52435wLh();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        isConnected();
        valueOf();
        values();
        fARcdN();
        AuCTel();
        C53539wnR c53539wnR = ((AbstractC48324uNg) gGvvIC()).EZpvd;
        int i = C48033uCm.Application.RgaQzq;
        C49960uyR.OLrzqt(this, c53539wnR, java.lang.Integer.valueOf(i), ((AbstractC48324uNg) gGvvIC()).AYXKKw, C55298xhM.dpInt$default(120, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        AkhnZx().register(BotParamColorItemData.class, new C51261vjg());
        AkhnZx().register(BotParamTickerData.class, new C51269vjo(null, 1, 0 == true ? 1 : 0));
        RecyclerView recyclerView = ((AbstractC48324uNg) gGvvIC()).AkhnZx;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(AkhnZx());
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        final C47988uAv c47988uAv = ((AbstractC48324uNg) gGvvIC()).AYXKKw;
        c47988uAv.setInputUnit(((BotGuideSpotGridPresenter) dxcTrN()).AhwBna().getInvestSymbol());
        c47988uAv.setInputUnitBolded(true);
        final Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = new Function2() { // from class: o.wLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52435wLh.EZpvd(c47988uAv, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        c47988uAv.setOnTextChangeCallback(function2);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.KWHzl(c47988uAv, this, function2, ((java.lang.Float) obj).floatValue());
            }
        });
        ((AbstractC48324uNg) gGvvIC()).EZpvd.setTransferCoin(((BotGuideSpotGridPresenter) dxcTrN()).AhwBna().getInvestSymbol());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C47988uAv c47988uAv, C52435wLh c52435wLh, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).copydefault(c47988uAv.AkhnZx());
        checkInvestAmtIsValid$default(c52435wLh, false, 1, null);
        c52435wLh.fJNWhG();
        c52435wLh.gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C47988uAv c47988uAv, C52435wLh c52435wLh, Function2 function2, float f) {
        C54536xML c54536xMLAYXKKw;
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            java.lang.String strMulS$default = C33129mqd.mulS$default(java.lang.Float.valueOf(c47988uAv.fJNWhG()), ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).getFieldNames(), null, null, null, 14, null);
            C54571xNh c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
            C47988uAv.setInputContent$default(c47988uAv, (c54571xNhCreateAmtConvert$default == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(strMulS$default)) == null) ? null : C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null), false, false, 6, null);
            ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).copydefault(c47988uAv.AkhnZx());
            checkInvestAmtIsValid$default(c52435wLh, false, 1, null);
            c52435wLh.fJNWhG();
            c52435wLh.gEmmrt();
            c47988uAv.setOnTextChangeCallback(function2);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        ((AbstractC48324uNg) gGvvIC()).EZpvd.setUnderlineClick(new Function0() { // from class: o.wLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52435wLh.copydefault(this.KWHzl);
            }
        });
        ((AbstractC48324uNg) gGvvIC()).EZpvd.setTransferClick(new Function0() { // from class: o.wLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52435wLh.valueOf(this.copydefault);
            }
        });
    }

    public static final Unit copydefault(C52435wLh c52435wLh) {
        android.content.Context context = c52435wLh.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase));
            java.lang.String string = c52435wLh.getString(C55688xof.Application.QWSkGZ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wLx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52435wLh.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C52435wLh c52435wLh) {
        C55867xrz.gridGuideButtonClick$default(C55867xrz.KWHzl, ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AhwBna(), ExtJson.BRC20TYPE_TRANSFER, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void AEQbTJ() {
        LossInsuranceBean voucherInformation;
        ((BotGuideSpotGridPresenter) dxcTrN()).EZpvd();
        C55867xrz.KWHzl.AEQbTJ(((BotGuideSpotGridPresenter) dxcTrN()).AhwBna(), "create", ((BotGuideSpotGridPresenter) dxcTrN()).DbNXlk());
        java.lang.String tag = getTAG();
        BotAggregatedInfoBean value = ((BotGuideSpotGridPresenter) dxcTrN()).djBIcL().getValue();
        pUU.EZpvd(tag, "onCreateClick voucher type: " + ((value == null || (voucherInformation = value.getVoucherInformation()) == null) ? null : voucherInformation.getVoucherType()));
        if (((BotGuideSpotGridPresenter) dxcTrN()).AuCTelauCTel()) {
            ((BotGuideSpotGridPresenter) dxcTrN()).AxsJAY();
            return;
        }
        AppCompatTextView appCompatTextView = ((AbstractC48324uNg) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        boolean z = appCompatTextView.getVisibility() == 0 || ((AbstractC48324uNg) gGvvIC()).AYXKKw.getFieldNames();
        boolean zAEQbTJ = AEQbTJ(true);
        pUU.EZpvd(getTAG(), "onCreateClick: ordering pre check: isErrAlready " + z + ", isInvestAmtValid " + zAEQbTJ);
        if (z || !zAEQbTJ) {
            return;
        }
        LossInsuranceDisplayData value2 = ((BotGuideSpotGridPresenter) dxcTrN()).isConnected().getValue();
        BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo = value2 != null ? new BotOrderConfirmPresenter.VoucherTagDisplayInfo(value2.getAmount(), value2.getVoucherCcy(), null, 4, null) : null;
        StrategyConfigInfo value3 = ((BotGuideSpotGridPresenter) dxcTrN()).wlaJM().getValue();
        BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
        java.lang.String instId = ((BotGuideSpotGridPresenter) dxcTrN()).AhwBna().getInstId();
        java.lang.String instType = ((BotGuideSpotGridPresenter) dxcTrN()).AhwBna().getInstType();
        StrategyBaseReq strategyBaseReqOLrzqt = ((BotGuideSpotGridPresenter) dxcTrN()).OLrzqt();
        strategyBaseReqOLrzqt.setInstId(((BotGuideSpotGridPresenter) dxcTrN()).AhwBna().getInstId());
        Unit unit = Unit.INSTANCE;
        BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = taskDescription.copydefault(instId, instType, new StrategyReqGroup(strategyBaseReqOLrzqt, (IceBergReq) null, (TwapReq) null, ((BotGuideSpotGridPresenter) dxcTrN()).AhwBna(), (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(value3), (DcaOrderReq) null, (AiOrderReq) null, 28662, (DefaultConstructorMarker) null), (248 & 8) != 0 ? false : true, (248 & 16) != 0 ? null : voucherTagDisplayInfo, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : new Function1() { // from class: o.wLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        botOrderConfirmFragmentCopydefault.show(childFragmentManager);
    }

    /* JADX INFO: renamed from: o.wLh$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52435wLh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52435wLh c52435wLh) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c52435wLh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    C52659wTp.copydefault.AEQbTJ(context);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52435wLh c52435wLh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AxsJAY();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void copydefault() {
        ((AbstractC48324uNg) gGvvIC()).AYXKKw.setMaxDecimal(((BotGuideSpotGridPresenter) dxcTrN()).hDKMBd());
        ((BotGuideSpotGridPresenter) dxcTrN()).zuBGHE();
        ((BotGuideSpotGridPresenter) dxcTrN()).QOLQEE();
        ((BotGuideSpotGridPresenter) dxcTrN()).copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataWlaJM = ((BotGuideSpotGridPresenter) dxcTrN()).wlaJM();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataWlaJM.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.EZpvd(this.AEQbTJ, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<BotAggregatedInfoBean> tradeLiveDataDjBIcL = ((BotGuideSpotGridPresenter) dxcTrN()).djBIcL();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.AEQbTJ(this.KWHzl, (BotAggregatedInfoBean) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataValues = ((BotGuideSpotGridPresenter) dxcTrN()).values();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataValues.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.wLg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.copydefault(this.EZpvd, (MinInvestResp) obj);
            }
        }));
        ((BotGuideSpotGridPresenter) dxcTrN()).KWHzl().observe(this, new ActionBar(new Function1() { // from class: o.wLi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        ((BotGuideSpotGridPresenter) dxcTrN()).AkhnZx().observe(this, new ActionBar(new Function1() { // from class: o.wLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        }));
        ((BotGuideSpotGridPresenter) dxcTrN()).getAggregateErrorLiveData().observe(this, new ActionBar(new Function1() { // from class: o.wLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.EZpvd(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        ((BotGuideSpotGridPresenter) dxcTrN()).AuCTel().AkhnZx().observe(this, new ActionBar(new Function1() { // from class: o.wLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        ((BotGuideSpotGridPresenter) dxcTrN()).fIwbmz().observe(this, new ActionBar(new Function1() { // from class: o.wLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.OLrzqt(this.EZpvd, (StrategyResponse) obj);
            }
        }));
        C56111xwe<LossInsuranceDisplayData> c56111xweIsConnected = ((BotGuideSpotGridPresenter) dxcTrN()).isConnected();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweIsConnected.observe(viewLifecycleOwner4, new ActionBar(new Function1() { // from class: o.wLm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.EZpvd(this.OLrzqt, (LossInsuranceDisplayData) obj);
            }
        }));
        C56111xwe<java.util.List<BotGuideCoinItem>> c56111xweEjfBZ = ((BotGuideSpotGridPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweEjfBZ.observe(viewLifecycleOwner5, new ActionBar(new Function1() { // from class: o.wLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52435wLh.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6), null, null, new BotGuideSpotGridFragment$subscribeOnUIChange$11(this, null), 3, null);
    }

    public static final Unit EZpvd(C52435wLh c52435wLh, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c52435wLh.fIwbmz();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52435wLh c52435wLh, BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        ((AbstractC48324uNg) c52435wLh.gGvvIC()).valueOf.copydefault(((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).copydefault(botAggregatedInfoBean));
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.TRUE, null));
        c52435wLh.dismissLoading();
        BotGuideSpotGridPresenter.refreshParams$default((BotGuideSpotGridPresenter) c52435wLh.dxcTrN(), botAggregatedInfoBean, null, 2, null);
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).sSMYrx();
        c52435wLh.OLrzqt(botAggregatedInfoBean);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52435wLh c52435wLh, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        C47988uAv.setInputLabel$default(((AbstractC48324uNg) c52435wLh.gGvvIC()).AYXKKw, "> " + xMR.copydefault.copydefault(minInvestResp.getMinQuoteSz()), null, 2, null);
        c52435wLh.djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52435wLh c52435wLh, java.util.List list) {
        ((AbstractC48324uNg) c52435wLh.gGvvIC()).AhwBna.setData(((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).gEmmrt());
        C43316rmw c43316rmwAkhnZx = c52435wLh.AkhnZx();
        Intrinsics.copydefault(list);
        C33064mpR.OLrzqt(c43316rmwAkhnZx, (java.util.List<? extends java.lang.Object>) list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52435wLh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52435wLh c52435wLh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC48324uNg) c52435wLh.gGvvIC()).EZpvd.setFooterAvaValue(xMO.KWHzl.AEQbTJ(xMR.copydefault.copydefault(str, ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).hDKMBd()), ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AhwBna().getInvestSymbol()));
        c52435wLh.djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52435wLh c52435wLh, androidx.core.util.Pair pair) {
        java.lang.String message;
        pUU.copydefault(c52435wLh.getTAG(), pair.first + " request failed cause by " + ((java.lang.Exception) pair.second).getMessage());
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).zLjUOn().bB_())) {
            ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.FALSE, pair.second));
            c52435wLh.dismissLoading();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52435wLh, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AuCTel().bB_())) {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).valueOf().bB_())) {
            ((AbstractC48324uNg) c52435wLh.gGvvIC()).EZpvd.setFooterAvaValue("--");
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).fetchVPNInfo().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52435wLh c52435wLh, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c52435wLh.showLoading();
        } else {
            c52435wLh.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52435wLh c52435wLh, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        android.content.Context context = c52435wLh.getContext();
        if (context != null) {
            ActivityC51150vhb.Companion.AEQbTJ(context, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AhwBna().getOrdType(), (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52435wLh c52435wLh, LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        c52435wLh.fetchVPNInfo();
        ((AbstractC48324uNg) c52435wLh.gGvvIC()).gEmmrt.setData(lossInsuranceDisplayData);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final C52435wLh c52435wLh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list) && list.size() > 1) {
            ((AbstractC48324uNg) c52435wLh.gGvvIC()).valueOf.setCoinSwitchEnable(new Function0() { // from class: o.wLq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52435wLh.gEmmrt(this.EZpvd);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C52435wLh c52435wLh) {
        FragmentKt.setFragmentResult(c52435wLh, "key_switch_coin", new android.os.Bundle());
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.wLj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52435wLh.EZpvd(this.KWHzl, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("invest_type_select", this, new FragmentResultListener() { // from class: o.wLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52435wLh.KWHzl(this.OLrzqt, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C52435wLh c52435wLh, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AxsJAY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C52435wLh c52435wLh, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AbstractC48324uNg abstractC48324uNg = (AbstractC48324uNg) c52435wLh.gGvvIC();
        abstractC48324uNg.AYXKKw.setInputUnit(((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AhwBna().getInvestSymbol());
        abstractC48324uNg.AYXKKw.setMaxDecimal(((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).hDKMBd());
        abstractC48324uNg.EZpvd.setTransferCoin(((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).AhwBna().getInvestSymbol());
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).QOLQEE();
        ((BotGuideSpotGridPresenter) c52435wLh.dxcTrN()).zuBGHE();
    }

    public final void djBIcL() {
        fetchVPNInfo();
        checkInvestAmtIsValid$default(this, false, 1, null);
        fJNWhG();
        gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        StrategyConfigInfo value = ((BotGuideSpotGridPresenter) dxcTrN()).wlaJM().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((AbstractC48324uNg) gGvvIC()).isConnected;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.copydefault(c54154wyx, value);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        C47988uAv.setInputContent$default(((AbstractC48324uNg) gGvvIC()).AYXKKw, ((BotGuideSpotGridPresenter) dxcTrN()).AYXKKw(), false, false, 6, null);
        ((BotGuideSpotGridPresenter) dxcTrN()).EZpvd(((AbstractC48324uNg) gGvvIC()).AYXKKw.AkhnZx());
    }

    public static /* synthetic */ boolean checkInvestAmtIsValid$default(C52435wLh c52435wLh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c52435wLh.AEQbTJ(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AEQbTJ(boolean z) {
        java.lang.String strCopydefault = ((BotGuideSpotGridPresenter) dxcTrN()).copydefault(z);
        pUU.EZpvd(getTAG(), "checkInvestAmtIsValid error msg = " + strCopydefault);
        boolean z2 = strCopydefault.length() == 0;
        if (z2) {
            ((AbstractC48324uNg) gGvvIC()).AYXKKw.copydefault();
        } else {
            ((AbstractC48324uNg) gGvvIC()).AYXKKw.setInputErrorMsg(strCopydefault);
        }
        return z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        ((AbstractC48324uNg) gGvvIC()).djBIcL.setVisibility(C33129mqd.AEQbTJ(((BotGuideSpotGridPresenter) dxcTrN()).getNewProxyInstance(), ((BotGuideSpotGridPresenter) dxcTrN()).getFieldNames()) ? 0 : 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void gEmmrt() {
        boolean z;
        AbstractC48324uNg abstractC48324uNg = (AbstractC48324uNg) gGvvIC();
        BotGuideSpotGridPresenter botGuideSpotGridPresenter = (BotGuideSpotGridPresenter) dxcTrN();
        java.lang.String newProxyInstance = ((BotGuideSpotGridPresenter) dxcTrN()).getNewProxyInstance();
        if (newProxyInstance == null || newProxyInstance.length() == 0 || abstractC48324uNg.AYXKKw.getFieldNames()) {
            z = false;
        } else {
            AppCompatTextView appCompatTextView = abstractC48324uNg.djBIcL;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            if (appCompatTextView.getVisibility() != 0) {
                z = true;
            }
        }
        botGuideSpotGridPresenter.OLrzqt(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(BotAggregatedInfoBean botAggregatedInfoBean) {
        java.lang.String voucherCcy;
        java.lang.String voucherValue;
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if ((voucherInformation != null ? voucherInformation.getVoucherType() : null) == TacticsVoucherType.AIRDROP) {
            AbstractC48324uNg abstractC48324uNg = (AbstractC48324uNg) gGvvIC();
            ConstraintLayout constraintLayout = abstractC48324uNg.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = abstractC48324uNg.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            AppCompatTextView appCompatTextView = abstractC48324uNg.AEQbTJ;
            LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
            java.lang.String str = "--";
            if (voucherInformation2 != null && voucherInformation2.getVoucherVisible()) {
                xMR xmr = xMR.copydefault;
                LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation3 != null && (voucherValue = voucherInformation3.getVoucherValue()) != null) {
                    str = voucherValue;
                }
                java.lang.String strCopydefault = xmr.copydefault(str);
                LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation4 == null || (voucherCcy = voucherInformation4.getVoucherCcy()) == null) {
                    voucherCcy = "USDT";
                }
                str = strCopydefault + " " + voucherCcy;
            }
            appCompatTextView.setText(str);
            C55258xgZ c55258xgZ = abstractC48324uNg.copydefault;
            c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        }
    }
}
