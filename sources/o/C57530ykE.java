package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57530ykE extends C57574ykw {
    public java.lang.String KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.KWHzl = str;
    }

    public C57530ykE() {
        copydefault(true);
        this.OLrzqt = -1;
    }

    @Override // o.C57574ykw
    public InterfaceC57562ykk AEQbTJ() {
        C57575ykx c57575ykx = new C57575ykx();
        c57575ykx.EZpvd(this.OLrzqt);
        c57575ykx.copydefault(this.KWHzl);
        return c57575ykx;
    }

    @Override // o.C57574ykw
    public java.lang.Object AEQbTJ(InterfaceC57562ykk interfaceC57562ykk) {
        if (interfaceC57562ykk instanceof C57575ykx) {
            return ((C57575ykx) interfaceC57562ykk).KWHzl();
        }
        return null;
    }

    @Override // o.C57574ykw
    public java.lang.Object OLrzqt(@NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.Object> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (next instanceof java.util.HashMap) {
                map.putAll((java.util.Map) next);
            }
        }
        return map;
    }
}
