package o;

import java.lang.reflect.InvocationHandler;

/* JADX INFO: renamed from: o.yMe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56622yMe implements InvocationHandler {
    public final InterfaceC56387yDm AEQbTJ;
    public final java.util.List EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final java.lang.Class OLrzqt;
    public final java.util.Map copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56622yMe(java.lang.Class cls, java.util.Map map, InterfaceC56387yDm interfaceC56387yDm, InterfaceC56387yDm interfaceC56387yDm2, java.util.List list) {
        this.OLrzqt = cls;
        this.copydefault = map;
        this.KWHzl = interfaceC56387yDm;
        this.AEQbTJ = interfaceC56387yDm2;
        this.EZpvd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return C56619yMb.EZpvd(this.OLrzqt, this.copydefault, this.KWHzl, this.AEQbTJ, this.EZpvd, obj, method, objArr);
    }
}
