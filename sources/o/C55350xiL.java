package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55350xiL extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        c55425xjh.setUnderlineColor(c55425xjh.getCurrentTextColor());
        c55425xjh.setShowUnderline(c55356xiR.AYXKKw());
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        return c55425xjh.EZpvd() != c55356xiR.AYXKKw();
    }
}
