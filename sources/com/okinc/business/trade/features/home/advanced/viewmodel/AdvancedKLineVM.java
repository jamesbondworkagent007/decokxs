package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedKLineVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.HistoryOrderData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC28224kTm;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.C21950hSi;
import o.C22380heK;
import o.C22416heu;
import o.C23184htT;
import o.C23245hub;
import o.C25389ivm;
import o.C27602jyL;
import o.C28196kSl;
import o.C28200kSp;
import o.C30565ldZ;
import o.C30685lfn;
import o.C36246oUr;
import o.C56403yEb;
import o.InterfaceC23253huj;
import o.InterfaceC23254huk;
import o.InterfaceC58227yxM;
import o.oUO;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedKLineVM extends AbstractC33073mpa implements InterfaceC23254huk, InterfaceC23253huj {
    public final MutableStateFlow<List<oUO>> AEQbTJ;
    public C23245hub AYXKKw;
    public final StateFlow<HashMap<String, HistoryOrderData>> AhwBna;
    public ChartType AkhnZx;
    public final C28196kSl AuCTel;
    public final StateFlow<AbstractC28224kTm> DbNXlk;
    public final MutableStateFlow<DexMultiTokenInfoBean> EZpvd;
    public final MutableStateFlow<List<HistoryOrderData>> KWHzl;
    public final MutableStateFlow<HashMap<String, HistoryOrderData>> OLrzqt;
    public final MutableStateFlow<AbstractC28224kTm> copydefault;
    public C23184htT djBIcL;
    public final C30685lfn fetchVPNInfo;
    public final StateFlow<List<HistoryOrderData>> gEmmrt;
    public C28200kSp isConnected;
    public final StateFlow<DexMultiTokenInfoBean> valueOf;
    public final StateFlow<List<oUO>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23184htT AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C28200kSp c28200kSp) {
        this.isConnected = c28200kSp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC28224kTm> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<HistoryOrderData>> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<HashMap<String, HistoryOrderData>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<oUO>> copydefault() {
        return this.values;
    }

    @yCM
    public AdvancedKLineVM(@NotNull C28196kSl c28196kSl, @NotNull C30685lfn c30685lfn) {
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c30685lfn, "");
        this.AuCTel = c28196kSl;
        this.fetchVPNInfo = c30685lfn;
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC28224kTm> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC28224kTm.Activity.EZpvd);
        this.copydefault = MutableStateFlow2;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<oUO>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow3;
        this.values = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<HistoryOrderData>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow4;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<HashMap<String, HistoryOrderData>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new HashMap());
        this.OLrzqt = MutableStateFlow5;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow5);
        AdvancedLimitBy.Activity activity = AdvancedLimitBy.Companion;
        Integer num = SPUtils.getInt("key_dex_advanced_limit_by", AdvancedLimitBy.Price.getValue(), "dex_trading_local_config");
        Intrinsics.checkNotNullExpressionValue(num, "");
        this.AkhnZx = activity.KWHzl(activity.OLrzqt(num.intValue()));
    }

    public final void KWHzl(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.AkhnZx = chartType;
        gEmmrt();
    }

    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.EZpvd.getValue())) {
            return;
        }
        this.EZpvd.setValue(dexMultiTokenInfoBean);
        gEmmrt();
        valueOf();
        djBIcL();
    }

    public final void KWHzl(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setValue(AbstractC28224kTm.Activity.EZpvd);
        C23245hub c23245hub = this.AYXKKw;
        if (c23245hub != null) {
            c23245hub.KWHzl(str, str2);
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$fetchBuySellData$1(this, str, null), 3, null);
    }

    public final void copydefault(@NotNull String str, String str2) {
        String tokenContractAddress;
        String str3;
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        if (value.isMainChainCoin()) {
            tokenContractAddress = value.getWTokenAddress();
            if (tokenContractAddress == null) {
                str3 = "";
            }
            String chainId = value.getChainId();
            String strSubstring = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            AbstractC58185ywX<List<CandlesticksBean>> abstractC58185ywXAEQbTJ = C22380heK.OLrzqt.copydefault("default_trade").isConnected().AEQbTJ(new DexTokenCandleParam(chainId, str3, str2, null, strSubstring, "300", null, 72, null));
            final Function1 function1 = new Function1() { // from class: o.kSt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedKLineVM.OLrzqt(this.EZpvd, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM<? super List<CandlesticksBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kSs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AdvancedKLineVM.AEQbTJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.kSv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedKLineVM.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kSu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AdvancedKLineVM.OLrzqt(function12, obj);
                }
            });
        }
        tokenContractAddress = value.getTokenContractAddress();
        str3 = tokenContractAddress;
        String chainId2 = value.getChainId();
        String strSubstring2 = str.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        AbstractC58185ywX<List<CandlesticksBean>> abstractC58185ywXAEQbTJ2 = C22380heK.OLrzqt.copydefault("default_trade").isConnected().AEQbTJ(new DexTokenCandleParam(chainId2, str3, str2, null, strSubstring2, "300", null, 72, null));
        final Function1 function13 = new Function1() { // from class: o.kSt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedKLineVM.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super List<CandlesticksBean>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.kSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedKLineVM.AEQbTJ(function13, obj);
            }
        };
        final Function1 function122 = new Function1() { // from class: o.kSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedKLineVM.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.kSu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedKLineVM.OLrzqt(function122, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AdvancedKLineVM advancedKLineVM, List list) {
        MutableStateFlow<List<oUO>> mutableStateFlow = advancedKLineVM.AEQbTJ;
        C21950hSi c21950hSi = C21950hSi.OLrzqt;
        Intrinsics.copydefault(list);
        mutableStateFlow.setValue(advancedKLineVM.OLrzqt(c21950hSi.AEQbTJ((List<CandlesticksBean>) list)));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        C23245hub c23245hub = this.AYXKKw;
        if (c23245hub != null) {
            c23245hub.EZpvd();
        }
        C23184htT c23184htT = this.djBIcL;
        if (c23184htT != null) {
            c23184htT.EZpvd();
        }
    }

    @Override // o.InterfaceC23254huk
    public void KWHzl(@NotNull List<? extends oUO> list, @NotNull String str) {
        oUO ouo;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        List<oUO> listOLrzqt = OLrzqt(list);
        if (Intrinsics.EZpvd((Object) str, (Object) "http") && (ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(listOLrzqt)) != null) {
            C36246oUr.copydefault().iwGUEr().AEQbTJ(ouo.KWHzl);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$onResult$2(this, listOLrzqt, str, null), 3, null);
    }

    @Override // o.InterfaceC23254huk
    public void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.copydefault("Dex Advanced KLine: " + str);
    }

    @Override // o.InterfaceC23254huk
    public void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("Dex Advanced KLine: " + str);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$onError$1(this, str, null), 3, null);
    }

    @Override // o.InterfaceC23253huj
    public void copydefault(@NotNull List<MarketBuySellKLinePoint> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.setValue(C27602jyL.EZpvd(list));
    }

    @Override // o.InterfaceC23253huj
    public void KWHzl(@NotNull MarketBuySellKLinePoint marketBuySellKLinePoint) {
        Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
        this.OLrzqt.getValue().put(marketBuySellKLinePoint.AhwBna(), C27602jyL.OLrzqt(marketBuySellKLinePoint));
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        C23245hub c23245hub = this.AYXKKw;
        if (c23245hub != null) {
            c23245hub.EZpvd();
        }
        this.AYXKKw = null;
        C23184htT c23184htT = this.djBIcL;
        if (c23184htT != null) {
            c23184htT.EZpvd();
        }
        this.djBIcL = null;
        this.isConnected = null;
        super.onCleared();
    }

    public final void valueOf() {
        DexMultiTokenInfoBean value;
        String tokenContractAddress;
        if (C22416heu.ejfBZ() || (value = this.EZpvd.getValue()) == null) {
            return;
        }
        if (value.isMainChainCoin()) {
            tokenContractAddress = value.getWTokenAddress();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
        } else {
            tokenContractAddress = value.getTokenContractAddress();
        }
        this.AYXKKw = new C23245hub(value.getChainId(), tokenContractAddress, new WeakReference(this));
    }

    public final void djBIcL() {
        DexMultiTokenInfoBean value;
        String tokenContractAddress;
        if (C22416heu.ejfBZ() || (value = this.EZpvd.getValue()) == null) {
            return;
        }
        if (value.isMainChainCoin()) {
            tokenContractAddress = value.getWTokenAddress();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
        } else {
            tokenContractAddress = value.getTokenContractAddress();
        }
        this.djBIcL = new C23184htT(value.getChainId(), tokenContractAddress, new WeakReference(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.oUO> */
    /* JADX WARN: Multi-variable type inference failed */
    private final List<oUO> OLrzqt(List<? extends oUO> list) {
        C28200kSp c28200kSp = this.isConnected;
        String strCopydefault = c28200kSp != null ? c28200kSp.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        if (this.AkhnZx == ChartType.PRICE || strCopydefault.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.fetchVPNInfo.AEQbTJ((oUO) it.next(), strCopydefault));
        }
        return arrayList;
    }
}
