package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.ViewKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.core.util.SPUtils;
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
import o.C23274hvD;
import o.C36250oUv;
import o.InterfaceC21944hSc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30681lfj extends LinearLayoutCompat implements InterfaceC39500ptX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public ChartViewOutSideConfig AEQbTJ;
    public C36312oXc AhwBna;
    public Application EZpvd;
    public DexMultiTokenInfoBean KWHzl;
    public ChartType OLrzqt;

    /* JADX INFO: renamed from: o.lfj$Application */
    public interface Application {
        void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2);

        void OLrzqt(@NotNull java.lang.String str);

        void OLrzqt(@NotNull java.lang.String str, java.lang.String str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30681lfj(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(Application application) {
        this.EZpvd = application;
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:43) call: o.lfj.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30681lfj(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30681lfj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AdvancedLimitBy.Activity activity = AdvancedLimitBy.Companion;
        java.lang.Integer num = SPUtils.getInt("key_dex_advanced_limit_by", AdvancedLimitBy.Price.getValue(), "dex_trading_local_config");
        Intrinsics.checkNotNullExpressionValue(num, "");
        this.OLrzqt = activity.KWHzl(activity.OLrzqt(num.intValue()));
    }

    public final void OLrzqt(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.OLrzqt = chartType;
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUvAEQbTJ.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, chartType == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
            loadKLine$default(this, null, 1, null);
        }
    }

    public final void setTokenData(DexMultiTokenInfoBean dexMultiTokenInfoBean, C28200kSp c28200kSp) {
        java.util.List<? extends InterfaceC39510pth> listAubY;
        C36250oUv c36250oUvAEQbTJ;
        C36250oUv c36250oUvAEQbTJ2 = AEQbTJ();
        boolean z = c36250oUvAEQbTJ2 != null && (listAubY = c36250oUvAEQbTJ2.AubY()) != null && (listAubY.isEmpty() ^ true) && ((c36250oUvAEQbTJ = AEQbTJ()) == null || c36250oUvAEQbTJ.getFieldNames() != -1);
        if (dexMultiTokenInfoBean != null) {
            if (C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.KWHzl) && z) {
                return;
            }
            this.KWHzl = dexMultiTokenInfoBean;
            OLrzqt(c28200kSp);
            C36250oUv c36250oUvAEQbTJ3 = AEQbTJ();
            if (c36250oUvAEQbTJ3 != null) {
                OLrzqt(c36250oUvAEQbTJ3);
                c36250oUvAEQbTJ3.gHZMYf();
                c36250oUvAEQbTJ3.sSMYrx();
                c36250oUvAEQbTJ3.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUvAEQbTJ3.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, c28200kSp != null && c28200kSp.KWHzl() && this.OLrzqt == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
            }
            values();
            C36250oUv c36250oUvAEQbTJ4 = AEQbTJ();
            if (c36250oUvAEQbTJ4 != null) {
                c36250oUvAEQbTJ4.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.lfl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.C36250oUv.PendingIntent
                    public final void AEQbTJ() {
                        C30681lfj.AEQbTJ(this.OLrzqt);
                    }
                });
            }
            loadKLine$default(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(C30681lfj c30681lfj) {
        c30681lfj.AYXKKw();
    }

    public final void copydefault(@NotNull java.util.List<? extends oUO> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.AEQbTJ(list);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")) {
            valueOf();
        }
    }

    public final void OLrzqt(@NotNull java.util.List<HistoryOrderData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.AkhnZx().setMShowHistoryOrder(true);
            c36250oUvAEQbTJ.OLrzqt(list, java.lang.Boolean.valueOf(z));
        }
    }

    public final void OLrzqt(@NotNull java.util.List<? extends oUO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.AkhnZx().setHistoryCandlesLoading(list.size() < C33129mqd.AhwBna("300"));
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                c36250oUvAEQbTJ.KWHzl(list);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        copydefault();
        OLrzqt();
    }

    public void AhwBna() {
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
        C21952hSk c21952hSk = C21952hSk.copydefault;
        chartViewOutSideConfig.setMShowHistoryOrder(c21952hSk.AYXKKw());
        chartViewOutSideConfig.setMShowCurrentOrder(c21952hSk.OLrzqt());
        chartViewOutSideConfig.setMShowCostLine(c21952hSk.EZpvd());
        chartViewOutSideConfig.setColumnChart(c21952hSk.AhwBna());
        chartViewOutSideConfig.setMShowPriceLine(c21952hSk.gEmmrt());
        chartViewOutSideConfig.setMShowVolume(false);
        chartViewOutSideConfig.setHideTradeDrawingLine(false);
        chartViewOutSideConfig.setChartTag("kline_dex_market_time_preference");
        chartViewOutSideConfig.setMode("defi_mode_dex");
        chartViewOutSideConfig.setDefaultTime(1);
        chartViewOutSideConfig.setMarketCap(false);
        chartViewOutSideConfig.setShowCountdown(false);
        this.AEQbTJ = chartViewOutSideConfig;
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.OLrzqt(this.AEQbTJ);
            c36250oUvAEQbTJ.setCurrentDataSource("");
        }
        pFN pfn = pFN.OLrzqt;
        C21945hSd c21945hSd = C21945hSd.KWHzl;
        pfn.EZpvd(c21945hSd.OLrzqt(), c21945hSd);
        c21945hSd.valueOf();
        oWN.KWHzl(C33570myu.djBIcL(getContext()));
    }

    public final void fetchVPNInfo() {
        if (this.AEQbTJ == null) {
            return;
        }
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.OLrzqt(this.AEQbTJ);
        }
        loadKLine$default(this, null, 1, null);
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        C36250oUv c36250oUvAEQbTJ2 = AEQbTJ();
        if (c36250oUvAEQbTJ2 != null) {
            C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(c36250oUvAEQbTJ2);
            this.AhwBna = c36312oXcAEQbTJ;
            c36250oUvAEQbTJ2.setCurrentStateMachine(c36312oXcAEQbTJ);
        }
    }

    public void OLrzqt(@NotNull C36250oUv c36250oUv) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.AhwBna = C36312oXc.AEQbTJ((C36250oUv) null);
        hRZ hrz = hRZ.OLrzqt;
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.KWHzl;
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        java.lang.String str = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.KWHzl;
        java.lang.String tokenContractAddress = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
        java.lang.String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.KWHzl;
        java.lang.String tokenSymbol = dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getTokenSymbol() : null;
        InterfaceC21944hSc.Activity.initChartView$default(hrz, c36250oUv, null, str, str2, tokenSymbol == null ? "" : tokenSymbol, false, 32, null);
    }

    public void EZpvd(C36250oUv c36250oUv) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.KWHzl;
        if (dexMultiTokenInfoBean != null) {
            hRZ hrz = hRZ.OLrzqt;
            hrz.KWHzl(c36250oUv, hrz.OLrzqt(c36250oUv, dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()), this.AhwBna);
        }
    }

    public static /* synthetic */ void loadKLine$default(C30681lfj c30681lfj, TimeIntervalItem timeIntervalItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeIntervalItem = null;
        }
        c30681lfj.KWHzl(timeIntervalItem);
    }

    public final void KWHzl(TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            if (timeIntervalItem == null && (timeIntervalItem = hRZ.OLrzqt.KWHzl(c36250oUvAEQbTJ.wlaJM().getSPTimeInterval())) == null) {
                return;
            }
            Application application = this.EZpvd;
            if (application != null) {
                application.AEQbTJ(hRZ.OLrzqt.copydefault(timeIntervalItem), C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUvAEQbTJ.fARcdN())));
            }
            c36250oUvAEQbTJ.gHZMYf();
            c36250oUvAEQbTJ.sSMYrx();
        }
    }

    public final void valueOf() {
        hRZ hrz;
        TimeIntervalItem timeIntervalItemKWHzl;
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ == null || (timeIntervalItemKWHzl = (hrz = hRZ.OLrzqt).KWHzl(c36250oUvAEQbTJ.wlaJM().getSPTimeInterval())) == null) {
            return;
        }
        java.lang.String strAEQbTJ = hrz.AEQbTJ(timeIntervalItemKWHzl.timeInterval);
        Application application = this.EZpvd;
        if (application != null) {
            application.OLrzqt(strAEQbTJ);
        }
    }

    public final void AYXKKw() {
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            c36250oUvAEQbTJ.AkhnZx().setHistoryCandlesLoading(true);
            hRZ hrz = hRZ.OLrzqt;
            TimeIntervalItem timeIntervalItemKWHzl = hrz.KWHzl(c36250oUvAEQbTJ.wlaJM().getSPTimeInterval());
            if (timeIntervalItemKWHzl == null) {
                return;
            }
            java.lang.String strCopydefault = hrz.copydefault(timeIntervalItemKWHzl);
            Application application = this.EZpvd;
            if (application != null) {
                application.OLrzqt(strCopydefault, C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUvAEQbTJ.fARcdN())));
            }
        }
    }

    private final void values() {
        LinkedHashMap<java.lang.String, ChartArea> areas;
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            EZpvd(c36250oUvAEQbTJ);
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUvAEQbTJ.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null && (areas = chartViewOutSideConfigAkhnZx.getAreas()) != null && areas.size() > 0) {
                hRZ.OLrzqt.AEQbTJ(c36250oUvAEQbTJ);
            }
            C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
            C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(c36250oUvAEQbTJ);
            this.AhwBna = c36312oXcAEQbTJ;
            c36250oUvAEQbTJ.setCurrentStateMachine(c36312oXcAEQbTJ);
            pGX pgxGEmmrt = gEmmrt();
            if (pgxGEmmrt != null) {
                pgxGEmmrt.setData();
            }
        }
    }

    public final void OLrzqt(C28200kSp c28200kSp) {
        android.widget.LinearLayout linearLayoutKWHzl = KWHzl();
        if (linearLayoutKWHzl != null) {
            linearLayoutKWHzl.setVisibility((c28200kSp == null || !c28200kSp.KWHzl()) ? 8 : 0);
        }
        if (c28200kSp == null || c28200kSp.KWHzl()) {
            return;
        }
        this.OLrzqt = ChartType.PRICE;
    }

    public final void copydefault() {
        C36250oUv c36250oUvAEQbTJ = AEQbTJ();
        if (c36250oUvAEQbTJ != null) {
            AhwBna();
            OLrzqt(c36250oUvAEQbTJ);
            c36250oUvAEQbTJ.setActionListener(this);
            values();
        }
    }

    public final void OLrzqt() {
        final pGX pgxGEmmrt = gEmmrt();
        if (pgxGEmmrt != null) {
            pgxGEmmrt.setData();
            pgxGEmmrt.setOnItemSelectListener(new Function1() { // from class: o.lfi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30681lfj.EZpvd(pgxGEmmrt, this, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(pGX pgx, final C30681lfj c30681lfj, int i) {
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        TimeIntervalItem timeIntervalItem;
        java.lang.String tokenContractAddress;
        TemplateSetting templateSettingWlaJM;
        if (i == 4) {
            hRZ hrz = hRZ.OLrzqt;
            androidx.fragment.app.FragmentManager childFragmentManager = ((C30616leX) ViewKt.findFragment(pgx)).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C36250oUv c36250oUvAEQbTJ = c30681lfj.AEQbTJ();
            pGX pgxGEmmrt = c30681lfj.gEmmrt();
            C36312oXc c36312oXc = c30681lfj.AhwBna;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = c30681lfj.KWHzl;
            java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            java.lang.String str = chainId == null ? "" : chainId;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = c30681lfj.KWHzl;
            tokenContractAddress = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
            hrz.copydefault(childFragmentManager, c36250oUvAEQbTJ, pgxGEmmrt, c36312oXc, str, tokenContractAddress == null ? "" : tokenContractAddress, false, new Function1() { // from class: o.lfo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30681lfj.KWHzl(this.copydefault, (TimeIntervalItem) obj);
                }
            });
        } else {
            InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
            if (interfaceC39509ptgDjBIcL != null && (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) != null && (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListKWHzl, i)) != null) {
                hRZ hrz2 = hRZ.OLrzqt;
                C36250oUv c36250oUvAEQbTJ2 = c30681lfj.AEQbTJ();
                C36312oXc c36312oXc2 = c30681lfj.AhwBna;
                DexMultiTokenInfoBean dexMultiTokenInfoBean3 = c30681lfj.KWHzl;
                java.lang.String chainId2 = dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getChainId() : null;
                java.lang.String str2 = chainId2 == null ? "" : chainId2;
                DexMultiTokenInfoBean dexMultiTokenInfoBean4 = c30681lfj.KWHzl;
                tokenContractAddress = dexMultiTokenInfoBean4 != null ? dexMultiTokenInfoBean4.getTokenContractAddress() : null;
                hrz2.OLrzqt(c36250oUvAEQbTJ2, timeIntervalItem, c36312oXc2, str2, tokenContractAddress == null ? "" : tokenContractAddress);
                c30681lfj.KWHzl(timeIntervalItem);
                C36250oUv c36250oUvAEQbTJ3 = c30681lfj.AEQbTJ();
                if (c36250oUvAEQbTJ3 != null && (templateSettingWlaJM = c36250oUvAEQbTJ3.wlaJM()) != null) {
                    templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
                }
                pGX pgxGEmmrt2 = c30681lfj.gEmmrt();
                if (pgxGEmmrt2 != null) {
                    pgxGEmmrt2.setData();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C30681lfj c30681lfj, TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        c30681lfj.KWHzl(timeIntervalItem);
        return Unit.INSTANCE;
    }

    public final C36250oUv AEQbTJ() {
        android.view.View childAt = getChildAt(1);
        if (childAt instanceof C36250oUv) {
            return (C36250oUv) childAt;
        }
        return null;
    }

    public final pGX gEmmrt() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (pGX) linearLayout.findViewById(C23274hvD.Application.DTwDnp);
        }
        return null;
    }

    public final android.widget.LinearLayout KWHzl() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.LinearLayout) linearLayout.findViewById(C23274hvD.Application.addQueueItem);
        }
        return null;
    }

    public final android.widget.TextView EZpvd() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.TextView) linearLayout.findViewById(C23274hvD.Application.removeOnMenuVisibilityListener);
        }
        return null;
    }

    public final android.widget.LinearLayout djBIcL() {
        android.view.View childAt = getChildAt(0);
        android.widget.LinearLayout linearLayout = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
        if (linearLayout != null) {
            return (android.widget.LinearLayout) linearLayout.findViewById(C23274hvD.Application.prepareFromSearch);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.lfj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lfj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
