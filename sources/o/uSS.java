package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSS implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final C55230xfy OLrzqt;
    public final C52834waB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public uSS(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52834waB c52834waB, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayout;
        this.copydefault = c52834waB;
        this.OLrzqt = c55230xfy;
        this.KWHzl = textView;
    }

    public static uSS EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialhOMIpD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static uSS EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.QUSxYX;
        C52834waB c52834waB = (C52834waB) ViewBindings.findChildViewById(view, i);
        if (c52834waB != null) {
            i = C48033uCm.Application.FullyDrawnReporterKtreportWhenComplete1;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = C48033uCm.Application.enforcement;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new uSS((android.widget.LinearLayout) view, c52834waB, c55230xfy, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
