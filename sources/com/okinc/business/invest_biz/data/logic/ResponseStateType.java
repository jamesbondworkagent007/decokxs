package com.okinc.business.invest_biz.data.logic;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ResponseStateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ResponseStateType[] $VALUES;
    public static final ResponseStateType NORMAL = new ResponseStateType("NORMAL", 0);
    public static final ResponseStateType NET_ERRO = new ResponseStateType("NET_ERRO", 1);
    public static final ResponseStateType SERVER_ERRRO = new ResponseStateType("SERVER_ERRRO", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ResponseStateType[] $values() {
        return new ResponseStateType[]{NORMAL, NET_ERRO, SERVER_ERRRO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ResponseStateType> getEntries() {
        return $ENTRIES;
    }

    private ResponseStateType(String str, int i) {
    }

    static {
        ResponseStateType[] responseStateTypeArr$values = $values();
        $VALUES = responseStateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(responseStateTypeArr$values);
    }

    public static ResponseStateType valueOf(String str) {
        return (ResponseStateType) Enum.valueOf(ResponseStateType.class, str);
    }

    public static ResponseStateType[] values() {
        return (ResponseStateType[]) $VALUES.clone();
    }
}
