package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class UpdateInfoSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UpdateInfoSource[] $VALUES;
    public static final UpdateInfoSource ADD_PASSKEY = new UpdateInfoSource("ADD_PASSKEY", 0);
    public static final UpdateInfoSource CHANGE_EMAIL = new UpdateInfoSource("CHANGE_EMAIL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UpdateInfoSource[] $values() {
        return new UpdateInfoSource[]{ADD_PASSKEY, CHANGE_EMAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UpdateInfoSource> getEntries() {
        return $ENTRIES;
    }

    private UpdateInfoSource(String str, int i) {
    }

    static {
        UpdateInfoSource[] updateInfoSourceArr$values = $values();
        $VALUES = updateInfoSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(updateInfoSourceArr$values);
    }

    public static UpdateInfoSource valueOf(String str) {
        return (UpdateInfoSource) Enum.valueOf(UpdateInfoSource.class, str);
    }

    public static UpdateInfoSource[] values() {
        return (UpdateInfoSource[]) $VALUES.clone();
    }
}
