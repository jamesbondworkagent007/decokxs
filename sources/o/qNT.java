package o;

import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qNT extends AbstractC40510qYn<C40245qOs, C42847reD> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42847reD AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42847reD c42847reDOLrzqt = C42847reD.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42847reDOLrzqt, "");
        return c42847reDOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42847reD c42847reD, int i, @NotNull C40245qOs c40245qOs) {
        Intrinsics.checkNotNullParameter(c42847reD, "");
        Intrinsics.checkNotNullParameter(c40245qOs, "");
        c42847reD.AEQbTJ.setText(qZH.PendingIntent.iZzfmt);
        C40239qOm.ActionBar.Application applicationAEQbTJ = c40245qOs.AEQbTJ();
        if (applicationAEQbTJ == null) {
            android.widget.LinearLayout root = c42847reD.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
            return;
        }
        android.widget.LinearLayout root2 = c42847reD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(0);
        C55244xgL c55244xgL = c42847reD.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        c55244xgL.setVisibility(applicationAEQbTJ.copydefault().size() > 1 ? 0 : 8);
        qSV qsv = c42847reD.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(qsv, "");
        qsv.setVisibility(0);
        C55244xgL c55244xgL2 = c42847reD.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55244xgL2, "");
        if (c55244xgL2.getVisibility() == 0) {
            qNQ.KWHzl(c42847reD, applicationAEQbTJ);
        }
        qNQ.AhwBna(c42847reD, applicationAEQbTJ);
        qNQ.EZpvd(c42847reD, applicationAEQbTJ);
    }
}
