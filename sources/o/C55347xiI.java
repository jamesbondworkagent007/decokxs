package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55347xiI extends AbstractC55339xiA {
    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        int iOLrzqt;
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        if (c55356xiR.AhwBna()) {
            java.lang.Integer numKWHzl = c55356xiR.KWHzl();
            if (numKWHzl != null) {
                iOLrzqt = numKWHzl.intValue();
            } else {
                C33517mxu c33517mxu = C33517mxu.KWHzl;
                android.content.Context context = c55425xjh.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = c33517mxu.OLrzqt(context, c55356xiR.OLrzqt().getTextColorRes$OKUILib_uilib());
            }
        } else {
            C33517mxu c33517mxu2 = C33517mxu.KWHzl;
            android.content.Context context2 = c55425xjh.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iOLrzqt = c33517mxu2.OLrzqt(context2, C52761wXj.Activity.hfdhUn);
        }
        c55425xjh.setEnabled(c55356xiR.AhwBna());
        c55425xjh.setUnderlineColor(iOLrzqt);
        c55425xjh.setTextColor(iOLrzqt);
        c55425xjh.EZpvd(c55356xiR.AhwBna() ? c55356xiR.OLrzqt().getTextColorRes$OKUILib_uilib() : C52761wXj.Activity.hfdhUn);
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        return c55425xjh.isEnabled() != c55356xiR.AhwBna();
    }
}
