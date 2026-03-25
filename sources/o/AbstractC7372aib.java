package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC7378aih;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7372aib implements InterfaceC7378aih {
    public static final int $stable = 8;
    private InterfaceComponentCallbacks2C43266rlz module;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void bindModule(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.module = interfaceComponentCallbacks2C43266rlz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceComponentCallbacks2C43266rlz getModule() {
        return this.module;
    }

    public C7325ahh register(@NotNull C7325ahh c7325ahh) {
        return InterfaceC7378aih.StateListAnimator.OLrzqt(this, c7325ahh);
    }
}
