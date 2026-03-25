package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes16.dex */
public final class nHY implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final nOF KWHzl;
    public final nOC OLrzqt;
    public final ConstraintLayout copydefault;
    public final androidx.appcompat.widget.Toolbar djBIcL;
    public final android.widget.ScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public nHY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull nOC noc, @androidx.annotation.NonNull nOF nof, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = noc;
        this.KWHzl = nof;
        this.EZpvd = constraintLayout2;
        this.valueOf = scrollView;
        this.djBIcL = toolbar;
        this.AhwBna = textView;
    }

    public static nHY AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static nHY OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.valueOf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static nHY copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.fZBcTu;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.UccSpe))) != null) {
            nOC nocOLrzqt = nOC.OLrzqt(viewFindChildViewById);
            i = C35399nuc.StateListAnimator.iqMDAV;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                nOF nofCopydefault = nOF.copydefault(viewFindChildViewById2);
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C35399nuc.StateListAnimator.QOjuYg;
                android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    i = C35399nuc.StateListAnimator.zbGDDc;
                    androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
                    if (toolbar != null) {
                        i = C35399nuc.StateListAnimator.ORrpqH;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new nHY(constraintLayout, c52794wYp, nocOLrzqt, nofCopydefault, constraintLayout, scrollView, toolbar, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
