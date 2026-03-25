package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42648raQ implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42648raQ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = constraintLayout;
        this.KWHzl = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.OLrzqt = textView;
    }

    public static C42648raQ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.htlTjW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42648raQ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DjzMc;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.dxTXDv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C42648raQ((ConstraintLayout) view, appCompatTextView, appCompatTextView2, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
