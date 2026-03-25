package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC52788wYj extends AbstractC52792wYn {
    public abstract java.lang.CharSequence EZpvd();

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        ViewGroup.LayoutParams layoutParams = linearLayoutCompatEZpvd != null ? linearLayoutCompatEZpvd.getLayoutParams() : null;
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.startToEnd = -1;
        layoutParams2.endToStart = -1;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        android.content.Context context = c52781wYc.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams2.setMarginStart(C55298xhM.OLrzqt(48, context));
        android.content.Context context2 = c52781wYc.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams2.setMarginEnd(C55298xhM.OLrzqt(48, context2));
        android.widget.TextView textViewAEQbTJ = c52781wYc.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.getLayoutParams().width = -1;
        }
        android.widget.TextView textViewAEQbTJ2 = c52781wYc.AEQbTJ();
        if (textViewAEQbTJ2 != null) {
            textViewAEQbTJ2.setGravity(17);
        }
        c52781wYc.setTitle(EZpvd());
        c52781wYc.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(6);
    }
}
