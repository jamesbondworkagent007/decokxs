package com.reown.sign.di;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SignDITags {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ SignDITags[] $VALUES;
    public static final SignDITags SERIALIZER_SET = new SignDITags("SERIALIZER_SET", 0);
    public static final SignDITags DESERIALIZER_MAP = new SignDITags("DESERIALIZER_MAP", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ SignDITags[] $values() {
        return new SignDITags[]{SERIALIZER_SET, DESERIALIZER_MAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignDITags> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SignDITags valueOf(String str) {
        return (SignDITags) Enum.valueOf(SignDITags.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SignDITags[] values() {
        return (SignDITags[]) $VALUES.clone();
    }

    public SignDITags(String str, int i) {
    }

    static {
        SignDITags[] signDITagsArr$values = $values();
        $VALUES = signDITagsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signDITagsArr$values);
    }
}
