package com.okinc.dexkline.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C34689ngo;
import o.mUR;
import o.yCM;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedMainVM extends AbstractC33073mpa {
    public final StateFlow<DexMultiTokenInfoBean> EZpvd;
    public final MutableStateFlow<DexMultiTokenInfoBean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public AdvancedMainVM() {
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mUR.safeLaunch$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || C34689ngo.AEQbTJ(dexMultiTokenInfoBean, this.OLrzqt.getValue())) {
            return;
        }
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedMainVM$updateBaseToken$1(this, dexMultiTokenInfoBean, null), 3, null);
    }
}
