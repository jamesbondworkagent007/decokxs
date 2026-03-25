package o;

import o.InterfaceC40231qOe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40236qOj implements InterfaceC40231qOe {
    public static final C40236qOj EZpvd = new C40236qOj();

    private C40236qOj() {
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
