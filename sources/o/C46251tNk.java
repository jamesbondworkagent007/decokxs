package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46251tNk implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final Barrier copydefault;
    public final AppCompatTextView djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C46251tNk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.OLrzqt = constraintLayout;
        this.copydefault = barrier;
        this.KWHzl = appCompatImageView;
        this.EZpvd = imageView;
        this.AEQbTJ = appCompatTextView;
        this.AhwBna = textView;
        this.gEmmrt = textView2;
        this.djBIcL = appCompatTextView2;
    }

    public static C46251tNk OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.QVAiDq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C46251tNk OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.AwvSrB;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C47501trL.TaskDescription.RSDDiY;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C47501trL.TaskDescription.invokespecialdPnHjp;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C47501trL.TaskDescription.aBDePw;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C47501trL.TaskDescription.hpmliR;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C47501trL.TaskDescription.dYepVG;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C47501trL.TaskDescription.OFqMGB;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    return new C46251tNk((ConstraintLayout) view, barrier, appCompatImageView, imageView, appCompatTextView, textView, textView2, appCompatTextView2);
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
