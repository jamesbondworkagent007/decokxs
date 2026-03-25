package com.okinc.tradingbot.impl.aiBot.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ParamType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ParamType[] $VALUES;
    public static final ParamType INTEGER = new ParamType("INTEGER", 0);
    public static final ParamType DECIMAL = new ParamType("DECIMAL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ParamType[] $values() {
        return new ParamType[]{INTEGER, DECIMAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ParamType> getEntries() {
        return $ENTRIES;
    }

    private ParamType(String str, int i) {
    }

    static {
        ParamType[] paramTypeArr$values = $values();
        $VALUES = paramTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paramTypeArr$values);
    }

    public static ParamType valueOf(String str) {
        return (ParamType) Enum.valueOf(ParamType.class, str);
    }

    public static ParamType[] values() {
        return (ParamType[]) $VALUES.clone();
    }
}
