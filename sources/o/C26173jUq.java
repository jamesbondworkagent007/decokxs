package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26173jUq implements InterfaceC40516qYt {
    public static final C26173jUq EZpvd = new C26173jUq();

    private C26173jUq() {
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return interfaceC40516qYt instanceof C26173jUq;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return interfaceC40516qYt instanceof C26173jUq;
    }
}
