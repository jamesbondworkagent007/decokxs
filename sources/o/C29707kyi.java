package o;

import com.okinc.business.market.features.tag.TagMetaModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.kyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29707kyi implements InterfaceC58162ywA<C29710kyl> {
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C29710kyl get() {
        return KWHzl(this.OLrzqt.get(), this.KWHzl.get());
    }

    public static C29710kyl KWHzl(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (C29710kyl) C58165ywD.KWHzl(TagMetaModule.copydefault.AEQbTJ(interfaceC27595jyE, coroutineDispatcher));
    }
}
