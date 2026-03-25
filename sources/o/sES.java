package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;

/* JADX INFO: loaded from: classes10.dex */
public final class sES implements InterfaceC58162ywA<InHouseIMGroupService> {
    public final ApiModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InHouseIMGroupService get() {
        return AEQbTJ(this.EZpvd);
    }

    public static InHouseIMGroupService AEQbTJ(ApiModule apiModule) {
        return (InHouseIMGroupService) C58165ywD.KWHzl(apiModule.djBIcL());
    }
}
