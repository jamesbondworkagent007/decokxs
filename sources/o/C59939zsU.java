package o;

import androidx.fragment.app.FragmentFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59975ztD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59939zsU extends FragmentFactory implements InterfaceC59975ztD {
    public final C60060zuj KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59939zsU() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C59939zsU(C60060zuj c60060zuj) {
        this.KWHzl = c60060zuj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.zuj:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.zuj) : (r1v0 o.zuj))
 A[MD:(o.zuj):void (m)] (LINE:26) call: o.zsU.<init>(o.zuj):void type: THIS */
    public /* synthetic */ C59939zsU(C60060zuj c60060zuj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c60060zuj);
    }

    @Override // o.InterfaceC59975ztD
    public C60022zty OLrzqt() {
        return InterfaceC59975ztD.ActionBar.EZpvd(this);
    }

    @Override // androidx.fragment.app.FragmentFactory
    public androidx.fragment.app.Fragment instantiate(@NotNull java.lang.ClassLoader classLoader, @NotNull java.lang.String str) throws java.lang.ClassNotFoundException {
        androidx.fragment.app.Fragment fragment;
        Intrinsics.checkNotNullParameter(classLoader, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Class<?> cls = java.lang.Class.forName(str);
        Intrinsics.checkNotNullExpressionValue(cls, "");
        InterfaceC56551yJo interfaceC56551yJoKWHzl = yHE.KWHzl(cls);
        C60060zuj c60060zuj = this.KWHzl;
        if (c60060zuj != null) {
            fragment = (androidx.fragment.app.Fragment) C60060zuj.getOrNull$default(c60060zuj, interfaceC56551yJoKWHzl, null, null, 6, null);
        } else {
            fragment = (androidx.fragment.app.Fragment) C60022zty.getOrNull$default(OLrzqt(), interfaceC56551yJoKWHzl, null, null, 6, null);
        }
        if (fragment != null) {
            return fragment;
        }
        androidx.fragment.app.Fragment fragmentInstantiate = super.instantiate(classLoader, str);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "");
        return fragmentInstantiate;
    }
}
