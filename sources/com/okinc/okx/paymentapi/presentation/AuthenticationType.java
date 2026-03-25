package com.okinc.okx.paymentapi.presentation;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class AuthenticationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AuthenticationType[] $VALUES;
    public static final AuthenticationType PASSKEY = new AuthenticationType("PASSKEY", 0, "passkey");
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AuthenticationType[] $values() {
        return new AuthenticationType[]{PASSKEY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AuthenticationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private AuthenticationType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        AuthenticationType[] authenticationTypeArr$values = $values();
        $VALUES = authenticationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(authenticationTypeArr$values);
    }

    public static AuthenticationType valueOf(String str) {
        return (AuthenticationType) Enum.valueOf(AuthenticationType.class, str);
    }

    public static AuthenticationType[] values() {
        return (AuthenticationType[]) $VALUES.clone();
    }
}
