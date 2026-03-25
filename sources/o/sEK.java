package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMAuthService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEK implements InterfaceC58162ywA<InHouseIMAuthService> {
    public final ApiModule AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InHouseIMAuthService get() {
        return OLrzqt(this.AEQbTJ);
    }

    public static InHouseIMAuthService OLrzqt(ApiModule apiModule) {
        return (InHouseIMAuthService) C58165ywD.KWHzl(apiModule.EZpvd());
    }
}
