package o;

import com.okinc.business.market.features.floatwindow.di.FloatWindowModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes7.dex */
public final class jWG implements InterfaceC58162ywA<InterfaceC28437kak> {
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<C27640jyx> KWHzl;
    public final InterfaceC58164ywC<InterfaceC23229huL> OLrzqt;
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC28437kak get() {
        return OLrzqt(this.OLrzqt.get(), this.EZpvd.get(), this.KWHzl.get(), this.copydefault.get());
    }

    public static InterfaceC28437kak OLrzqt(InterfaceC23229huL interfaceC23229huL, C27640jyx c27640jyx, C27640jyx c27640jyx2, Json json) {
        return (InterfaceC28437kak) C58165ywD.KWHzl(FloatWindowModule.KWHzl.OLrzqt(interfaceC23229huL, c27640jyx, c27640jyx2, json));
    }
}
