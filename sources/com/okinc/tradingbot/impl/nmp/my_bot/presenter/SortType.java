package com.okinc.tradingbot.impl.nmp.my_bot.presenter;

import androidx.annotation.StringRes;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SortType[] $VALUES;
    public static final SortType BOT = new SortType("BOT", 0, C55688xof.Application.QVMIlx);
    public static final SortType SIGNAL = new SortType("SIGNAL", 1, C55688xof.Application.HJWChPfvRMlC);
    private final int title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SortType[] $values() {
        return new SortType[]{BOT, SIGNAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private SortType(@StringRes String str, int i, int i2) {
        this.title = i2;
    }

    static {
        SortType[] sortTypeArr$values = $values();
        $VALUES = sortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sortTypeArr$values);
    }

    public static SortType valueOf(String str) {
        return (SortType) Enum.valueOf(SortType.class, str);
    }

    public static SortType[] values() {
        return (SortType[]) $VALUES.clone();
    }
}
