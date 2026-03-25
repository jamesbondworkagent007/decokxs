package com.okinc.wallet.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class CheckReferralResult {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CheckReferralResult[] $VALUES;
    public static final CheckReferralResult SUCCESS = new CheckReferralResult("SUCCESS", 0);
    public static final CheckReferralResult VERSION_INVALID = new CheckReferralResult("VERSION_INVALID", 1);
    public static final CheckReferralResult FAIL = new CheckReferralResult("FAIL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CheckReferralResult[] $values() {
        return new CheckReferralResult[]{SUCCESS, VERSION_INVALID, FAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CheckReferralResult> getEntries() {
        return $ENTRIES;
    }

    private CheckReferralResult(String str, int i) {
    }

    static {
        CheckReferralResult[] checkReferralResultArr$values = $values();
        $VALUES = checkReferralResultArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(checkReferralResultArr$values);
    }

    public static CheckReferralResult valueOf(String str) {
        return (CheckReferralResult) Enum.valueOf(CheckReferralResult.class, str);
    }

    public static CheckReferralResult[] values() {
        return (CheckReferralResult[]) $VALUES.clone();
    }
}
