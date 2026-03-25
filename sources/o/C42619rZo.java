package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.MessageManagementService;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.MessageManagementModule;

/* JADX INFO: renamed from: o.rZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42619rZo implements InterfaceC58162ywA<C42601rYx> {
    public final InterfaceC58164ywC<MessageManagementService> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C42601rYx get() {
        return KWHzl(this.OLrzqt.get());
    }

    public static C42601rYx KWHzl(MessageManagementService messageManagementService) {
        return (C42601rYx) C58165ywD.KWHzl(MessageManagementModule.Companion.KWHzl(messageManagementService));
    }
}
