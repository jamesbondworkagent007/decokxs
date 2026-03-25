package o;

import androidx.lifecycle.FlowLiveDataConversions;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19588gHy implements InterfaceC19585gHv {
    public final C19589gHz KWHzl;

    public C19588gHy(@NotNull C19589gHz c19589gHz) {
        Intrinsics.checkNotNullParameter(c19589gHz, "");
        this.KWHzl = c19589gHz;
    }

    @Override // o.InterfaceC19585gHv
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<? extends java.util.ArrayList<C19574gHk>>> continuation) {
        return FlowLiveDataConversions.asFlow(this.KWHzl.OLrzqt());
    }
}
