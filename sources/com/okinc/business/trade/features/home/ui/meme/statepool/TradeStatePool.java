package com.okinc.business.trade.features.home.ui.meme.statepool;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeStatePool {
    public static final int $stable = 8;
    private ArrayList<TradeStep> initPool;
    private boolean quotePriceSuccess;
    private final ArrayList<TradeStep> statePool = new ArrayList<>();
    private final MutableLiveData<TradeStep> currentStep = new MutableLiveData<>();
    private final MutableLiveData<SwapState> currentState = new MutableLiveData<>();

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

    public final boolean isQuoteStep() {
        CheckStep step;
        TradeStep value = this.currentStep.getValue();
        if (value != null && (step = value.getStep()) != null) {
            ArrayList<TradeStep> arrayList = this.initPool;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TradeStep) it.next()).getStep());
            }
            if (arrayList2.indexOf(step) > 2) {
                return true;
            }
        }
        return false;
    }

    public final void initRefreshCheckStep() {
        this.statePool.clear();
        Iterator<T> it = this.initPool.iterator();
        while (it.hasNext()) {
            this.statePool.add((TradeStep) it.next());
        }
        this.currentStep.setValue(new TradeStep(CheckStep.INIT, true, SwapState.INIT_SUCCESS, true, false));
    }

    public final void initStep() {
        this.statePool.clear();
        Iterator<T> it = this.initPool.iterator();
        while (it.hasNext()) {
            this.statePool.add((TradeStep) it.next());
        }
    }

    public final void resetApproval() {
        Object obj;
        Object next;
        Iterator<T> it = this.statePool.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TradeStep) next).getStep() == CheckStep.APPROVE) {
                    break;
                }
            }
        }
        TradeStep tradeStep = (TradeStep) next;
        if (tradeStep != null) {
            tradeStep.setHasCheck(false);
        }
        Iterator<T> it2 = this.statePool.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((TradeStep) next2).getStep() == CheckStep.SWAP) {
                obj = next2;
                break;
            }
        }
        TradeStep tradeStep2 = (TradeStep) obj;
        if (tradeStep2 != null) {
            tradeStep2.setHasCheck(false);
        }
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
        Object next2;
        Object next3;
        SwapState value = this.currentState.getValue();
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
                    Object next4 = it2.next();
                    if (((TradeStep) next4).getStep() == CheckStep.APPROVE) {
                        obj = next4;
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
                return;
            }
            return;
        }
        Iterator<T> it3 = this.statePool.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            TradeStep tradeStep4 = (TradeStep) next2;
            if (tradeStep4.getStep() == CheckStep.APPROVE && tradeStep4.getHasCheck()) {
                break;
            }
        }
        TradeStep tradeStep5 = (TradeStep) next2;
        if (tradeStep5 != null && tradeStep5.getState() == SwapState.APPROVE_SUCCESS && value == SwapState.APPROVING) {
            Iterator<T> it4 = this.statePool.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
                TradeStep tradeStep6 = (TradeStep) next3;
                if (tradeStep6.getShowState() && tradeStep6.getHasCheck()) {
                    break;
                }
            }
            TradeStep tradeStep7 = (TradeStep) next3;
            if (tradeStep7 == null) {
                Iterator<T> it5 = this.statePool.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    TradeStep tradeStep8 = (TradeStep) next5;
                    if (tradeStep8.getShowState() && tradeStep8.getStep() == CheckStep.SWAP) {
                        obj = next5;
                        break;
                    }
                }
                tradeStep7 = (TradeStep) obj;
            }
            if (tradeStep7 != null) {
                this.currentState.setValue(tradeStep7.getState());
                return;
            }
            SwapState value2 = this.currentState.getValue();
            SwapState swapState = SwapState.APPROVE_SUCCESS;
            if (value2 != swapState) {
                this.currentState.setValue(swapState);
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
