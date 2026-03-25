package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30431lay {
    public static InterfaceC30428lav AEQbTJ;
    public static final C30431lay copydefault = new C30431lay();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC30428lav interfaceC30428lav) {
        Intrinsics.checkNotNullParameter(interfaceC30428lav, "");
        AEQbTJ = interfaceC30428lav;
    }

    private C30431lay() {
    }

    public final InterfaceC30428lav KWHzl() {
        InterfaceC30428lav interfaceC30428lav = AEQbTJ;
        if (interfaceC30428lav != null) {
            return interfaceC30428lav;
        }
        throw new java.lang.IllegalStateException("TokenListDependencyProvider not initialized. Call register() first.");
    }
}
