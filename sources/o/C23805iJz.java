package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23805iJz implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C23805iJz(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayout;
        this.KWHzl = linearLayout2;
        this.EZpvd = imageView;
        this.AEQbTJ = textView;
    }

    public static C23805iJz KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DGOPHZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23805iJz AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = C25493ixk.ActionBar.RjCdvpRjCdvp;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.RhlVAI;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C23805iJz(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
