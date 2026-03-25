package o;

import com.okinc.oklive.app.data.repository.remote.LiveAuthService;
import com.okinc.oklive.di.NetworkModule;

/* JADX INFO: loaded from: classes10.dex */
public final class sVC implements InterfaceC58162ywA<LiveAuthService> {
    public final InterfaceC58164ywC<C44540sTs> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LiveAuthService get() {
        return AEQbTJ(this.copydefault.get());
    }

    public static LiveAuthService AEQbTJ(C44540sTs c44540sTs) {
        return (LiveAuthService) C58165ywD.KWHzl(NetworkModule.copydefault.copydefault(c44540sTs));
    }
}
