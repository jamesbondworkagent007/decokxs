package o;

import com.okinc.business.market.di.MemeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27682jzm implements InterfaceC58162ywA<InterfaceC28619keG> {
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<InterfaceC23229huL> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC28619keG get() {
        return copydefault(this.copydefault.get(), this.KWHzl.get());
    }

    public static InterfaceC28619keG copydefault(InterfaceC23229huL interfaceC23229huL, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28619keG) C58165ywD.KWHzl(MemeModule.EZpvd.AEQbTJ(interfaceC23229huL, coroutineDispatcher));
    }
}
