package com.okinc.okex.center.bean.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class LoginRouteCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LoginRouteCode[] $VALUES;
    private final int value;
    public static final LoginRouteCode REQUEST_LOGIN_AND_TO_MY_REQUEST = new LoginRouteCode("REQUEST_LOGIN_AND_TO_MY_REQUEST", 0, 1);
    public static final LoginRouteCode REQUEST_LOGIN_AND_TO_FEEDBACK = new LoginRouteCode("REQUEST_LOGIN_AND_TO_FEEDBACK", 1, 2);
    public static final LoginRouteCode REQUEST_LOGIN_AND_TO_DEEPLINK = new LoginRouteCode("REQUEST_LOGIN_AND_TO_DEEPLINK", 2, 3);
    public static final LoginRouteCode REQUEST_LOGIN_AND_TO_TICKET_DETAIL = new LoginRouteCode("REQUEST_LOGIN_AND_TO_TICKET_DETAIL", 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LoginRouteCode[] $values() {
        return new LoginRouteCode[]{REQUEST_LOGIN_AND_TO_MY_REQUEST, REQUEST_LOGIN_AND_TO_FEEDBACK, REQUEST_LOGIN_AND_TO_DEEPLINK, REQUEST_LOGIN_AND_TO_TICKET_DETAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LoginRouteCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private LoginRouteCode(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LoginRouteCode[] loginRouteCodeArr$values = $values();
        $VALUES = loginRouteCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(loginRouteCodeArr$values);
    }

    public static LoginRouteCode valueOf(String str) {
        return (LoginRouteCode) Enum.valueOf(LoginRouteCode.class, str);
    }

    public static LoginRouteCode[] values() {
        return (LoginRouteCode[]) $VALUES.clone();
    }
}
