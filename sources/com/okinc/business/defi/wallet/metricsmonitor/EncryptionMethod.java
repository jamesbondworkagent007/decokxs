package com.okinc.business.defi.wallet.metricsmonitor;

import androidx.autofill.HintConstants;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EncryptionMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EncryptionMethod[] $VALUES;
    private final String stringValue;
    public static final EncryptionMethod PASSWORD = new EncryptionMethod("PASSWORD", 0, HintConstants.AUTOFILL_HINT_PASSWORD);
    public static final EncryptionMethod BIOMETRIC = new EncryptionMethod("BIOMETRIC", 1, "biometric");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EncryptionMethod[] $values() {
        return new EncryptionMethod[]{PASSWORD, BIOMETRIC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EncryptionMethod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStringValue() {
        return this.stringValue;
    }

    private EncryptionMethod(String str, int i, String str2) {
        this.stringValue = str2;
    }

    static {
        EncryptionMethod[] encryptionMethodArr$values = $values();
        $VALUES = encryptionMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(encryptionMethodArr$values);
    }

    public static EncryptionMethod valueOf(String str) {
        return (EncryptionMethod) Enum.valueOf(EncryptionMethod.class, str);
    }

    public static EncryptionMethod[] values() {
        return (EncryptionMethod[]) $VALUES.clone();
    }
}
