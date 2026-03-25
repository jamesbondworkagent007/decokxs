package com.reown.android.internal.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class Validation {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ Validation[] $VALUES;
    public static final Validation VALID = new Validation("VALID", 0);
    public static final Validation INVALID = new Validation("INVALID", 1);
    public static final Validation UNKNOWN = new Validation("UNKNOWN", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ Validation[] $values() {
        return new Validation[]{VALID, INVALID, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Validation> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Validation valueOf(String str) {
        return (Validation) Enum.valueOf(Validation.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Validation[] values() {
        return (Validation[]) $VALUES.clone();
    }

    public Validation(String str, int i) {
    }

    static {
        Validation[] validationArr$values = $values();
        $VALUES = validationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(validationArr$values);
    }
}
