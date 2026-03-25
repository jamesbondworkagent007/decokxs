package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMUserService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEY implements InterfaceC58162ywA<InHouseIMUserService> {
    public final ApiModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InHouseIMUserService get() {
        return copydefault(this.KWHzl);
    }

    public static InHouseIMUserService copydefault(ApiModule apiModule) {
        return (InHouseIMUserService) C58165ywD.KWHzl(apiModule.AkhnZx());
    }
}
