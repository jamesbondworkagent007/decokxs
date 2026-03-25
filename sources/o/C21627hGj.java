package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21627hGj implements ViewBinding {
    public final OKEditText AEQbTJ;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C21627hGj(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = constraintLayout;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = oKEditText;
        this.OLrzqt = textView;
    }

    public static C21627hGj OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.HJWChPRAkuRW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21627hGj KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.TarCU;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.iWlNch;
            OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
            if (oKEditText != null) {
                i = C23274hvD.Application.onChildrenLoaded;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C21627hGj((ConstraintLayout) view, c52794wYp, oKEditText, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
