package com.okinc.business.defi.biz.core.password;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CredentialState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CredentialState[] $VALUES;
    public static final CredentialState MANUAL_PASSWORD = new CredentialState("MANUAL_PASSWORD", 0);
    public static final CredentialState SECRET_KEY_EXISTS = new CredentialState("SECRET_KEY_EXISTS", 1);
    public static final CredentialState SECRET_KEY_NOT_EXISTS = new CredentialState("SECRET_KEY_NOT_EXISTS", 2);
    public static final CredentialState NONE = new CredentialState("NONE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CredentialState[] $values() {
        return new CredentialState[]{MANUAL_PASSWORD, SECRET_KEY_EXISTS, SECRET_KEY_NOT_EXISTS, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CredentialState> getEntries() {
        return $ENTRIES;
    }

    private CredentialState(String str, int i) {
    }

    static {
        CredentialState[] credentialStateArr$values = $values();
        $VALUES = credentialStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(credentialStateArr$values);
    }

    public static CredentialState valueOf(String str) {
        return (CredentialState) Enum.valueOf(CredentialState.class, str);
    }

    public static CredentialState[] values() {
        return (CredentialState[]) $VALUES.clone();
    }
}
