package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16991euP implements ViewBinding {
    public final android.widget.EditText AEQbTJ;
    public final C52794wYp EZpvd;
    public final MaterialCardView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C16991euP(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull MaterialCardView materialCardView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.EditText editText) {
        this.valueOf = linearLayout;
        this.KWHzl = materialCardView;
        this.EZpvd = c52794wYp;
        this.copydefault = textView;
        this.OLrzqt = textView2;
        this.AEQbTJ = editText;
    }

    public static C16991euP OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.UCQKYV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16991euP KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.QfsBiF;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
        if (materialCardView != null) {
            i = C13754dXa.ActionBar.RXzakW;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.invokespecialhOMIpD;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C13754dXa.ActionBar.QMuEJi;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C13754dXa.ActionBar.fhUrPt;
                        android.widget.EditText editText = (android.widget.EditText) ViewBindings.findChildViewById(view, i);
                        if (editText != null) {
                            return new C16991euP((android.widget.LinearLayout) view, materialCardView, c52794wYp, textView, textView2, editText);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
