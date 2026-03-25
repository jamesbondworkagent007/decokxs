package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNN implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public tNN(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.EZpvd = linearLayout;
        this.copydefault = textView;
        this.OLrzqt = textView2;
        this.AEQbTJ = textView3;
        this.KWHzl = textView4;
        this.AYXKKw = textView5;
    }

    public static tNN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.ffGIBT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static tNN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.zXhzOT;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C47501trL.TaskDescription.pause;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C47501trL.TaskDescription.iLWfRf;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C47501trL.TaskDescription.gdLjtZ;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = C47501trL.TaskDescription.OxbLUn;
                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            return new tNN((android.widget.LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
