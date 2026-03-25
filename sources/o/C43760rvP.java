package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43760rvP implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout OLrzqt;
    public final C33537myN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C43760rvP(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AEQbTJ = linearLayout;
        this.copydefault = c33537myN;
        this.EZpvd = c52794wYp;
        this.OLrzqt = linearLayout2;
    }

    public static C43760rvP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C43760rvP copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.valueOf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C43760rvP EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.zuBGHE;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C43662rtX.ActionBar.aUsmxb;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C43662rtX.ActionBar.geLlBI;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new C43760rvP((android.widget.LinearLayout) view, c33537myN, c52794wYp, linearLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
