package com.okinc.im.bean;

import com.okinc.p2p.api.OtcExtraKeys;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class MessageCenterNavigation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MessageCenterNavigation[] $VALUES;
    public static final MessageCenterNavigation IM = new MessageCenterNavigation(OtcExtraKeys.IM, 0);
    public static final MessageCenterNavigation Notification = new MessageCenterNavigation("Notification", 1);
    public static final MessageCenterNavigation Invalid = new MessageCenterNavigation("Invalid", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MessageCenterNavigation[] $values() {
        return new MessageCenterNavigation[]{IM, Notification, Invalid};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MessageCenterNavigation> getEntries() {
        return $ENTRIES;
    }

    private MessageCenterNavigation(String str, int i) {
    }

    static {
        MessageCenterNavigation[] messageCenterNavigationArr$values = $values();
        $VALUES = messageCenterNavigationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(messageCenterNavigationArr$values);
    }

    public static MessageCenterNavigation valueOf(String str) {
        return (MessageCenterNavigation) Enum.valueOf(MessageCenterNavigation.class, str);
    }

    public static MessageCenterNavigation[] values() {
        return (MessageCenterNavigation[]) $VALUES.clone();
    }
}
