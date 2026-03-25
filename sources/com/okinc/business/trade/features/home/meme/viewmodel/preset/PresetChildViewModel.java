package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.CommonMemeQuoteParams;
import com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC28344kXy;
import o.C28294kWb;
import o.C28297kWe;
import o.C28300kWh;
import o.C28310kWr;
import o.C30982llS;
import o.InterfaceC30984llU;
import o.InterfaceC30985llV;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetChildViewModel extends AbstractC28344kXy {
    public final MutableLiveData<Boolean> AEQbTJ;
    public final C28294kWb AYXKKw;
    public final C28310kWr AhwBna;
    public final MutableLiveData<Pair<Boolean, MemeModeQuoteBean>> OLrzqt;
    public final C28297kWe djBIcL;
    public final MutableLiveData<List<PrioritySelectionBean>> gEmmrt;
    public final C28300kWh valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<PrioritySelectionBean>> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Pair<Boolean, MemeModeQuoteBean>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public PresetChildViewModel(@NotNull C28310kWr c28310kWr, @NotNull C28300kWh c28300kWh, @NotNull C28294kWb c28294kWb, @NotNull C28297kWe c28297kWe) {
        Intrinsics.checkNotNullParameter(c28310kWr, "");
        Intrinsics.checkNotNullParameter(c28300kWh, "");
        Intrinsics.checkNotNullParameter(c28294kWb, "");
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        this.AhwBna = c28310kWr;
        this.valueOf = c28300kWh;
        this.AYXKKw = c28294kWb;
        this.djBIcL = c28297kWe;
        this.gEmmrt = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
    }

    public final void copydefault(@NotNull List<FeeOption> list, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.setValue(this.AhwBna.copydefault(list, interfaceC30984llU, z, str));
    }

    public final String KWHzl(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.AhwBna.AEQbTJ(i, interfaceC30984llU, z, str);
    }

    public final String EZpvd(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.AhwBna.OLrzqt(i, interfaceC30984llU, z, str, "", "", "");
    }

    public final boolean AEQbTJ(@NotNull String str, @NotNull String str2, InterfaceC30985llV interfaceC30985llV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (interfaceC30985llV == null) {
            return false;
        }
        return this.valueOf.KWHzl(OLrzqt(), str2, interfaceC30985llV);
    }

    public final String OLrzqt() {
        MemeModeQuoteBean second;
        MemeModeCommonDexInfo memeModeCommonDexInfo;
        String memeChainType;
        Pair<Boolean, MemeModeQuoteBean> value = this.OLrzqt.getValue();
        return (value == null || (second = value.getSecond()) == null || (memeModeCommonDexInfo = second.getMemeModeCommonDexInfo()) == null || (memeChainType = memeModeCommonDexInfo.getMemeChainType()) == null) ? MemeChainType.MemeChainTypeOther.getValue() : memeChainType;
    }

    public static /* synthetic */ void memeQuote$default(PresetChildViewModel presetChildViewModel, CommonMemeQuoteParams commonMemeQuoteParams, C28294kWb.StateListAnimator stateListAnimator, int i, Object obj) {
        if ((i & 2) != 0) {
            stateListAnimator = null;
        }
        presetChildViewModel.OLrzqt(commonMemeQuoteParams, stateListAnimator);
    }

    public final void OLrzqt(@NotNull CommonMemeQuoteParams commonMemeQuoteParams, C28294kWb.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(commonMemeQuoteParams, "");
        this.AEQbTJ.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PresetChildViewModel$memeQuote$1(this, commonMemeQuoteParams, stateListAnimator, null), 3, null);
    }

    public final InterfaceC30984llU copydefault(@NotNull MemeModeQuoteBean memeModeQuoteBean) {
        Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
        return C30982llS.EZpvd(memeModeQuoteBean);
    }

    public final String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.AhwBna.OLrzqt(i, interfaceC30984llU, z, str);
    }
}
