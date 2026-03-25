package o;

import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import com.okinc.oklive.di.NetworkModule;

/* JADX INFO: loaded from: classes10.dex */
public final class sVK implements InterfaceC58162ywA<LivestreamService> {
    public final InterfaceC58164ywC<C44540sTs> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LivestreamService get() {
        return EZpvd(this.KWHzl.get());
    }

    public static LivestreamService EZpvd(C44540sTs c44540sTs) {
        return (LivestreamService) C58165ywD.KWHzl(NetworkModule.copydefault.EZpvd(c44540sTs));
    }
}
