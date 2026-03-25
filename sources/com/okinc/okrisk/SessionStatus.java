package com.okinc.okrisk;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class SessionStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SessionStatus[] $VALUES;
    public static final SessionStatus OK = new SessionStatus("OK", 0, 0);
    public static final SessionStatus PARTIAL = new SessionStatus("PARTIAL", 1, 1);
    public static final SessionStatus PENDING = new SessionStatus(CardSyncResponse.PENDING, 2, 2);
    public static final SessionStatus FAIL = new SessionStatus("FAIL", 3, 3);
    public static final SessionStatus UNKNOWN = new SessionStatus("UNKNOWN", 4, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SessionStatus[] $values() {
        return new SessionStatus[]{OK, PARTIAL, PENDING, FAIL, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SessionStatus> getEntries() {
        return $ENTRIES;
    }

    private SessionStatus(String str, int i, int i2) {
    }

    static {
        SessionStatus[] sessionStatusArr$values = $values();
        $VALUES = sessionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sessionStatusArr$values);
    }

    public static SessionStatus valueOf(String str) {
        return (SessionStatus) Enum.valueOf(SessionStatus.class, str);
    }

    public static SessionStatus[] values() {
        return (SessionStatus[]) $VALUES.clone();
    }
}
