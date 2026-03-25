package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
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
    public static final SwapState STAND_BY_DISH_WARNING = new SwapState("STAND_BY_DISH_WARNING", 10);
    public static final SwapState APPROVE_SUCCESS = new SwapState("APPROVE_SUCCESS", 11);
    public static final SwapState APPROVE_ERROR = new SwapState("APPROVE_ERROR", 12);
    public static final SwapState WALLET_LEGAL = new SwapState("WALLET_LEGAL", 13);
    public static final SwapState SWAP_INPUT = new SwapState("SWAP_INPUT", 14);
    public static final SwapState SWITCH_COIN = new SwapState("SWITCH_COIN", 15);
    public static final SwapState BLACK_ADDRESS = new SwapState("BLACK_ADDRESS", 16);
    public static final SwapState MPC_WALLET_LEGAL = new SwapState("MPC_WALLET_LEGAL", 17);
    public static final SwapState LIMIT_REGION = new SwapState("LIMIT_REGION", 18);
    public static final SwapState FETCHING_ERROR = new SwapState("FETCHING_ERROR", 19);
    public static final SwapState FETCHING_NONE = new SwapState("FETCHING_NONE", 20);
    public static final SwapState INSUFFICIENT_BALANCE = new SwapState("INSUFFICIENT_BALANCE", 21);
    public static final SwapState APPROVING = new SwapState("APPROVING", 22);
    public static final SwapState APPROVE_CONFIRMING = new SwapState("APPROVE_CONFIRMING", 23);
    public static final SwapState FETCHING_QUOTES = new SwapState("FETCHING_QUOTES", 24);
    public static final SwapState APPROVE = new SwapState("APPROVE", 25);
    public static final SwapState APPROVED_AND_NEED_CANCEL_APPROVE = new SwapState("APPROVED_AND_NEED_CANCEL_APPROVE", 26);
    public static final SwapState CANCEL_APPROVING = new SwapState("CANCEL_APPROVING", 27);
    public static final SwapState REGISTER = new SwapState("REGISTER", 28);
    public static final SwapState REGISTERING = new SwapState("REGISTERING", 29);
    public static final SwapState SWAP = new SwapState("SWAP", 30);
    public static final SwapState SAFE_MOON_SLIP_ERROR = new SwapState("SAFE_MOON_SLIP_ERROR", 31);
    public static final SwapState TEE_NUM_LIMIT_WARNING = new SwapState("TEE_NUM_LIMIT_WARNING", 32);
    public static final SwapState HETEROGENEOUS_CHAIN_INVALID = new SwapState("HETEROGENEOUS_CHAIN_INVALID", 33);
    public static final SwapState GAS_DROP_STATE = new SwapState("GAS_DROP_STATE", 34);
    public static final SwapState FACET_SWAP_WARNING = new SwapState("FACET_SWAP_WARNING", 35);
    public static final SwapState NO_QUOTE_FETCHED = new SwapState("NO_QUOTE_FETCHED", 36);
    public static final SwapState ORBITER_QUOTE_FETCH_FAILED = new SwapState("ORBITER_QUOTE_FETCH_FAILED", 37);
    public static final SwapState NO_LIQUIDITY_AT_THE_MOMENT = new SwapState("NO_LIQUIDITY_AT_THE_MOMENT", 38);
    public static final SwapState CROSS_CHAIN_BRIDGE_UNSUPPORTED = new SwapState("CROSS_CHAIN_BRIDGE_UNSUPPORTED", 39);
    public static final SwapState SCOPE_TIPS_WARNING = new SwapState("SCOPE_TIPS_WARNING", 40);
    public static final SwapState SWAP_THORSWAP_BTC_ADDRESS_ERROR = new SwapState("SWAP_THORSWAP_BTC_ADDRESS_ERROR", 41);
    public static final SwapState SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP = new SwapState("SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP", 42);
    public static final SwapState SWAP_UNSUPPORTED_FOR_DAPP = new SwapState("SWAP_UNSUPPORTED_FOR_DAPP", 43);
    public static final SwapState BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP = new SwapState("BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP", 44);
    public static final SwapState HIGH_PRICE_DIFFERENCE = new SwapState("HIGH_PRICE_DIFFERENCE", 45);
    public static final SwapState SWAP_CONFIG_FETCH_FAILED = new SwapState("SWAP_CONFIG_FETCH_FAILED", 46);
    public static final SwapState SLIPPAGE_REMINDER = new SwapState("SLIPPAGE_REMINDER", 47);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SwapState[] $values() {
        return new SwapState[]{INIT_SUCCESS, NO_WALLET, SWITCH_WALLET, WALLET_SUCCESS, SWAP_INPUT_SUCCESS, TRACKING_WALLET_SUCCESS, FETCHING_SUCCESS, BALANCE_SUCCESS, STAND_BY_DISH, STAND_BY_LEVERAGE, STAND_BY_DISH_WARNING, APPROVE_SUCCESS, APPROVE_ERROR, WALLET_LEGAL, SWAP_INPUT, SWITCH_COIN, BLACK_ADDRESS, MPC_WALLET_LEGAL, LIMIT_REGION, FETCHING_ERROR, FETCHING_NONE, INSUFFICIENT_BALANCE, APPROVING, APPROVE_CONFIRMING, FETCHING_QUOTES, APPROVE, APPROVED_AND_NEED_CANCEL_APPROVE, CANCEL_APPROVING, REGISTER, REGISTERING, SWAP, SAFE_MOON_SLIP_ERROR, TEE_NUM_LIMIT_WARNING, HETEROGENEOUS_CHAIN_INVALID, GAS_DROP_STATE, FACET_SWAP_WARNING, NO_QUOTE_FETCHED, ORBITER_QUOTE_FETCH_FAILED, NO_LIQUIDITY_AT_THE_MOMENT, CROSS_CHAIN_BRIDGE_UNSUPPORTED, SCOPE_TIPS_WARNING, SWAP_THORSWAP_BTC_ADDRESS_ERROR, SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP, SWAP_UNSUPPORTED_FOR_DAPP, BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP, HIGH_PRICE_DIFFERENCE, SWAP_CONFIG_FETCH_FAILED, SLIPPAGE_REMINDER};
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

    public final SwapState isButtonStateInterception(boolean z) {
        return (!z || isDAppRedirectState()) ? this : LIMIT_REGION;
    }

    public static SwapState valueOf(String str) {
        return (SwapState) Enum.valueOf(SwapState.class, str);
    }

    public static SwapState[] values() {
        return (SwapState[]) $VALUES.clone();
    }
}
