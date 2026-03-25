package o;

import com.okinc.okimcore.di.ApiModule;
import com.okinc.okimcore.feature.message.repository.remote.IMMessageService;

/* JADX INFO: loaded from: classes10.dex */
public final class sER implements InterfaceC58162ywA<IMMessageService> {
    public final ApiModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public IMMessageService get() {
        return OLrzqt(this.copydefault);
    }

    public static IMMessageService OLrzqt(ApiModule apiModule) {
        return (IMMessageService) C58165ywD.KWHzl(apiModule.AhwBna());
    }
}
