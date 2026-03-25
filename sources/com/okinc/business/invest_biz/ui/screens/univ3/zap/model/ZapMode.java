package com.okinc.business.invest_biz.ui.screens.univ3.zap.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ZapMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ZapMode[] $VALUES;
    public static final ZapMode SINGLE_CRYPTO = new ZapMode("SINGLE_CRYPTO", 0);
    public static final ZapMode DUAL_CRYPTO = new ZapMode("DUAL_CRYPTO", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ZapMode[] $values() {
        return new ZapMode[]{SINGLE_CRYPTO, DUAL_CRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ZapMode> getEntries() {
        return $ENTRIES;
    }

    private ZapMode(String str, int i) {
    }

    static {
        ZapMode[] zapModeArr$values = $values();
        $VALUES = zapModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(zapModeArr$values);
    }

    public static ZapMode valueOf(String str) {
        return (ZapMode) Enum.valueOf(ZapMode.class, str);
    }

    public static ZapMode[] values() {
        return (ZapMode[]) $VALUES.clone();
    }
}
