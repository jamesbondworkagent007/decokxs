package com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData;
import com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.dexkline.market.features.filter.ChartDetailSubTabName;
import com.okinc.kline.data.KlineDexAvgDataBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC58185ywX;
import o.C32144mRc;
import o.C34587ner;
import o.C56390yDp;
import o.C58156yvv;
import o.InterfaceC58227yxM;
import o.mPY;
import o.mQC;
import o.mQW;
import o.mUR;
import o.mVW;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartViewModel extends mQC {
    public final MutableStateFlow<List<KlineDexAvgDataBean>> AEQbTJ;
    public final mVW AYXKKw;
    public final StateFlow<List<KlineDexAvgDataBean>> AhwBna;
    public final C34587ner AkhnZx;
    public final MutableStateFlow<List<KlineOpenOrderBean>> OLrzqt;
    public final StateFlow<List<KlineOpenOrderBean>> djBIcL;
    public final HashMap<ChartDetailSubTabName, KlineDexAvgDataBean> gEmmrt;
    public MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> valueOf;
    public MutableLiveData<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<KlineDexAvgDataBean>> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<KlineOpenOrderBean>> OLrzqt() {
        return this.djBIcL;
    }

    @yCM
    public ChartViewModel(@NotNull C34587ner c34587ner, @NotNull mVW mvw) {
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(mvw, "");
        this.AkhnZx = c34587ner;
        this.AYXKKw = mvw;
        this.valueOf = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        MutableStateFlow<List<KlineOpenOrderBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<KlineDexAvgDataBean>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.gEmmrt = new HashMap<>();
    }

    public static /* synthetic */ void getAvgPrice$default(ChartViewModel chartViewModel, String str, String str2, String str3, ChartDetailSubTabName chartDetailSubTabName, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            chartDetailSubTabName = ChartDetailSubTabName.NONE;
        }
        chartViewModel.EZpvd(str, str2, str3, chartDetailSubTabName);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        if (yEE.AhwBna(ChartDetailSubTabName.NONE, ChartDetailSubTabName.HOLDERS, ChartDetailSubTabName.TRADER, ChartDetailSubTabName.HISTORY_CHANGE).contains(chartDetailSubTabName)) {
            this.gEmmrt.remove(chartDetailSubTabName);
            mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartViewModel$getAvgPrice$1(this, str, str2, str3, chartDetailSubTabName, null), 3, null);
        }
    }

    public final void KWHzl(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        this.gEmmrt.remove(chartDetailSubTabName);
        OLrzqt(chartDetailSubTabName);
    }

    public final void OLrzqt(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        KlineDexAvgDataBean klineDexAvgDataBean;
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        ArrayList arrayList = new ArrayList();
        HashMap<ChartDetailSubTabName, KlineDexAvgDataBean> map = this.gEmmrt;
        ChartDetailSubTabName chartDetailSubTabName2 = ChartDetailSubTabName.NONE;
        KlineDexAvgDataBean klineDexAvgDataBean2 = map.get(chartDetailSubTabName2);
        if (klineDexAvgDataBean2 != null) {
            arrayList.add(klineDexAvgDataBean2);
        }
        if (chartDetailSubTabName != chartDetailSubTabName2 && (klineDexAvgDataBean = this.gEmmrt.get(chartDetailSubTabName)) != null) {
            arrayList.add(klineDexAvgDataBean);
        }
        this.AEQbTJ.setValue(arrayList);
    }

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.values.setValue(Boolean.TRUE);
        KWHzl(lifecycleOwner, str2, this.AkhnZx.AEQbTJ(), str3, this.AkhnZx.KWHzl(str3));
    }

    private final void KWHzl(LifecycleOwner lifecycleOwner, String str, String str2, String str3, String str4) {
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(mPY.OLrzqt.copydefault("default_trade").KWHzl().KWHzl(str, str2, str3, str4), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.mQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewModel.copydefault(this.KWHzl, (LatestMarketInfoBean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartViewModel.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewModel.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartViewModel.valueOf(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ChartViewModel chartViewModel, LatestMarketInfoBean latestMarketInfoBean) {
        chartViewModel.values.setValue(Boolean.FALSE);
        chartViewModel.valueOf.setValue(C56390yDp.OLrzqt(Boolean.TRUE, latestMarketInfoBean));
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ChartViewModel chartViewModel, Throwable th) {
        MutableLiveData<Boolean> mutableLiveData = chartViewModel.values;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        if (th instanceof OKServerException) {
            chartViewModel.valueOf.setValue(C56390yDp.OLrzqt(bool, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, String.valueOf(((OKServerException) th).getCode()), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, -2097153, 2047, (DefaultConstructorMarker) null)));
        } else {
            chartViewModel.valueOf.setValue(C56390yDp.OLrzqt(bool, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, MultiTransferSignData.DEFAULT_INTERVAL, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, -2097153, 2047, (DefaultConstructorMarker) null)));
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        C32144mRc c32144mRcAEQbTJ = AEQbTJ();
        if (c32144mRcAEQbTJ != null) {
            c32144mRcAEQbTJ.OLrzqt();
        }
        mQW mqwKWHzl = KWHzl();
        if (mqwKWHzl != null) {
            mqwKWHzl.AEQbTJ();
        }
    }

    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AkhnZx.copydefault(null, str);
    }
}
