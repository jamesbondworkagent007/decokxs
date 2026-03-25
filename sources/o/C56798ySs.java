package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56802ySw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56798ySs implements yNX {
    public final C56794ySo AEQbTJ;
    public final InterfaceC59226zcz<C56933yXs, ySZ> EZpvd;

    public C56798ySs(@NotNull C56791ySl c56791ySl) {
        Intrinsics.checkNotNullParameter(c56791ySl, "");
        C56794ySo c56794ySo = new C56794ySo(c56791ySl, InterfaceC56802ySw.ActionBar.copydefault, C56389yDo.AEQbTJ(null));
        this.AEQbTJ = c56794ySo;
        this.EZpvd = c56794ySo.EZpvd().OLrzqt();
    }

    @Override // o.yNU
    public /* synthetic */ java.util.Collection KWHzl(C56933yXs c56933yXs, Function1 function1) {
        return copydefault(c56933yXs, (Function1<? super C56935yXu, java.lang.Boolean>) function1);
    }

    public final ySZ KWHzl(C56933yXs c56933yXs) {
        InterfaceC56840yUg interfaceC56840yUgFindPackage$default = C56765yRm.findPackage$default(this.AEQbTJ.copydefault().copydefault(), c56933yXs, false, 2, null);
        if (interfaceC56840yUgFindPackage$default == null) {
            return null;
        }
        return this.EZpvd.copydefault(c56933yXs, new C56797ySr(this, interfaceC56840yUgFindPackage$default));
    }

    public static final ySZ copydefault(C56798ySs c56798ySs, InterfaceC56840yUg interfaceC56840yUg) {
        return new ySZ(c56798ySs.AEQbTJ, interfaceC56840yUg);
    }

    @Override // o.yNU
    public java.util.List<ySZ> copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return yDY.OLrzqt(KWHzl(c56933yXs));
    }

    @Override // o.yNX
    public void EZpvd(@NotNull C56933yXs c56933yXs, @NotNull java.util.Collection<yNW> collection) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(collection, "");
        C59433zgu.EZpvd(collection, KWHzl(c56933yXs));
    }

    @Override // o.yNX
    public boolean OLrzqt(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return C56765yRm.findPackage$default(this.AEQbTJ.copydefault().copydefault(), c56933yXs, false, 2, null) == null;
    }

    public java.util.List<C56933yXs> copydefault(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ySZ yszKWHzl = KWHzl(c56933yXs);
        java.util.List<C56933yXs> listValueOf = yszKWHzl != null ? yszKWHzl.valueOf() : null;
        return listValueOf == null ? yDY.AhwBna() : listValueOf;
    }

    public java.lang.String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.AEQbTJ.copydefault().fetchVPNInfo();
    }
}
