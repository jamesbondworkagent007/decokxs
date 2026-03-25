package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CM extends AbstractC5068Dm {
    public final InterfaceC59908zr AEQbTJ;
    public final InterfaceC5060De KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CM(@NotNull InterfaceC59908zr interfaceC59908zr, @NotNull InterfaceC5060De interfaceC5060De) {
        super(interfaceC5060De);
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        this.AEQbTJ = interfaceC59908zr;
        this.KWHzl = interfaceC5060De;
    }

    @Override // o.AbstractC5068Dm
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AEQbTJ.copydefault(bArr, i, i2);
    }

    public final byte[] KWHzl() {
        return this.AEQbTJ.AEQbTJ();
    }
}
