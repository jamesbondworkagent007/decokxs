package o;

import o.InterfaceC40231qOe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40240qOn implements InterfaceC40231qOe {
    public static final C40240qOn KWHzl = new C40240qOn();

    private C40240qOn() {
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC40231qOe.StateListAnimator.copydefault(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC40231qOe.StateListAnimator.OLrzqt(this, interfaceC40516qYt);
    }
}
