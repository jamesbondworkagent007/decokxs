package com.okinc.unify_trade.trade.setting.setting_data;

import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SettingPageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingPageType[] $VALUES;
    private final int titleRes;
    public static final SettingPageType TRADE_MODE = new SettingPageType("TRADE_MODE", 0, C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResult11);
    public static final SettingPageType PREFERENCES = new SettingPageType("PREFERENCES", 1, C55688xof.Application.rememberLauncherForActivityResult);
    public static final SettingPageType LAYOUT = new SettingPageType("LAYOUT", 2, C55688xof.Application.IntegerRes);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingPageType[] $values() {
        return new SettingPageType[]{TRADE_MODE, PREFERENCES, LAYOUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SettingPageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleRes() {
        return this.titleRes;
    }

    private SettingPageType(String str, int i, int i2) {
        this.titleRes = i2;
    }

    static {
        SettingPageType[] settingPageTypeArr$values = $values();
        $VALUES = settingPageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(settingPageTypeArr$values);
    }

    public static SettingPageType valueOf(String str) {
        return (SettingPageType) Enum.valueOf(SettingPageType.class, str);
    }

    public static SettingPageType[] values() {
        return (SettingPageType[]) $VALUES.clone();
    }
}
