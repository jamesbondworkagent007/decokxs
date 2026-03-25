package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17228eyo implements InterfaceC17225eyl {
    public final C10954byG AEQbTJ;

    public C17228eyo(@NotNull C10954byG c10954byG) {
        Intrinsics.checkNotNullParameter(c10954byG, "");
        this.AEQbTJ = c10954byG;
    }

    @Override // o.InterfaceC17225eyl
    public C10854bwM AEQbTJ() {
        return this.AEQbTJ.valueOf().isConnected();
    }
}
