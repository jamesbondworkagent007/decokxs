package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignType[] $VALUES;
    public static final SignType MESSAGE = new SignType("MESSAGE", 0);
    public static final SignType PERSONAL_MESSAGE = new SignType("PERSONAL_MESSAGE", 1);
    public static final SignType TYPED_MESSAGE = new SignType("TYPED_MESSAGE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignType[] $values() {
        return new SignType[]{MESSAGE, PERSONAL_MESSAGE, TYPED_MESSAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignType> getEntries() {
        return $ENTRIES;
    }

    private SignType(String str, int i) {
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
