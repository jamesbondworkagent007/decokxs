package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19866gSf;
import o.kKG;
import o.kVP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class CopyTradingBaseBuySettingViewModel extends AbstractC33073mpa {
    public final kKG AEQbTJ;
    public final kVP EZpvd;
    public final C19866gSf KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final StateFlow<String> copydefault;

    @yCM
    public CopyTradingBaseBuySettingViewModel(@NotNull C19866gSf c19866gSf, @NotNull kVP kvp, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c19866gSf, "");
        Intrinsics.checkNotNullParameter(kvp, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.KWHzl = c19866gSf;
        this.EZpvd = kvp;
        this.AEQbTJ = kkg;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingBaseBuySettingViewModel$subscribeTokensBalance$1(this, dexMultiTokenInfoBean, null), 3, null);
    }
}
