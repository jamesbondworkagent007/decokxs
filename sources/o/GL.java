package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GL implements GB<java.lang.Double> {
    public static final GL EZpvd = new GL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(double d, @NotNull InterfaceC57843yq interfaceC57843yq, FW fw) {
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
    }

    private GL() {
    }

    @Override // o.GB
    public /* synthetic */ void KWHzl(java.lang.Number number, InterfaceC57843yq interfaceC57843yq, FW fw) {
        KWHzl(number.doubleValue(), interfaceC57843yq, fw);
    }
}
