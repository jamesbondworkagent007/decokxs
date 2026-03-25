package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.bot.BotKLineFullScreenFragment$setBotOrdersData$1;
import com.okinc.kline.ui.bot.KlineBotViewModel;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C39339pqT;
import o.C39358pqm;
import o.InterfaceC39274ppH;
import o.InterfaceC39563puh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38962pjN extends oYA implements InterfaceC35972oKn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int hBpjJd = 8;
    public final InterfaceC56387yDm RdAHlO;
    public AbstractC36029oMq dHguZz;

    /* JADX INFO: renamed from: o.pjN$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    @Override // o.InterfaceC36340oYd
    public void KWHzl(java.lang.String str) {
    }

    @Override // o.oYA
    public boolean ODWQjV() {
        return true;
    }

    @Override // o.oYA
    public void accept() {
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.getFieldNames;
    }

    public C38962pjN() {
        final Function0 function0 = null;
        this.RdAHlO = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineBotViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.bot.BotKLineFullScreenFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.bot.BotKLineFullScreenFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.bot.BotKLineFullScreenFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.oYA.OFhtUX()V */
    public final KlineBotViewModel OFhtUX() {
        return (KlineBotViewModel) this.RdAHlO.getValue();
    }

    /* JADX INFO: renamed from: o.pjN$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pjN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C38962pjN copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C38962pjN c38962pjN = new C38962pjN();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            c38962pjN.setArguments(bundle);
            return c38962pjN;
        }
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.dHguZz = null;
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.OLrzqt(AxsJAYaxsJAY());
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        EZpvd(C36312oXc.AEQbTJ(QVAiDq()));
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.setCurrentStateMachine(RcXXUw());
        }
    }

    @Override // o.oYA, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        pFN pfn = pFN.OLrzqt;
        C37830pCg c37830pCg = C37830pCg.EZpvd;
        java.lang.String strCopydefault = c37830pCg.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        pfn.EZpvd(strCopydefault, c37830pCg);
        djBIcL(true);
        super.initView(view, bundle);
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.setChartHistoryOrder(false);
        }
        this.dHguZz = (AbstractC36029oMq) DataBindingUtil.bind(view);
        oWN.KWHzl(C33570myu.djBIcL(ejfBZ()));
        OJuSTm();
        if (QbewEr() != null) {
            AEQbTJ(true);
            QSLkRj();
        }
        OxVOHk();
    }

    @Override // o.oYA
    public void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        C36250oUv c36250oUvFIwbmz;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (QbewEr() != null) {
            if (abstractC54531xLw != null) {
                MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
                java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null && (c36250oUvFIwbmz = fIwbmz()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setAmountDisplaySymbol(C33129mqd.gEmmrt(bizInstrumentValueOf.getTradeSymbol()));
                    chartViewOutSideConfigAkhnZx.setTurnoverDisplaySymbol(C33129mqd.gEmmrt(bizInstrumentValueOf.getQuoteSymbol()));
                    chartViewOutSideConfigAkhnZx.setTradeSymbol(bizInstrumentValueOf.getTradeSymbol());
                }
            }
            C36250oUv c36250oUvQVAiDq = QVAiDq();
            TemplateSetting templateSettingWlaJM = c36250oUvQVAiDq != null ? c36250oUvQVAiDq.wlaJM() : null;
            Intrinsics.copydefault(templateSettingWlaJM);
            OLrzqt(templateSettingWlaJM);
            DarRvM();
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = dNCPSb();
            if (stateListAnimatorDNCPSb != null) {
                stateListAnimatorDNCPSb.AEQbTJ(abstractC54531xLw);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb2 = dNCPSb();
            if (stateListAnimatorDNCPSb2 != null) {
                MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
                Intrinsics.copydefault(marketCoinInfoQbewEr2);
                stateListAnimatorDNCPSb2.AEQbTJ(marketCoinInfoQbewEr2);
            }
            QHmsKR();
            QOLQEE().OLrzqt("TYPE_KLINE");
            C36250oUv c36250oUvFIwbmz2 = fIwbmz();
            if (c36250oUvFIwbmz2 != null) {
                c36250oUvFIwbmz2.AEQbTJ();
            }
            TemplateSetting templateSettingGiSNqX = giSNqX();
            if (templateSettingGiSNqX != null) {
                final int sPTimeInterval = templateSettingGiSNqX.getSPTimeInterval();
                C36250oUv c36250oUvFIwbmz3 = fIwbmz();
                if (c36250oUvFIwbmz3 != null) {
                    c36250oUvFIwbmz3.AYXKKw();
                }
                RdAHlO();
                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb3 = dNCPSb();
                if (stateListAnimatorDNCPSb3 != null) {
                    InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimatorDNCPSb3, this, sPTimeInterval, sPTimeInterval != -2, false, new Function1() { // from class: o.pjS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C38962pjN.OLrzqt(sPTimeInterval, this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    }, 8, null);
                }
                if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && ODWQjV()) {
                    java.lang.String string = SPUtils.getString("kline_indicator_version", "0");
                    InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb4 = dNCPSb();
                    if (stateListAnimatorDNCPSb4 != null) {
                        Intrinsics.copydefault((java.lang.Object) string);
                        stateListAnimatorDNCPSb4.copydefault(this, "ALL", string);
                    }
                }
            }
        }
    }

    public static final Unit OLrzqt(int i, C38962pjN c38962pjN, boolean z) {
        C36250oUv c36250oUvQVAiDq;
        MarketCoinInfo marketCoinInfoQbewEr;
        if (z && i != -2 && (c36250oUvQVAiDq = c38962pjN.QVAiDq()) != null && (marketCoinInfoQbewEr = c38962pjN.QbewEr()) != null) {
            InterfaceC39274ppH.ActionBar.getDrawingData$default(c38962pjN.zsXlph(), c36250oUvQVAiDq, marketCoinInfoQbewEr.getInstrumentId(), c38962pjN, false, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pjN$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C38962pjN EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C38962pjN c38962pjN) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c38962pjN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C39402pre c39402preQKudOq = this.EZpvd.QKudOq();
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                if (c39402preQKudOq != null) {
                    c39402preQKudOq.show(supportFragmentManager, C38962pjN.class.getSimpleName());
                }
                this.EZpvd.copydefault(false);
            }
        }
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        java.util.List<java.lang.String> listAhwBna;
        Intrinsics.checkNotNullParameter(list, "");
        C39263pox c39263poxAxsJAY = AxsJAY();
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX == null || (listAhwBna = templateSettingGiSNqX.getSideIndicatorNames()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List<java.lang.String> list2 = listAhwBna;
        java.lang.String strOcIXYQ = OcIXYQ();
        java.lang.String strORxRYg = ORxRYg();
        TemplateSetting templateSettingGiSNqX2 = giSNqX();
        c39263poxAxsJAY.OLrzqt(this, list2, strOcIXYQ, strORxRYg, templateSettingGiSNqX2 != null ? templateSettingGiSNqX2.getSPTimeInterval() : 0);
    }

    private final void OxVOHk() {
        C37979pHu c37979pHu = C37979pHu.AEQbTJ;
        c37979pHu.OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.pjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.AYXKKw(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.pjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.gEmmrt(this.copydefault, (java.util.List) obj);
            }
        }));
        c37979pHu.KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.pjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.valueOf(this.OLrzqt, (java.util.List) obj);
            }
        }));
        c37979pHu.copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.pjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.AhwBna(this.copydefault, (java.util.List) obj);
            }
        }));
        c37979pHu.EZpvd().observe(this, new TaskDescription(new Function1() { // from class: o.pjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.djBIcL(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    public static final Unit AYXKKw(C38962pjN c38962pjN, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "OI");
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C38962pjN c38962pjN, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSAcco");
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C38962pjN c38962pjN, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSRatio");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C38962pjN c38962pjN, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSPos");
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C38962pjN c38962pjN, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "BSVol");
        }
        return Unit.INSTANCE;
    }

    private final void OJuSTm() {
        C55173xeu c55173xeu;
        AbstractC36029oMq abstractC36029oMq = this.dHguZz;
        if (abstractC36029oMq != null && (c55173xeu = abstractC36029oMq.gEmmrt) != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pjU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38962pjN.copydefault(this.OLrzqt, view);
                }
            });
        }
        android.widget.TextView textViewGkJEwt = gkJEwt();
        if (textViewGkJEwt != null) {
            textViewGkJEwt.setOnClickListener(new Activity(textViewGkJEwt, 1000L, this));
        }
    }

    public static final void copydefault(C38962pjN c38962pjN, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        if (c38962pjN.QbewEr() != null) {
            AbstractC36029oMq abstractC36029oMq = c38962pjN.dHguZz;
            if (abstractC36029oMq != null && (linearLayout = abstractC36029oMq.AEQbTJ) != null) {
                linearLayout.setVisibility(8);
            }
            c38962pjN.onResume();
        }
    }

    private final void QSLkRj() {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            OLrzqt(c36250oUvQVAiDq);
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
            c36250oUvQVAiDq.AkhnZx().setBotKLine(true);
            c36250oUvQVAiDq.setIsSupportDoubleClick(false);
            c36250oUvQVAiDq.AkhnZx().setScreen(false);
            c36250oUvQVAiDq.AkhnZx().setChartMode(1);
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                chartViewOutSideConfigAkhnZx.setPortraitChart(true);
            }
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx();
            if (chartViewOutSideConfigAkhnZx2 != null) {
                chartViewOutSideConfigAkhnZx2.setFullScreenMode(true);
            }
        }
        AbstractC36029oMq abstractC36029oMq = this.dHguZz;
        if (abstractC36029oMq != null && (c39828pzh = abstractC36029oMq.OLrzqt) != null) {
            c39828pzh.setOnItemSelectListener(new Function1() { // from class: o.pjO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38962pjN.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        TemplateSetting templateSettingWlaJM = c36250oUvQVAiDq2 != null ? c36250oUvQVAiDq2.wlaJM() : null;
        if (templateSettingWlaJM != null) {
            java.util.ArrayList<java.lang.String> mainIndicatorNames = templateSettingWlaJM.getMainIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(mainIndicatorNames, "");
            java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
            KWHzl(mainIndicatorNames, sideIndicatorNames);
        }
    }

    public static final Unit copydefault(C38962pjN c38962pjN, int i) {
        c38962pjN.djBIcL(i);
        return Unit.INSTANCE;
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C36246oUr.copydefault().isConnected(str);
    }

    @Override // o.oYA
    public void DarRvM() {
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            copydefault(c36250oUvQVAiDq);
        }
    }

    private final void djBIcL(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        if (i == 4) {
            QVsKAR();
            C37908pFd.EZpvd(true);
            return;
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) == null) {
            return;
        }
        TimeIntervalItem timeIntervalItem = arrayListKWHzl.get(i);
        Intrinsics.checkNotNullExpressionValue(timeIntervalItem, "");
        oYA.changeTime$default(this, c36250oUvQVAiDq, timeIntervalItem, false, 4, null);
        C37908pFd.OLrzqt(arrayListKWHzl.get(i).getTradingType(), true);
    }

    @Override // o.oYA
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        C36250oUv c36250oUvQVAiDq;
        java.lang.Integer numValueOf;
        C36250oUv c36250oUvQVAiDq2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            C36250oUv c36250oUvQVAiDq3 = QVAiDq();
            if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq3 == null || (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq3.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx3.getCurrentMode()), (java.lang.Object) "YScale")) {
                C36250oUv c36250oUvQVAiDq4 = QVAiDq();
                if (c36250oUvQVAiDq4 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq4.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx2.setNeedUpdateInYScale(true);
                }
                C36250oUv c36250oUvQVAiDq5 = QVAiDq();
                if (c36250oUvQVAiDq5 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq5.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setMoveInterceptMode(" YUPDOWNMOVE");
                }
            }
            java.util.ArrayList<IndicatorDataReq> arrayList = new java.util.ArrayList<>();
            if (z) {
                int size = templateSettingGiSNqX.getSideIndicatorNames().size();
                if (size >= 4) {
                    java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingGiSNqX.getSideIndicatorNames();
                    Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
                    java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(sideIndicatorNames);
                    if (str2 == null) {
                        str2 = "";
                    }
                    IndicatorDataReq indicatorDataReqCopydefault = copydefault(str2, false, false);
                    if (indicatorDataReqCopydefault != null) {
                        arrayList.add(indicatorDataReqCopydefault);
                    }
                }
                templateSettingGiSNqX.addSideIndicator(str);
                C36250oUv c36250oUvQVAiDq6 = QVAiDq();
                if (c36250oUvQVAiDq6 != null) {
                    c36250oUvQVAiDq6.copydefault(str);
                }
                C39263pox c39263poxAxsJAY = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames2 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames2, "");
                c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames2, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (size < 4 && DXXBbs() && (c36250oUvQVAiDq2 = QVAiDq()) != null) {
                    C36250oUv c36250oUvQVAiDq7 = QVAiDq();
                    numValueOf = c36250oUvQVAiDq7 != null ? java.lang.Integer.valueOf(c36250oUvQVAiDq7.getMinimumHeight() + C36246oUr.copydefault().accept()) : null;
                    Intrinsics.copydefault(numValueOf);
                    c36250oUvQVAiDq2.setMinimumHeight(numValueOf.intValue());
                }
            } else {
                templateSettingGiSNqX.removeSideIndicator(str);
                C36250oUv c36250oUvQVAiDq8 = QVAiDq();
                if (c36250oUvQVAiDq8 != null) {
                    c36250oUvQVAiDq8.gEmmrt(str);
                }
                C39263pox c39263poxAxsJAY2 = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames3 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames3, "");
                c39263poxAxsJAY2.OLrzqt(this, sideIndicatorNames3, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (DXXBbs() && (c36250oUvQVAiDq = QVAiDq()) != null) {
                    C36250oUv c36250oUvQVAiDq9 = QVAiDq();
                    numValueOf = c36250oUvQVAiDq9 != null ? java.lang.Integer.valueOf(c36250oUvQVAiDq9.getMinimumHeight() - C36246oUr.copydefault().accept()) : null;
                    Intrinsics.copydefault(numValueOf);
                    c36250oUvQVAiDq.setMinimumHeight(numValueOf.intValue());
                }
            }
            if (z) {
                IndicatorDataReq indicatorDataReqCopydefault2 = copydefault(str, true, false);
                if (indicatorDataReqCopydefault2 != null) {
                    arrayList.add(indicatorDataReqCopydefault2);
                }
                AhwBna(arrayList);
            }
        }
    }

    @Override // o.oYA
    public void hUfVAv() {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.QfsBiF();
        }
        AbstractC36029oMq abstractC36029oMq = this.dHguZz;
        if (abstractC36029oMq == null || (c39828pzh = abstractC36029oMq.OLrzqt) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        android.widget.LinearLayout linearLayout;
        AbstractC36029oMq abstractC36029oMq = this.dHguZz;
        if (abstractC36029oMq != null && (linearLayout = abstractC36029oMq.AEQbTJ) != null) {
            linearLayout.setVisibility(0);
        }
        AkhnZx();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AkhnZx();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.AEQbTJ(list);
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.setShowEmptyUi(false);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.KWHzl(list);
        }
    }

    @Override // o.oYA
    public void EZpvd(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        copydefault(marketCoinInfo);
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        AEQbTJ(marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null);
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        AhwBna(marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null);
    }

    private final void QVsKAR() {
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, true, false, 2, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.pjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.copydefault(this.OLrzqt, (MarketTypeSelect) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = C38962pjN.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39339pqTNewInstance$default.EZpvd(childFragmentManager, simpleName);
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pkb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C38962pjN.AEQbTJ(this.KWHzl, dialogInterface);
            }
        });
    }

    public static final Unit copydefault(C38962pjN c38962pjN, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            java.lang.Object data = marketTypeSelect.getData();
            Intrinsics.copydefault(data, "");
            oYA.changeTime$default(c38962pjN, c36250oUvQVAiDq, (TimeIntervalItem) data, false, 4, null);
            java.lang.Object data2 = marketTypeSelect.getData();
            Intrinsics.copydefault(data2, "");
            C37908pFd.OLrzqt(((TimeIntervalItem) data2).getTradingType(), true);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C38962pjN c38962pjN, android.content.DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        AbstractC36029oMq abstractC36029oMq = c38962pjN.dHguZz;
        if (abstractC36029oMq == null || (c39828pzh = abstractC36029oMq.OLrzqt) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.InterfaceC35972oKn
    public void OLrzqt() {
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX == null || templateSettingGiSNqX.getSideIndicatorNames() == null) {
            return;
        }
        C39358pqm.TaskDescription taskDescription = C39358pqm.Companion;
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        C39358pqm c39358pqmNewInstance$default = C39358pqm.TaskDescription.newInstance$default(taskDescription, false, strORxRYg, 1, null);
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.pjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38962pjN.OLrzqt(this.AEQbTJ, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C38962pjN.KWHzl(this.AEQbTJ, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = C38962pjN.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(childFragmentManager, simpleName);
    }

    public static final Unit OLrzqt(C38962pjN c38962pjN, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME") && !Intrinsics.EZpvd((java.lang.Object) c38962pjN.aKErDB(), (java.lang.Object) "TYPE_KLINE")) {
            return Unit.INSTANCE;
        }
        C36250oUv c36250oUvQVAiDq = c38962pjN.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c38962pjN.KWHzl(c36250oUvQVAiDq, marketTypeSelect);
        }
        C37908pFd.indicatorSelectFragmentEvent$default(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0, true, null, 16, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C38962pjN c38962pjN, android.content.DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQVAiDq2 = c38962pjN.QVAiDq();
        if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getCurrentMode()), (java.lang.Object) "YScale") && (c36250oUvQVAiDq = c38962pjN.QVAiDq()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setNeedUpdateInYScale(false);
        }
        AbstractC36029oMq abstractC36029oMq = c38962pjN.dHguZz;
        if (abstractC36029oMq == null || (c39828pzh = abstractC36029oMq.OLrzqt) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.InterfaceC35972oKn
    public void EZpvd(@NotNull IBotOrdersDataBean iBotOrdersDataBean) {
        Intrinsics.checkNotNullParameter(iBotOrdersDataBean, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotKLineFullScreenFragment$setBotOrdersData$1(this, iBotOrdersDataBean, null), 3, null);
    }
}
