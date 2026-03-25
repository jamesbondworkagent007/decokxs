package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.MessageManagementService;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.MessageManagementModule;

/* JADX INFO: renamed from: o.rZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42621rZq implements InterfaceC58162ywA<MessageManagementService> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public MessageManagementService get() {
        return KWHzl();
    }

    public static MessageManagementService KWHzl() {
        return (MessageManagementService) C58165ywD.KWHzl(MessageManagementModule.Companion.EZpvd());
    }
}
