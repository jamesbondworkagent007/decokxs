package com.okinc.lifecycle.impl.deeplink.core;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LinkStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LinkStatus[] $VALUES;
    private final String status;
    public static final LinkStatus SUCCESS = new LinkStatus("SUCCESS", 0, "success");
    public static final LinkStatus FAIL = new LinkStatus("FAIL", 1, "fail");
    public static final LinkStatus CANCEL = new LinkStatus("CANCEL", 2, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LinkStatus[] $values() {
        return new LinkStatus[]{SUCCESS, FAIL, CANCEL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LinkStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    private LinkStatus(String str, int i, String str2) {
        this.status = str2;
    }

    static {
        LinkStatus[] linkStatusArr$values = $values();
        $VALUES = linkStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(linkStatusArr$values);
    }

    public static LinkStatus valueOf(String str) {
        return (LinkStatus) Enum.valueOf(LinkStatus.class, str);
    }

    public static LinkStatus[] values() {
        return (LinkStatus[]) $VALUES.clone();
    }
}
