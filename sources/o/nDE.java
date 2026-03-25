package o;

import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.rxutils.RxBus;

/* JADX INFO: loaded from: classes15.dex */
public final class nDE {
    public static final void copydefault(java.lang.Long l, java.lang.Long l2, OKMessageContent oKMessageContent) {
        if (l2 == null || (oKMessageContent instanceof OKRecallNotificationMessage)) {
            return;
        }
        RxBus.AEQbTJ(new nDF(l, l2.longValue()));
    }
}
