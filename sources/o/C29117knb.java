package o;

import com.okinc.business.market.features.position.PositionModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.knb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29117knb implements InterfaceC58162ywA<InterfaceC28437kak> {
    public final InterfaceC58164ywC<InterfaceC23229huL> AEQbTJ;
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<C27640jyx> KWHzl;
    public final InterfaceC58164ywC<Json> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC28437kak get() {
        return EZpvd(this.AEQbTJ.get(), this.KWHzl.get(), this.EZpvd.get(), this.OLrzqt.get());
    }

    public static InterfaceC28437kak EZpvd(InterfaceC23229huL interfaceC23229huL, C27640jyx c27640jyx, C27640jyx c27640jyx2, Json json) {
        return (InterfaceC28437kak) C58165ywD.KWHzl(PositionModule.OLrzqt.OLrzqt(interfaceC23229huL, c27640jyx, c27640jyx2, json));
    }
}
