package com.okinc.business.dexlogic.main.limmitorder;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class SwapState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SwapState[] $VALUES;
    public static final SwapState INIT_SUCCESS = new SwapState("INIT_SUCCESS", 0);
    public static final SwapState NO_WALLET = new SwapState("NO_WALLET", 1);
    public static final SwapState TRACKING_WALLET_SUCCESS = new SwapState("TRACKING_WALLET_SUCCESS", 2);
    public static final SwapState WALLET_LEGAL = new SwapState("WALLET_LEGAL", 3);
    public static final SwapState WALLET_SUCCESS = new SwapState("WALLET_SUCCESS", 4);
    public static final SwapState MPC_WALLET_LEGAL = new SwapState("MPC_WALLET_LEGAL", 5);
    public static final SwapState SA_NEED_TO_UPDATE_APP = new SwapState("SA_NEED_TO_UPDATE_APP", 6);
    public static final SwapState SA_NOT_SMART_ACCOUNT = new SwapState("SA_NOT_SMART_ACCOUNT", 7);
    public static final SwapState SA_DISABLED = new SwapState("SA_DISABLED", 8);
    public static final SwapState SA_SERVICE_UPGRADED_ACCOUNT = new SwapState("SA_SERVICE_UPGRADED_ACCOUNT", 9);
    public static final SwapState COIN_ERROR = new SwapState("COIN_ERROR", 10);
    public static final SwapState COIN_SUCCESS = new SwapState("COIN_SUCCESS", 11);
    public static final SwapState BLACK_ADDRESS = new SwapState("BLACK_ADDRESS", 12);
    public static final SwapState FUNCTION_UPGRADE = new SwapState("FUNCTION_UPGRADE", 13);
    public static final SwapState LIMIT_REGION = new SwapState("LIMIT_REGION", 14);
    public static final SwapState SWAP_INPUT_SUCCESS = new SwapState("SWAP_INPUT_SUCCESS", 15);
    public static final SwapState SWAP_INPUT = new SwapState("SWAP_INPUT", 16);
    public static final SwapState SWAP_INPUT_FAIL = new SwapState("SWAP_INPUT_FAIL", 17);
    public static final SwapState COUNT_ERROR = new SwapState("COUNT_ERROR", 18);
    public static final SwapState FETCHING_COUNT = new SwapState("FETCHING_COUNT", 19);
    public static final SwapState SWAP_AMOUNT_LOW = new SwapState("SWAP_AMOUNT_LOW", 20);
    public static final SwapState QUOTE_AMOUNT_LOW_SUCCESS = new SwapState("QUOTE_AMOUNT_LOW_SUCCESS", 21);
    public static final SwapState QUOTE_COIN_ERROR = new SwapState("QUOTE_COIN_ERROR", 22);
    public static final SwapState BALANCE_SUCCESS = new SwapState("BALANCE_SUCCESS", 23);
    public static final SwapState INSUFFICIENT_BALANCE = new SwapState("INSUFFICIENT_BALANCE", 24);
    public static final SwapState STAND_BY_DISH = new SwapState("STAND_BY_DISH", 25);
    public static final SwapState APPROVE_SUCCESS = new SwapState("APPROVE_SUCCESS", 26);
    public static final SwapState APPROVE_ERROR = new SwapState("APPROVE_ERROR", 27);
    public static final SwapState APPROVE = new SwapState("APPROVE", 28);
    public static final SwapState APPROVING = new SwapState("APPROVING", 29);
    public static final SwapState CANCEL_APPROVE = new SwapState("CANCEL_APPROVE", 30);
    public static final SwapState CANCEL_APPROVING = new SwapState("CANCEL_APPROVING", 31);
    public static final SwapState SWITCH_COIN = new SwapState("SWITCH_COIN", 32);
    public static final SwapState SWAP = new SwapState("SWAP", 33);
    public static final SwapState SWAP_CONFIG_FETCH_FAILED = new SwapState("SWAP_CONFIG_FETCH_FAILED", 34);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SwapState[] $values() {
        return new SwapState[]{INIT_SUCCESS, NO_WALLET, TRACKING_WALLET_SUCCESS, WALLET_LEGAL, WALLET_SUCCESS, MPC_WALLET_LEGAL, SA_NEED_TO_UPDATE_APP, SA_NOT_SMART_ACCOUNT, SA_DISABLED, SA_SERVICE_UPGRADED_ACCOUNT, COIN_ERROR, COIN_SUCCESS, BLACK_ADDRESS, FUNCTION_UPGRADE, LIMIT_REGION, SWAP_INPUT_SUCCESS, SWAP_INPUT, SWAP_INPUT_FAIL, COUNT_ERROR, FETCHING_COUNT, SWAP_AMOUNT_LOW, QUOTE_AMOUNT_LOW_SUCCESS, QUOTE_COIN_ERROR, BALANCE_SUCCESS, INSUFFICIENT_BALANCE, STAND_BY_DISH, APPROVE_SUCCESS, APPROVE_ERROR, APPROVE, APPROVING, CANCEL_APPROVE, CANCEL_APPROVING, SWITCH_COIN, SWAP, SWAP_CONFIG_FETCH_FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SwapState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapState isButtonStateInterception(boolean z) {
        return z ? LIMIT_REGION : this;
    }

    private SwapState(String str, int i) {
    }

    static {
        SwapState[] swapStateArr$values = $values();
        $VALUES = swapStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(swapStateArr$values);
    }

    public static SwapState valueOf(String str) {
        return (SwapState) Enum.valueOf(SwapState.class, str);
    }

    public static SwapState[] values() {
        return (SwapState[]) $VALUES.clone();
    }
}
