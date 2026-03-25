package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.agentbot.remote.AgentBotApiService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEL implements InterfaceC58162ywA<AgentBotApiService> {
    public final ApiModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AgentBotApiService get() {
        return copydefault(this.KWHzl);
    }

    public static AgentBotApiService copydefault(ApiModule apiModule) {
        return (AgentBotApiService) C58165ywD.KWHzl(apiModule.AEQbTJ());
    }
}
