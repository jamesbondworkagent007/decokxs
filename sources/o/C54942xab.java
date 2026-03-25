package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54942xab implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55380xip EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C54942xab(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55380xip c55380xip, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = constraintLayout2;
        this.copydefault = imageView;
        this.EZpvd = c55380xip;
        this.OLrzqt = imageView2;
        this.valueOf = textView;
    }

    public static C54942xab KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.hDKMBd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C54942xab copydefault(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = android.R.id.icon;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, android.R.id.icon);
        if (imageView != null) {
            i = C52761wXj.FragmentManager.fHqPtx;
            C55380xip c55380xip = (C55380xip) ViewBindings.findChildViewById(view, i);
            if (c55380xip != null) {
                i = C52761wXj.FragmentManager.zlvcHA;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = android.R.id.text1;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, android.R.id.text1);
                    if (textView != null) {
                        return new C54942xab(constraintLayout, constraintLayout, imageView, c55380xip, imageView2, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
