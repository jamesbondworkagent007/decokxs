package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AdditionalInfoFields {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdditionalInfoFields[] $VALUES;
    public static final AdditionalInfoFields CPF = new AdditionalInfoFields("CPF", 0, "cpfNumber");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdditionalInfoFields[] $values() {
        return new AdditionalInfoFields[]{CPF};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdditionalInfoFields> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AdditionalInfoFields(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdditionalInfoFields[] additionalInfoFieldsArr$values = $values();
        $VALUES = additionalInfoFieldsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(additionalInfoFieldsArr$values);
    }

    public static AdditionalInfoFields valueOf(String str) {
        return (AdditionalInfoFields) Enum.valueOf(AdditionalInfoFields.class, str);
    }

    public static AdditionalInfoFields[] values() {
        return (AdditionalInfoFields[]) $VALUES.clone();
    }
}
