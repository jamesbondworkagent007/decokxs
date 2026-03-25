package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52779wYa extends wXX {
    public abstract void OLrzqt(@NotNull C54956xap c54956xap);

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        float fAEQbTJ = C55302xhQ.AEQbTJ(resources);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        float fOLrzqt = C55298xhM.OLrzqt(20, contextRequireContext);
        Intrinsics.checkNotNullExpressionValue(getResources(), "");
        return (fAEQbTJ - fOLrzqt) / C55302xhQ.AEQbTJ(r3);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        int iOLrzqt;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54956xap c54956xapAEQbTJ = C54956xap.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c54956xapAEQbTJ, "");
        OLrzqt(c54956xapAEQbTJ);
        ViewGroup.LayoutParams layoutParams = c54956xapAEQbTJ.copydefault.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (c54956xapAEQbTJ.EZpvd.getVisibility() == 0) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            iOLrzqt = C55298xhM.OLrzqt(38, contextRequireContext);
        } else {
            iOLrzqt = 0;
        }
        marginLayoutParams.bottomMargin = iOLrzqt;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setId(1);
    }
}
