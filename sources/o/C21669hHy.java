package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21669hHy implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55320xhi AhwBna;
    public final C33537myN EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C21669hHy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = constraintLayout;
        this.OLrzqt = c52794wYp;
        this.EZpvd = c33537myN;
        this.KWHzl = imageView;
        this.AEQbTJ = textView;
        this.AhwBna = c55320xhi;
        this.valueOf = textView2;
    }

    public static C21669hHy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.avCqka, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21669hHy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.valueOf;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.dxcTrN;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C23274hvD.Application.extraCommand;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.ImmLeaksCleaner;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.getResources;
                        C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                        if (c55320xhi != null) {
                            i = C23274hvD.Application.parseItem;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C21669hHy((ConstraintLayout) view, c52794wYp, c33537myN, imageView, textView, c55320xhi, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
