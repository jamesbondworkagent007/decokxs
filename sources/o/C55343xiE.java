package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55343xiE extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        java.lang.Integer numEZpvd = c55356xiR.EZpvd();
        int iIntValue = numEZpvd != null ? numEZpvd.intValue() : -1;
        if (c55356xiR.djBIcL()) {
            c55425xjh.copydefault(C52761wXj.TaskDescription.dNxZaP, iIntValue, java.lang.Integer.valueOf(c55356xiR.OLrzqt().getTextColorRes$OKUILib_uilib()));
        } else {
            c55425xjh.KWHzl();
        }
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        return OLrzqt(c55356xiR) && KWHzl(c55425xjh, c55356xiR);
    }

    public final boolean KWHzl(C55425xjh c55425xjh, C55356xiR c55356xiR) {
        return (c55425xjh.copydefault() && !c55356xiR.djBIcL()) || (!c55425xjh.copydefault() && c55356xiR.djBIcL());
    }

    public final boolean OLrzqt(C55356xiR c55356xiR) {
        java.lang.Integer numEZpvd = c55356xiR.EZpvd();
        return numEZpvd != null && numEZpvd.intValue() > 0;
    }
}
