package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uMD implements ViewBinding {
    public final ComposeView EZpvd;
    public final MaterialToolbar KWHzl;
    public final ConstraintLayout OLrzqt;
    public final wYF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public uMD(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull MaterialToolbar materialToolbar, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull ComposeView composeView) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = materialToolbar;
        this.copydefault = wyf;
        this.EZpvd = composeView;
    }

    public static uMD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static uMD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static uMD EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.dvKsVJ;
        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
        if (materialToolbar != null) {
            i = C48033uCm.Application.DcMfJKDCKfqP;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C48033uCm.Application.GQzpsZ;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    return new uMD((ConstraintLayout) view, materialToolbar, wyf, composeView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
