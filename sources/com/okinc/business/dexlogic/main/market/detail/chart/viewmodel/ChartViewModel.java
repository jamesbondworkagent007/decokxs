package com.okinc.business.dexlogic.main.market.detail.chart.viewmodel;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.market.bean.BubbleMapData;
import com.okinc.business.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.business.market.features.filter.ChartDetailSubTabName;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC22627hit;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C23184htT;
import o.C23245hub;
import o.C25389ivm;
import o.C25982jNo;
import o.C25986jNs;
import o.C56390yDp;
import o.C58156yvv;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartViewModel extends AbstractC22627hit {
    public final HashMap<ChartDetailSubTabName, C25982jNo> AYXKKw;
    public MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> AhwBna;
    public final kKG DbNXlk;
    public final MutableStateFlow<List<KlineOpenOrderBean>> OLrzqt;
    public final MutableStateFlow<List<C25982jNo>> copydefault;
    public final C25986jNs djBIcL;
    public final StateFlow<List<C25982jNo>> gEmmrt;
    public final StateFlow<List<KlineOpenOrderBean>> valueOf;
    public MutableLiveData<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C25982jNo>> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<KlineOpenOrderBean>> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> djBIcL() {
        return this.AhwBna;
    }

    @yCM
    public ChartViewModel(@NotNull kKG kkg, @NotNull C25986jNs c25986jNs) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c25986jNs, "");
        this.DbNXlk = kkg;
        this.djBIcL = c25986jNs;
        this.AhwBna = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        MutableStateFlow<List<KlineOpenOrderBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<C25982jNo>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        this.AYXKKw = new HashMap<>();
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartViewModel$getOpenLimitOrders$1(this, str, str2, null), 3, null);
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
            this.AYXKKw.remove(chartDetailSubTabName);
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChartViewModel$getAvgPrice$1(this, str, str2, str3, chartDetailSubTabName, null), 3, null);
        }
    }

    public final void AEQbTJ(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        this.AYXKKw.remove(chartDetailSubTabName);
        copydefault(chartDetailSubTabName);
    }

    public final void copydefault(@NotNull ChartDetailSubTabName chartDetailSubTabName) {
        C25982jNo c25982jNo;
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        ArrayList arrayList = new ArrayList();
        HashMap<ChartDetailSubTabName, C25982jNo> map = this.AYXKKw;
        ChartDetailSubTabName chartDetailSubTabName2 = ChartDetailSubTabName.NONE;
        C25982jNo c25982jNo2 = map.get(chartDetailSubTabName2);
        if (c25982jNo2 != null) {
            arrayList.add(c25982jNo2);
        }
        if (chartDetailSubTabName != chartDetailSubTabName2 && (c25982jNo = this.AYXKKw.get(chartDetailSubTabName)) != null) {
            arrayList.add(c25982jNo);
        }
        this.copydefault.setValue(arrayList);
    }

    public final void EZpvd(double d, @NotNull ChartDetailSubTabName chartDetailSubTabName) {
        Intrinsics.checkNotNullParameter(chartDetailSubTabName, "");
        if (this.AYXKKw.isEmpty()) {
            return;
        }
        for (Map.Entry<ChartDetailSubTabName, C25982jNo> entry : this.AYXKKw.entrySet()) {
            ChartDetailSubTabName key = entry.getKey();
            C25982jNo value = entry.getValue();
            if (value.AEQbTJ() > AudioStats.AUDIO_AMPLITUDE_NONE && value.KWHzl() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dAEQbTJ = value.AEQbTJ();
                this.AYXKKw.put(key, value.AEQbTJ((59 & 1) != 0 ? value.KWHzl : AudioStats.AUDIO_AMPLITUDE_NONE, (59 & 2) != 0 ? value.EZpvd : AudioStats.AUDIO_AMPLITUDE_NONE, (59 & 4) != 0 ? value.djBIcL : (d - dAEQbTJ) * value.KWHzl(), (59 & 8) != 0 ? value.AEQbTJ : AudioStats.AUDIO_AMPLITUDE_NONE, (59 & 16) != 0 ? value.OLrzqt : null, (59 & 32) != 0 ? value.copydefault : null));
            }
        }
        copydefault(chartDetailSubTabName);
    }

    public final void EZpvd(@NotNull final LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull final String str2, @NotNull final String str3) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.values.setValue(Boolean.TRUE);
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C22380heK.OLrzqt.copydefault(str).fARcdN().OLrzqt(), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.hiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewModel.OLrzqt(this.AEQbTJ, lifecycleOwner, str2, str3, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hiA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartViewModel.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewModel.KWHzl(this.copydefault, lifecycleOwner, str2, str3, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartViewModel.valueOf(function12, obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ChartViewModel chartViewModel, LifecycleOwner lifecycleOwner, String str, String str2, InterfaceC9738bbJ interfaceC9738bbJ) {
        chartViewModel.AEQbTJ(lifecycleOwner, str, interfaceC9738bbJ.DbNXlk(), str2, chartViewModel.DbNXlk.copydefault());
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ChartViewModel chartViewModel, LifecycleOwner lifecycleOwner, String str, String str2, Throwable th) {
        chartViewModel.AEQbTJ(lifecycleOwner, str, "", str2, (String) null);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(LifecycleOwner lifecycleOwner, String str, String str2, String str3, String str4) {
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C22380heK.OLrzqt.copydefault("default_trade").isConnected().OLrzqt(str, str2, str3, str4), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.hiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewModel.AEQbTJ(this.OLrzqt, (LatestMarketInfoBean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hiw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartViewModel.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hiz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewModel.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartViewModel.fetchVPNInfo(function12, obj);
            }
        });
    }

    public static final void isConnected(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ChartViewModel chartViewModel, LatestMarketInfoBean latestMarketInfoBean) {
        chartViewModel.values.setValue(Boolean.FALSE);
        chartViewModel.AhwBna.setValue(C56390yDp.OLrzqt(Boolean.TRUE, latestMarketInfoBean));
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ChartViewModel chartViewModel, Throwable th) {
        MutableLiveData<Boolean> mutableLiveData = chartViewModel.values;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        if (th instanceof OKServerException) {
            chartViewModel.AhwBna.setValue(C56390yDp.OLrzqt(bool, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, String.valueOf(((OKServerException) th).getCode()), (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, (String) null, (String) null, -524289, 2047, (DefaultConstructorMarker) null)));
        } else {
            chartViewModel.AhwBna.setValue(C56390yDp.OLrzqt(bool, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, MultiTransferSignData.DEFAULT_INTERVAL, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, (String) null, (String) null, -524289, 2047, (DefaultConstructorMarker) null)));
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        C23245hub c23245hubAEQbTJ = AEQbTJ();
        if (c23245hubAEQbTJ != null) {
            c23245hubAEQbTJ.EZpvd();
        }
        C23184htT c23184htTCopydefault = copydefault();
        if (c23184htTCopydefault != null) {
            c23184htTCopydefault.EZpvd();
        }
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.DbNXlk.valueOf();
        return interfaceC9738bbJValueOf == null ? "" : this.DbNXlk.EZpvd(interfaceC9738bbJValueOf, str);
    }
}
