package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27656jzM implements InterfaceC58162ywA<InterfaceC28697kff> {
    public final InterfaceC58164ywC<C27640jyx> KWHzl;
    public final InterfaceC58164ywC<Json> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC28697kff get() {
        return OLrzqt(this.KWHzl.get(), this.OLrzqt.get());
    }

    public static InterfaceC28697kff OLrzqt(C27640jyx c27640jyx, Json json) {
        return (InterfaceC28697kff) C58165ywD.KWHzl(RepositoryModule.OLrzqt.copydefault(c27640jyx, json));
    }
}
