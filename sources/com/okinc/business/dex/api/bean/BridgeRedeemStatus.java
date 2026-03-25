package com.okinc.business.dex.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class BridgeRedeemStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BridgeRedeemStatus[] $VALUES;
    public static final BridgeRedeemStatus RedeemCallDataFailed = new BridgeRedeemStatus("RedeemCallDataFailed", 0);
    public static final BridgeRedeemStatus BroadcastFailed = new BridgeRedeemStatus("BroadcastFailed", 1);
    public static final BridgeRedeemStatus BroadcastSuccess = new BridgeRedeemStatus("BroadcastSuccess", 2);
    public static final BridgeRedeemStatus RedeemCancelledOrFailed = new BridgeRedeemStatus("RedeemCancelledOrFailed", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BridgeRedeemStatus[] $values() {
        return new BridgeRedeemStatus[]{RedeemCallDataFailed, BroadcastFailed, BroadcastSuccess, RedeemCancelledOrFailed};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BridgeRedeemStatus> getEntries() {
        return $ENTRIES;
    }

    private BridgeRedeemStatus(String str, int i) {
    }

    static {
        BridgeRedeemStatus[] bridgeRedeemStatusArr$values = $values();
        $VALUES = bridgeRedeemStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bridgeRedeemStatusArr$values);
    }

    public static BridgeRedeemStatus valueOf(String str) {
        return (BridgeRedeemStatus) Enum.valueOf(BridgeRedeemStatus.class, str);
    }

    public static BridgeRedeemStatus[] values() {
        return (BridgeRedeemStatus[]) $VALUES.clone();
    }
}
