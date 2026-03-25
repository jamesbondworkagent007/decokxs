package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16318ehf implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C52794wYp EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C33537myN OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C16318ehf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.valueOf = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.KWHzl = imageView;
        this.OLrzqt = c33537myN;
        this.copydefault = constraintLayout2;
        this.djBIcL = textView;
        this.AhwBna = textView2;
    }

    public static C16318ehf AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C16318ehf copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.getNewProxyInstance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16318ehf KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zOIQXb;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.DQzvGNdrmXxu;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C13754dXa.ActionBar.rsEnD;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C13754dXa.ActionBar.playFromUri;
                    C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
                    if (c33537myN != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C13754dXa.ActionBar.ActivityResultContractsOpenDocument;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C13754dXa.ActionBar.ActivityResultContractsGetContent;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C16318ehf(constraintLayout, c52794wYp, c52794wYp2, imageView, c33537myN, constraintLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
