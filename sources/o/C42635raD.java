package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42635raD implements ViewBinding {
    public final C33540myQ AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final wYK OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42635raD(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C33540myQ c33540myQ, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = wyk;
        this.copydefault = view;
        this.AEQbTJ = c33540myQ;
        this.KWHzl = textView;
    }

    public static C42635raD AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.ODXsMY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42635raD OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.ODXsMY;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.hrjNmC))) != null) {
            i = qZH.StateListAnimator.dHAKvv;
            C33540myQ c33540myQ = (C33540myQ) ViewBindings.findChildViewById(view, i);
            if (c33540myQ != null) {
                i = qZH.StateListAnimator.RemoteActionCompatParcelizer;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C42635raD((ConstraintLayout) view, wyk, viewFindChildViewById, c33540myQ, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
