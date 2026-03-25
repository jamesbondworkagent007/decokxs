package com.okinc.business.defi.wallet.common.tonconnect.model;

import kotlinx.serialization.SerialName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class TonNetwork {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TonNetwork[] $VALUES;

    @SerialName("-239")
    public static final TonNetwork MAIN_NET = new TonNetwork("MAIN_NET", 0);

    @SerialName("-3")
    public static final TonNetwork TEST_NET = new TonNetwork("TEST_NET", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TonNetwork[] $values() {
        return new TonNetwork[]{MAIN_NET, TEST_NET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TonNetwork> getEntries() {
        return $ENTRIES;
    }

    private TonNetwork(String str, int i) {
    }

    static {
        TonNetwork[] tonNetworkArr$values = $values();
        $VALUES = tonNetworkArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tonNetworkArr$values);
    }

    public static TonNetwork valueOf(String str) {
        return (TonNetwork) Enum.valueOf(TonNetwork.class, str);
    }

    public static TonNetwork[] values() {
        return (TonNetwork[]) $VALUES.clone();
    }
}
