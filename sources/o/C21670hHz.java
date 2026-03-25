package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21670hHz implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final C55173xeu KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final CircularProgressIndicator djBIcL;
    public final RecyclerView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C21670hHz(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull CircularProgressIndicator circularProgressIndicator, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.view.View view) {
        this.AYXKKw = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.copydefault = imageView;
        this.AEQbTJ = frameLayout;
        this.KWHzl = c55173xeu;
        this.EZpvd = imageView2;
        this.valueOf = textView;
        this.djBIcL = circularProgressIndicator;
        this.AhwBna = imageView3;
        this.gEmmrt = recyclerView;
        this.values = view;
    }

    public static C21670hHz OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.dxcTrN;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.accept;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.invokespecialRtjmuc;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C23274hvD.Application.QOjuYg;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C23274hvD.Application.DRtzUu;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C23274hvD.Application.getExtraBinder;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.PlaybackStateCompatErrorCode;
                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                                if (circularProgressIndicator != null) {
                                    i = C23274hvD.Application.initViewTreeOwners;
                                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = C23274hvD.Application.ComponentActivity5;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.setContentdefault))) != null) {
                                            return new C21670hHz((ConstraintLayout) view, constraintLayout, imageView, frameLayout, c55173xeu, imageView2, textView, circularProgressIndicator, imageView3, recyclerView, viewFindChildViewById);
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
