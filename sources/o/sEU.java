package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.share.repository.remote.IMShareService;

/* JADX INFO: loaded from: classes10.dex */
public final class sEU implements InterfaceC58162ywA<IMShareService> {
    public final ApiModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public IMShareService get() {
        return EZpvd(this.KWHzl);
    }

    public static IMShareService EZpvd(ApiModule apiModule) {
        return (IMShareService) C58165ywD.KWHzl(apiModule.fetchVPNInfo());
    }
}
