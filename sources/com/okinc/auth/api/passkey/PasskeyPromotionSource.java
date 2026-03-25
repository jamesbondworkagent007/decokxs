package com.okinc.auth.api.passkey;

import com.google.firebase.analytics.FirebaseAnalytics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyPromotionSource[] $VALUES;
    private final String value;
    public static final PasskeyPromotionSource DIRECTLY = new PasskeyPromotionSource("DIRECTLY", 0, "directly");
    public static final PasskeyPromotionSource ALERT_MODULE = new PasskeyPromotionSource("ALERT_MODULE", 1, "alert_module");
    public static final PasskeyPromotionSource SECURITY_CENTER = new PasskeyPromotionSource("SECURITY_CENTER", 2, "security_center");
    public static final PasskeyPromotionSource SIGNUP = new PasskeyPromotionSource("SIGNUP", 3, "signup");
    public static final PasskeyPromotionSource LOGIN = new PasskeyPromotionSource("LOGIN", 4, FirebaseAnalytics.Event.LOGIN);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyPromotionSource[] $values() {
        return new PasskeyPromotionSource[]{DIRECTLY, ALERT_MODULE, SECURITY_CENTER, SIGNUP, LOGIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyPromotionSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PasskeyPromotionSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PasskeyPromotionSource[] passkeyPromotionSourceArr$values = $values();
        $VALUES = passkeyPromotionSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyPromotionSourceArr$values);
    }

    public static PasskeyPromotionSource valueOf(String str) {
        return (PasskeyPromotionSource) Enum.valueOf(PasskeyPromotionSource.class, str);
    }

    public static PasskeyPromotionSource[] values() {
        return (PasskeyPromotionSource[]) $VALUES.clone();
    }
}
