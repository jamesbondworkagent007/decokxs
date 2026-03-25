package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46264tNx implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C33537myN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C46264tNx(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.EZpvd = linearLayout;
        this.copydefault = c33537myN;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
        this.OLrzqt = textView3;
    }

    public static C46264tNx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C46264tNx KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.dvKsVJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C46264tNx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.fZc;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C47501trL.TaskDescription.apHBvG;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C47501trL.TaskDescription.HJWChPfrwjPh;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C47501trL.TaskDescription.RZMhtF;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new C46264tNx((android.widget.LinearLayout) view, c33537myN, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
