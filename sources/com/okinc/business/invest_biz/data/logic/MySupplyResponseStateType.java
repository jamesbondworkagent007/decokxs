package com.okinc.business.invest_biz.data.logic;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class MySupplyResponseStateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MySupplyResponseStateType[] $VALUES;
    public static final MySupplyResponseStateType NORMAL = new MySupplyResponseStateType("NORMAL", 0);
    public static final MySupplyResponseStateType NET_ERRO = new MySupplyResponseStateType("NET_ERRO", 1);
    public static final MySupplyResponseStateType SERVER_ERRRO = new MySupplyResponseStateType("SERVER_ERRRO", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MySupplyResponseStateType[] $values() {
        return new MySupplyResponseStateType[]{NORMAL, NET_ERRO, SERVER_ERRRO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MySupplyResponseStateType> getEntries() {
        return $ENTRIES;
    }

    private MySupplyResponseStateType(String str, int i) {
    }

    static {
        MySupplyResponseStateType[] mySupplyResponseStateTypeArr$values = $values();
        $VALUES = mySupplyResponseStateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mySupplyResponseStateTypeArr$values);
    }

    public static MySupplyResponseStateType valueOf(String str) {
        return (MySupplyResponseStateType) Enum.valueOf(MySupplyResponseStateType.class, str);
    }

    public static MySupplyResponseStateType[] values() {
        return (MySupplyResponseStateType[]) $VALUES.clone();
    }
}
