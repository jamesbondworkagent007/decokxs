package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46221tMh implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55113xdn AYXKKw;
    public final RecyclerView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final C55173xeu KWHzl;
    public final C52794wYp OLrzqt;
    public final C52794wYp copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C46221tMh(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.djBIcL = constraintLayout;
        this.EZpvd = linearLayout;
        this.OLrzqt = c52794wYp;
        this.copydefault = c52794wYp2;
        this.AEQbTJ = imageView;
        this.KWHzl = c55173xeu;
        this.AYXKKw = c55113xdn;
        this.AhwBna = recyclerView;
        this.valueOf = constraintLayout2;
        this.gEmmrt = textView;
    }

    public static C46221tMh OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C46221tMh KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C46221tMh OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.QKVWgx;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C47501trL.TaskDescription.QUSxYX;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C47501trL.TaskDescription.djSkpj;
                C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp2 != null) {
                    i = C47501trL.TaskDescription.DaRZkR;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C47501trL.TaskDescription.zDUObI;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C47501trL.TaskDescription.zpGcln;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                i = C47501trL.TaskDescription.DztXDE;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i = C47501trL.TaskDescription.pause;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new C46221tMh(constraintLayout, linearLayout, c52794wYp, c52794wYp2, imageView, c55173xeu, c55113xdn, recyclerView, constraintLayout, textView);
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
