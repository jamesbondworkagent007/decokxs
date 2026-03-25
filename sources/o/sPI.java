package o;

import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;

/* JADX INFO: loaded from: classes10.dex */
public final class sPI {
    public static final OKConversationType copydefault(java.lang.Integer num) {
        int iIntValue = num != null ? num.intValue() : InHouseIMChannelType.Unknown.getApiValue();
        return iIntValue == InHouseIMChannelType.LiveStreamChatRoom.getApiValue() ? OKConversationType.LiveStream : iIntValue == InHouseIMChannelType.Group.getApiValue() ? OKConversationType.GROUP : iIntValue == InHouseIMChannelType.Individual.getApiValue() ? OKConversationType.PRIVATE : iIntValue == InHouseIMChannelType.SystemNotification.getApiValue() ? OKConversationType.SYSTEM : iIntValue == InHouseIMChannelType.OrbitNotifications.getApiValue() ? OKConversationType.OrbitNotifications : OKConversationType.NONE;
    }
}
