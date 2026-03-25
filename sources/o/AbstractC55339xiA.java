package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC55339xiA {
    public abstract void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR);

    public abstract boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR);

    public final void EZpvd(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR, boolean z) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        if (copydefault(c55425xjh, c55356xiR) || z) {
            AEQbTJ(c55425xjh, c55356xiR);
        }
    }
}
