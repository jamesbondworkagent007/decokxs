package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27650jzG implements InterfaceC58162ywA<InterfaceC28700kfi> {
    public final InterfaceC58164ywC<C27640jyx> AEQbTJ;
    public final InterfaceC58164ywC<Json> KWHzl;
    public final InterfaceC58164ywC<C27640jyx> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC28700kfi get() {
        return AEQbTJ(this.copydefault.get(), this.AEQbTJ.get(), this.KWHzl.get());
    }

    public static InterfaceC28700kfi AEQbTJ(C27640jyx c27640jyx, C27640jyx c27640jyx2, Json json) {
        return (InterfaceC28700kfi) C58165ywD.KWHzl(RepositoryModule.OLrzqt.AEQbTJ(c27640jyx, c27640jyx2, json));
    }
}
