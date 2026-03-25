package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27658jzO implements InterfaceC58162ywA<InterfaceC29249kqA> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> AEQbTJ;
    public final InterfaceC58164ywC<Json> EZpvd;
    public final InterfaceC58164ywC<C27640jyx> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC29249kqA get() {
        return OLrzqt(this.AEQbTJ.get(), this.OLrzqt.get(), this.EZpvd.get());
    }

    public static InterfaceC29249kqA OLrzqt(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, Json json) {
        return (InterfaceC29249kqA) C58165ywD.KWHzl(RepositoryModule.OLrzqt.AEQbTJ(interfaceC27595jyE, c27640jyx, json));
    }
}
