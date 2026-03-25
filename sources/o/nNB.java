package o;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nNB implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final C35893oHp EZpvd;
    public final AppCompatCheckBox KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.ImageView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.gEmmrt;
    }

    public nNB(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatCheckBox appCompatCheckBox, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.gEmmrt = linearLayout;
        this.KWHzl = appCompatCheckBox;
        this.copydefault = constraintLayout;
        this.AEQbTJ = view;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = c35893oHp;
        this.djBIcL = imageView;
        this.AYXKKw = imageView2;
        this.valueOf = imageView3;
        this.AhwBna = textView;
        this.isConnected = textView2;
        this.DbNXlk = textView3;
        this.values = textView4;
    }

    public static nNB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.fGQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static nNB AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.ODXsMY;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i);
        if (appCompatCheckBox != null) {
            i = C35399nuc.StateListAnimator.run;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.aJFbMH))) != null) {
                i = C35399nuc.StateListAnimator.fkESqH;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
                    C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
                    if (c35893oHp != null) {
                        i = C35399nuc.StateListAnimator.aGOrKO;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C35399nuc.StateListAnimator.fupbxE;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C35399nuc.StateListAnimator.deregisterUser;
                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = C35399nuc.StateListAnimator.OEsIKP;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C35399nuc.StateListAnimator.fRNHEq;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C35399nuc.StateListAnimator.OqhRBMiKdSzF;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C35399nuc.StateListAnimator.QezThh;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    return new nNB((android.widget.LinearLayout) view, appCompatCheckBox, constraintLayout, viewFindChildViewById, linearLayoutCompat, c35893oHp, imageView, imageView2, imageView3, textView, textView2, textView3, textView4);
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
