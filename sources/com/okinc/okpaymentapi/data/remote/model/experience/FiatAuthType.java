package com.okinc.okpaymentapi.data.remote.model.experience;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class FiatAuthType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FiatAuthType[] $VALUES;
    public static final FiatAuthType MFA = new FiatAuthType("MFA", 0, "MFA");
    public static final FiatAuthType OTP = new FiatAuthType("OTP", 1, "OTP");
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FiatAuthType[] $values() {
        return new FiatAuthType[]{MFA, OTP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FiatAuthType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private FiatAuthType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        FiatAuthType[] fiatAuthTypeArr$values = $values();
        $VALUES = fiatAuthTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fiatAuthTypeArr$values);
    }

    public static FiatAuthType valueOf(String str) {
        return (FiatAuthType) Enum.valueOf(FiatAuthType.class, str);
    }

    public static FiatAuthType[] values() {
        return (FiatAuthType[]) $VALUES.clone();
    }
}
