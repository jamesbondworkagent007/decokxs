package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.business.trade.features.home.ui.uistate.preset.MemePresetSaveUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C28297kWe;
import o.C28369kYw;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.kXI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetSelectionViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final C28369kYw AYXKKw;
    public final MutableLiveData<Pair<String, String>> AhwBna;
    public final MutableLiveData<Boolean> EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<MemePresetSaveUiState> OLrzqt;
    public final MutableLiveData<DexPresetResultVO> copydefault;
    public final kKG djBIcL;
    public final SharedFlow<Boolean> gEmmrt;
    public final C28297kWe valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<String, String>> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<DexPresetResultVO> gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MemePresetSaveUiState> valueOf() {
        return this.OLrzqt;
    }

    @yCM
    public PresetSelectionViewModel(@NotNull C28297kWe c28297kWe, @NotNull C28369kYw c28369kYw, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        Intrinsics.checkNotNullParameter(c28369kYw, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.valueOf = c28297kWe;
        this.AYXKKw = c28369kYw;
        this.djBIcL = kkg;
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AhwBna = new MutableLiveData<>();
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PresetSelectionViewModel$updatePresetReset$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PresetSelectionViewModel$getUserPresetConfig$1(this, str, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull PresetUserConfigBean presetUserConfigBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
        DexPresetResultVO value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        if (this.EZpvd.getValue() == null || !(!r1.booleanValue())) {
            Iterator<PresetUserConfigBean> it = value.getDexPresetResultVOList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                PresetUserConfigBean next = it.next();
                if (Intrinsics.EZpvd((Object) next.getChainId(), (Object) str) && Intrinsics.EZpvd((Object) next.getPresetType(), (Object) str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            value.getDexPresetResultVOList().set(i, presetUserConfigBean);
        }
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexPresetResultVO value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        PresetUserParams presetUserParamsOLrzqt = kXI.OLrzqt(value.getDexPresetResultVOList(), str, AEQbTJ(), KWHzl(str), str2);
        this.KWHzl.setValue(Boolean.TRUE);
        this.OLrzqt.setValue(new MemePresetSaveUiState(true, false, false, "", null, 20, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PresetSelectionViewModel$savePreset$1(this, value, presetUserParamsOLrzqt, null), 3, null);
    }

    public final PresetUserConfigBean EZpvd(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        DexPresetResultVO value = this.copydefault.getValue();
        if (value != null && i <= value.getDexPresetResultVOList().size()) {
            return value.getDexPresetResultVOList().get(i);
        }
        return null;
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.djBIcL.copydefault(str);
    }

    public final String AEQbTJ() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.djBIcL.valueOf();
        String strDbNXlk = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public final boolean djBIcL() {
        return this.AYXKKw.KWHzl();
    }

    public final void AEQbTJ(boolean z) {
        this.AYXKKw.EZpvd(z);
    }

    public final PresetUserConfigBean KWHzl(@NotNull String str, @NotNull String str2) {
        ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexPresetResultVO value = this.copydefault.getValue();
        Object obj = null;
        if (value == null || (dexPresetResultVOList = value.getDexPresetResultVOList()) == null) {
            return null;
        }
        Iterator<T> it = dexPresetResultVOList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) next;
            if (Intrinsics.EZpvd((Object) presetUserConfigBean.getChainId(), (Object) str) && Intrinsics.EZpvd((Object) presetUserConfigBean.getPresetType(), (Object) str2)) {
                obj = next;
                break;
            }
        }
        return (PresetUserConfigBean) obj;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        PresetUserConfigBean presetUserConfigBeanKWHzl = KWHzl(str, str2);
        if (presetUserConfigBeanKWHzl != null) {
            presetUserConfigBeanKWHzl.setName(str3);
        }
    }

    public final PresetUserParams OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexPresetResultVO value = this.copydefault.getValue();
        if (value == null) {
            return new PresetUserParams(null, null, null, str2, null, 23, null);
        }
        return kXI.OLrzqt(value.getDexPresetResultVOList(), str, AEQbTJ(), KWHzl(str), str2);
    }

    public final PresetUserConfigBean KWHzl(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        DexPresetResultVO value = this.copydefault.getValue();
        if (value != null && i <= value.getDexPresetResultVOList().size()) {
            return value.getDexPresetResultVOList().get(i);
        }
        return null;
    }

    public final boolean EZpvd(String str, @NotNull String str2, int i, @NotNull String str3) {
        String limitOrderMax;
        String limitOrderMin;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str == null) {
            return true;
        }
        BuySellPreset buySellPresetKWHzl = KWHzl(str, str2, i);
        System.out.println((Object) ("buysellpreset " + buySellPresetKWHzl));
        PresetUserParams presetUserParamsOLrzqt = OLrzqt(str2, str3);
        if (buySellPresetKWHzl == null) {
            return presetUserParamsOLrzqt.isInvalid("", "", "", "", "", "");
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) MemeTransactionSceneType.Market.getValue())) {
            limitOrderMax = buySellPresetKWHzl.getFeeConfig().getMax();
            limitOrderMin = buySellPresetKWHzl.getFeeConfig().getMin();
        } else {
            limitOrderMax = buySellPresetKWHzl.getFeeConfig().getLimitOrderMax();
            limitOrderMin = buySellPresetKWHzl.getFeeConfig().getLimitOrderMin();
        }
        return presetUserParamsOLrzqt.isInvalid(buySellPresetKWHzl.getSlippageConfig().getDynamicMin(), buySellPresetKWHzl.getSlippageConfig().getDynamicMax(), buySellPresetKWHzl.getSlippageConfig().getFixedMin(), buySellPresetKWHzl.getSlippageConfig().getFixedMax(), limitOrderMax, limitOrderMin);
    }

    public final BuySellPreset KWHzl(String str, String str2, int i) {
        if (i == TransactionType.Buy.getType()) {
            PresetUserConfigBean presetUserConfigBeanKWHzl = KWHzl(str2, str);
            if (presetUserConfigBeanKWHzl != null) {
                return presetUserConfigBeanKWHzl.getBuyPreset();
            }
        } else {
            PresetUserConfigBean presetUserConfigBeanKWHzl2 = KWHzl(str2, str);
            if (presetUserConfigBeanKWHzl2 != null) {
                return presetUserConfigBeanKWHzl2.getSellPreset();
            }
        }
        return null;
    }

    public final String OLrzqt() {
        DexPresetResultVO value = this.copydefault.getValue();
        if (value != null) {
            return value.getGasPriceUnitDecimal();
        }
        return null;
    }

    public final DexMultiTokenInfoBean KWHzl() {
        DexMultiTokenInfoBean nativeTokenInfo;
        DexPresetResultVO value = this.copydefault.getValue();
        return (value == null || (nativeTokenInfo = value.getNativeTokenInfo()) == null) ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : nativeTokenInfo;
    }

    public final Boolean fetchVPNInfo() {
        DexPresetResultVO value = gEmmrt().getValue();
        if (value != null) {
            return Boolean.valueOf(value.getSupportCustomGasFee());
        }
        return null;
    }
}
