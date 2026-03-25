package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEP implements InterfaceC58162ywA<InHouseIMConversationService> {
    public final ApiModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InHouseIMConversationService get() {
        return EZpvd(this.OLrzqt);
    }

    public static InHouseIMConversationService EZpvd(ApiModule apiModule) {
        return (InHouseIMConversationService) C58165ywD.KWHzl(apiModule.valueOf());
    }
}
