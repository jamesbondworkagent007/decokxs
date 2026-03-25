package com.okinc.business.defi.biz.setting;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class SwitchType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SwitchType[] $VALUES;
    public static final SwitchType INCLUDE_NFT_TO_TOTAL_ASSETS = new SwitchType("INCLUDE_NFT_TO_TOTAL_ASSETS", 0);
    public static final SwitchType HIDE_SMALL_ASSET = new SwitchType("HIDE_SMALL_ASSET", 1);
    public static final SwitchType TOUCH_SWITCH = new SwitchType("TOUCH_SWITCH", 2);
    public static final SwitchType SCREENSHOT_SHARING = new SwitchType("SCREENSHOT_SHARING", 3);
    public static final SwitchType HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION = new SwitchType("HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION", 4);
    public static final SwitchType HIDE_LOW_VALUE_ASSET = new SwitchType("HIDE_LOW_VALUE_ASSET", 5);
    public static final SwitchType SHOW_DEX_POSITIONS_WIDGET = new SwitchType("SHOW_DEX_POSITIONS_WIDGET", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SwitchType[] $values() {
        return new SwitchType[]{INCLUDE_NFT_TO_TOTAL_ASSETS, HIDE_SMALL_ASSET, TOUCH_SWITCH, SCREENSHOT_SHARING, HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION, HIDE_LOW_VALUE_ASSET, SHOW_DEX_POSITIONS_WIDGET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SwitchType> getEntries() {
        return $ENTRIES;
    }

    private SwitchType(String str, int i) {
    }

    static {
        SwitchType[] switchTypeArr$values = $values();
        $VALUES = switchTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(switchTypeArr$values);
    }

    public static SwitchType valueOf(String str) {
        return (SwitchType) Enum.valueOf(SwitchType.class, str);
    }

    public static SwitchType[] values() {
        return (SwitchType[]) $VALUES.clone();
    }
}
