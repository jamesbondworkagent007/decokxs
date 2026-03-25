package com.okinc.business.dexui.main.limitorder;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitInputCondition {
    public static final int $stable = 8;
    private DexMultiTokenInfoBean fromCoin;
    private DexMultiTokenInfoBean toCoin;
    private String fromContent = "";
    private String toContent = "";
    private MutableLiveData<Boolean> inputFinish = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromCoin() {
        return this.fromCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromContent() {
        return this.fromContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> getInputFinish() {
        return this.inputFinish;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToCoin() {
        return this.toCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToContent() {
        return this.toContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromCoin(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.fromCoin = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputFinish(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.inputFinish = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToCoin(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.toCoin = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toContent = str;
    }

    public static /* synthetic */ void setCondition$default(LimitInputCondition limitInputCondition, TradeInputGroup tradeInputGroup, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        limitInputCondition.setCondition(tradeInputGroup, z, z2);
    }

    public final void setCondition(@NotNull TradeInputGroup tradeInputGroup, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tradeInputGroup, "");
        this.fromCoin = tradeInputGroup.getFromData().getData().getCoinData().getData();
        this.toCoin = tradeInputGroup.getToData().getData().getCoinData().getData();
        this.fromContent = tradeInputGroup.getFromData().getData().getEditData().getData();
        this.toContent = tradeInputGroup.getToData().getData().getEditData().getData();
        updateQuoteCondition(z, z2);
    }

    private final void updateQuoteCondition(boolean z, boolean z2) {
        this.inputFinish.setValue(Boolean.valueOf((this.fromCoin == null || this.toCoin == null || !z || z2) ? false : true));
    }
}
