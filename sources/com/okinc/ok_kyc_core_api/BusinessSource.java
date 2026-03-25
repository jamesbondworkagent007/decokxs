package com.okinc.ok_kyc_core_api;

import com.okinc.p2p.api.OtcExtraKeys;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class BusinessSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BusinessSource[] $VALUES;
    public static final BusinessSource FIAT = new BusinessSource("FIAT", 0, OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK);
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BusinessSource[] $values() {
        return new BusinessSource[]{FIAT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BusinessSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private BusinessSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        BusinessSource[] businessSourceArr$values = $values();
        $VALUES = businessSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(businessSourceArr$values);
    }

    public static BusinessSource valueOf(String str) {
        return (BusinessSource) Enum.valueOf(BusinessSource.class, str);
    }

    public static BusinessSource[] values() {
        return (BusinessSource[]) $VALUES.clone();
    }
}
