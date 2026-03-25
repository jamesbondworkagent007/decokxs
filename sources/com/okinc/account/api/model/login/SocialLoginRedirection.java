package com.okinc.account.api.model.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class SocialLoginRedirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SocialLoginRedirection[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final SocialLoginRedirection LINK_EXISTING = new SocialLoginRedirection("LINK_EXISTING", 0, "BIND_EXISTING");
    public static final SocialLoginRedirection SIGN_UP = new SocialLoginRedirection("SIGN_UP", 1, "SIGN_UP");
    public static final SocialLoginRedirection MAIN_LOGIN = new SocialLoginRedirection("MAIN_LOGIN", 2, "MAIN_LOGIN");
    public static final SocialLoginRedirection TELEGRAM_LOGIN_SIGNUP = new SocialLoginRedirection("TELEGRAM_LOGIN_SIGNUP", 3, "FULL_REG");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SocialLoginRedirection[] $values() {
        return new SocialLoginRedirection[]{LINK_EXISTING, SIGN_UP, MAIN_LOGIN, TELEGRAM_LOGIN_SIGNUP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SocialLoginRedirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SocialLoginRedirection(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SocialLoginRedirection[] socialLoginRedirectionArr$values = $values();
        $VALUES = socialLoginRedirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(socialLoginRedirectionArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.SocialLoginRedirection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SocialLoginRedirection from(String str) {
            for (SocialLoginRedirection socialLoginRedirection : SocialLoginRedirection.values()) {
                if (Intrinsics.EZpvd((Object) socialLoginRedirection.getValue(), (Object) str)) {
                    return socialLoginRedirection;
                }
            }
            return null;
        }
    }

    public static SocialLoginRedirection valueOf(String str) {
        return (SocialLoginRedirection) Enum.valueOf(SocialLoginRedirection.class, str);
    }

    public static SocialLoginRedirection[] values() {
        return (SocialLoginRedirection[]) $VALUES.clone();
    }
}
