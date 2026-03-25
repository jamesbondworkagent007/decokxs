package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17105ewX implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final Flow KWHzl;
    public final AppCompatTextView OLrzqt;
    public final C21260gwR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C17105ewX(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C21260gwR c21260gwR, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = view;
        this.copydefault = c21260gwR;
        this.EZpvd = constraintLayout;
        this.KWHzl = flow;
        this.OLrzqt = appCompatTextView;
    }

    public static C17105ewX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C13754dXa.TaskDescription.gvFztT, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C17105ewX OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.sendBehavioSecData;
        C21260gwR c21260gwR = (C21260gwR) ViewBindings.findChildViewById(view, i);
        if (c21260gwR != null) {
            i = C13754dXa.ActionBar.DlmWDR;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C13754dXa.ActionBar.HJWChPQPAeHI;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                if (flow != null) {
                    i = C13754dXa.ActionBar.enforcement;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new C17105ewX(view, c21260gwR, constraintLayout, flow, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
