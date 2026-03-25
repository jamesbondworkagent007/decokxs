package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MfaOtpAuthType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MfaOtpAuthType[] $VALUES;
    public static final MfaOtpAuthType EMAIL = new MfaOtpAuthType("EMAIL", 0);
    public static final MfaOtpAuthType PHONE = new MfaOtpAuthType("PHONE", 1);
    public static final MfaOtpAuthType VOICE = new MfaOtpAuthType("VOICE", 2);
    public static final MfaOtpAuthType AUTHENTICATOR = new MfaOtpAuthType("AUTHENTICATOR", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MfaOtpAuthType[] $values() {
        return new MfaOtpAuthType[]{EMAIL, PHONE, VOICE, AUTHENTICATOR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MfaOtpAuthType> getEntries() {
        return $ENTRIES;
    }

    private MfaOtpAuthType(String str, int i) {
    }

    static {
        MfaOtpAuthType[] mfaOtpAuthTypeArr$values = $values();
        $VALUES = mfaOtpAuthTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mfaOtpAuthTypeArr$values);
    }

    public static MfaOtpAuthType valueOf(String str) {
        return (MfaOtpAuthType) Enum.valueOf(MfaOtpAuthType.class, str);
    }

    public static MfaOtpAuthType[] values() {
        return (MfaOtpAuthType[]) $VALUES.clone();
    }
}
