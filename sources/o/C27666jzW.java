package o;

import com.okinc.business.market.di.RepositorySingletonModule;

/* JADX INFO: renamed from: o.jzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27666jzW implements InterfaceC58162ywA<InterfaceC29443ktj> {
    public final InterfaceC58164ywC<InterfaceC23229huL> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC29443ktj get() {
        return copydefault(this.AEQbTJ.get());
    }

    public static InterfaceC29443ktj copydefault(InterfaceC23229huL interfaceC23229huL) {
        return (InterfaceC29443ktj) C58165ywD.KWHzl(RepositorySingletonModule.AEQbTJ.copydefault(interfaceC23229huL));
    }
}
