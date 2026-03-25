package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52785wYg extends wXX {
    public final boolean isConnected = true;
    public final boolean fARcdN = true;

    public abstract void AEQbTJ(@NotNull C54954xan c54954xan);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.isConnected;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        int iKWHzl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54954xan c54954xanEZpvd = C54954xan.EZpvd(getCustomLayoutInflater(), constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c54954xanEZpvd, "");
        AEQbTJ(c54954xanEZpvd);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (c54954xanEZpvd.EZpvd.getVisibility() == 0) {
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    iKWHzl = C55298xhM.KWHzl(40.0f, contextRequireContext);
                } else {
                    iKWHzl = 0;
                }
                marginLayoutParams.bottomMargin = iKWHzl;
            }
            constraintLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(AhwBna() ? 1 : 3);
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i = AhwBna() ? 24 : 16;
        android.content.Context context = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = C55298xhM.OLrzqt(i, context);
    }
}
