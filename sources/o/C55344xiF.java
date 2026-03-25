package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55344xiF extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        java.lang.Integer numEZpvd = c55356xiR.EZpvd();
        if (numEZpvd != null) {
            c55425xjh.setLineHeight(numEZpvd.intValue());
        }
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        int lineHeight = c55425xjh.getLineHeight();
        java.lang.Integer numEZpvd = c55356xiR.EZpvd();
        return numEZpvd == null || lineHeight != numEZpvd.intValue();
    }
}
