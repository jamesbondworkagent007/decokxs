package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17177exq implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C16835erS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C17177exq(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C16835erS c16835erS) {
        this.AhwBna = constraintLayout;
        this.OLrzqt = textView;
        this.EZpvd = textView2;
        this.KWHzl = frameLayout;
        this.AEQbTJ = linearLayout;
        this.copydefault = c16835erS;
    }

    public static C17177exq copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.valueOf;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C13754dXa.ActionBar.getNewProxyInstance;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C13754dXa.ActionBar.putInt;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C13754dXa.ActionBar.setTitle;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.ParceledListSliceAdapterApi21))) != null) {
                        return new C17177exq((ConstraintLayout) view, textView, textView2, frameLayout, linearLayout, C16835erS.AEQbTJ(viewFindChildViewById));
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
