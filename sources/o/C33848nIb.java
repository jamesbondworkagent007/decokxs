package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33848nIb implements ViewBinding {
    public final nOD AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final nOA EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final nOA OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.ImageView djBIcL;
    public final androidx.appcompat.widget.Toolbar fetchVPNInfo;
    public final C35893oHp gEmmrt;
    public final android.widget.ScrollView isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C33848nIb(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull nOA noa, @androidx.annotation.NonNull nOD nod, @androidx.annotation.NonNull nOA noa2, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.valueOf = linearLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = frameLayout;
        this.EZpvd = noa;
        this.AEQbTJ = nod;
        this.OLrzqt = noa2;
        this.gEmmrt = c35893oHp;
        this.djBIcL = imageView;
        this.AhwBna = linearLayout2;
        this.AYXKKw = linearLayout3;
        this.isConnected = scrollView;
        this.fetchVPNInfo = toolbar;
        this.DbNXlk = textView;
        this.values = textView2;
        this.AkhnZx = textView3;
    }

    public static C33848nIb AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C33848nIb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C33848nIb copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.fZBcTu;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C35399nuc.StateListAnimator.getLabel;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.ggKfIT))) != null) {
                nOA noaKWHzl = nOA.KWHzl(viewFindChildViewById);
                i = C35399nuc.StateListAnimator.RqmePg;
                android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById2 != null) {
                    nOD nodCopydefault = nOD.copydefault(viewFindChildViewById2);
                    i = C35399nuc.StateListAnimator.iHkeWl;
                    android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById3 != null) {
                        nOA noaKWHzl2 = nOA.KWHzl(viewFindChildViewById3);
                        i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
                        C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
                        if (c35893oHp != null) {
                            i = C35399nuc.StateListAnimator.dIjzlO;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C35399nuc.StateListAnimator.fmB;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
                                    i = C35399nuc.StateListAnimator.QOjuYg;
                                    android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                                    if (scrollView != null) {
                                        i = C35399nuc.StateListAnimator.zbGDDc;
                                        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
                                        if (toolbar != null) {
                                            i = C35399nuc.StateListAnimator.ORrpqH;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C35399nuc.StateListAnimator.haRtnV;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C35399nuc.StateListAnimator.zagaMW;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        return new C33848nIb(linearLayout2, c52794wYp, frameLayout, noaKWHzl, nodCopydefault, noaKWHzl2, c35893oHp, imageView, linearLayout, linearLayout2, scrollView, toolbar, textView, textView2, textView3);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
