package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUU {
    public final CoroutineDispatcher AEQbTJ;
    public int KWHzl;
    public final InterfaceC28281kVp OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public kUU(@NotNull InterfaceC28281kVp interfaceC28281kVp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28281kVp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC28281kVp;
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = C31172lox.Companion.KWHzl();
    }

    public final void copydefault(int i) {
        this.KWHzl = i;
        InterfaceC28281kVp interfaceC28281kVp = this.OLrzqt;
        C28277kVl c28277kVl = interfaceC28281kVp instanceof C28277kVl ? (C28277kVl) interfaceC28281kVp : null;
        if (c28277kVl != null) {
            c28277kVl.copydefault(i);
        }
    }

    public final kVP EZpvd() {
        return new kVP(this.OLrzqt, this.AEQbTJ);
    }
}
