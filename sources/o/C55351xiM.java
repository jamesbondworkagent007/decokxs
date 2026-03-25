package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55351xiM extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        java.lang.CharSequence charSequenceAEQbTJ = c55356xiR.AEQbTJ();
        if (charSequenceAEQbTJ != null) {
            c55425xjh.setText(charSequenceAEQbTJ);
        }
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        return !Intrinsics.EZpvd(c55425xjh.getText(), c55356xiR.AEQbTJ());
    }
}
