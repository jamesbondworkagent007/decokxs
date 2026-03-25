package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22318hdB implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final kLP KWHzl;
    public final C55113xdn OLrzqt;
    public final ConstraintLayout copydefault;
    public final AppCompatTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C22318hdB(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull kLP klp, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.copydefault = constraintLayout;
        this.KWHzl = klp;
        this.OLrzqt = c55113xdn;
        this.AEQbTJ = recyclerView;
        this.EZpvd = appCompatTextView;
        this.djBIcL = appCompatTextView2;
    }

    public static C22318hdB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C22318hdB KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C22366hdx.ActionBar.QOLQEE;
        kLP klp = (kLP) ViewBindings.findChildViewById(view, i);
        if (klp != null) {
            i = C22366hdx.ActionBar.getPostValueLengthLimit;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C22366hdx.ActionBar.OFhtUX;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C22366hdx.ActionBar.UhxbNG;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C22366hdx.ActionBar.sTzBva;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new C22318hdB((ConstraintLayout) view, klp, c55113xdn, recyclerView, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
