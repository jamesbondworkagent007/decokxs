package o;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingImageTileBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18185fdd extends AbstractC14584doH<DefiOnboardingTile.StateListAnimator, C16791eqb> {
    public C18185fdd() {
        super(DefiOnboardingImageTileBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16791eqb c16791eqb, @NotNull DefiOnboardingTile.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c16791eqb, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        android.widget.ImageView root = c16791eqb.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        if (root.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = stateListAnimator.djBIcL();
                marginLayoutParams.height = stateListAnimator.EZpvd();
                android.graphics.Rect rectAEQbTJ = stateListAnimator.AEQbTJ();
                if (rectAEQbTJ != null) {
                    marginLayoutParams.leftMargin = rectAEQbTJ.left;
                    marginLayoutParams.topMargin = rectAEQbTJ.top;
                    marginLayoutParams.rightMargin = rectAEQbTJ.right;
                    marginLayoutParams.bottomMargin = rectAEQbTJ.bottom;
                }
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault != null) {
            Glide.KWHzl(c16791eqb.getRoot()).EZpvd(strCopydefault).EZpvd(c16791eqb.getRoot());
            return;
        }
        java.lang.Integer numKWHzl = stateListAnimator.KWHzl();
        if (numKWHzl != null) {
            c16791eqb.getRoot().setImageResource(numKWHzl.intValue());
        }
        ImageView.ScaleType scaleTypeOLrzqt = stateListAnimator.OLrzqt();
        if (scaleTypeOLrzqt != null) {
            c16791eqb.getRoot().setScaleType(scaleTypeOLrzqt);
        }
    }
}
