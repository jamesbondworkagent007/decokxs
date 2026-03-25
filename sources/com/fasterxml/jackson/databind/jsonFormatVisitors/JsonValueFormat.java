package com.fasterxml.jackson.databind.jsonFormatVisitors;

import androidx.autofill.HintConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import o.TY;

/* JADX INFO: loaded from: classes21.dex */
public enum JsonValueFormat {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE(HintConstants.AUTOFILL_HINT_PHONE),
    REGEX("regex"),
    STYLE(TtmlNode.TAG_STYLE),
    TIME(CrashHianalyticsData.TIME),
    URI("uri"),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");

    private final String _desc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    @TY
    public String toString() {
        return this._desc;
    }

    JsonValueFormat(String str) {
        this._desc = str;
    }
}
