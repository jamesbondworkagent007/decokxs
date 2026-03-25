package com.okinc.auth.impl.passkey.model;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import kotlin.NoWhenBranchMatchedException;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class Fido2VerificationOption {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Fido2VerificationOption[] $VALUES;
    private final String trackValue;
    public static final Fido2VerificationOption EMAIL = new Fido2VerificationOption("EMAIL", 0, "email");
    public static final Fido2VerificationOption SMS = new Fido2VerificationOption("SMS", 1, OtpEventTracker.OTP_EVENT_VALUE_SMS);
    public static final Fido2VerificationOption GA = new Fido2VerificationOption("GA", 2, "ga");
    public static final Fido2VerificationOption FIDO2 = new Fido2VerificationOption(GetAuthenticationTypeResponse.AUTH_TYPE_FIDO2, 3, "fido");

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Fido2VerificationOption.values().length];
            try {
                iArr[Fido2VerificationOption.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Fido2VerificationOption.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Fido2VerificationOption.GA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Fido2VerificationOption.FIDO2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Fido2VerificationOption[] $values() {
        return new Fido2VerificationOption[]{EMAIL, SMS, GA, FIDO2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Fido2VerificationOption> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackValue() {
        return this.trackValue;
    }

    private Fido2VerificationOption(String str, int i, String str2) {
        this.trackValue = str2;
    }

    static {
        Fido2VerificationOption[] fido2VerificationOptionArr$values = $values();
        $VALUES = fido2VerificationOptionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fido2VerificationOptionArr$values);
    }

    public final String toAuthType() {
        int i = Activity.AEQbTJ[ordinal()];
        if (i == 1) {
            return "EMAIL";
        }
        if (i == 2) {
            return "MOBILE";
        }
        if (i == 3) {
            return "AUTHENTICATOR";
        }
        if (i == 4) {
            return GetAuthenticationTypeResponse.AUTH_TYPE_FIDO2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Fido2VerificationOption valueOf(String str) {
        return (Fido2VerificationOption) Enum.valueOf(Fido2VerificationOption.class, str);
    }

    public static Fido2VerificationOption[] values() {
        return (Fido2VerificationOption[]) $VALUES.clone();
    }
}
