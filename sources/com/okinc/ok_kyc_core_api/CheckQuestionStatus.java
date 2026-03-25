package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CheckQuestionStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CheckQuestionStatus[] $VALUES;
    public static final CheckQuestionStatus JUMP_KYC = new CheckQuestionStatus("JUMP_KYC", 0);
    public static final CheckQuestionStatus ONBOARDING = new CheckQuestionStatus("ONBOARDING", 1);
    public static final CheckQuestionStatus GO_TRANSACTION = new CheckQuestionStatus("GO_TRANSACTION", 2);
    public static final CheckQuestionStatus NETWORK_ERROR = new CheckQuestionStatus("NETWORK_ERROR", 3);
    public static final CheckQuestionStatus NONE = new CheckQuestionStatus("NONE", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CheckQuestionStatus[] $values() {
        return new CheckQuestionStatus[]{JUMP_KYC, ONBOARDING, GO_TRANSACTION, NETWORK_ERROR, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CheckQuestionStatus> getEntries() {
        return $ENTRIES;
    }

    private CheckQuestionStatus(String str, int i) {
    }

    static {
        CheckQuestionStatus[] checkQuestionStatusArr$values = $values();
        $VALUES = checkQuestionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(checkQuestionStatusArr$values);
    }

    public static CheckQuestionStatus valueOf(String str) {
        return (CheckQuestionStatus) Enum.valueOf(CheckQuestionStatus.class, str);
    }

    public static CheckQuestionStatus[] values() {
        return (CheckQuestionStatus[]) $VALUES.clone();
    }
}
