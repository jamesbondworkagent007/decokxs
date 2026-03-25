package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50823vbS implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.view.View AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55353xiO OLrzqt;
    public final RecyclerView copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C50823vbS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55353xiO c55353xiO, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.view.View view) {
        this.valueOf = constraintLayout;
        this.EZpvd = textView;
        this.OLrzqt = c55353xiO;
        this.AEQbTJ = textView2;
        this.KWHzl = textView3;
        this.copydefault = recyclerView;
        this.djBIcL = linearLayoutCompat;
        this.AYXKKw = textView4;
        this.gEmmrt = imageView;
        this.AhwBna = view;
    }

    public static C50823vbS copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.nriSR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C50823vbS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.ORmwhf;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.getBitmap;
            C55353xiO c55353xiO = (C55353xiO) ViewBindings.findChildViewById(view, i);
            if (c55353xiO != null) {
                i = C48033uCm.Application.createSession;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C48033uCm.Application.MediaSessionCompatApi21Callback;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C48033uCm.Application.BoolRes;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = C48033uCm.Application.Keep;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C48033uCm.Application.setInstance;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.updateStateFromTypedArray))) != null) {
                                        return new C50823vbS((ConstraintLayout) view, textView, c55353xiO, textView2, textView3, recyclerView, linearLayoutCompat, textView4, imageView, viewFindChildViewById);
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
