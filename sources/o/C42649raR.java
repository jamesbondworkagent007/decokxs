package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.qZH;

/* JADX INFO: renamed from: o.raR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42649raR implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final OKEditText OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C42649raR(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = linearLayout;
        this.copydefault = c52794wYp;
        this.OLrzqt = oKEditText;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
    }

    public static C42649raR EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fdOvFl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42649raR AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DCJXGO;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.iKEqwx;
            OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
            if (oKEditText != null) {
                i = qZH.StateListAnimator.DDNONI;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C42649raR((android.widget.LinearLayout) view, c52794wYp, oKEditText, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
