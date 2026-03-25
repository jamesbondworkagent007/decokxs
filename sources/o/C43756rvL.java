package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43756rvL implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final C33537myN KWHzl;
    public final C52794wYp OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public C43756rvL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.AYXKKw = linearLayout;
        this.KWHzl = c33537myN;
        this.EZpvd = linearLayout2;
        this.copydefault = c52794wYp;
        this.AEQbTJ = linearLayout3;
        this.OLrzqt = c52794wYp2;
    }

    public static C43756rvL copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C43756rvL copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C43756rvL EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.zuBGHE;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C43662rtX.ActionBar.QKVWgx;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C43662rtX.ActionBar.iRxXKY;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C43662rtX.ActionBar.QwvEab;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C43662rtX.ActionBar.RkASWs;
                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp2 != null) {
                            return new C43756rvL((android.widget.LinearLayout) view, c33537myN, linearLayout, c52794wYp, linearLayout2, c52794wYp2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
