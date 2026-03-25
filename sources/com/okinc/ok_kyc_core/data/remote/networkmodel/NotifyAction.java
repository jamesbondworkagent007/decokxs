package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.liveness.lca.EopTrackEvent;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class NotifyAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NotifyAction[] $VALUES;
    private final String action;
    public static final NotifyAction ONBOARDING = new NotifyAction("ONBOARDING", 0, "onboarding");
    public static final NotifyAction DIALOG = new NotifyAction("DIALOG", 1, "dialog");
    public static final NotifyAction CANCEL = new NotifyAction("CANCEL", 2, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    public static final NotifyAction OK = new NotifyAction("OK", 3, EopTrackEvent.EXIT);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NotifyAction[] $values() {
        return new NotifyAction[]{ONBOARDING, DIALOG, CANCEL, OK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NotifyAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    private NotifyAction(String str, int i, String str2) {
        this.action = str2;
    }

    static {
        NotifyAction[] notifyActionArr$values = $values();
        $VALUES = notifyActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notifyActionArr$values);
    }

    public static NotifyAction valueOf(String str) {
        return (NotifyAction) Enum.valueOf(NotifyAction.class, str);
    }

    public static NotifyAction[] values() {
        return (NotifyAction[]) $VALUES.clone();
    }
}
