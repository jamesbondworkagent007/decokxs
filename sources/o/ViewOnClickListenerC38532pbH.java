package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.CompareCandlesItem;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.KLineCompareFullScreenFragment$getCompareIconBitmap$1;
import com.okinc.kline.ui.KLineCompareFullScreenFragment$setCompareBitmap$1;
import com.okinc.kline.ui.KLineCompareFullScreenFragment$setMarketOptionState$1$2$2;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C36250oUv;
import o.C39339pqT;
import o.C39358pqm;
import o.C52761wXj;
import o.InterfaceC39563puh;
import o.InterfaceC43294rma;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC38532pbH extends oYA implements InterfaceC39502ptZ, View.OnClickListener {
    public static final Activity Companion = new Activity(null);
    public static final int dHguZz = 8;
    public int DLWbHP;
    public java.lang.String ODXsMY;
    public AbstractC36036oMx OHqIaq;
    public java.lang.String RdAHlO;
    public java.util.ArrayList<MarketCoinInfo> gwTjWJ;
    public final int hBpjJd = C55298xhM.dp2px$default(12.0f, null, 1, null);
    public boolean hrNTAI;

    /* JADX INFO: renamed from: o.pbH$StateListAnimator */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    @Override // o.InterfaceC39502ptZ
    public void AkhnZx(boolean z) {
    }

    @Override // o.InterfaceC39502ptZ
    public void KWHzl(int i, boolean z) {
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC36340oYd
    public void KWHzl(java.lang.String str) {
    }

    @Override // o.oYA
    public boolean ODWQjV() {
        return true;
    }

    @Override // o.InterfaceC39502ptZ
    public void OFhtUX() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OxVOHk() {
        this.hrNTAI = true;
    }

    @Override // o.InterfaceC39502ptZ
    public void QSLkRj() {
    }

    @Override // o.oYA
    public void accept() {
    }

    @Override // o.InterfaceC39502ptZ
    public void dUDNAs() {
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.ORxRYg;
    }

    @Override // o.InterfaceC39502ptZ
    public void isConnected(boolean z) {
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
    }

    /* JADX INFO: renamed from: o.pbH$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pbH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ViewOnClickListenerC38532pbH EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList, java.lang.String str3, boolean z, boolean z2, java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH = new ViewOnClickListenerC38532pbH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putParcelableArrayList("data", arrayList);
            bundle.putString("from", str3);
            bundle.putBoolean(viewOnClickListenerC38532pbH.wlaJM(), z);
            bundle.putBoolean("is_CR_Mode", z2);
            bundle.putString("from_scene", str4);
            viewOnClickListenerC38532pbH.setArguments(bundle);
            return viewOnClickListenerC38532pbH;
        }
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLineCompareFullScreenFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onVisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        super.onVisible();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setPortraitChart(true);
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setFullScreenMode(true);
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        EZpvd(C36312oXc.AEQbTJ(QVAiDq()));
        C36250oUv c36250oUvQVAiDq3 = QVAiDq();
        if (c36250oUvQVAiDq3 != null) {
            c36250oUvQVAiDq3.setCurrentStateMachine(RcXXUw());
        }
        C36312oXc c36312oXcRcXXUw = RcXXUw();
        if (c36312oXcRcXXUw != null) {
            c36312oXcRcXXUw.EZpvd(c36312oXcRcXXUw.zLjUOn);
        }
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onInvisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        if (this.hrNTAI) {
            C36250oUv c36250oUvQVAiDq = QVAiDq();
            if (c36250oUvQVAiDq != null && (mapEjfBZ = c36250oUvQVAiDq.ejfBZ()) != null) {
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUvQVAiDq2 != null ? c36250oUvQVAiDq2.fIwbmz() : null);
                if (dataSource != null) {
                    dataSource.KWHzl();
                }
            }
            C36250oUv c36250oUvQVAiDq3 = QVAiDq();
            if (c36250oUvQVAiDq3 != null) {
                c36250oUvQVAiDq3.djSkpj();
            }
            C36250oUv c36250oUvQVAiDq4 = QVAiDq();
            if (c36250oUvQVAiDq4 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq4.AkhnZx()) == null) {
                return;
            }
            chartViewOutSideConfigAkhnZx.setCompareBitmapList(yDY.AhwBna());
        }
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.djSkpj();
        }
        this.OHqIaq = null;
    }

    @Override // o.oYA, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna(true);
        super.initView(view, bundle);
        this.OHqIaq = (AbstractC36036oMx) DataBindingUtil.bind(view);
        android.os.Bundle arguments = getArguments();
        this.ODXsMY = arguments != null ? arguments.getString("from") : null;
        android.os.Bundle arguments2 = getArguments();
        this.RdAHlO = arguments2 != null ? arguments2.getString("from_scene") : null;
        android.os.Bundle arguments3 = getArguments();
        this.gwTjWJ = arguments3 != null ? arguments3.getParcelableArrayList("data") : null;
        htlTjW();
        oWN.KWHzl(C57676yms.AEQbTJ(ejfBZ()));
        QwvEab();
        igXuih();
        AuCTel(SPUtils.getBoolean("trade_button_left", true));
        if (QbewEr() != null) {
            fjfviF();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
                AkhnZx(true);
            } else {
                AkhnZx(false);
            }
        }
        QVsKAR();
    }

    @Override // o.oYA
    public void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C39756pyO c39756pyOSSMYrx;
        C36250oUv c36250oUvFIwbmz;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (QbewEr() != null) {
            if (abstractC54531xLw != null) {
                MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
                java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                Intrinsics.copydefault((java.lang.Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null && (c36250oUvFIwbmz = fIwbmz()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvFIwbmz.AkhnZx()) != null) {
                    C36246oUr.copydefault(pDX.KWHzl());
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
            TemplateSetting templateSettingGiSNqX = giSNqX();
            if (templateSettingGiSNqX != null && (sideIndicatorNames = templateSettingGiSNqX.getSideIndicatorNames()) != null && (c39756pyOSSMYrx = sSMYrx()) != null) {
                c39756pyOSSMYrx.setSideIndicators(sideIndicatorNames);
            }
            AuCTel();
        }
    }

    @Override // o.oYA
    public void AuCTel() {
        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb;
        C36250oUv c36250oUvFIwbmz = fIwbmz();
        if (c36250oUvFIwbmz != null) {
            c36250oUvFIwbmz.AEQbTJ();
        }
        C36250oUv c36250oUvFIwbmz2 = fIwbmz();
        if (c36250oUvFIwbmz2 != null) {
            c36250oUvFIwbmz2.AYXKKw();
        }
        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb2 = dNCPSb();
        if (stateListAnimatorDNCPSb2 != null) {
            stateListAnimatorDNCPSb2.EZpvd();
        }
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            int sPTimeInterval = templateSettingGiSNqX.getSPTimeInterval();
            if (sPTimeInterval == 0) {
                C36250oUv c36250oUvQVAiDq = QVAiDq();
                if (c36250oUvQVAiDq != null) {
                    c36250oUvQVAiDq.djSkpj();
                }
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                if (c36250oUvQVAiDq2 != null) {
                    c36250oUvQVAiDq2.setShowEmptyUi(true);
                }
                OJuSTm();
                return;
            }
            RdAHlO();
            final java.util.ArrayList<MarketCoinInfo> arrayList = this.gwTjWJ;
            if (arrayList == null || (stateListAnimatorDNCPSb = dNCPSb()) == null) {
                return;
            }
            stateListAnimatorDNCPSb.KWHzl((LifecycleOwner) this, arrayList, sPTimeInterval, true, new Function1() { // from class: o.pbY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38532pbH.AEQbTJ(this.copydefault, arrayList, (java.util.ArrayList) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            viewOnClickListenerC38532pbH.gEmmrt((java.util.ArrayList<CompareCandlesItem>) arrayList2);
            java.util.ArrayList<MarketCoinInfo> arrayList3 = viewOnClickListenerC38532pbH.gwTjWJ;
            if (arrayList3 != null) {
                C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
                if (c36250oUvQVAiDq != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                    java.util.Iterator<T> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((MarketCoinInfo) it.next()).getInstrumentId());
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        MarketCoinInfo marketCoinInfo = (MarketCoinInfo) it2.next();
                        arrayList5.add(C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), false, false, viewOnClickListenerC38532pbH.ejfBZ(), false, false, 108, null));
                    }
                    c36250oUvQVAiDq.setCompareIndicator(arrayList4, arrayList5);
                }
                viewOnClickListenerC38532pbH.USBtdM();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.oYA
    public void fJNWhG() {
        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb;
        java.lang.String strGEmmrt;
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            int sPTimeInterval = templateSettingGiSNqX.getSPTimeInterval();
            java.util.ArrayList<MarketCoinInfo> arrayList = this.gwTjWJ;
            if (arrayList == null || (stateListAnimatorDNCPSb = dNCPSb()) == null) {
                return;
            }
            C36250oUv c36250oUvQVAiDq = QVAiDq();
            if (c36250oUvQVAiDq == null || (strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUvQVAiDq.fARcdN()))) == null) {
                strGEmmrt = "";
            }
            stateListAnimatorDNCPSb.OLrzqt(this, arrayList, sPTimeInterval, strGEmmrt);
        }
    }

    public final void OJuSTm() {
        AkhnZx();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ActivityC38783pfu activityC38783pfu = activity instanceof ActivityC38783pfu ? (ActivityC38783pfu) activity : null;
            if (activityC38783pfu != null) {
                activityC38783pfu.EZpvd();
            }
        }
    }

    public final void USBtdM() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineCompareFullScreenFragment$setCompareBitmap$1(this, null), 3, null);
    }

    public final void QVsKAR() {
        C37979pHu c37979pHu = C37979pHu.AEQbTJ;
        c37979pHu.OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.pbI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.valueOf(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.pbK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.AhwBna(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.KWHzl().observe(this, new StateListAnimator(new Function1() { // from class: o.pbS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.gEmmrt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c37979pHu.copydefault().observe(this, new StateListAnimator(new Function1() { // from class: o.pbV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.AYXKKw(this.copydefault, (java.util.List) obj);
            }
        }));
        c37979pHu.EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.pbZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.isConnected(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit valueOf(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "OI");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSAcco");
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSRatio");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSPos");
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.List list) {
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "BSVol");
        }
        return Unit.INSTANCE;
    }

    public void QwvEab() {
        C57585ylG c57585ylG;
        C57585ylG c57585ylG2;
        InterfaceC54577xNn interfaceC54577xNn;
        C57585ylG c57585ylG3;
        if (!QKVWgx()) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
                AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
                if (abstractC36036oMx != null && (c57585ylG2 = abstractC36036oMx.isConnected) != null) {
                    c57585ylG2.setVisibility(8);
                }
            } else {
                AbstractC36036oMx abstractC36036oMx2 = this.OHqIaq;
                if (abstractC36036oMx2 != null && (c57585ylG3 = abstractC36036oMx2.isConnected) != null) {
                    c57585ylG3.setVisibility(0);
                }
            }
        }
        AbstractC36036oMx abstractC36036oMx3 = this.OHqIaq;
        if (abstractC36036oMx3 == null || (c57585ylG = abstractC36036oMx3.isConnected) == null) {
            return;
        }
        java.lang.String string = getString(C35964oKf.Fragment.fHqPtx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C35964oKf.Fragment.gGvvIC);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c57585ylG.setText(string, string2);
        c57585ylG.setUserIconClick(new Function0() { // from class: o.pce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC38532pbH.OLrzqt(this.copydefault);
            }
        });
        c57585ylG.setOnRealChangeClick(new Function0() { // from class: o.pcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC38532pbH.AhwBna(this.KWHzl);
            }
        });
    }

    public static final Unit OLrzqt(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH) {
        C32866mlf.onEvent$default("app_demo_trading_header_user_center_click", (TrackChannel[]) null, new Function1() { // from class: o.pbU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.AuCTel((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC35160nqA interfaceC35160nqA = (InterfaceC35160nqA) C43251rlk.OLrzqt(InterfaceC35160nqA.class);
        if (interfaceC35160nqA != null) {
            FragmentActivity fragmentActivityRequireActivity = viewOnClickListenerC38532pbH.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC35160nqA.KWHzl(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "home", false);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH) {
        C32866mlf.onEvent$default("app_demo_trading_header_switch_mode_click", (TrackChannel[]) null, new Function1() { // from class: o.pbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.fARcdN((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        viewOnClickListenerC38532pbH.showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC38532pbH), null, null, new KLineCompareFullScreenFragment$setMarketOptionState$1$2$2(viewOnClickListenerC38532pbH, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "home", false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pbH$ActionBar */
    public static final class ActionBar implements C36250oUv.Activity {
        public final /* synthetic */ C36250oUv AEQbTJ;

        public ActionBar(C36250oUv c36250oUv) {
            this.AEQbTJ = c36250oUv;
        }

        @Override // o.C36250oUv.Activity
        public void EZpvd() {
            ViewOnClickListenerC38532pbH.this.UlJrfe();
            C37908pFd.gEmmrt("open_label");
        }

        @Override // o.C36250oUv.Activity
        public void KWHzl(int i) {
            Expression.Parameter parameterCopydefault;
            AbstractC36262oVg abstractC36262oVgEZpvd = C36246oUr.copydefault().EZpvd(this.AEQbTJ.fIwbmz(), "compare");
            if (abstractC36262oVgEZpvd != null && (parameterCopydefault = abstractC36262oVgEZpvd.copydefault(i)) != null) {
                parameterCopydefault.setIsShow(false);
            }
            java.util.ArrayList<MarketCoinInfo> arrayList = ViewOnClickListenerC38532pbH.this.gwTjWJ;
            if (arrayList != null) {
                ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH = ViewOnClickListenerC38532pbH.this;
                if (i < arrayList.size()) {
                    arrayList.set(i, new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null));
                    C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
                    if (c36250oUvQVAiDq != null) {
                        c36250oUvQVAiDq.invalidate();
                    }
                    viewOnClickListenerC38532pbH.copydefault(arrayList);
                }
            }
            C37908pFd.gEmmrt(EopTrackEvent.CLOSE);
        }
    }

    private final void igXuih() {
        C55173xeu c55173xeu;
        android.widget.ImageView imageView;
        C33624mzv c33624mzv;
        C33624mzv c33624mzv2;
        C33624mzv c33624mzv3;
        C33624mzv c33624mzv4;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        android.widget.ImageView imageView2;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.setCompareListener(new ActionBar(c36250oUvQVAiDq));
        }
        AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
        if (abstractC36036oMx != null && (imageView2 = abstractC36036oMx.AhwBna) != null) {
            imageView2.setOnClickListener(this);
        }
        AbstractC36036oMx abstractC36036oMx2 = this.OHqIaq;
        if (abstractC36036oMx2 != null && (c52794wYp2 = abstractC36036oMx2.AEQbTJ) != null) {
            C55296xhK.singleClick$default(c52794wYp2, this, 0L, 2, (java.lang.Object) null);
        }
        AbstractC36036oMx abstractC36036oMx3 = this.OHqIaq;
        if (abstractC36036oMx3 != null && (c52794wYp = abstractC36036oMx3.OLrzqt) != null) {
            C55296xhK.singleClick$default(c52794wYp, this, 0L, 2, (java.lang.Object) null);
        }
        AbstractC36036oMx abstractC36036oMx4 = this.OHqIaq;
        if (abstractC36036oMx4 != null && (c33624mzv4 = abstractC36036oMx4.fARcdN) != null) {
            C55296xhK.singleClick$default(c33624mzv4, this, 0L, 2, (java.lang.Object) null);
        }
        AbstractC36036oMx abstractC36036oMx5 = this.OHqIaq;
        if (abstractC36036oMx5 != null && (c33624mzv3 = abstractC36036oMx5.fIwbmz) != null) {
            C55296xhK.singleClick$default(c33624mzv3, this, 0L, 2, (java.lang.Object) null);
        }
        AbstractC36036oMx abstractC36036oMx6 = this.OHqIaq;
        if (abstractC36036oMx6 != null && (c33624mzv2 = abstractC36036oMx6.ejfBZ) != null) {
            C55296xhK.singleClick$default(c33624mzv2, this, 0L, 2, (java.lang.Object) null);
        }
        AbstractC36036oMx abstractC36036oMx7 = this.OHqIaq;
        if (abstractC36036oMx7 != null && (c33624mzv = abstractC36036oMx7.fJNWhG) != null) {
            C55296xhK.singleClick$default(c33624mzv, this, 0L, 2, (java.lang.Object) null);
        }
        AbstractC36036oMx abstractC36036oMx8 = this.OHqIaq;
        if (abstractC36036oMx8 != null && (imageView = abstractC36036oMx8.djBIcL) != null) {
            C8003auW.copydefault(imageView).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.pbO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ViewOnClickListenerC38532pbH.copydefault(this.copydefault, obj);
                }
            });
        }
        AbstractC36036oMx abstractC36036oMx9 = this.OHqIaq;
        if (abstractC36036oMx9 == null || (c55173xeu = abstractC36036oMx9.values) == null) {
            return;
        }
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pbL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC38532pbH.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void copydefault(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.lang.Object obj) {
        if (viewOnClickListenerC38532pbH.isConnected() != null) {
            InterfaceC39499ptW interfaceC39499ptWIsConnected = viewOnClickListenerC38532pbH.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.OLrzqt(0);
            }
            C32866mlf.onEvent$default("KLine_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pbW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ViewOnClickListenerC38532pbH.fetchVPNInfo((EventParamsList) obj2);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("top_icon_type", "share", true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        if (viewOnClickListenerC38532pbH.QbewEr() != null) {
            AbstractC36036oMx abstractC36036oMx = viewOnClickListenerC38532pbH.OHqIaq;
            if (abstractC36036oMx != null && (linearLayout = abstractC36036oMx.EZpvd) != null) {
                linearLayout.setVisibility(8);
            }
            FragmentActivity activity = viewOnClickListenerC38532pbH.getActivity();
            if (activity != null) {
                ActivityC38783pfu activityC38783pfu = activity instanceof ActivityC38783pfu ? (ActivityC38783pfu) activity : null;
                if (activityC38783pfu != null) {
                    activityC38783pfu.hDKMBd();
                }
            }
            viewOnClickListenerC38532pbH.onResume();
            viewOnClickListenerC38532pbH.QSLkRj();
        }
    }

    private final void fjfviF() {
        C39828pzh c39828pzh;
        final C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            OLrzqt(c36250oUvQVAiDq);
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
            c36250oUvQVAiDq.setIsSupportDoubleClick(false);
            c36250oUvQVAiDq.AkhnZx().setScreen(false);
            c36250oUvQVAiDq.AkhnZx().setChartMode(1);
            c36250oUvQVAiDq.AkhnZx().setFromCompare(true);
            c36250oUvQVAiDq.AkhnZx().setCompareKLine(true);
            c36250oUvQVAiDq.post(new java.lang.Runnable() { // from class: o.pbT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC38532pbH.OLrzqt(this.copydefault, c36250oUvQVAiDq);
                }
            });
        }
        AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
        if (abstractC36036oMx == null || (c39828pzh = abstractC36036oMx.fetchVPNInfo) == null) {
            return;
        }
        c39828pzh.setOnItemSelectListener(new Function1() { // from class: o.pbQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final void OLrzqt(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, C36250oUv c36250oUv) {
        viewOnClickListenerC38532pbH.QOLQEE().AEQbTJ(c36250oUv.getMeasuredHeight());
    }

    public static final Unit KWHzl(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, int i) {
        viewOnClickListenerC38532pbH.valueOf(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009b -> B:29:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super java.util.List<android.graphics.Bitmap>> continuation) throws java.lang.Throwable {
        KLineCompareFullScreenFragment$getCompareIconBitmap$1 kLineCompareFullScreenFragment$getCompareIconBitmap$1;
        android.content.Context context;
        ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH;
        java.util.Iterator it;
        java.util.Collection collection;
        if (continuation instanceof KLineCompareFullScreenFragment$getCompareIconBitmap$1) {
            kLineCompareFullScreenFragment$getCompareIconBitmap$1 = (KLineCompareFullScreenFragment$getCompareIconBitmap$1) continuation;
            int i = kLineCompareFullScreenFragment$getCompareIconBitmap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.label = i - Integer.MIN_VALUE;
            } else {
                kLineCompareFullScreenFragment$getCompareIconBitmap$1 = new KLineCompareFullScreenFragment$getCompareIconBitmap$1(this, continuation);
            }
        }
        java.lang.Object obj = kLineCompareFullScreenFragment$getCompareIconBitmap$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kLineCompareFullScreenFragment$getCompareIconBitmap$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            context = getContext();
            if (context == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList<MarketCoinInfo> arrayList = this.gwTjWJ;
            if (arrayList == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            viewOnClickListenerC38532pbH = this;
            it = arrayList.iterator();
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$4;
            it = (java.util.Iterator) kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$3;
            java.util.Collection collection2 = (java.util.Collection) kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$2;
            android.content.Context context2 = (android.content.Context) kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$1;
            ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH2 = (ViewOnClickListenerC38532pbH) kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$0;
            C56391yDq.AEQbTJ(obj);
            viewOnClickListenerC38532pbH = viewOnClickListenerC38532pbH2;
            collection.add((android.graphics.Bitmap) obj);
            collection = collection2;
            context = context2;
            if (it.hasNext()) {
                MarketCoinInfo marketCoinInfo = (MarketCoinInfo) it.next();
                pDQ pdq = pDQ.copydefault;
                java.lang.String iconUrl = marketCoinInfo.getIconUrl();
                int i3 = viewOnClickListenerC38532pbH.hBpjJd;
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$0 = viewOnClickListenerC38532pbH;
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$1 = context;
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$2 = collection;
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$3 = it;
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.L$4 = collection;
                kLineCompareFullScreenFragment$getCompareIconBitmap$1.label = 1;
                java.lang.Object objKWHzl = pdq.KWHzl(context, iconUrl, i3, i3, kLineCompareFullScreenFragment$getCompareIconBitmap$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                context2 = context;
                obj = objKWHzl;
                collection2 = collection;
                collection.add((android.graphics.Bitmap) obj);
                collection = collection2;
                context = context2;
                if (it.hasNext()) {
                    return (java.util.List) collection;
                }
            }
        }
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C36246oUr.copydefault().isConnected(str);
    }

    public final void valueOf(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        if (i == 4) {
            fdOvFl();
            C37908pFd.EZpvd(true);
            return;
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) == null) {
            return;
        }
        AYXKKw(false);
        TimeIntervalItem timeIntervalItem = arrayListKWHzl.get(i);
        Intrinsics.checkNotNullExpressionValue(timeIntervalItem, "");
        oYA.changeTime$default(this, c36250oUvQVAiDq, timeIntervalItem, false, 4, null);
        C37908pFd.OLrzqt(arrayListKWHzl.get(i).getTradingType(), true);
    }

    @Override // o.oYA
    public void hUfVAv() {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.QfsBiF();
        }
        AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
        if (abstractC36036oMx == null || (c39828pzh = abstractC36036oMx.fetchVPNInfo) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.oYA
    public void DarRvM() {
        super.DarRvM();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            copydefault(c36250oUvQVAiDq);
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
        }
    }

    private final void AuCTel(boolean z) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        android.widget.LinearLayout linearLayout5;
        android.widget.LinearLayout linearLayout6;
        if (QKVWgx()) {
            AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
            if (abstractC36036oMx != null && (linearLayout6 = abstractC36036oMx.gEmmrt) != null) {
                linearLayout6.setVisibility(8);
            }
            AbstractC36036oMx abstractC36036oMx2 = this.OHqIaq;
            if (abstractC36036oMx2 == null || (linearLayout5 = abstractC36036oMx2.valueOf) == null) {
                return;
            }
            linearLayout5.setVisibility(8);
            return;
        }
        if (z) {
            AbstractC36036oMx abstractC36036oMx3 = this.OHqIaq;
            if (abstractC36036oMx3 != null && (linearLayout4 = abstractC36036oMx3.gEmmrt) != null) {
                linearLayout4.setVisibility(0);
            }
            AbstractC36036oMx abstractC36036oMx4 = this.OHqIaq;
            if (abstractC36036oMx4 == null || (linearLayout3 = abstractC36036oMx4.valueOf) == null) {
                return;
            }
            linearLayout3.setVisibility(8);
            return;
        }
        AbstractC36036oMx abstractC36036oMx5 = this.OHqIaq;
        if (abstractC36036oMx5 != null && (linearLayout2 = abstractC36036oMx5.gEmmrt) != null) {
            linearLayout2.setVisibility(8);
        }
        AbstractC36036oMx abstractC36036oMx6 = this.OHqIaq;
        if (abstractC36036oMx6 == null || (linearLayout = abstractC36036oMx6.valueOf) == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        android.widget.LinearLayout linearLayout;
        AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
        if (abstractC36036oMx != null && (linearLayout = abstractC36036oMx.EZpvd) != null) {
            linearLayout.setVisibility(0);
        }
        OJuSTm();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OJuSTm();
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

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void valueOf() {
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.invalidate();
        }
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.AEQbTJ(str, list);
        }
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.ArrayList<MarketCoinInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            int sPTimeInterval = templateSettingGiSNqX.getSPTimeInterval();
            InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = dNCPSb();
            if (stateListAnimatorDNCPSb != null) {
                stateListAnimatorDNCPSb.OLrzqt(this, sPTimeInterval, arrayList);
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

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.KWHzl(list);
        }
    }

    public final void fdOvFl() {
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, true, false, 2, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.pbN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.EZpvd(this.KWHzl, (MarketTypeSelect) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = ViewOnClickListenerC38532pbH.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39339pqTNewInstance$default.EZpvd(childFragmentManager, simpleName);
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ViewOnClickListenerC38532pbH.EZpvd(this.copydefault, dialogInterface);
            }
        });
    }

    public static final Unit EZpvd(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            viewOnClickListenerC38532pbH.AYXKKw(false);
            java.lang.Object data = marketTypeSelect.getData();
            Intrinsics.copydefault(data, "");
            oYA.changeTime$default(viewOnClickListenerC38532pbH, c36250oUvQVAiDq, (TimeIntervalItem) data, false, 4, null);
            java.lang.Object data2 = marketTypeSelect.getData();
            Intrinsics.copydefault(data2, "");
            C37908pFd.OLrzqt(((TimeIntervalItem) data2).getTradingType(), true);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, android.content.DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        AbstractC36036oMx abstractC36036oMx = viewOnClickListenerC38532pbH.OHqIaq;
        if (abstractC36036oMx == null || (c39828pzh = abstractC36036oMx.fetchVPNInfo) == null) {
            return;
        }
        c39828pzh.setData();
    }

    public final void aUsmxb() {
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
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.pca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38532pbH.OLrzqt(this.copydefault, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ViewOnClickListenerC38532pbH.OLrzqt(this.copydefault, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = ViewOnClickListenerC38532pbH.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(childFragmentManager, simpleName);
    }

    public static final Unit OLrzqt(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME") && !Intrinsics.EZpvd((java.lang.Object) viewOnClickListenerC38532pbH.aKErDB(), (java.lang.Object) "TYPE_KLINE")) {
            return Unit.INSTANCE;
        }
        C36250oUv c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            viewOnClickListenerC38532pbH.KWHzl(c36250oUvQVAiDq, marketTypeSelect);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, android.content.DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQVAiDq2 = viewOnClickListenerC38532pbH.QVAiDq();
        if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getCurrentMode()), (java.lang.Object) "YScale") && (c36250oUvQVAiDq = viewOnClickListenerC38532pbH.QVAiDq()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setNeedUpdateInYScale(false);
        }
        AbstractC36036oMx abstractC36036oMx = viewOnClickListenerC38532pbH.OHqIaq;
        if (abstractC36036oMx == null || (c39828pzh = abstractC36036oMx.fetchVPNInfo) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.oYA
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        java.lang.Integer numValueOf;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            C36250oUv c36250oUvQVAiDq = QVAiDq();
            if (Intrinsics.EZpvd((java.lang.Object) ((c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx3.getCurrentMode()), (java.lang.Object) "YScale")) {
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx2.setNeedUpdateInYScale(true);
                }
                C36250oUv c36250oUvQVAiDq3 = QVAiDq();
                if (c36250oUvQVAiDq3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq3.AkhnZx()) != null) {
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
                C36250oUv c36250oUvQVAiDq4 = QVAiDq();
                if (c36250oUvQVAiDq4 != null) {
                    c36250oUvQVAiDq4.copydefault(str);
                }
                C39263pox c39263poxAxsJAY = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames2 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames2, "");
                c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames2, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (size < 4 && DXXBbs()) {
                    this.DLWbHP += C36246oUr.copydefault().accept();
                    C36250oUv c36250oUvQVAiDq5 = QVAiDq();
                    if (c36250oUvQVAiDq5 != null) {
                        C36250oUv c36250oUvQVAiDq6 = QVAiDq();
                        numValueOf = c36250oUvQVAiDq6 != null ? java.lang.Integer.valueOf(c36250oUvQVAiDq6.getMinimumHeight() + C36246oUr.copydefault().accept()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQVAiDq5.setMinimumHeight(numValueOf.intValue());
                    }
                }
            } else {
                templateSettingGiSNqX.removeSideIndicator(str);
                C36250oUv c36250oUvQVAiDq7 = QVAiDq();
                if (c36250oUvQVAiDq7 != null) {
                    c36250oUvQVAiDq7.gEmmrt(str);
                }
                C39263pox c39263poxAxsJAY2 = AxsJAY();
                java.util.ArrayList<java.lang.String> sideIndicatorNames3 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames3, "");
                c39263poxAxsJAY2.OLrzqt(this, sideIndicatorNames3, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (DXXBbs()) {
                    this.DLWbHP -= C36246oUr.copydefault().accept();
                    C36250oUv c36250oUvQVAiDq8 = QVAiDq();
                    if (c36250oUvQVAiDq8 != null) {
                        C36250oUv c36250oUvQVAiDq9 = QVAiDq();
                        numValueOf = c36250oUvQVAiDq9 != null ? java.lang.Integer.valueOf(c36250oUvQVAiDq9.getMinimumHeight() - C36246oUr.copydefault().accept()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQVAiDq8.setMinimumHeight(numValueOf.intValue());
                    }
                }
            }
            OLrzqt();
            if (z) {
                IndicatorDataReq indicatorDataReqCopydefault2 = copydefault(str, true, false);
                if (indicatorDataReqCopydefault2 != null) {
                    arrayList.add(indicatorDataReqCopydefault2);
                }
                AhwBna(arrayList);
            }
        }
    }

    public final void OLrzqt() {
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        java.lang.Integer numValueOf = (c36250oUvQVAiDq == null || (templateSettingWlaJM = c36250oUvQVAiDq.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? null : java.lang.Integer.valueOf(sideIndicatorNames.size());
        int iRlQdEF = C36246oUr.copydefault().RlQdEF();
        int iAccept = C36246oUr.copydefault().accept();
        Intrinsics.copydefault(numValueOf);
        this.DLWbHP = iRlQdEF + (iAccept * numValueOf.intValue());
        QOLQEE().KWHzl((int) (this.DLWbHP * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.keyboardTargetTextChanged;
        if (numValueOf != null && numValueOf.intValue() == i) {
            if (isConnected() == null || (interfaceC39499ptWIsConnected = isConnected()) == null) {
                return;
            }
            interfaceC39499ptWIsConnected.AYXKKw();
            return;
        }
        int i2 = C35964oKf.StateListAnimator.QUSxYX;
        if (numValueOf == null || numValueOf.intValue() != i2) {
            int i3 = C35964oKf.StateListAnimator.aKErDB;
            if (numValueOf == null || numValueOf.intValue() != i3) {
                int i4 = C35964oKf.StateListAnimator.newArray;
                if (numValueOf == null || numValueOf.intValue() != i4) {
                    int i5 = C35964oKf.StateListAnimator.MediaBrowserCompatServiceBinderWrapper;
                    if (numValueOf == null || numValueOf.intValue() != i5) {
                        int i6 = C35964oKf.StateListAnimator.isBrowsable;
                        if (numValueOf == null || numValueOf.intValue() != i6) {
                            int i7 = C35964oKf.StateListAnimator.getDescription;
                            if (numValueOf == null || numValueOf.intValue() != i7) {
                                return;
                            }
                        }
                        UlJrfe();
                        C37908pFd.gEmmrt("compare");
                        return;
                    }
                }
                aUsmxb();
                C37908pFd.gEmmrt("indicators");
                return;
            }
        }
        pFP pfp = pFP.OLrzqt;
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        if (pfp.copydefault(strORxRYg)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.gZKUVK), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        } else {
            QCjLjM();
            C32866mlf.onEvent$default("KLine_Btm_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pcc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38532pbH.fJNWhG((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit fJNWhG(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", ExtJson.BRC20TYPE_TRADE, true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        return Unit.INSTANCE;
    }

    public final void UlJrfe() {
        java.util.ArrayList<MarketCoinInfo> arrayList;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if (!isAdded() || (arrayList = this.gwTjWJ) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (MarketCoinInfo marketCoinInfo : arrayList) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null);
            if (suggestedInstrument$default != null) {
                arrayList2.add(suggestedInstrument$default);
            }
        }
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC43033rhe.copydefault(childFragmentManager, arrayList2, new Function1() { // from class: o.pbX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38532pbH.values(this.KWHzl, (java.util.List) obj);
                }
            });
        }
    }

    public final void QCjLjM() {
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
        C48914uef c48914uef = C48914uef.EZpvd;
        MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
        int iOLrzqt = c48914uef.OLrzqt(marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null);
        java.lang.String strUzCIH = QUSxYX().OLrzqt().uzCIH();
        QUSxYX().AEQbTJ(true);
        java.lang.String strOLrzqt = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt();
        java.lang.String str = this.RdAHlO;
        java.lang.String str2 = strOLrzqt + "?bizType=" + iOLrzqt + "&instId=" + instrumentId + "&fromPageSession=" + strUzCIH + "&from=kline_page&fromPageSubSource=icon_trade&fromPageSource=" + ((str == null || str.length() == 0) ? this.ODXsMY : this.RdAHlO);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str2, null, new Function1() { // from class: o.pbP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38532pbH.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AYXKKw(java.util.ArrayList<MarketCoinInfo> arrayList) {
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            RdAHlO();
            QSBOWP();
            c36250oUvQVAiDq.setCurrentDataSource(AEQbTJ(giSNqX()));
            java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ = c36250oUvQVAiDq.ejfBZ();
            if (mapEjfBZ != null) {
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(c36250oUvQVAiDq2 != null ? c36250oUvQVAiDq2.fIwbmz() : null);
                if (dataSource != null) {
                    dataSource.KWHzl();
                }
            }
            this.gwTjWJ = arrayList;
            AuCTel();
        }
    }

    private final void htlTjW() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        C52794wYp c52794wYp5;
        C52794wYp c52794wYp6;
        C52794wYp c52794wYp7;
        C52794wYp c52794wYp8;
        pFP pfp = pFP.OLrzqt;
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        if (!pfp.copydefault(strORxRYg)) {
            AbstractC36036oMx abstractC36036oMx = this.OHqIaq;
            if (abstractC36036oMx != null && (c52794wYp4 = abstractC36036oMx.AEQbTJ) != null) {
                c52794wYp4.setBackgroundTintList(null);
            }
            AbstractC36036oMx abstractC36036oMx2 = this.OHqIaq;
            if (abstractC36036oMx2 != null && (c52794wYp3 = abstractC36036oMx2.OLrzqt) != null) {
                c52794wYp3.setBackgroundTintList(null);
            }
            AbstractC36036oMx abstractC36036oMx3 = this.OHqIaq;
            if (abstractC36036oMx3 != null && (c52794wYp2 = abstractC36036oMx3.AEQbTJ) != null) {
                c52794wYp2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            }
            AbstractC36036oMx abstractC36036oMx4 = this.OHqIaq;
            if (abstractC36036oMx4 == null || (c52794wYp = abstractC36036oMx4.OLrzqt) == null) {
                return;
            }
            c52794wYp.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            return;
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? C52761wXj.Activity.zhUgOk : C52761wXj.Activity.sTzBva));
        Intrinsics.copydefault(colorStateListValueOf);
        AbstractC36036oMx abstractC36036oMx5 = this.OHqIaq;
        if (abstractC36036oMx5 != null && (c52794wYp8 = abstractC36036oMx5.AEQbTJ) != null) {
            c52794wYp8.setBackgroundTintList(colorStateListValueOf);
        }
        AbstractC36036oMx abstractC36036oMx6 = this.OHqIaq;
        if (abstractC36036oMx6 != null && (c52794wYp7 = abstractC36036oMx6.OLrzqt) != null) {
            c52794wYp7.setBackgroundTintList(colorStateListValueOf);
        }
        AbstractC36036oMx abstractC36036oMx7 = this.OHqIaq;
        if (abstractC36036oMx7 != null && (c52794wYp6 = abstractC36036oMx7.AEQbTJ) != null) {
            c52794wYp6.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        AbstractC36036oMx abstractC36036oMx8 = this.OHqIaq;
        if (abstractC36036oMx8 == null || (c52794wYp5 = abstractC36036oMx8.OLrzqt) == null) {
            return;
        }
        c52794wYp5.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
    }

    public final void gEmmrt(java.util.ArrayList<CompareCandlesItem> arrayList) {
        java.util.ArrayList<MarketCoinInfo> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
        for (CompareCandlesItem compareCandlesItem : arrayList) {
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            marketCoinInfo.setInstrumentId(compareCandlesItem.getInstId());
            arrayList2.add(marketCoinInfo);
        }
        java.util.ArrayList<MarketCoinInfo> arrayList3 = this.gwTjWJ;
        if (arrayList3 != null) {
            for (MarketCoinInfo marketCoinInfo2 : arrayList3) {
                for (MarketCoinInfo marketCoinInfo3 : arrayList2) {
                    if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo2.getInstrumentId(), (java.lang.Object) marketCoinInfo3.getInstrumentId())) {
                        marketCoinInfo3.setInstrumentType(marketCoinInfo2.getInstrumentType());
                        marketCoinInfo3.setIconUrl(marketCoinInfo2.getIconUrl());
                    }
                }
            }
        }
        this.gwTjWJ = arrayList2;
    }

    public static final Unit values(ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            BizInstrument bizInstrument = (BizInstrument) it.next();
            arrayList.add(new MarketCoinInfo(bizInstrument.getInstId(), bizInstrument.getInstType(), (java.lang.String) null, (java.lang.String) null, C55687xoe.AEQbTJ.OLrzqt(bizInstrument.getTradeSymbol()), 12, (DefaultConstructorMarker) null));
        }
        viewOnClickListenerC38532pbH.AYXKKw(new java.util.ArrayList<>(arrayList));
        return Unit.INSTANCE;
    }
}
