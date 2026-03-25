package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48429uRb implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final ConstraintLayout EZpvd;
    public final android.view.View KWHzl;
    public final wYC OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C48429uRb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = wyc;
        this.copydefault = linearLayout;
        this.KWHzl = view;
        this.AEQbTJ = linearLayout2;
        this.gEmmrt = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
    }

    public static C48429uRb AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zKcAg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C48429uRb KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.OJuSTm;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C48033uCm.Application.gdwsGQ;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.DzCpqu))) != null) {
                i = C48033uCm.Application.iTrKTi;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = C48033uCm.Application.setItems;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C48033uCm.Application.setCancelable;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new C48429uRb((ConstraintLayout) view, wyc, linearLayout, viewFindChildViewById, linearLayout2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
