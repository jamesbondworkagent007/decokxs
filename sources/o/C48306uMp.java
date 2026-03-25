package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48306uMp implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ComposeView EZpvd;
    public final MaterialToolbar KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final wYF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C48306uMp(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull MaterialToolbar materialToolbar, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = linearLayout;
        this.KWHzl = materialToolbar;
        this.copydefault = wyf;
        this.EZpvd = composeView;
        this.AEQbTJ = textView;
    }

    public static C48306uMp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C48306uMp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48306uMp AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.dvKsVJ;
        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
        if (materialToolbar != null) {
            i = C48033uCm.Application.fmB;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C48033uCm.Application.DBAlnt;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C48033uCm.Application.hrnhsO;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C48306uMp((android.widget.LinearLayout) view, materialToolbar, wyf, composeView, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
