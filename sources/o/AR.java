package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AR extends C58859zS {
    public final Call AhwBna;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5039Cj interfaceC5039Cj, @NotNull C5173Hn c5173Hn, @NotNull C5173Hn c5173Hn2, @NotNull CoroutineContext coroutineContext, @NotNull Call call) {
        super(interfaceC5037Ch, interfaceC5039Cj, c5173Hn, c5173Hn2, coroutineContext);
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(c5173Hn2, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(call, "");
        this.AhwBna = call;
    }

    @Override // o.C58859zS
    public C58859zS AEQbTJ(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5039Cj interfaceC5039Cj) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        return new AR(interfaceC5037Ch, interfaceC5039Cj, KWHzl(), copydefault(), getCoroutineContext(), this.AhwBna);
    }

    @Override // o.C58859zS
    public void EZpvd() {
        super.EZpvd();
        this.AhwBna.cancel();
    }
}
