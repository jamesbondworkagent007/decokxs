package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54915xaA implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final android.widget.RelativeLayout AhwBna;
    public final MaterialTextView AkhnZx;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final wYF OLrzqt;
    public final android.widget.RelativeLayout copydefault;
    public final android.widget.RelativeLayout djBIcL;
    public final android.view.View gEmmrt;
    public final android.widget.RelativeLayout valueOf;
    public final MaterialTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.gEmmrt;
    }

    public C54915xaA(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout3, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout4, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull MaterialTextView materialTextView, @androidx.annotation.NonNull MaterialTextView materialTextView2) {
        this.gEmmrt = view;
        this.copydefault = relativeLayout;
        this.OLrzqt = wyf;
        this.EZpvd = imageView;
        this.AEQbTJ = imageView2;
        this.KWHzl = linearLayout;
        this.AhwBna = relativeLayout2;
        this.valueOf = relativeLayout3;
        this.djBIcL = relativeLayout4;
        this.AYXKKw = nestedScrollView;
        this.AkhnZx = materialTextView;
        this.values = materialTextView2;
    }

    public static C54915xaA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.flVtFt, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54915xaA OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.AEQbTJ;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C52761wXj.FragmentManager.values;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C52761wXj.FragmentManager.hrNTAI;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C52761wXj.FragmentManager.OJuSTm;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C52761wXj.FragmentManager.igXuih;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C52761wXj.FragmentManager.UhxbNG;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = C52761wXj.FragmentManager.ULRxlR;
                                android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout3 != null) {
                                    i = C52761wXj.FragmentManager.aJFbMH;
                                    android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout4 != null) {
                                        i = C52761wXj.FragmentManager.gSBher;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                        if (nestedScrollView != null) {
                                            i = C52761wXj.FragmentManager.RIuxYh;
                                            MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                            if (materialTextView != null) {
                                                i = C52761wXj.FragmentManager.RgLUBD;
                                                MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                                if (materialTextView2 != null) {
                                                    return new C54915xaA(view, relativeLayout, wyf, imageView, imageView2, linearLayout, relativeLayout2, relativeLayout3, relativeLayout4, nestedScrollView, materialTextView, materialTextView2);
                                                }
                                            }
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
