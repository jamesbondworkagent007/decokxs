package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54769xUq implements InterfaceC54763xUk {
    public InterfaceC54763xUk EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC54763xUk interfaceC54763xUk) {
        this.EZpvd = interfaceC54763xUk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC54763xUk copydefault() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC54763xUk
    public AbstractC54531xLw KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54763xUk interfaceC54763xUk = this.EZpvd;
        if (interfaceC54763xUk != null) {
            return interfaceC54763xUk.KWHzl(str);
        }
        return null;
    }

    @Override // o.InterfaceC54763xUk
    public void AEQbTJ(InterfaceC54763xUk interfaceC54763xUk) {
        InterfaceC54763xUk interfaceC54763xUk2 = this.EZpvd;
        if (interfaceC54763xUk2 != null) {
            interfaceC54763xUk2.AEQbTJ(interfaceC54763xUk);
        }
        this.EZpvd = null;
    }
}
