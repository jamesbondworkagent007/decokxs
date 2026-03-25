package com.okinc.business.defi.biz.setting;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class SettingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingType[] $VALUES;
    public static final SettingType FIAT_SWITCH = new SettingType("FIAT_SWITCH", 0);
    public static final SettingType NIGHT_MODE = new SettingType("NIGHT_MODE", 1);
    public static final SettingType SELECT_LANG = new SettingType("SELECT_LANG", 2);
    public static final SettingType RISE_FALL_COLOR = new SettingType("RISE_FALL_COLOR", 3);
    public static final SettingType ASSET_DISPLAY_RULES = new SettingType("ASSET_DISPLAY_RULES", 4);
    public static final SettingType INTERACTION_PRIVACY_RULES = new SettingType("INTERACTION_PRIVACY_RULES", 5);
    public static final SettingType HIDE_LOW_VALUE_ASSET_TINY_THRESHOLD = new SettingType("HIDE_LOW_VALUE_ASSET_TINY_THRESHOLD", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingType[] $values() {
        return new SettingType[]{FIAT_SWITCH, NIGHT_MODE, SELECT_LANG, RISE_FALL_COLOR, ASSET_DISPLAY_RULES, INTERACTION_PRIVACY_RULES, HIDE_LOW_VALUE_ASSET_TINY_THRESHOLD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SettingType> getEntries() {
        return $ENTRIES;
    }

    private SettingType(String str, int i) {
    }

    static {
        SettingType[] settingTypeArr$values = $values();
        $VALUES = settingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(settingTypeArr$values);
    }

    public static SettingType valueOf(String str) {
        return (SettingType) Enum.valueOf(SettingType.class, str);
    }

    public static SettingType[] values() {
        return (SettingType[]) $VALUES.clone();
    }
}
