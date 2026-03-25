package com.okinc.tradingbot.api.constants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class TacticsDetailsActionEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TacticsDetailsActionEnum[] $VALUES;
    public static final TacticsDetailsActionEnum ACTION_ADD_MARGIN = new TacticsDetailsActionEnum("ACTION_ADD_MARGIN", 0, 1);
    public static final TacticsDetailsActionEnum ACTION_ADD_POSITION = new TacticsDetailsActionEnum("ACTION_ADD_POSITION", 1, 2);
    public static final TacticsDetailsActionEnum ACTION_ADJUST_TP_PRICE = new TacticsDetailsActionEnum("ACTION_ADJUST_TP_PRICE", 2, 3);
    public static final TacticsDetailsActionEnum ACTION_EDIT_PARAM = new TacticsDetailsActionEnum("ACTION_EDIT_PARAM", 3, 4);
    public static final TacticsDetailsActionEnum NAVIGATE_EVENT_HISTORY = new TacticsDetailsActionEnum("NAVIGATE_EVENT_HISTORY", 4, 5);
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TacticsDetailsActionEnum[] $values() {
        return new TacticsDetailsActionEnum[]{ACTION_ADD_MARGIN, ACTION_ADD_POSITION, ACTION_ADJUST_TP_PRICE, ACTION_EDIT_PARAM, NAVIGATE_EVENT_HISTORY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TacticsDetailsActionEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private TacticsDetailsActionEnum(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        TacticsDetailsActionEnum[] tacticsDetailsActionEnumArr$values = $values();
        $VALUES = tacticsDetailsActionEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tacticsDetailsActionEnumArr$values);
    }

    public static TacticsDetailsActionEnum valueOf(String str) {
        return (TacticsDetailsActionEnum) Enum.valueOf(TacticsDetailsActionEnum.class, str);
    }

    public static TacticsDetailsActionEnum[] values() {
        return (TacticsDetailsActionEnum[]) $VALUES.clone();
    }
}
