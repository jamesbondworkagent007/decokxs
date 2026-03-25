package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55352xiN extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        java.lang.Integer numKWHzl = c55356xiR.KWHzl();
        if (numKWHzl != null) {
            c55425xjh.setTextColor(numKWHzl.intValue());
        }
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        int currentTextColor = c55425xjh.getCurrentTextColor();
        java.lang.Integer numKWHzl = c55356xiR.KWHzl();
        return (numKWHzl == null || currentTextColor != numKWHzl.intValue()) && c55425xjh.isEnabled();
    }
}
