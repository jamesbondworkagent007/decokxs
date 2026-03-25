package com.reown.android.internal.common.model;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class Tags {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ Tags[] $VALUES;
    public final int id;
    public static final Tags UNSUPPORTED_METHOD = new Tags("UNSUPPORTED_METHOD", 0, 0);
    public static final Tags PAIRING_DELETE = new Tags("PAIRING_DELETE", 1, 1000);
    public static final Tags PAIRING_DELETE_RESPONSE = new Tags("PAIRING_DELETE_RESPONSE", 2, 1001);
    public static final Tags PAIRING_PING = new Tags("PAIRING_PING", 3, 1002);
    public static final Tags PAIRING_PING_RESPONSE = new Tags("PAIRING_PING_RESPONSE", 4, 1003);
    public static final Tags SESSION_PROPOSE = new Tags("SESSION_PROPOSE", 5, 1100);
    public static final Tags SESSION_PROPOSE_RESPONSE_APPROVE = new Tags("SESSION_PROPOSE_RESPONSE_APPROVE", 6, 1101);
    public static final Tags SESSION_PROPOSE_RESPONSE_REJECT = new Tags("SESSION_PROPOSE_RESPONSE_REJECT", 7, 1120);
    public static final Tags SESSION_PROPOSE_RESPONSE_AUTO_REJECT = new Tags("SESSION_PROPOSE_RESPONSE_AUTO_REJECT", 8, 1121);
    public static final Tags SESSION_SETTLE = new Tags("SESSION_SETTLE", 9, 1102);
    public static final Tags SESSION_SETTLE_RESPONSE = new Tags("SESSION_SETTLE_RESPONSE", 10, 1103);
    public static final Tags SESSION_UPDATE = new Tags("SESSION_UPDATE", 11, 1104);
    public static final Tags SESSION_UPDATE_RESPONSE = new Tags("SESSION_UPDATE_RESPONSE", 12, 1105);
    public static final Tags SESSION_EXTEND = new Tags("SESSION_EXTEND", 13, 1106);
    public static final Tags SESSION_EXTEND_RESPONSE = new Tags("SESSION_EXTEND_RESPONSE", 14, 1107);
    public static final Tags SESSION_REQUEST = new Tags("SESSION_REQUEST", 15, 1108);
    public static final Tags SESSION_REQUEST_RESPONSE = new Tags("SESSION_REQUEST_RESPONSE", 16, 1109);
    public static final Tags SESSION_EVENT = new Tags("SESSION_EVENT", 17, 1110);
    public static final Tags SESSION_EVENT_RESPONSE = new Tags("SESSION_EVENT_RESPONSE", 18, 1111);
    public static final Tags SESSION_DELETE = new Tags("SESSION_DELETE", 19, 1112);
    public static final Tags SESSION_DELETE_RESPONSE = new Tags("SESSION_DELETE_RESPONSE", 20, 1113);
    public static final Tags SESSION_PING = new Tags("SESSION_PING", 21, 1114);
    public static final Tags SESSION_PING_RESPONSE = new Tags("SESSION_PING_RESPONSE", 22, 1115);
    public static final Tags SESSION_AUTHENTICATE = new Tags("SESSION_AUTHENTICATE", 23, 1116);
    public static final Tags SESSION_AUTHENTICATE_RESPONSE_APPROVE = new Tags("SESSION_AUTHENTICATE_RESPONSE_APPROVE", 24, 1117);
    public static final Tags SESSION_AUTHENTICATE_RESPONSE_REJECT = new Tags("SESSION_AUTHENTICATE_RESPONSE_REJECT", 25, 1118);
    public static final Tags SESSION_AUTHENTICATE_RESPONSE_AUTO_REJECT = new Tags("SESSION_AUTHENTICATE_RESPONSE_AUTO_REJECT", 26, 1119);
    public static final Tags SESSION_AUTHENTICATE_LINK_MODE = new Tags("SESSION_AUTHENTICATE_LINK_MODE", 27, 1122);
    public static final Tags SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_APPROVE = new Tags("SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_APPROVE", 28, 1123);
    public static final Tags SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_REJECT = new Tags("SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_REJECT", 29, 1124);
    public static final Tags SESSION_REQUEST_LINK_MODE = new Tags("SESSION_REQUEST_LINK_MODE", 30, 1125);
    public static final Tags SESSION_REQUEST_LINK_MODE_RESPONSE = new Tags("SESSION_REQUEST_LINK_MODE_RESPONSE", 31, 1126);
    public static final Tags NOTIFY_SUBSCRIBE = new Tags("NOTIFY_SUBSCRIBE", 32, 4000);
    public static final Tags NOTIFY_SUBSCRIBE_RESPONSE = new Tags("NOTIFY_SUBSCRIBE_RESPONSE", 33, MTAnalysisConstants.MainWhat.INIT);
    public static final Tags NOTIFY_MESSAGE = new Tags("NOTIFY_MESSAGE", 34, MTAnalysisConstants.MainWhat.ON_EVENT);
    public static final Tags NOTIFY_MESSAGE_RESPONSE = new Tags("NOTIFY_MESSAGE_RESPONSE", 35, MTAnalysisConstants.MainWhat.ON_ACCOUNT);
    public static final Tags NOTIFY_DELETE = new Tags("NOTIFY_DELETE", 36, MTAnalysisConstants.MainWhat.ON_REPORT);
    public static final Tags NOTIFY_DELETE_RESPONSE = new Tags("NOTIFY_DELETE_RESPONSE", 37, MTAnalysisConstants.MainWhat.ON_DRAW_DONE);
    public static final Tags NOTIFY_UPDATE = new Tags("NOTIFY_UPDATE", 38, 4008);
    public static final Tags NOTIFY_UPDATE_RESPONSE = new Tags("NOTIFY_UPDATE_RESPONSE", 39, 4009);
    public static final Tags NOTIFY_WATCH_SUBSCRIPTIONS = new Tags("NOTIFY_WATCH_SUBSCRIPTIONS", 40, 4010);
    public static final Tags NOTIFY_WATCH_SUBSCRIPTIONS_RESPONSE = new Tags("NOTIFY_WATCH_SUBSCRIPTIONS_RESPONSE", 41, 4011);
    public static final Tags NOTIFY_SUBSCRIPTIONS_CHANGED = new Tags("NOTIFY_SUBSCRIPTIONS_CHANGED", 42, 4012);
    public static final Tags NOTIFY_SUBSCRIPTIONS_CHANGED_RESPONSE = new Tags("NOTIFY_SUBSCRIPTIONS_CHANGED_RESPONSE", 43, 4013);
    public static final Tags NOTIFY_GET_NOTIFICATIONS = new Tags("NOTIFY_GET_NOTIFICATIONS", 44, 4014);
    public static final Tags NOTIFY_GET_NOTIFICATIONS_RESPONSE = new Tags("NOTIFY_GET_NOTIFICATIONS_RESPONSE", 45, 4015);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ Tags[] $values() {
        return new Tags[]{UNSUPPORTED_METHOD, PAIRING_DELETE, PAIRING_DELETE_RESPONSE, PAIRING_PING, PAIRING_PING_RESPONSE, SESSION_PROPOSE, SESSION_PROPOSE_RESPONSE_APPROVE, SESSION_PROPOSE_RESPONSE_REJECT, SESSION_PROPOSE_RESPONSE_AUTO_REJECT, SESSION_SETTLE, SESSION_SETTLE_RESPONSE, SESSION_UPDATE, SESSION_UPDATE_RESPONSE, SESSION_EXTEND, SESSION_EXTEND_RESPONSE, SESSION_REQUEST, SESSION_REQUEST_RESPONSE, SESSION_EVENT, SESSION_EVENT_RESPONSE, SESSION_DELETE, SESSION_DELETE_RESPONSE, SESSION_PING, SESSION_PING_RESPONSE, SESSION_AUTHENTICATE, SESSION_AUTHENTICATE_RESPONSE_APPROVE, SESSION_AUTHENTICATE_RESPONSE_REJECT, SESSION_AUTHENTICATE_RESPONSE_AUTO_REJECT, SESSION_AUTHENTICATE_LINK_MODE, SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_APPROVE, SESSION_AUTHENTICATE_LINK_MODE_RESPONSE_REJECT, SESSION_REQUEST_LINK_MODE, SESSION_REQUEST_LINK_MODE_RESPONSE, NOTIFY_SUBSCRIBE, NOTIFY_SUBSCRIBE_RESPONSE, NOTIFY_MESSAGE, NOTIFY_MESSAGE_RESPONSE, NOTIFY_DELETE, NOTIFY_DELETE_RESPONSE, NOTIFY_UPDATE, NOTIFY_UPDATE_RESPONSE, NOTIFY_WATCH_SUBSCRIPTIONS, NOTIFY_WATCH_SUBSCRIPTIONS_RESPONSE, NOTIFY_SUBSCRIPTIONS_CHANGED, NOTIFY_SUBSCRIPTIONS_CHANGED_RESPONSE, NOTIFY_GET_NOTIFICATIONS, NOTIFY_GET_NOTIFICATIONS_RESPONSE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Tags> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Tags valueOf(String str) {
        return (Tags) Enum.valueOf(Tags.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Tags[] values() {
        return (Tags[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    public Tags(String str, int i, int i2) {
        this.id = i2;
    }

    static {
        Tags[] tagsArr$values = $values();
        $VALUES = tagsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tagsArr$values);
    }
}
