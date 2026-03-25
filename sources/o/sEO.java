package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMCallServiceApi;

/* JADX INFO: loaded from: classes10.dex */
public final class sEO implements InterfaceC58162ywA<InHouseIMCallServiceApi> {
    public final ApiModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InHouseIMCallServiceApi get() {
        return AEQbTJ(this.OLrzqt);
    }

    public static InHouseIMCallServiceApi AEQbTJ(ApiModule apiModule) {
        return (InHouseIMCallServiceApi) C58165ywD.KWHzl(apiModule.OLrzqt());
    }
}
