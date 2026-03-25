package o;

import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C46526tXp;

/* JADX INFO: loaded from: classes10.dex */
public final class tXB implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final Group OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ScrollView isConnected;
    public final android.widget.ScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.valueOf;
    }

    public tXB(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ScrollView scrollView2) {
        this.valueOf = scrollView;
        this.EZpvd = textView;
        this.AEQbTJ = linearLayout;
        this.KWHzl = imageView;
        this.OLrzqt = group;
        this.copydefault = textView2;
        this.gEmmrt = textView3;
        this.AYXKKw = linearLayout2;
        this.djBIcL = imageView2;
        this.AhwBna = textView4;
        this.isConnected = scrollView2;
    }

    public static tXB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C46526tXp.ActionBar.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static tXB OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C46526tXp.Application.AEQbTJ;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C46526tXp.Application.valueOf;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C46526tXp.Application.gEmmrt;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C46526tXp.Application.AhwBna;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C46526tXp.Application.djBIcL;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C46526tXp.Application.values;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C46526tXp.Application.fetchVPNInfo;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C46526tXp.Application.AkhnZx;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C46526tXp.Application.fARcdN;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            android.widget.ScrollView scrollView = (android.widget.ScrollView) view;
                                            return new tXB(scrollView, textView, linearLayout, imageView, group, textView2, textView3, linearLayout2, imageView2, textView4, scrollView);
                                        }
                                    }
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
