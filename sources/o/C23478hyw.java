package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23478hyw implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final C28055kNf AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AEQbTJ;
    }

    public C23478hyw(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C28055kNf c28055kNf) {
        this.AEQbTJ = nestedScrollView;
        this.KWHzl = appCompatImageView;
        this.copydefault = linearLayout;
        this.EZpvd = appCompatTextView;
        this.OLrzqt = textView;
        this.AhwBna = appCompatTextView2;
        this.AYXKKw = c28055kNf;
    }

    public static C23478hyw OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DCJXGO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23478hyw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DhEJvI;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.OnBackPressedDispatcherOnBackPressedCancellable;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.onMenuModeChange;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.createRadioButton;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.WindowDecorActionBarActionModeImpl;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.flagActionItems;
                            C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
                            if (c28055kNf != null) {
                                return new C23478hyw((NestedScrollView) view, appCompatImageView, linearLayout, appCompatTextView, textView, appCompatTextView2, c28055kNf);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
