package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42866reW implements ViewBinding {
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final qII OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C42866reW(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull qII qii, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = view;
        this.OLrzqt = qii;
        this.KWHzl = textView;
    }

    public static C42866reW AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DCUTEI;
        qII qii = (qII) ViewBindings.findChildViewById(view, i);
        if (qii != null) {
            i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C42866reW(view, qii, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
