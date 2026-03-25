package com.okinc.planet.biz_content.input;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ValidationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ValidationStatus[] $VALUES;
    public static final ValidationStatus PASS = new ValidationStatus("PASS", 0);
    public static final ValidationStatus FAIL = new ValidationStatus("FAIL", 1);
    public static final ValidationStatus WARNING = new ValidationStatus("WARNING", 2);
    public static final ValidationStatus PENDING = new ValidationStatus(CardSyncResponse.PENDING, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ValidationStatus[] $values() {
        return new ValidationStatus[]{PASS, FAIL, WARNING, PENDING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ValidationStatus> getEntries() {
        return $ENTRIES;
    }

    private ValidationStatus(String str, int i) {
    }

    static {
        ValidationStatus[] validationStatusArr$values = $values();
        $VALUES = validationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(validationStatusArr$values);
    }

    public static ValidationStatus valueOf(String str) {
        return (ValidationStatus) Enum.valueOf(ValidationStatus.class, str);
    }

    public static ValidationStatus[] values() {
        return (ValidationStatus[]) $VALUES.clone();
    }
}
