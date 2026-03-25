package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class AccountSceneType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountSceneType[] $VALUES;
    public static final AccountSceneType SCENE_ESCAPE = new AccountSceneType("SCENE_ESCAPE", 0, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountSceneType[] $values() {
        return new AccountSceneType[]{SCENE_ESCAPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountSceneType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AccountSceneType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AccountSceneType[] accountSceneTypeArr$values = $values();
        $VALUES = accountSceneTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountSceneTypeArr$values);
    }

    public static AccountSceneType valueOf(String str) {
        return (AccountSceneType) Enum.valueOf(AccountSceneType.class, str);
    }

    public static AccountSceneType[] values() {
        return (AccountSceneType[]) $VALUES.clone();
    }
}
