package o;

import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5284Lu implements LJ {
    public final LA AEQbTJ;
    public final InterfaceC5215Jd KWHzl;

    public C5284Lu(@NotNull android.content.Context context, @NotNull InterfaceC5215Jd interfaceC5215Jd) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC5215Jd, "");
        this.KWHzl = interfaceC5215Jd;
        this.AEQbTJ = new LA(context);
    }

    @Override // o.LJ
    public LF AEQbTJ() {
        C5213Jb c5213JbAEQbTJ = this.KWHzl.AEQbTJ();
        return this.AEQbTJ.AEQbTJ().AEQbTJ().fetchVPNInfo(c5213JbAEQbTJ.OLrzqt()).copydefault(c5213JbAEQbTJ.KWHzl()).OLrzqt(c5213JbAEQbTJ.AEQbTJ()).OLrzqt();
    }

    public final LF AEQbTJ(long j) throws TimeoutException {
        C5213Jb c5213JbEZpvd = C5286Lw.EZpvd(this.KWHzl, j);
        return this.AEQbTJ.AEQbTJ().AEQbTJ().fetchVPNInfo(c5213JbEZpvd.OLrzqt()).copydefault(c5213JbEZpvd.KWHzl()).OLrzqt(c5213JbEZpvd.AEQbTJ()).OLrzqt();
    }
}
