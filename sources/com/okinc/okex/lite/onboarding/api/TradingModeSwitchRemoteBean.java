package com.okinc.okex.lite.onboarding.api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class TradingModeSwitchRemoteBean {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradingModeSwitchRemoteBean[] $VALUES;
    private final int value;
    public static final TradingModeSwitchRemoteBean UNKNOWN = new TradingModeSwitchRemoteBean("UNKNOWN", 0, 0);
    public static final TradingModeSwitchRemoteBean SIMPLE = new TradingModeSwitchRemoteBean("SIMPLE", 1, 1);
    public static final TradingModeSwitchRemoteBean ADVANCED = new TradingModeSwitchRemoteBean("ADVANCED", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradingModeSwitchRemoteBean[] $values() {
        return new TradingModeSwitchRemoteBean[]{UNKNOWN, SIMPLE, ADVANCED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradingModeSwitchRemoteBean> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TradingModeSwitchRemoteBean(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TradingModeSwitchRemoteBean[] tradingModeSwitchRemoteBeanArr$values = $values();
        $VALUES = tradingModeSwitchRemoteBeanArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradingModeSwitchRemoteBeanArr$values);
    }

    public static TradingModeSwitchRemoteBean valueOf(String str) {
        return (TradingModeSwitchRemoteBean) Enum.valueOf(TradingModeSwitchRemoteBean.class, str);
    }

    public static TradingModeSwitchRemoteBean[] values() {
        return (TradingModeSwitchRemoteBean[]) $VALUES.clone();
    }
}
