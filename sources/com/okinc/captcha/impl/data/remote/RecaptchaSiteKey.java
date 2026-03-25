package com.okinc.captcha.impl.data.remote;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RecaptchaSiteKey {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecaptchaSiteKey[] $VALUES;
    private final String key;
    public static final RecaptchaSiteKey SCORE = new RecaptchaSiteKey("SCORE", 0, "6LcqqREsAAAAAL9eVDomRbdVojjf3IXO1GmTvV0B");
    public static final RecaptchaSiteKey CHECKBOX = new RecaptchaSiteKey("CHECKBOX", 1, "6LcjrhEsAAAAAK7OI8zXQC9G9QcgHu4skNMtlMHq");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecaptchaSiteKey[] $values() {
        return new RecaptchaSiteKey[]{SCORE, CHECKBOX};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecaptchaSiteKey> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private RecaptchaSiteKey(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        RecaptchaSiteKey[] recaptchaSiteKeyArr$values = $values();
        $VALUES = recaptchaSiteKeyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recaptchaSiteKeyArr$values);
    }

    public static RecaptchaSiteKey valueOf(String str) {
        return (RecaptchaSiteKey) Enum.valueOf(RecaptchaSiteKey.class, str);
    }

    public static RecaptchaSiteKey[] values() {
        return (RecaptchaSiteKey[]) $VALUES.clone();
    }
}
