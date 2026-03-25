package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.CommonMemeQuoteParams;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter;
import java.util.Iterator;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.C28297kWe;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetBuySellViewModel extends AbstractC33073mpa {
    public final C28297kWe AEQbTJ;
    public final kKG AYXKKw;
    public final MutableLiveData<Boolean> EZpvd;
    public final MutableLiveData<Triple<Integer, String, CommonMemeQuoteParams>> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<PresetUserConfigBean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Triple<Integer, String, CommonMemeQuoteParams>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<PresetUserConfigBean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public PresetBuySellViewModel(@NotNull C28297kWe c28297kWe, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.AEQbTJ = c28297kWe;
        this.AYXKKw = kkg;
        this.EZpvd = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PresetBuySellViewModel$resetPreset$1(this, str, str2, null), 3, null);
    }

    public final String copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.copydefault(str);
    }

    public final CommonMemeQuoteParams EZpvd(@NotNull MemeQuoteAdapter memeQuoteAdapter, @NotNull BuySellPreset buySellPreset, boolean z) {
        Object next;
        Intrinsics.checkNotNullParameter(memeQuoteAdapter, "");
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        String fromTokenAddress = memeQuoteAdapter.getFromTokenAddress(z);
        String toTokenAddress = memeQuoteAdapter.getToTokenAddress(z);
        String fromTokenAmount = memeQuoteAdapter.getFromTokenAmount(z);
        String chainId = memeQuoteAdapter.getChainId();
        Iterator<T> it = buySellPreset.getSlippageConfig().getSlippageRange().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SlippageRange) next).getSelected()) {
                break;
            }
        }
        SlippageRange slippageRange = (SlippageRange) next;
        String slippageValue = slippageRange != null ? slippageRange.getSlippageValue() : null;
        int slippageType = buySellPreset.getSlippageConfig().getSlippageType();
        SlippageMode slippageMode = SlippageMode.Dynamic;
        return new CommonMemeQuoteParams(chainId, fromTokenAmount, fromTokenAddress, toTokenAddress, copydefault(chainId), slippageType == slippageMode.getType() ? null : slippageValue, buySellPreset.getSlippageConfig().getSlippageType(), buySellPreset.getSlippageConfig().getSlippageType() == slippageMode.getType() ? buySellPreset.getSlippageConfig().getDynamicMaxSlippageValue() : null);
    }
}
