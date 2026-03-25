package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21649hHe implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C21649hHe(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.copydefault = linearLayoutCompat;
        this.KWHzl = imageView;
        this.AEQbTJ = imageView2;
        this.OLrzqt = c52794wYp;
    }

    public static C21649hHe copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.apLTlu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21649hHe OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.UscePu;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.apNbdB;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C23274hvD.Application.dLBcXg;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    return new C21649hHe((LinearLayoutCompat) view, imageView, imageView2, c52794wYp);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
