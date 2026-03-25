package com.okinc.biz.net.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SignTypeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignTypeEnum[] $VALUES;
    private final String type;
    public static final SignTypeEnum R1 = new SignTypeEnum("R1", 0, "R1");
    public static final SignTypeEnum K1 = new SignTypeEnum("K1", 1, "K1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignTypeEnum[] $values() {
        return new SignTypeEnum[]{R1, K1};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignTypeEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private SignTypeEnum(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        SignTypeEnum[] signTypeEnumArr$values = $values();
        $VALUES = signTypeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signTypeEnumArr$values);
    }

    public static SignTypeEnum valueOf(String str) {
        return (SignTypeEnum) Enum.valueOf(SignTypeEnum.class, str);
    }

    public static SignTypeEnum[] values() {
        return (SignTypeEnum[]) $VALUES.clone();
    }
}
