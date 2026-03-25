package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46263tNw implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final tUE AYXKKw;
    public final ConstraintLayout AhwBna;
    public final wYK DbNXlk;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.TextView djBIcL;
    public final tUE gEmmrt;
    public final tUE valueOf;
    public final tUE values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C46263tNw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull tUE tue, @androidx.annotation.NonNull tUE tue2, @androidx.annotation.NonNull tUE tue3, @androidx.annotation.NonNull tUE tue4, @androidx.annotation.NonNull wYK wyk) {
        this.AhwBna = constraintLayout;
        this.copydefault = c33537myN;
        this.OLrzqt = c52794wYp;
        this.EZpvd = constraintLayout2;
        this.AEQbTJ = textView;
        this.KWHzl = constraintLayout3;
        this.djBIcL = textView2;
        this.AYXKKw = tue;
        this.gEmmrt = tue2;
        this.valueOf = tue3;
        this.values = tue4;
        this.DbNXlk = wyk;
    }

    public static C46263tNw AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C46263tNw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.fZBcTu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C46263tNw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.valueOf;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C47501trL.TaskDescription.htlTjW;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C47501trL.TaskDescription.gGNlxh;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C47501trL.TaskDescription.fVjYLc;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C47501trL.TaskDescription.FHvxmb;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = C47501trL.TaskDescription.hNurIN;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C47501trL.TaskDescription.OgHfcT;
                                tUE tue = (tUE) ViewBindings.findChildViewById(view, i);
                                if (tue != null) {
                                    i = C47501trL.TaskDescription.DQnQnb;
                                    tUE tue2 = (tUE) ViewBindings.findChildViewById(view, i);
                                    if (tue2 != null) {
                                        i = C47501trL.TaskDescription.OrsvgJ;
                                        tUE tue3 = (tUE) ViewBindings.findChildViewById(view, i);
                                        if (tue3 != null) {
                                            i = C47501trL.TaskDescription.gAnGwV;
                                            tUE tue4 = (tUE) ViewBindings.findChildViewById(view, i);
                                            if (tue4 != null) {
                                                i = C47501trL.TaskDescription.GiPPlLRPuVlr;
                                                wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                                                if (wyk != null) {
                                                    return new C46263tNw((ConstraintLayout) view, c33537myN, c52794wYp, constraintLayout, textView, constraintLayout2, textView2, tue, tue2, tue3, tue4, wyk);
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
