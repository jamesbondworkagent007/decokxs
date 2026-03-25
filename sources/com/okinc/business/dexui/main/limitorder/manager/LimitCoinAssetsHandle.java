package com.okinc.business.dexui.main.limitorder.manager;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssetsHandle;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinState;
import com.okinc.business.dexui.main.limitorder.manager.LimitCoinAssetsHandle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C22332hdP;
import o.C22495hgT;
import o.C23313hvq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitCoinAssetsHandle extends CoinAssetsHandle {
    public static final int $stable = 0;

    public final void getCoinAssets(@NotNull CoinAssets coinAssets, @NotNull final MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull final C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(coinAssets, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        if (mutableLiveData.getValue() != null) {
            if (c22495hgT.OcIXYQ() != null && yDY.gEmmrt(CoinAssets.BOTH, CoinAssets.FROM).contains(coinAssets)) {
                ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
                Intrinsics.copydefault(value);
                mutableLiveData.setValue(C22332hdP.EZpvd(value.getData().setFromBalance("", "", (60 & 4) != 0 ? false : false, (60 & 8) != 0 ? false : false, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? "" : null)));
            }
            if (c22495hgT.QKudOq() != null && yDY.gEmmrt(CoinAssets.BOTH, CoinAssets.TO).contains(coinAssets)) {
                ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
                Intrinsics.copydefault(value2);
                mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.setToBalance$default(value2.getData(), "", "", false, false, 12, null)));
            }
        }
        CoinAssetsHandle.getFromCoinAssets$default(this, c22495hgT.OcIXYQ(), coinAssets, c22495hgT.AxsJAYaxsJAY(), null, new Function1() { // from class: o.hKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitCoinAssetsHandle.getCoinAssets$lambda$2$lambda$0(mutableLiveData, this, c22495hgT, (CoinState) obj);
            }
        }, 8, null);
        CoinAssetsHandle.getToCoinAssets$default(this, c22495hgT.QKudOq(), coinAssets, c22495hgT.AxsJAYaxsJAY(), null, new Function1() { // from class: o.hKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitCoinAssetsHandle.getCoinAssets$lambda$2$lambda$1(mutableLiveData, (CoinState) obj);
            }
        }, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getCoinAssets$lambda$2$lambda$0(MutableLiveData mutableLiveData, LimitCoinAssetsHandle limitCoinAssetsHandle, C22495hgT c22495hgT, CoinState coinState) {
        Intrinsics.checkNotNullParameter(coinState, "");
        T value = mutableLiveData.getValue();
        Intrinsics.copydefault(value);
        mutableLiveData.setValue(C22332hdP.EZpvd(((TradeInputGroup) ((ConsumeData) value).getData()).setFromBalance(coinState.getShowData(), coinState.getOriginData(), (60 & 4) != 0 ? false : coinState.getErrorType(), (60 & 8) != 0 ? false : true, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? "" : null)));
        checkFromBalance$default(limitCoinAssetsHandle, mutableLiveData, c22495hgT, (Function0) null, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getCoinAssets$lambda$2$lambda$1(MutableLiveData mutableLiveData, CoinState coinState) {
        Intrinsics.checkNotNullParameter(coinState, "");
        T value = mutableLiveData.getValue();
        Intrinsics.copydefault(value);
        mutableLiveData.setValue(C22332hdP.EZpvd(((TradeInputGroup) ((ConsumeData) value).getData()).setToBalance(coinState.getShowData(), coinState.getOriginData(), coinState.getErrorType(), true)));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.limitorder.manager.LimitCoinAssetsHandle */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkFromBalance$default(LimitCoinAssetsHandle limitCoinAssetsHandle, MutableLiveData mutableLiveData, C22495hgT c22495hgT, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        limitCoinAssetsHandle.checkFromBalance((MutableLiveData<ConsumeData<TradeInputGroup>>) mutableLiveData, c22495hgT, (Function0<Unit>) function0);
    }

    public final void checkFromBalance(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull C22495hgT c22495hgT, Function0<Unit> function0) {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || !data2.getBalance().getFinish()) {
            return;
        }
        if (C23313hvq.KWHzl(data2.getBalance().getData(), data2.getEditData().getData())) {
            if (function0 != null) {
                function0.invoke();
            }
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.BALANCE, true, SwapState.INSUFFICIENT_BALANCE, true, false));
            return;
        }
        c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.BALANCE, true, SwapState.BALANCE_SUCCESS, false, true));
    }
}
