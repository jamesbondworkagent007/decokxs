package com.amplifyframework.auth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class MFAType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MFAType[] $VALUES;
    public static final MFAType SMS = new MFAType("SMS", 0);
    public static final MFAType TOTP = new MFAType("TOTP", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MFAType[] $values() {
        return new MFAType[]{SMS, TOTP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MFAType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static MFAType valueOf(String str) {
        return (MFAType) Enum.valueOf(MFAType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static MFAType[] values() {
        return (MFAType[]) $VALUES.clone();
    }

    private MFAType(String str, int i) {
    }

    static {
        MFAType[] mFATypeArr$values = $values();
        $VALUES = mFATypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mFATypeArr$values);
    }
}
