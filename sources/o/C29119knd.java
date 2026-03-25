package o;

import com.okinc.business.market.features.position.PositionModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.knd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29119knd implements InterfaceC58162ywA<InterfaceC29130kno> {
    public final InterfaceC58164ywC<InterfaceC9859bdY> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC29130kno get() {
        return KWHzl(this.OLrzqt.get(), this.KWHzl.get(), this.copydefault.get());
    }

    public static InterfaceC29130kno KWHzl(InterfaceC27595jyE interfaceC27595jyE, InterfaceC9859bdY interfaceC9859bdY, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC29130kno) C58165ywD.KWHzl(PositionModule.OLrzqt.AEQbTJ(interfaceC27595jyE, interfaceC9859bdY, coroutineDispatcher));
    }
}
