package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55349xiK extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        if (c55356xiR.gEmmrt() != null) {
            c55425xjh.setTextSize(0, r3.intValue());
        }
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        float textSize = c55425xjh.getTextSize();
        return !Intrinsics.copydefault(textSize, c55356xiR.gEmmrt() != null ? java.lang.Float.valueOf(r3.intValue()) : null);
    }
}
