package com.okinc.im.imui.privacy;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class SettingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingType[] $VALUES;
    public static final SettingType BLOCK_LIST = new SettingType("BLOCK_LIST", 0);
    public static final SettingType AUTO_DOWNLOAD_MEDIA = new SettingType("AUTO_DOWNLOAD_MEDIA", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingType[] $values() {
        return new SettingType[]{BLOCK_LIST, AUTO_DOWNLOAD_MEDIA};
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
