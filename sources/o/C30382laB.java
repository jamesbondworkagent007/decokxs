package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.laB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30382laB implements ViewModelProvider.Factory {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.laE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30382laB.KWHzl();
        }
    });

    public static final InterfaceC30428lav KWHzl() {
        return C30431lay.copydefault.KWHzl();
    }

    public final InterfaceC30428lav copydefault() {
        return (InterfaceC30428lav) this.EZpvd.getValue();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isAssignableFrom(C30384laD.class)) {
            return new C30384laD(copydefault().fvQaOB(), kYF.EZpvd.QfsBiF(), copydefault().finit());
        }
        if (cls.isAssignableFrom(C30429law.class)) {
            kYF kyf = kYF.EZpvd;
            return new C30429law(kyf.copydefault(copydefault().dvKsVJ()), kyf.OLrzqt(copydefault().dvKsVJ()), kyf.djSkpj(), copydefault().gasjUx(), copydefault().fFgQHt(), kyf.QVAiDq(), kyf.gkJEwt(), copydefault().gGvvIC());
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
