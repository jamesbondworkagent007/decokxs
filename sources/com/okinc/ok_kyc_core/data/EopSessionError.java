package com.okinc.ok_kyc_core.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class EopSessionError {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EopSessionError[] $VALUES;
    private final int code;
    private final String message;
    public static final EopSessionError CANCELLED_BY_USER = new EopSessionError("CANCELLED_BY_USER", 0, 101, "CANCELLED_BY_USER");
    public static final EopSessionError NOT_SUPPORTED_TASK = new EopSessionError("NOT_SUPPORTED_TASK", 1, 102, "NOT_SUPPORTED_TASK");
    public static final EopSessionError EMPTY_TASK = new EopSessionError("EMPTY_TASK", 2, 103, "EMPTY_TASK");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EopSessionError[] $values() {
        return new EopSessionError[]{CANCELLED_BY_USER, NOT_SUPPORTED_TASK, EMPTY_TASK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EopSessionError> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    private EopSessionError(String str, int i, int i2, String str2) {
        this.code = i2;
        this.message = str2;
    }

    static {
        EopSessionError[] eopSessionErrorArr$values = $values();
        $VALUES = eopSessionErrorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eopSessionErrorArr$values);
    }

    public static EopSessionError valueOf(String str) {
        return (EopSessionError) Enum.valueOf(EopSessionError.class, str);
    }

    public static EopSessionError[] values() {
        return (EopSessionError[]) $VALUES.clone();
    }
}
