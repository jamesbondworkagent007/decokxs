package o;

import com.okinc.business.market.di.SpModule;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27663jzT implements InterfaceC58162ywA<C27670jza> {
    public final InterfaceC58164ywC<Json> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<android.content.Context> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C27670jza get() {
        return copydefault(this.OLrzqt.get(), this.EZpvd.get(), this.KWHzl.get());
    }

    public static C27670jza copydefault(android.content.Context context, Json json, CoroutineDispatcher coroutineDispatcher) {
        return (C27670jza) C58165ywD.KWHzl(SpModule.copydefault.KWHzl(context, json, coroutineDispatcher));
    }
}
