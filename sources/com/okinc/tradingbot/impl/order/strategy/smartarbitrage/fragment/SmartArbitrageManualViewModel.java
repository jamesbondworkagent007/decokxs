package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.HomeArbitrageResponse;
import com.okinc.tradingbot.impl.dto.LeveragePrincipalConfig;
import com.okinc.tradingbot.impl.dto.StakingConfig;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.vNB;
import o.wTM;
import o.wTU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageManualViewModel extends ViewModel {
    public final MutableStateFlow<vNB<ArbitrageInfoResponse>> AEQbTJ;
    public final wTU AhwBna;
    public final CoroutineDispatcher EZpvd;
    public final wTM KWHzl;
    public final StateFlow<vNB<ArbitrageInfoResponse>> OLrzqt;
    public final MutableStateFlow<vNB<HomeArbitrageResponse>> copydefault;
    public String gEmmrt;
    public final StateFlow<vNB<HomeArbitrageResponse>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<ArbitrageInfoResponse>> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<HomeArbitrageResponse>> djBIcL() {
        return this.valueOf;
    }

    @yCM
    public SmartArbitrageManualViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTU wtu, @NotNull wTM wtm) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtu, "");
        Intrinsics.checkNotNullParameter(wtm, "");
        this.EZpvd = coroutineDispatcher;
        this.AhwBna = wtu;
        this.KWHzl = wtm;
        vNB.Activity activity = vNB.Activity.copydefault;
        MutableStateFlow<vNB<HomeArbitrageResponse>> MutableStateFlow = StateFlowKt.MutableStateFlow(activity);
        this.copydefault = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<vNB<ArbitrageInfoResponse>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(activity);
        this.AEQbTJ = MutableStateFlow2;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
        this.gEmmrt = "";
    }

    public final HomeArbitrageResponse AhwBna() {
        return this.valueOf.getValue().KWHzl();
    }

    public final ArbitrageInfoResponse copydefault() {
        return this.OLrzqt.getValue().KWHzl();
    }

    public final void EZpvd(boolean z, Float f, @NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new SmartArbitrageManualViewModel$fetchArbitrageInfo$1(this, str, str2, f, str3, z, null), 2, null);
    }

    public final void EZpvd() {
        this.copydefault.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new SmartArbitrageManualViewModel$fetchHomeArbitrage$1(this, null), 2, null);
    }

    public final StakingConfig valueOf() {
        Map<String, StakingConfig> mapGEmmrt;
        HomeArbitrageResponse homeArbitrageResponseAhwBna = AhwBna();
        if (homeArbitrageResponseAhwBna == null || (mapGEmmrt = homeArbitrageResponseAhwBna.gEmmrt()) == null) {
            return null;
        }
        return mapGEmmrt.get(this.gEmmrt);
    }

    public final LeveragePrincipalConfig gEmmrt() {
        Map<String, LeveragePrincipalConfig> mapEZpvd;
        HomeArbitrageResponse homeArbitrageResponseAhwBna = AhwBna();
        if (homeArbitrageResponseAhwBna == null || (mapEZpvd = homeArbitrageResponseAhwBna.EZpvd()) == null) {
            return null;
        }
        return mapEZpvd.get(this.gEmmrt);
    }

    public final boolean KWHzl() {
        HomeArbitrageResponse homeArbitrageResponseAhwBna = AhwBna();
        return homeArbitrageResponseAhwBna != null && homeArbitrageResponseAhwBna.valueOf();
    }

    public final boolean OLrzqt() {
        HomeArbitrageResponse homeArbitrageResponseAhwBna = AhwBna();
        return homeArbitrageResponseAhwBna != null && homeArbitrageResponseAhwBna.copydefault();
    }
}
