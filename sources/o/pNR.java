package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: loaded from: classes9.dex */
public final class pNR implements InterfaceC58162ywA<InterfaceC38164pOp> {
    public final LinkModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC38164pOp get() {
        return KWHzl(this.EZpvd);
    }

    public static InterfaceC38164pOp KWHzl(LinkModule linkModule) {
        return (InterfaceC38164pOp) C58165ywD.KWHzl(linkModule.isConnected());
    }
}
