package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34942nlv extends C34941nlu {
    public final CoroutineDispatcher AhwBna;
    public final boolean KWHzl;
    public final InterfaceC54577xNn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C34941nlu, o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C34941nlu
    public boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C34942nlv(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        super(coroutineDispatcher, interfaceC54577xNn);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = coroutineDispatcher;
        this.valueOf = interfaceC54577xNn;
    }
}
