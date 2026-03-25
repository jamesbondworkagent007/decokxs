package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C43662rtX;

/* JADX INFO: renamed from: o.ryS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43922ryS implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final OKEditText copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C43922ryS(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = linearLayout;
        this.OLrzqt = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.copydefault = oKEditText;
        this.AEQbTJ = textView;
    }

    public static C43922ryS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.QCjLjM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C43922ryS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.gGvvIC;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C43662rtX.ActionBar.hUfVAv;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C43662rtX.ActionBar.OTwTPd;
                OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                if (oKEditText != null) {
                    i = C43662rtX.ActionBar.DcMfJKOmnske;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C43922ryS((android.widget.LinearLayout) view, c52794wYp, c52794wYp2, oKEditText, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
