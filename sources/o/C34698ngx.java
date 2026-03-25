package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.ViewKt;
import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.dexkline.dexlogic.track.enums.KlineType;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C36250oUv;
import o.mTI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34698ngx extends LinearLayoutCompat implements InterfaceC39500ptX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public ChartViewOutSideConfig AEQbTJ;
    public ChartType AhwBna;
    public boolean EZpvd;
    public ActionBar OLrzqt;
    public DexMultiTokenInfoBean copydefault;
    public C36312oXc djBIcL;

    /* JADX INFO: renamed from: o.ngx$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public interface ActionBar {
        void AEQbTJ(@NotNull java.lang.String str);

        void EZpvd(@NotNull java.lang.String str, java.lang.String str2);

        void KWHzl(@NotNull java.lang.String str, java.lang.String str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34698ngx(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKKLine_kline_impl(ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:46) call: o.ngx.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34698ngx(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34698ngx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = ChartType.PRICE;
    }

    public final void KWHzl(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.AhwBna = chartType;
        ChartViewOutSideConfig chartViewOutSideConfig = this.AEQbTJ;
        if (chartViewOutSideConfig != null) {
            chartViewOutSideConfig.setMarketCap(chartType == ChartType.MARKET_CAP);
        }
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            c36250oUvEZpvd.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUvEZpvd.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, chartType == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
            loadKLine$default(this, null, 1, null);
        }
    }

    public final void setTokenData(DexMultiTokenInfoBean dexMultiTokenInfoBean, C34679nge c34679nge) {
        ChartType chartTypeCopydefault;
        if (dexMultiTokenInfoBean == null || C34689ngo.AEQbTJ(dexMultiTokenInfoBean, this.copydefault)) {
            return;
        }
        this.copydefault = dexMultiTokenInfoBean;
        if (c34679nge == null || (chartTypeCopydefault = c34679nge.copydefault()) == null) {
            chartTypeCopydefault = ChartType.PRICE;
        }
        this.AhwBna = chartTypeCopydefault;
        this.EZpvd = c34679nge != null ? c34679nge.KWHzl() : false;
        EZpvd(c34679nge);
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            AEQbTJ(c36250oUvEZpvd);
            c36250oUvEZpvd.gHZMYf();
            c36250oUvEZpvd.sSMYrx();
            c36250oUvEZpvd.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUvEZpvd.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, this.EZpvd && this.AhwBna == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
            oUJ ouj = oUJ.KWHzl;
            java.lang.String strKWHzl = mTL.KWHzl.KWHzl();
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUvEZpvd.AkhnZx();
            ouj.OLrzqt(strKWHzl + ((chartViewOutSideConfigAkhnZx == null || !chartViewOutSideConfigAkhnZx.isMarketCap()) ? "" : KlineType.MARKET_CAP.getValue()), "SPOT");
        }
        AkhnZx();
        C36250oUv c36250oUvEZpvd2 = EZpvd();
        if (c36250oUvEZpvd2 != null) {
            c36250oUvEZpvd2.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.ngE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.PendingIntent
                public final void AEQbTJ() {
                    C34698ngx.KWHzl(this.AEQbTJ);
                }
            });
        }
        loadKLine$default(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(C34698ngx c34698ngx) {
        c34698ngx.fetchVPNInfo();
    }

    public final void KWHzl(@NotNull java.util.List<? extends oUO> list, @NotNull java.lang.String str) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            c36250oUvEZpvd.AEQbTJ(list);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")) {
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                DbNXlk();
                C36250oUv c36250oUvEZpvd2 = EZpvd();
                if (c36250oUvEZpvd2 == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvEZpvd2.AkhnZx()) == null) {
                    return;
                }
                chartViewOutSideConfigAkhnZx2.setShowEmptyUi(false);
                return;
            }
            C36250oUv c36250oUvEZpvd3 = EZpvd();
            if (c36250oUvEZpvd3 == null || (chartViewOutSideConfigAkhnZx = c36250oUvEZpvd3.AkhnZx()) == null) {
                return;
            }
            chartViewOutSideConfigAkhnZx.setShowEmptyUi(true);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<HistoryOrderData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            c36250oUvEZpvd.AkhnZx().setMShowHistoryOrder(true);
            c36250oUvEZpvd.OLrzqt(list, java.lang.Boolean.valueOf(z));
        }
    }

    public final void OLrzqt(@NotNull java.util.List<? extends oUO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            c36250oUvEZpvd.AkhnZx().setHistoryCandlesLoading(list.size() < C33129mqd.AhwBna("300"));
            c36250oUvEZpvd.KWHzl(list);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        values();
        isConnected();
    }

    public void AhwBna() {
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
        mTR mtr = mTR.EZpvd;
        chartViewOutSideConfig.setMShowHistoryOrder(mtr.AEQbTJ());
        chartViewOutSideConfig.setMShowCurrentOrder(mtr.OLrzqt());
        chartViewOutSideConfig.setMShowCostLine(mtr.copydefault());
        chartViewOutSideConfig.setColumnChart(mtr.AYXKKw());
        chartViewOutSideConfig.setMShowPriceLine(mtr.KWHzl());
        chartViewOutSideConfig.setMShowVolume(false);
        chartViewOutSideConfig.setChartTag("sp_timeinterval_okx_cedefi");
        chartViewOutSideConfig.setMode("cedefi_mode");
        chartViewOutSideConfig.setDefaultTime(1);
        chartViewOutSideConfig.setMarketCap(this.EZpvd && this.AhwBna == ChartType.MARKET_CAP);
        chartViewOutSideConfig.setShowCountdown(false);
        this.AEQbTJ = chartViewOutSideConfig;
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            c36250oUvEZpvd.OLrzqt(this.AEQbTJ);
            c36250oUvEZpvd.setCurrentDataSource("");
        }
        pFN pfn = pFN.OLrzqt;
        mTH mth = mTH.copydefault;
        pfn.EZpvd(mth.copydefault(), mth);
        mth.valueOf();
        oWN.KWHzl(C33570myu.djBIcL(getContext()));
    }

    public final void AYXKKw() {
        values();
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            AEQbTJ(c36250oUvEZpvd);
            ChartViewOutSideConfig chartViewOutSideConfig = this.AEQbTJ;
            Intrinsics.copydefault(chartViewOutSideConfig);
            chartViewOutSideConfig.getTemplateSettings().clear();
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        C36250oUv c36250oUvEZpvd2 = EZpvd();
        if (c36250oUvEZpvd2 != null) {
            C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(c36250oUvEZpvd2);
            this.djBIcL = c36312oXcAEQbTJ;
            c36250oUvEZpvd2.setCurrentStateMachine(c36312oXcAEQbTJ);
        }
        loadKLine$default(this, null, 1, null);
    }

    public void AEQbTJ(@NotNull C36250oUv c36250oUv) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.djBIcL = C36312oXc.AEQbTJ((C36250oUv) null);
        mTL mtl = mTL.KWHzl;
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.copydefault;
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        java.lang.String str = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.copydefault;
        java.lang.String tokenContractAddress = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
        java.lang.String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.copydefault;
        java.lang.String tokenSymbol = dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getTokenSymbol() : null;
        mTI.StateListAnimator.initChartView$default(mtl, c36250oUv, null, str, str2, tokenSymbol == null ? "" : tokenSymbol, false, 32, null);
    }

    public void copydefault(C36250oUv c36250oUv) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.copydefault;
        if (dexMultiTokenInfoBean != null) {
            mTL mtl = mTL.KWHzl;
            mtl.EZpvd(c36250oUv, mtl.copydefault(c36250oUv, dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()), this.djBIcL);
        }
    }

    public static /* synthetic */ void loadKLine$default(C34698ngx c34698ngx, TimeIntervalItem timeIntervalItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeIntervalItem = null;
        }
        c34698ngx.OLrzqt(timeIntervalItem);
    }

    private final void OLrzqt(TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            if (timeIntervalItem == null && (timeIntervalItem = mTL.KWHzl.copydefault(c36250oUvEZpvd.wlaJM().getSPTimeInterval())) == null) {
                return;
            }
            ActionBar actionBar = this.OLrzqt;
            if (actionBar != null) {
                actionBar.KWHzl(mTL.KWHzl.AEQbTJ(timeIntervalItem), C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUvEZpvd.fARcdN())));
            }
            mTL.KWHzl.AEQbTJ(c36250oUvEZpvd);
            c36250oUvEZpvd.gHZMYf();
            c36250oUvEZpvd.sSMYrx();
        }
    }

    private final void DbNXlk() {
        mTL mtl;
        TimeIntervalItem timeIntervalItemCopydefault;
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd == null || (timeIntervalItemCopydefault = (mtl = mTL.KWHzl).copydefault(c36250oUvEZpvd.wlaJM().getSPTimeInterval())) == null) {
            return;
        }
        java.lang.String strOLrzqt = mtl.OLrzqt(timeIntervalItemCopydefault.timeInterval);
        ActionBar actionBar = this.OLrzqt;
        if (actionBar != null) {
            actionBar.AEQbTJ(strOLrzqt);
        }
    }

    private final void fetchVPNInfo() {
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            c36250oUvEZpvd.AkhnZx().setHistoryCandlesLoading(true);
            mTL mtl = mTL.KWHzl;
            TimeIntervalItem timeIntervalItemCopydefault = mtl.copydefault(c36250oUvEZpvd.wlaJM().getSPTimeInterval());
            if (timeIntervalItemCopydefault == null) {
                return;
            }
            java.lang.String strAEQbTJ = mtl.AEQbTJ(timeIntervalItemCopydefault);
            ActionBar actionBar = this.OLrzqt;
            if (actionBar != null) {
                actionBar.EZpvd(strAEQbTJ, C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUvEZpvd.fARcdN())));
            }
        }
    }

    private final void AkhnZx() {
        LinkedHashMap<java.lang.String, ChartArea> areas;
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            copydefault(c36250oUvEZpvd);
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUvEZpvd.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null && (areas = chartViewOutSideConfigAkhnZx.getAreas()) != null && areas.size() > 0) {
                mTL.KWHzl.AEQbTJ(c36250oUvEZpvd);
            }
            C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
            C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(c36250oUvEZpvd);
            this.djBIcL = c36312oXcAEQbTJ;
            c36250oUvEZpvd.setCurrentStateMachine(c36312oXcAEQbTJ);
            pGX pgxDjBIcL = djBIcL();
            if (pgxDjBIcL != null) {
                pgxDjBIcL.setData();
            }
        }
    }

    public final void EZpvd(C34679nge c34679nge) {
        android.widget.RelativeLayout relativeLayoutCopydefault = copydefault();
        if (relativeLayoutCopydefault != null) {
            relativeLayoutCopydefault.setVisibility((c34679nge == null || !c34679nge.KWHzl()) ? 8 : 0);
        }
        if (c34679nge == null || c34679nge.KWHzl()) {
            return;
        }
        this.AhwBna = ChartType.PRICE;
    }

    private final void values() {
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd != null) {
            AhwBna();
            c36250oUvEZpvd.setActionListener(this);
        }
    }

    private final void isConnected() {
        final pGX pgxDjBIcL = djBIcL();
        if (pgxDjBIcL != null) {
            pgxDjBIcL.setData();
            pgxDjBIcL.setOnItemSelectListener(new Function1() { // from class: o.ngz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34698ngx.copydefault(pgxDjBIcL, this, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(pGX pgx, final C34698ngx c34698ngx, int i) {
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        TimeIntervalItem timeIntervalItem;
        java.lang.String tokenContractAddress;
        TemplateSetting templateSettingWlaJM;
        if (i == 4) {
            mTL mtl = mTL.KWHzl;
            androidx.fragment.app.FragmentManager childFragmentManager = ((C34695ngu) ViewKt.findFragment(pgx)).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C36250oUv c36250oUvEZpvd = c34698ngx.EZpvd();
            pGX pgxDjBIcL = c34698ngx.djBIcL();
            C36312oXc c36312oXc = c34698ngx.djBIcL;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = c34698ngx.copydefault;
            java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            java.lang.String str = chainId == null ? "" : chainId;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = c34698ngx.copydefault;
            tokenContractAddress = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
            mtl.OLrzqt(childFragmentManager, c36250oUvEZpvd, pgxDjBIcL, c36312oXc, str, tokenContractAddress == null ? "" : tokenContractAddress, false, new Function1() { // from class: o.ngv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34698ngx.EZpvd(this.AEQbTJ, (TimeIntervalItem) obj);
                }
            });
        } else {
            InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
            if (interfaceC39509ptgDjBIcL != null && (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) != null && (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListKWHzl, i)) != null) {
                mTL mtl2 = mTL.KWHzl;
                C36250oUv c36250oUvEZpvd2 = c34698ngx.EZpvd();
                C36312oXc c36312oXc2 = c34698ngx.djBIcL;
                DexMultiTokenInfoBean dexMultiTokenInfoBean3 = c34698ngx.copydefault;
                java.lang.String chainId2 = dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getChainId() : null;
                java.lang.String str2 = chainId2 == null ? "" : chainId2;
                DexMultiTokenInfoBean dexMultiTokenInfoBean4 = c34698ngx.copydefault;
                tokenContractAddress = dexMultiTokenInfoBean4 != null ? dexMultiTokenInfoBean4.getTokenContractAddress() : null;
                mtl2.OLrzqt(c36250oUvEZpvd2, timeIntervalItem, c36312oXc2, str2, tokenContractAddress == null ? "" : tokenContractAddress);
                c34698ngx.OLrzqt(timeIntervalItem);
                C36250oUv c36250oUvEZpvd3 = c34698ngx.EZpvd();
                if (c36250oUvEZpvd3 != null && (templateSettingWlaJM = c36250oUvEZpvd3.wlaJM()) != null) {
                    templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
                }
                pGX pgxDjBIcL2 = c34698ngx.djBIcL();
                if (pgxDjBIcL2 != null) {
                    pgxDjBIcL2.setData();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C34698ngx c34698ngx, TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        c34698ngx.OLrzqt(timeIntervalItem);
        return Unit.INSTANCE;
    }

    public final C36250oUv EZpvd() {
        android.view.View childAt = getChildAt(1);
        android.widget.FrameLayout frameLayout = childAt instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) childAt : null;
        if (frameLayout != null) {
            return (C36250oUv) frameLayout.findViewById(C35964oKf.StateListAnimator.DsrFlB);
        }
        return null;
    }

    public final pGX djBIcL() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (pGX) linearLayout.findViewById(C35964oKf.StateListAnimator.valueOf);
        }
        return null;
    }

    public final android.widget.RelativeLayout copydefault() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.RelativeLayout) linearLayout.findViewById(C35964oKf.StateListAnimator.HrFqwD);
        }
        return null;
    }

    public final android.widget.ImageView valueOf() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.ImageView) linearLayout.findViewById(C35964oKf.StateListAnimator.Dfm);
        }
        return null;
    }

    public final android.widget.TextView AEQbTJ() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.TextView) linearLayout.findViewById(C35964oKf.StateListAnimator.getBundle);
        }
        return null;
    }

    public final LinearLayoutCompat OLrzqt() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (LinearLayoutCompat) linearLayout.findViewById(C35964oKf.StateListAnimator.gwwzsY);
        }
        return null;
    }

    public final android.widget.TextView gEmmrt() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.TextView) linearLayout.findViewById(C35964oKf.StateListAnimator.newHeartRating);
        }
        return null;
    }

    public final android.widget.ImageView KWHzl() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.ImageView) linearLayout.findViewById(C35964oKf.StateListAnimator.QnnRaN);
        }
        return null;
    }

    public final void copydefault(@NotNull ChartType chartType) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(chartType, "");
        this.AhwBna = chartType;
        C36250oUv c36250oUvEZpvd = EZpvd();
        if (c36250oUvEZpvd == null || (chartViewOutSideConfigAkhnZx = c36250oUvEZpvd.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setMarketCap(this.EZpvd && this.AhwBna == ChartType.MARKET_CAP);
    }

    /* JADX INFO: renamed from: o.ngx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ngx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
