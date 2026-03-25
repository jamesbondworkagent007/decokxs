package o;

import com.okinc.dexkline.market.features.tag.TagMetaModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.nds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34535nds implements InterfaceC58162ywA<C34537ndu> {
    public final InterfaceC58164ywC<InterfaceC32260mVk> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C34537ndu get() {
        return KWHzl(this.EZpvd.get(), this.OLrzqt.get());
    }

    public static C34537ndu KWHzl(InterfaceC32260mVk interfaceC32260mVk, CoroutineDispatcher coroutineDispatcher) {
        return (C34537ndu) C58165ywD.KWHzl(TagMetaModule.EZpvd.AEQbTJ(interfaceC32260mVk, coroutineDispatcher));
    }
}
