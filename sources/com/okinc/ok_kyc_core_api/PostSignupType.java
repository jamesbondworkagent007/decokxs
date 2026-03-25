package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PostSignupType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PostSignupType[] $VALUES;
    private final String value;
    public static final PostSignupType TRUE = new PostSignupType("TRUE", 0, "true");
    public static final PostSignupType FALSE = new PostSignupType("FALSE", 1, "false");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PostSignupType[] $values() {
        return new PostSignupType[]{TRUE, FALSE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PostSignupType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PostSignupType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PostSignupType[] postSignupTypeArr$values = $values();
        $VALUES = postSignupTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(postSignupTypeArr$values);
    }

    public static PostSignupType valueOf(String str) {
        return (PostSignupType) Enum.valueOf(PostSignupType.class, str);
    }

    public static PostSignupType[] values() {
        return (PostSignupType[]) $VALUES.clone();
    }
}
