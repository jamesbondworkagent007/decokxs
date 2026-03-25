package com.okinc.business.trade.features.home.ui.meme.statepool;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SwapState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SwapState[] $VALUES;
    public static final SwapState INIT_SUCCESS = new SwapState("INIT_SUCCESS", 0);
    public static final SwapState NO_WALLET = new SwapState("NO_WALLET", 1);
    public static final SwapState SWITCH_WALLET = new SwapState("SWITCH_WALLET", 2);
    public static final SwapState WALLET_SUCCESS = new SwapState("WALLET_SUCCESS", 3);
    public static final SwapState SWAP_INPUT_SUCCESS = new SwapState("SWAP_INPUT_SUCCESS", 4);
    public static final SwapState TRACKING_WALLET_SUCCESS = new SwapState("TRACKING_WALLET_SUCCESS", 5);
    public static final SwapState FETCHING_SUCCESS = new SwapState("FETCHING_SUCCESS", 6);
    public static final SwapState BALANCE_SUCCESS = new SwapState("BALANCE_SUCCESS", 7);
    public static final SwapState STAND_BY_DISH = new SwapState("STAND_BY_DISH", 8);
    public static final SwapState STAND_BY_LEVERAGE = new SwapState("STAND_BY_LEVERAGE", 9);
    public static final SwapState SAFEMOON_COIN = new SwapState("SAFEMOON_COIN", 10);
    public static final SwapState STAND_BY_DISH_WARNING = new SwapState("STAND_BY_DISH_WARNING", 11);
    public static final SwapState STAND_BY_LEVERAGE_WARNING = new SwapState("STAND_BY_LEVERAGE_WARNING", 12);
    public static final SwapState APPROVE_SUCCESS = new SwapState("APPROVE_SUCCESS", 13);
    public static final SwapState APPROVE_ERROR = new SwapState("APPROVE_ERROR", 14);
    public static final SwapState WALLET_LEGAL = new SwapState("WALLET_LEGAL", 15);
    public static final SwapState SWAP_INPUT = new SwapState("SWAP_INPUT", 16);
    public static final SwapState SWITCH_COIN = new SwapState("SWITCH_COIN", 17);
    public static final SwapState BLACK_ADDRESS = new SwapState("BLACK_ADDRESS", 18);
    public static final SwapState NEW_ADDRESS = new SwapState("NEW_ADDRESS", 19);
    public static final SwapState LIMIT_REGION = new SwapState("LIMIT_REGION", 20);
    public static final SwapState MPC_WALLET_LEGAL = new SwapState("MPC_WALLET_LEGAL", 21);
    public static final SwapState SA_NEED_TO_UPDATE_APP = new SwapState("SA_NEED_TO_UPDATE_APP", 22);
    public static final SwapState SA_NOT_SMART_ACCOUNT = new SwapState("SA_NOT_SMART_ACCOUNT", 23);
    public static final SwapState SA_DISABLED = new SwapState("SA_DISABLED", 24);
    public static final SwapState SA_SERVICE_UPGRADED_ACCOUNT = new SwapState("SA_SERVICE_UPGRADED_ACCOUNT", 25);
    public static final SwapState SA_EXPIRING_SOON = new SwapState("SA_EXPIRING_SOON", 26);
    public static final SwapState FETCHING_ERROR = new SwapState("FETCHING_ERROR", 27);
    public static final SwapState FETCHING_NONE = new SwapState("FETCHING_NONE", 28);
    public static final SwapState INSUFFICIENT_BALANCE = new SwapState("INSUFFICIENT_BALANCE", 29);
    public static final SwapState APPROVING = new SwapState("APPROVING", 30);
    public static final SwapState APPROVE_CONFIRMING = new SwapState("APPROVE_CONFIRMING", 31);
    public static final SwapState FETCHING_QUOTES = new SwapState("FETCHING_QUOTES", 32);
    public static final SwapState APPROVE = new SwapState("APPROVE", 33);
    public static final SwapState APPROVED_AND_NEED_CANCEL_APPROVE = new SwapState("APPROVED_AND_NEED_CANCEL_APPROVE", 34);
    public static final SwapState CANCEL_APPROVING = new SwapState("CANCEL_APPROVING", 35);
    public static final SwapState SWAP = new SwapState("SWAP", 36);
    public static final SwapState PRE_CHECK_FAIL = new SwapState("PRE_CHECK_FAIL", 37);
    public static final SwapState ZERO_FORM_AMOUNT = new SwapState("ZERO_FORM_AMOUNT", 38);
    public static final SwapState SAFE_MOON_SLIP_ERROR = new SwapState("SAFE_MOON_SLIP_ERROR", 39);
    public static final SwapState NoSupportTPLS = new SwapState("NoSupportTPLS", 40);
    public static final SwapState HETEROGENEOUS_CHAIN_INVALID = new SwapState("HETEROGENEOUS_CHAIN_INVALID", 41);
    public static final SwapState GAS_DROP_STATE = new SwapState("GAS_DROP_STATE", 42);
    public static final SwapState NO_QUOTE_FETCHED = new SwapState("NO_QUOTE_FETCHED", 43);
    public static final SwapState NO_LIQUIDITY_AT_THE_MOMENT = new SwapState("NO_LIQUIDITY_AT_THE_MOMENT", 44);
    public static final SwapState SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP = new SwapState("SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP", 45);
    public static final SwapState SWAP_UNSUPPORTED_FOR_DAPP = new SwapState("SWAP_UNSUPPORTED_FOR_DAPP", 46);
    public static final SwapState BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP = new SwapState("BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP", 47);
    public static final SwapState LOW_FROM_AMOUNT_FOR_LIMIT = new SwapState("LOW_FROM_AMOUNT_FOR_LIMIT", 48);
    public static final SwapState NONE = new SwapState("NONE", 49);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SwapState[] $values() {
        return new SwapState[]{INIT_SUCCESS, NO_WALLET, SWITCH_WALLET, WALLET_SUCCESS, SWAP_INPUT_SUCCESS, TRACKING_WALLET_SUCCESS, FETCHING_SUCCESS, BALANCE_SUCCESS, STAND_BY_DISH, STAND_BY_LEVERAGE, SAFEMOON_COIN, STAND_BY_DISH_WARNING, STAND_BY_LEVERAGE_WARNING, APPROVE_SUCCESS, APPROVE_ERROR, WALLET_LEGAL, SWAP_INPUT, SWITCH_COIN, BLACK_ADDRESS, NEW_ADDRESS, LIMIT_REGION, MPC_WALLET_LEGAL, SA_NEED_TO_UPDATE_APP, SA_NOT_SMART_ACCOUNT, SA_DISABLED, SA_SERVICE_UPGRADED_ACCOUNT, SA_EXPIRING_SOON, FETCHING_ERROR, FETCHING_NONE, INSUFFICIENT_BALANCE, APPROVING, APPROVE_CONFIRMING, FETCHING_QUOTES, APPROVE, APPROVED_AND_NEED_CANCEL_APPROVE, CANCEL_APPROVING, SWAP, PRE_CHECK_FAIL, ZERO_FORM_AMOUNT, SAFE_MOON_SLIP_ERROR, NoSupportTPLS, HETEROGENEOUS_CHAIN_INVALID, GAS_DROP_STATE, NO_QUOTE_FETCHED, NO_LIQUIDITY_AT_THE_MOMENT, SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP, SWAP_UNSUPPORTED_FOR_DAPP, BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP, LOW_FROM_AMOUNT_FOR_LIMIT, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SwapState> getEntries() {
        return $ENTRIES;
    }

    private SwapState(String str, int i) {
    }

    static {
        SwapState[] swapStateArr$values = $values();
        $VALUES = swapStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(swapStateArr$values);
    }

    public final boolean isDAppRedirectState() {
        return yDY.gEmmrt(SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP, BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP, SWAP_UNSUPPORTED_FOR_DAPP).contains(this);
    }

    public final SwapState isButtonStateInterception(boolean z, boolean z2) {
        return (!z || isDAppRedirectState()) ? this : LIMIT_REGION;
    }

    public static SwapState valueOf(String str) {
        return (SwapState) Enum.valueOf(SwapState.class, str);
    }

    public static SwapState[] values() {
        return (SwapState[]) $VALUES.clone();
    }
}
