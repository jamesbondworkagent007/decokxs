package o;

import com.google.common.net.HttpHeaders;

/* JADX INFO: renamed from: o.zlv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59699zlv implements InterfaceC59557zjL {
    public static final C59699zlv EZpvd = new C59699zlv();

    @Override // o.InterfaceC59557zjL
    public long copydefault(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59584zjm, "HTTP response");
        C59760znC c59760znC = new C59760znC(interfaceC59584zjm.headerIterator(HttpHeaders.KEEP_ALIVE));
        while (c59760znC.hasNext()) {
            InterfaceC59517ziY interfaceC59517ziYKWHzl = c59760znC.KWHzl();
            java.lang.String strCopydefault = interfaceC59517ziYKWHzl.copydefault();
            java.lang.String strKWHzl = interfaceC59517ziYKWHzl.KWHzl();
            if (strKWHzl != null && strCopydefault.equalsIgnoreCase("timeout")) {
                try {
                    return java.lang.Long.parseLong(strKWHzl) * 1000;
                } catch (java.lang.NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1L;
    }
}
