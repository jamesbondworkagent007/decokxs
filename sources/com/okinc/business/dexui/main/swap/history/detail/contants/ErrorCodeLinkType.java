package com.okinc.business.dexui.main.swap.history.detail.contants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ErrorCodeLinkType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ErrorCodeLinkType[] $VALUES;
    public static final ErrorCodeLinkType DEFAULT_TYPE = new ErrorCodeLinkType("DEFAULT_TYPE", 0);
    public static final ErrorCodeLinkType CUSTOMER_SERVICE_TYPE = new ErrorCodeLinkType("CUSTOMER_SERVICE_TYPE", 1);
    public static final ErrorCodeLinkType SHADOW_ASSETS_TYPE = new ErrorCodeLinkType("SHADOW_ASSETS_TYPE", 2);
    public static final ErrorCodeLinkType FACET_REDEEM_TYPE = new ErrorCodeLinkType("FACET_REDEEM_TYPE", 3);
    public static final ErrorCodeLinkType GUIDE_URL_TYPE = new ErrorCodeLinkType("GUIDE_URL_TYPE", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ErrorCodeLinkType[] $values() {
        return new ErrorCodeLinkType[]{DEFAULT_TYPE, CUSTOMER_SERVICE_TYPE, SHADOW_ASSETS_TYPE, FACET_REDEEM_TYPE, GUIDE_URL_TYPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ErrorCodeLinkType> getEntries() {
        return $ENTRIES;
    }

    private ErrorCodeLinkType(String str, int i) {
    }

    static {
        ErrorCodeLinkType[] errorCodeLinkTypeArr$values = $values();
        $VALUES = errorCodeLinkTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(errorCodeLinkTypeArr$values);
    }

    public static ErrorCodeLinkType valueOf(String str) {
        return (ErrorCodeLinkType) Enum.valueOf(ErrorCodeLinkType.class, str);
    }

    public static ErrorCodeLinkType[] values() {
        return (ErrorCodeLinkType[]) $VALUES.clone();
    }
}
