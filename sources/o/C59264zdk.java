package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59264zdk extends AbstractC59325zes {
    public final AbstractC59325zes copydefault;

    public C59264zdk(@NotNull AbstractC59325zes abstractC59325zes) {
        Intrinsics.checkNotNullParameter(abstractC59325zes, "");
        this.copydefault = abstractC59325zes;
    }

    @Override // o.AbstractC59325zes
    public InterfaceC59317zek copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return this.copydefault.copydefault(abstractC59233zdF);
    }

    @Override // o.AbstractC59325zes
    public AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Variance variance) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(variance, "");
        return this.copydefault.copydefault(abstractC59233zdF, variance);
    }

    @Override // o.AbstractC59325zes
    public boolean EZpvd() {
        return this.copydefault.EZpvd();
    }

    @Override // o.AbstractC59325zes
    public boolean copydefault() {
        return this.copydefault.copydefault();
    }

    @Override // o.AbstractC59325zes
    public boolean AEQbTJ() {
        return this.copydefault.AEQbTJ();
    }

    @Override // o.AbstractC59325zes
    public yOL AEQbTJ(@NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        return this.copydefault.AEQbTJ(yol);
    }
}
