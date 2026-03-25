package com.okinc.auth.impl.passkey.model;

import com.google.android.gms.common.internal.ImagesContract;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CredentialType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CredentialType[] $VALUES;
    private final String trackingValue;
    private final String value;
    public static final CredentialType HYBRID = new CredentialType("HYBRID", 0, "hybrid", "hybrid");
    public static final CredentialType INTERNAL = new CredentialType("INTERNAL", 1, ImagesContract.LOCAL, "internal");
    public static final CredentialType USB = new CredentialType("USB", 2, "security_key", "usb");
    public static final CredentialType UNKNOWN = new CredentialType("UNKNOWN", 3, "unknown", "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CredentialType[] $values() {
        return new CredentialType[]{HYBRID, INTERNAL, USB, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CredentialType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private CredentialType(String str, int i, String str2, String str3) {
        this.trackingValue = str2;
        this.value = str3;
    }

    static {
        CredentialType[] credentialTypeArr$values = $values();
        $VALUES = credentialTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(credentialTypeArr$values);
    }

    public static CredentialType valueOf(String str) {
        return (CredentialType) Enum.valueOf(CredentialType.class, str);
    }

    public static CredentialType[] values() {
        return (CredentialType[]) $VALUES.clone();
    }
}
