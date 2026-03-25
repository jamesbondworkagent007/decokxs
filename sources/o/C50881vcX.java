package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50881vcX implements ViewBinding {
    public final C55320xhi AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C50881vcX(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.copydefault = linearLayout;
        this.EZpvd = appCompatTextView;
        this.AEQbTJ = c55320xhi;
        this.KWHzl = appCompatTextView2;
    }

    public static C50881vcX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OWSZPf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C50881vcX KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.uncaughtException;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C48033uCm.Application.shouldWrapException;
            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
            if (c55320xhi != null) {
                i = C48033uCm.Application.ResourcesFlusher;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    return new C50881vcX((android.widget.LinearLayout) view, appCompatTextView, c55320xhi, appCompatTextView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
