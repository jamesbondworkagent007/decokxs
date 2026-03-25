package com.okinc.business.defi.common.password;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class SilentSignErrorCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SilentSignErrorCode[] $VALUES;
    private final int code;
    public static final SilentSignErrorCode CHECK_PWD_AND_HASH = new SilentSignErrorCode("CHECK_PWD_AND_HASH", 0, -998);
    public static final SilentSignErrorCode CHECK_DECODE_DATA = new SilentSignErrorCode("CHECK_DECODE_DATA", 1, -997);
    public static final SilentSignErrorCode ACCESSIBILITY_RISK = new SilentSignErrorCode("ACCESSIBILITY_RISK", 2, -996);
    public static final SilentSignErrorCode DEVICE_ENV_RISK = new SilentSignErrorCode("DEVICE_ENV_RISK", 3, -995);
    public static final SilentSignErrorCode UNKNOWN = new SilentSignErrorCode("UNKNOWN", 4, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SilentSignErrorCode[] $values() {
        return new SilentSignErrorCode[]{CHECK_PWD_AND_HASH, CHECK_DECODE_DATA, ACCESSIBILITY_RISK, DEVICE_ENV_RISK, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SilentSignErrorCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private SilentSignErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        SilentSignErrorCode[] silentSignErrorCodeArr$values = $values();
        $VALUES = silentSignErrorCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(silentSignErrorCodeArr$values);
    }

    public static SilentSignErrorCode valueOf(String str) {
        return (SilentSignErrorCode) Enum.valueOf(SilentSignErrorCode.class, str);
    }

    public static SilentSignErrorCode[] values() {
        return (SilentSignErrorCode[]) $VALUES.clone();
    }
}
