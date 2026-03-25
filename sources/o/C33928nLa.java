package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33928nLa implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C33928nLa(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayout;
        this.KWHzl = imageView;
        this.EZpvd = textView;
    }

    public static C33928nLa KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.OTwTPd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33928nLa OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.gdmIOq;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C35399nuc.StateListAnimator.DQzvGNdrmXxu;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C33928nLa((android.widget.LinearLayout) view, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
