package com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignType[] $VALUES;
    private final int type;
    public static final SignType SignTypeUnknown = new SignType("SignTypeUnknown", 0, 0);
    public static final SignType SignTypeAmino = new SignType("SignTypeAmino", 1, 1);
    public static final SignType SignTypeDirect = new SignType("SignTypeDirect", 2, 2);
    public static final SignType SignTypeArbitrary = new SignType("SignTypeArbitrary", 3, 3);
    public static final SignType SignTypeAminoMsg = new SignType("SignTypeAminoMsg", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignType[] $values() {
        return new SignType[]{SignTypeUnknown, SignTypeAmino, SignTypeDirect, SignTypeArbitrary, SignTypeAminoMsg};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private SignType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        SignType[] signTypeArr$values = $values();
        $VALUES = signTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signTypeArr$values);
    }

    public static SignType valueOf(String str) {
        return (SignType) Enum.valueOf(SignType.class, str);
    }

    public static SignType[] values() {
        return (SignType[]) $VALUES.clone();
    }
}
