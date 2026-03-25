package com.okinc.unify_trade.tool;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class ResponseStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ResponseStatus[] $VALUES;
    public static final ResponseStatus SUCCESS = new ResponseStatus("SUCCESS", 0);
    public static final ResponseStatus FAIL = new ResponseStatus("FAIL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ResponseStatus[] $values() {
        return new ResponseStatus[]{SUCCESS, FAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ResponseStatus> getEntries() {
        return $ENTRIES;
    }

    private ResponseStatus(String str, int i) {
    }

    static {
        ResponseStatus[] responseStatusArr$values = $values();
        $VALUES = responseStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(responseStatusArr$values);
    }

    public static ResponseStatus valueOf(String str) {
        return (ResponseStatus) Enum.valueOf(ResponseStatus.class, str);
    }

    public static ResponseStatus[] values() {
        return (ResponseStatus[]) $VALUES.clone();
    }
}
