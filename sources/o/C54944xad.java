package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54944xad implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C54944xad(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = view;
        this.AEQbTJ = c52794wYp;
        this.copydefault = view2;
        this.OLrzqt = imageView;
        this.EZpvd = linearLayout;
        this.gEmmrt = imageView2;
        this.djBIcL = imageView3;
        this.AYXKKw = textView;
        this.valueOf = textView2;
    }

    public static C54944xad KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.uzCIH, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54944xad OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C52761wXj.FragmentManager.OLrzqt;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.giSNqX))) != null) {
            i = C52761wXj.FragmentManager.DarRvM;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C52761wXj.FragmentManager.zOIQXb;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C52761wXj.FragmentManager.DGUQLIDGUQLI;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C52761wXj.FragmentManager.DGUQLIOvDItG;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C52761wXj.FragmentManager.getLabel;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C52761wXj.FragmentManager.ggKfIT;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new C54944xad(view, c52794wYp, viewFindChildViewById, imageView, linearLayout, imageView2, imageView3, textView, textView2);
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
