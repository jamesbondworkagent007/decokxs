package com.okinc.business.defi.common.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class CloudBackupEventCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CloudBackupEventCode[] $VALUES;
    private final int code;
    public static final CloudBackupEventCode SUCCESS = new CloudBackupEventCode("SUCCESS", 0, 0);
    public static final CloudBackupEventCode UNKNOWN_ERROR = new CloudBackupEventCode("UNKNOWN_ERROR", 1, -1);
    public static final CloudBackupEventCode PASSWORD_HASH_MISMATCH = new CloudBackupEventCode("PASSWORD_HASH_MISMATCH", 2, -2);
    public static final CloudBackupEventCode EMPTY_MNEMONIC = new CloudBackupEventCode("EMPTY_MNEMONIC", 3, -3);
    public static final CloudBackupEventCode INVALID_MNEMONIC = new CloudBackupEventCode("INVALID_MNEMONIC", 4, -4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CloudBackupEventCode[] $values() {
        return new CloudBackupEventCode[]{SUCCESS, UNKNOWN_ERROR, PASSWORD_HASH_MISMATCH, EMPTY_MNEMONIC, INVALID_MNEMONIC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CloudBackupEventCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private CloudBackupEventCode(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        CloudBackupEventCode[] cloudBackupEventCodeArr$values = $values();
        $VALUES = cloudBackupEventCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cloudBackupEventCodeArr$values);
    }

    public static CloudBackupEventCode valueOf(String str) {
        return (CloudBackupEventCode) Enum.valueOf(CloudBackupEventCode.class, str);
    }

    public static CloudBackupEventCode[] values() {
        return (CloudBackupEventCode[]) $VALUES.clone();
    }
}
