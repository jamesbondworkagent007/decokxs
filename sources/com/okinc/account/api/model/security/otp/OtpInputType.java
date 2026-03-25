package com.okinc.account.api.model.security.otp;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OtpInputType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OtpInputType[] $VALUES;
    public static final String AUTHENTICATOR_VALUE = "AUTHENTICATOR";
    public static final Companion Companion;
    public static final String EMAIL_VALUE = "EMAIL";
    public static final String MOBILE_VALUE = "MOBILE";
    private final int type;
    public static final OtpInputType GOOGLE_ONLY = new OtpInputType("GOOGLE_ONLY", 0, 0);
    public static final OtpInputType SMS_ONLY = new OtpInputType("SMS_ONLY", 1, 1);
    public static final OtpInputType EMAIL_ONLY = new OtpInputType("EMAIL_ONLY", 2, 2);
    public static final OtpInputType SMS_GOOGLE = new OtpInputType("SMS_GOOGLE", 3, 3);
    public static final OtpInputType EMAIL_GOOGLE = new OtpInputType("EMAIL_GOOGLE", 4, 4);
    public static final OtpInputType SMS_EMAIL = new OtpInputType("SMS_EMAIL", 5, 5);
    public static final OtpInputType ALL = new OtpInputType("ALL", 6, 6);
    public static final OtpInputType NO_2FA = new OtpInputType("NO_2FA", 7, 9);
    public static final OtpInputType UNKNOWN = new OtpInputType("UNKNOWN", 8, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OtpInputType[] $values() {
        return new OtpInputType[]{GOOGLE_ONLY, SMS_ONLY, EMAIL_ONLY, SMS_GOOGLE, EMAIL_GOOGLE, SMS_EMAIL, ALL, NO_2FA, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OtpInputType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private OtpInputType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        OtpInputType[] otpInputTypeArr$values = $values();
        $VALUES = otpInputTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(otpInputTypeArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.security.otp.OtpInputType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OtpInputType get(int i) {
            OtpInputType[] otpInputTypeArrValues = OtpInputType.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(otpInputTypeArrValues.length), 16));
            for (OtpInputType otpInputType : otpInputTypeArrValues) {
                linkedHashMap.put(Integer.valueOf(otpInputType.ordinal()), otpInputType);
            }
            OtpInputType otpInputType2 = (OtpInputType) linkedHashMap.get(Integer.valueOf(i));
            return otpInputType2 == null ? OtpInputType.UNKNOWN : otpInputType2;
        }

        public final OtpInputType findTypeByType(int i) {
            for (OtpInputType otpInputType : OtpInputType.values()) {
                if (otpInputType.getType() == i) {
                    return otpInputType;
                }
            }
            return null;
        }

        public final OtpInputType findTypeByList(List<String> list) {
            if (list == null) {
                return OtpInputType.NO_2FA;
            }
            if (list.contains("MOBILE") && list.contains("AUTHENTICATOR") && list.contains("EMAIL")) {
                return OtpInputType.ALL;
            }
            return (list.contains("MOBILE") && list.contains("AUTHENTICATOR")) ? OtpInputType.SMS_GOOGLE : (list.contains("MOBILE") && list.contains("EMAIL")) ? OtpInputType.SMS_EMAIL : (list.contains("EMAIL") && list.contains("AUTHENTICATOR")) ? OtpInputType.EMAIL_GOOGLE : list.contains("MOBILE") ? OtpInputType.SMS_ONLY : list.contains("EMAIL") ? OtpInputType.EMAIL_ONLY : list.contains("AUTHENTICATOR") ? OtpInputType.GOOGLE_ONLY : OtpInputType.NO_2FA;
        }
    }

    public static OtpInputType valueOf(String str) {
        return (OtpInputType) Enum.valueOf(OtpInputType.class, str);
    }

    public static OtpInputType[] values() {
        return (OtpInputType[]) $VALUES.clone();
    }
}
