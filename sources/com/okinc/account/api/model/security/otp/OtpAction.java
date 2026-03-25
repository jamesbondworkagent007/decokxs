package com.okinc.account.api.model.security.otp;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class OtpAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OtpAction[] $VALUES;
    public static final OtpAction OLD = new OtpAction("OLD", 0);
    public static final OtpAction NEW = new OtpAction("NEW", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OtpAction[] $values() {
        return new OtpAction[]{OLD, NEW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OtpAction> getEntries() {
        return $ENTRIES;
    }

    private OtpAction(String str, int i) {
    }

    static {
        OtpAction[] otpActionArr$values = $values();
        $VALUES = otpActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(otpActionArr$values);
    }

    public static OtpAction valueOf(String str) {
        return (OtpAction) Enum.valueOf(OtpAction.class, str);
    }

    public static OtpAction[] values() {
        return (OtpAction[]) $VALUES.clone();
    }
}
