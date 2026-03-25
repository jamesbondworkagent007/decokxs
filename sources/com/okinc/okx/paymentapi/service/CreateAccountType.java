package com.okinc.okx.paymentapi.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class CreateAccountType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CreateAccountType[] $VALUES;
    public static final CreateAccountType CREATE_NEW_ACCOUNT = new CreateAccountType("CREATE_NEW_ACCOUNT", 0);
    public static final CreateAccountType RE_LINK = new CreateAccountType("RE_LINK", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CreateAccountType[] $values() {
        return new CreateAccountType[]{CREATE_NEW_ACCOUNT, RE_LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CreateAccountType> getEntries() {
        return $ENTRIES;
    }

    private CreateAccountType(String str, int i) {
    }

    static {
        CreateAccountType[] createAccountTypeArr$values = $values();
        $VALUES = createAccountTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(createAccountTypeArr$values);
    }

    public static CreateAccountType valueOf(String str) {
        return (CreateAccountType) Enum.valueOf(CreateAccountType.class, str);
    }

    public static CreateAccountType[] values() {
        return (CreateAccountType[]) $VALUES.clone();
    }
}
