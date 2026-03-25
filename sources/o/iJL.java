package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iJL implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final OKSortTextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final OKSortTextView djBIcL;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public iJL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull OKSortTextView oKSortTextView2) {
        this.EZpvd = constraintLayout;
        this.KWHzl = oKSortTextView;
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.AEQbTJ = view;
        this.valueOf = view2;
        this.djBIcL = oKSortTextView2;
    }

    public static iJL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.heceqZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static iJL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C25493ixk.ActionBar.AubY;
        OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
        if (oKSortTextView != null) {
            i = C25493ixk.ActionBar.DtnWsU;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C25493ixk.ActionBar.gxJrGF;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.sJqpAA))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.sYOsaF))) != null) {
                    i = C25493ixk.ActionBar.getBundle;
                    OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView2 != null) {
                        return new iJL((ConstraintLayout) view, oKSortTextView, textView, textView2, viewFindChildViewById, viewFindChildViewById2, oKSortTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
