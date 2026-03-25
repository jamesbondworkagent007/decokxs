package com.okinc.okex.common.util;

import com.okinc.liveness.lca.EopTrackEvent;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ServerErrorField {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ServerErrorField[] $VALUES;
    public static final ServerErrorField ErrorMsg = new ServerErrorField("ErrorMsg", 0, EopTrackEvent.KEY_ERROR_MSG);
    public static final ServerErrorField Msg = new ServerErrorField("Msg", 1, "msg");
    private final String fieldName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ServerErrorField[] $values() {
        return new ServerErrorField[]{ErrorMsg, Msg};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ServerErrorField> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldName() {
        return this.fieldName;
    }

    private ServerErrorField(String str, int i, String str2) {
        this.fieldName = str2;
    }

    static {
        ServerErrorField[] serverErrorFieldArr$values = $values();
        $VALUES = serverErrorFieldArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(serverErrorFieldArr$values);
    }

    public static ServerErrorField valueOf(String str) {
        return (ServerErrorField) Enum.valueOf(ServerErrorField.class, str);
    }

    public static ServerErrorField[] values() {
        return (ServerErrorField[]) $VALUES.clone();
    }
}
