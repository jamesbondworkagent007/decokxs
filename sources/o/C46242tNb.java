package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46242tNb implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C46242tNb(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = linearLayout;
        this.copydefault = c52794wYp;
        this.EZpvd = textView;
    }

    public static C46242tNb KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.FQMcgE;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C47501trL.TaskDescription.DpxfQh;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C46242tNb((android.widget.LinearLayout) view, c52794wYp, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
