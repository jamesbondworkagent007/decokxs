package com.okinc.auth.impl.mfa.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class OTP {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OTP[] $VALUES;
    private final String key;
    public static final OTP EMAIL = new OTP("EMAIL", 0, "EMAIL");
    public static final OTP PHONE = new OTP("PHONE", 1, "PHONE");
    public static final OTP SMS = new OTP("SMS", 2, "SMS");
    public static final OTP VOICE = new OTP("VOICE", 3, "VOICE");
    public static final OTP AUTHENTICATOR = new OTP("AUTHENTICATOR", 4, "AUTHENTICATOR");
    public static final OTP PASSKEY = new OTP("PASSKEY", 5, "PASSKEY");
    public static final OTP PASSWORD = new OTP("PASSWORD", 6, "PASSWORD");
    public static final OTP FACE_VERIFY = new OTP("FACE_VERIFY", 7, "FACE_VERIFY");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OTP[] $values() {
        return new OTP[]{EMAIL, PHONE, SMS, VOICE, AUTHENTICATOR, PASSKEY, PASSWORD, FACE_VERIFY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OTP> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private OTP(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        OTP[] otpArr$values = $values();
        $VALUES = otpArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(otpArr$values);
    }

    public static OTP valueOf(String str) {
        return (OTP) Enum.valueOf(OTP.class, str);
    }

    public static OTP[] values() {
        return (OTP[]) $VALUES.clone();
    }
}
