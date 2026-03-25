package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xas, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54959xas implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55375xik AYXKKw;
    public final C55375xik AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C55353xiO OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C55375xik getRoot() {
        return this.AYXKKw;
    }

    public C54959xas(@androidx.annotation.NonNull C55375xik c55375xik, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C55353xiO c55353xiO, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55375xik c55375xik2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AYXKKw = c55375xik;
        this.AEQbTJ = linearLayout;
        this.EZpvd = linearLayout2;
        this.KWHzl = imageView;
        this.copydefault = imageView2;
        this.OLrzqt = c55353xiO;
        this.valueOf = linearLayout3;
        this.djBIcL = frameLayout;
        this.AhwBna = c55375xik2;
        this.gEmmrt = textView;
        this.AkhnZx = textView2;
        this.fetchVPNInfo = textView3;
        this.isConnected = textView4;
    }

    public static C54959xas copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.QUSxYX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C54959xas OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.EZpvd;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C52761wXj.FragmentManager.zuWLRA;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = C52761wXj.FragmentManager.hrNTAI;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C52761wXj.FragmentManager.OJuSTm;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C52761wXj.FragmentManager.OxVOHk;
                        C55353xiO c55353xiO = (C55353xiO) ViewBindings.findChildViewById(view, i);
                        if (c55353xiO != null) {
                            i = C52761wXj.FragmentManager.igXuih;
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = C52761wXj.FragmentManager.dLBcXg;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    C55375xik c55375xik = (C55375xik) view;
                                    i = C52761wXj.FragmentManager.DQzvGN;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C52761wXj.FragmentManager.ihnvzI;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C52761wXj.FragmentManager.DQYQgr;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C52761wXj.FragmentManager.fXYAwm;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    return new C54959xas(c55375xik, linearLayout, linearLayout2, imageView, imageView2, c55353xiO, linearLayout3, frameLayout, c55375xik, textView, textView2, textView3, textView4);
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
