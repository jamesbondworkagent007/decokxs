package o;

import com.okinc.business.market.di.RepositorySingletonModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27662jzS implements InterfaceC58162ywA<InterfaceC25651jBh> {
    public final InterfaceC58164ywC<C28603kdr> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;
    public final InterfaceC58164ywC<C28586kda> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC25651jBh get() {
        return KWHzl(this.OLrzqt.get(), this.AEQbTJ.get(), this.copydefault.get(), this.KWHzl.get());
    }

    public static InterfaceC25651jBh KWHzl(InterfaceC27595jyE interfaceC27595jyE, C28603kdr c28603kdr, C28586kda c28586kda, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC25651jBh) C58165ywD.KWHzl(RepositorySingletonModule.AEQbTJ.copydefault(interfaceC27595jyE, c28603kdr, c28586kda, coroutineDispatcher));
    }
}
