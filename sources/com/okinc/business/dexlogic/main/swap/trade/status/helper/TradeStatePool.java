package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TradeStatePool {
    public static final int $stable = 8;
    private ArrayList<TradeStep> initPool;
    private boolean quotePriceSuccess;
    private ArrayList<TradeStep> statePool = new ArrayList<>();
    private MutableLiveData<TradeStep> currentStep = new MutableLiveData<>();
    private MutableLiveData<SwapState> currentState = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SwapState> getCurrentState() {
        return this.currentState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TradeStep> getCurrentStep() {
        return this.currentStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getQuotePriceSuccess() {
        return this.quotePriceSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentState(@NotNull MutableLiveData<SwapState> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.currentState = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentStep(@NotNull MutableLiveData<TradeStep> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.currentStep = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotePriceSuccess(boolean z) {
        this.quotePriceSuccess = z;
    }

    public TradeStatePool() {
        ArrayList<TradeStep> arrayList = new ArrayList<>();
        arrayList.add(new TradeStep(CheckStep.INIT, false, SwapState.INIT_SUCCESS, true, false));
        arrayList.add(new TradeStep(CheckStep.WALLET, false, SwapState.WALLET_LEGAL, true, false));
        arrayList.add(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, false));
        arrayList.add(new TradeStep(CheckStep.QUOTES, false, SwapState.FETCHING_QUOTES, true, false));
        arrayList.add(new TradeStep(CheckStep.BALANCE, false, SwapState.INSUFFICIENT_BALANCE, true, false));
        arrayList.add(new TradeStep(CheckStep.APPROVE, false, SwapState.APPROVE, true, false));
        arrayList.add(new TradeStep(CheckStep.SWAP, false, SwapState.SWAP, true, false));
        this.initPool = arrayList;
    }

    public final void initCheckStep() {
        this.statePool.clear();
        Iterator<T> it = this.initPool.iterator();
        while (it.hasNext()) {
            this.statePool.add((TradeStep) it.next());
        }
        MutableLiveData<TradeStep> mutableLiveData = this.currentStep;
        CheckStep checkStep = CheckStep.INIT;
        SwapState swapState = SwapState.INIT_SUCCESS;
        mutableLiveData.setValue(new TradeStep(checkStep, true, swapState, true, false));
        this.currentState.setValue(swapState);
    }

    private final boolean checkBalanceLegal(TradeStep tradeStep) {
        List listGEmmrt = yDY.gEmmrt(CheckStep.INIT, CheckStep.WALLET, CheckStep.INPUT, CheckStep.QUOTES);
        TradeStep value = this.currentStep.getValue();
        return tradeStep.getStep() == CheckStep.BALANCE && CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends CheckStep>) ((Iterable<? extends Object>) listGEmmrt), value != null ? value.getStep() : null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep.copy$default(com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep, com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep, boolean, com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState, boolean, boolean, int, java.lang.Object):com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep */
    private final void setCheckStep() {
        Object next;
        TradeStep tradeStep;
        Iterator<T> it = this.statePool.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TradeStep tradeStep2 = (TradeStep) next;
            if ((!tradeStep2.getDoNext()) | (!tradeStep2.getHasCheck())) {
                break;
            }
        }
        TradeStep tradeStep3 = (TradeStep) next;
        if (tradeStep3 == null || (tradeStep = TradeStep.copy$default(tradeStep3, null, false, null, false, false, 31, null)) == null) {
            tradeStep = new TradeStep(CheckStep.SWAP, true, SwapState.SWAP, true, false);
        }
        this.currentStep.setValue(tradeStep);
    }

    private final void setCheckState() {
        Object obj;
        Object next;
        Iterator<T> it = this.statePool.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TradeStep tradeStep = (TradeStep) next;
            if (tradeStep.getHasCheck() & tradeStep.getShowState()) {
                break;
            }
        }
        TradeStep tradeStep2 = (TradeStep) next;
        if (tradeStep2 != null) {
            if (tradeStep2.getState() == SwapState.FETCHING_QUOTES) {
                Iterator<T> it2 = this.statePool.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((TradeStep) next2).getStep() == CheckStep.APPROVE) {
                        obj = next2;
                        break;
                    }
                }
                TradeStep tradeStep3 = (TradeStep) obj;
                if (tradeStep3 != null && tradeStep3.getHasCheck() && tradeStep3.getShowState() && yDY.gEmmrt(SwapState.APPROVE_CONFIRMING, SwapState.APPROVING, SwapState.APPROVE_ERROR, SwapState.CANCEL_APPROVING).contains(tradeStep3.getState())) {
                    if (this.currentState.getValue() != tradeStep3.getState()) {
                        this.currentState.setValue(tradeStep3.getState());
                        return;
                    }
                    return;
                } else {
                    if (this.currentState.getValue() != tradeStep2.getState()) {
                        this.currentState.setValue(tradeStep2.getState());
                        return;
                    }
                    return;
                }
            }
            if (this.currentState.getValue() != tradeStep2.getState()) {
                this.currentState.setValue(tradeStep2.getState());
            }
        }
    }

    public final void refreshStatePool(@NotNull TradeStep tradeStep) {
        Intrinsics.checkNotNullParameter(tradeStep, "");
        if (checkBalanceLegal(tradeStep)) {
            return;
        }
        Iterator<TradeStep> it = this.statePool.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getStep() == tradeStep.getStep()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            TradeStep tradeStep2 = this.statePool.get(i);
            Intrinsics.checkNotNullExpressionValue(tradeStep2, "");
            if (!Intrinsics.EZpvd(tradeStep2, tradeStep)) {
                this.statePool.set(i, tradeStep);
                if (tradeStep.getStep() != CheckStep.QUOTES) {
                    int size = this.statePool.size();
                    for (int i2 = i + 1; i2 < size; i2++) {
                        this.statePool.set(i2, this.initPool.get(i2));
                    }
                } else {
                    this.statePool.set(i, tradeStep);
                    if (!this.quotePriceSuccess) {
                        int size2 = this.statePool.size();
                        for (int i3 = i + 1; i3 < size2; i3++) {
                            this.statePool.set(i3, this.initPool.get(i3));
                        }
                    }
                }
            }
        }
        setCheckState();
        if (tradeStep.getDoNext()) {
            setCheckStep();
        }
    }
}
