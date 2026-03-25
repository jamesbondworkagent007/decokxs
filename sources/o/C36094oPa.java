package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36094oPa implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C36108oPo EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final C39774pyg djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C36094oPa(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C36108oPo c36108oPo, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C39774pyg c39774pyg, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AhwBna = constraintLayout;
        this.KWHzl = recyclerView;
        this.OLrzqt = linearLayout;
        this.AEQbTJ = imageView;
        this.copydefault = textView;
        this.EZpvd = c36108oPo;
        this.AYXKKw = appCompatTextView;
        this.djBIcL = c39774pyg;
        this.valueOf = appCompatTextView2;
        this.gEmmrt = linearLayout2;
    }

    public static C36094oPa copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.zKcAg;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35964oKf.StateListAnimator.aVhqwO;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C35964oKf.StateListAnimator.fupbxE;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35964oKf.StateListAnimator.gBtXYZ;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DfrfUJ))) != null) {
                        C36108oPo c36108oPoKWHzl = C36108oPo.KWHzl(viewFindChildViewById);
                        i = C35964oKf.StateListAnimator.RxVVQC;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C35964oKf.StateListAnimator.DbvGUJ;
                            C39774pyg c39774pyg = (C39774pyg) ViewBindings.findChildViewById(view, i);
                            if (c39774pyg != null) {
                                i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi213;
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        return new C36094oPa((ConstraintLayout) view, recyclerView, linearLayout, imageView, textView, c36108oPoKWHzl, appCompatTextView, c39774pyg, appCompatTextView2, linearLayout2);
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
