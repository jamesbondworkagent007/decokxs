package o;

import com.okinc.dexkline.market.features.risk_control.RiskControlModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.ndm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34529ndm implements InterfaceC58162ywA<C34531ndo> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC32162mRu> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C34531ndo get() {
        return OLrzqt(this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static C34531ndo OLrzqt(InterfaceC32162mRu interfaceC32162mRu, CoroutineDispatcher coroutineDispatcher) {
        return (C34531ndo) C58165ywD.KWHzl(RiskControlModule.OLrzqt.KWHzl(interfaceC32162mRu, coroutineDispatcher));
    }
}
