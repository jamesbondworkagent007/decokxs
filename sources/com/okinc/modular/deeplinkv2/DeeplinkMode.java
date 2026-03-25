package com.okinc.modular.deeplinkv2;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DeeplinkMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DeeplinkMode[] $VALUES;
    private final String mode;
    public static final DeeplinkMode APP = new DeeplinkMode(GrsBaseInfo.CountryCodeSource.APP, 0, "app");
    public static final DeeplinkMode WALLET = new DeeplinkMode("WALLET", 1, "web3");
    public static final DeeplinkMode PRO = new DeeplinkMode("PRO", 2, "pro");
    public static final DeeplinkMode LITE = new DeeplinkMode("LITE", 3, "lite");
    public static final DeeplinkMode PAY = new DeeplinkMode("PAY", 4, "pay");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DeeplinkMode[] $values() {
        return new DeeplinkMode[]{APP, WALLET, PRO, LITE, PAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DeeplinkMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    private DeeplinkMode(String str, int i, String str2) {
        this.mode = str2;
    }

    static {
        DeeplinkMode[] deeplinkModeArr$values = $values();
        $VALUES = deeplinkModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(deeplinkModeArr$values);
    }

    public static DeeplinkMode valueOf(String str) {
        return (DeeplinkMode) Enum.valueOf(DeeplinkMode.class, str);
    }

    public static DeeplinkMode[] values() {
        return (DeeplinkMode[]) $VALUES.clone();
    }
}
