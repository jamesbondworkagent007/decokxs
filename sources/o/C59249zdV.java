package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59249zdV extends AbstractC59191zcQ implements InterfaceC59379zft {
    public final InterfaceC59098zad AhwBna;
    public final InterfaceC59315zei KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59191zcQ, o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public InterfaceC59315zei djBIcL() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59249zdV(@NotNull InterfaceC59297zeQ interfaceC59297zeQ, boolean z, @NotNull InterfaceC59315zei interfaceC59315zei) {
        super(interfaceC59297zeQ, z);
        Intrinsics.checkNotNullParameter(interfaceC59297zeQ, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        this.KWHzl = interfaceC59315zei;
        this.AhwBna = interfaceC59297zeQ.bU_().AhwBna().OLrzqt();
    }

    @Override // o.AbstractC59191zcQ
    public AbstractC59191zcQ KWHzl(boolean z) {
        return new C59249zdV(gEmmrt(), z, djBIcL());
    }

    @Override // o.AbstractC59242zdO
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(gEmmrt());
        sb.append(AEQbTJ() ? "?" : "");
        return sb.toString();
    }
}
