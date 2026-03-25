package com.okinc.wallet.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ReferralCodeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReferralCodeType[] $VALUES;
    private final int type;
    public static final ReferralCodeType CODE_TYPE_BIND_FRONTEND = new ReferralCodeType("CODE_TYPE_BIND_FRONTEND", 0, 0);
    public static final ReferralCodeType CODE_TYPE_DEEPLINK = new ReferralCodeType("CODE_TYPE_DEEPLINK", 1, 1);
    public static final ReferralCodeType CODE_TYPE_BIND_BACKEND = new ReferralCodeType("CODE_TYPE_BIND_BACKEND", 2, 2);
    public static final ReferralCodeType CODE_TYPE_BIND_DEVICE = new ReferralCodeType("CODE_TYPE_BIND_DEVICE", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReferralCodeType[] $values() {
        return new ReferralCodeType[]{CODE_TYPE_BIND_FRONTEND, CODE_TYPE_DEEPLINK, CODE_TYPE_BIND_BACKEND, CODE_TYPE_BIND_DEVICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReferralCodeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private ReferralCodeType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ReferralCodeType[] referralCodeTypeArr$values = $values();
        $VALUES = referralCodeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(referralCodeTypeArr$values);
    }

    public static ReferralCodeType valueOf(String str) {
        return (ReferralCodeType) Enum.valueOf(ReferralCodeType.class, str);
    }

    public static ReferralCodeType[] values() {
        return (ReferralCodeType[]) $VALUES.clone();
    }
}
