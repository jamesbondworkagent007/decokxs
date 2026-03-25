package com.okinc.account.api.model.security;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class LockScreenPage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LockScreenPage[] $VALUES;
    public static final LockScreenPage NONE = new LockScreenPage("NONE", 0);
    public static final LockScreenPage OPEN_APP = new LockScreenPage("OPEN_APP", 1);
    public static final LockScreenPage TRADE = new LockScreenPage("TRADE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LockScreenPage[] $values() {
        return new LockScreenPage[]{NONE, OPEN_APP, TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LockScreenPage> getEntries() {
        return $ENTRIES;
    }

    private LockScreenPage(String str, int i) {
    }

    static {
        LockScreenPage[] lockScreenPageArr$values = $values();
        $VALUES = lockScreenPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lockScreenPageArr$values);
    }

    public static LockScreenPage valueOf(String str) {
        return (LockScreenPage) Enum.valueOf(LockScreenPage.class, str);
    }

    public static LockScreenPage[] values() {
        return (LockScreenPage[]) $VALUES.clone();
    }
}
