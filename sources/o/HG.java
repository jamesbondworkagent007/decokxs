package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class HG implements InterfaceC5184Hy {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, byte[]> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5184Hy
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    public HG(@NotNull java.util.Map<java.lang.String, byte[]> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = map;
        this.AEQbTJ = str;
    }

    @Override // o.InterfaceC5184Hy
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super byte[]> continuation) {
        return this.OLrzqt.get(str);
    }

    @Override // o.InterfaceC5184Hy
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.put(str, bArr);
        return Unit.INSTANCE;
    }
}
