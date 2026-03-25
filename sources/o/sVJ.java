package o;

import com.okinc.oklive.app.data.repository.remote.LiveAuthService;
import com.okinc.oklive.di.NetworkModule;

/* JADX INFO: loaded from: classes10.dex */
public final class sVJ implements InterfaceC58162ywA<C44535sTn> {
    public final InterfaceC58164ywC<LiveAuthService> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C44535sTn get() {
        return AEQbTJ(this.OLrzqt.get());
    }

    public static C44535sTn AEQbTJ(LiveAuthService liveAuthService) {
        return (C44535sTn) C58165ywD.KWHzl(NetworkModule.copydefault.AEQbTJ(liveAuthService));
    }
}
