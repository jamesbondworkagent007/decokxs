package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57533ykH extends C57574ykw {
    public C57533ykH() {
        copydefault(true);
    }

    @Override // o.C57574ykw
    public InterfaceC57562ykk AEQbTJ() {
        return new C57531ykF();
    }

    @Override // o.C57574ykw
    public java.lang.Object AEQbTJ(InterfaceC57562ykk interfaceC57562ykk) {
        if (interfaceC57562ykk instanceof C57531ykF) {
            return ((C57531ykF) interfaceC57562ykk).KWHzl();
        }
        return null;
    }

    @Override // o.C57574ykw
    public java.lang.Object OLrzqt(@NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (arrayList.size() > 0) {
            return arrayList.get(0);
        }
        return null;
    }
}
