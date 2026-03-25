package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16509elK implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C16509elK(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.OLrzqt = linearLayout;
        this.KWHzl = c52794wYp;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
        this.copydefault = textView2;
        this.AhwBna = textView3;
        this.gEmmrt = textView4;
        this.djBIcL = textView5;
    }

    public static C16509elK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.zlvcHA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16509elK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.QDqgQU;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.zbGDDc;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C13754dXa.ActionBar.onRestoreInstanceState;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C13754dXa.ActionBar.ActivityResultRegistry2;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C13754dXa.ActionBar.register;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C13754dXa.ActionBar.dispatchResult;
                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = C13754dXa.ActionBar.CheckResult;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    return new C16509elK((android.widget.LinearLayout) view, c52794wYp, imageView, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
