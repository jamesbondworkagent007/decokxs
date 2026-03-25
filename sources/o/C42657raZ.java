package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42657raZ implements ViewBinding {
    public final qAG AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final android.view.View EZpvd;
    public final C48917uei KWHzl;
    public final C55258xgZ OLrzqt;
    public final C55258xgZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C42657raZ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull qAG qag, @androidx.annotation.NonNull C48917uei c48917uei, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = view;
        this.AEQbTJ = qag;
        this.KWHzl = c48917uei;
        this.OLrzqt = c55258xgZ;
        this.copydefault = c55258xgZ2;
        this.AYXKKw = appCompatTextView;
    }

    public static C42657raZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.call, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42657raZ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RAQtXZ;
        qAG qag = (qAG) ViewBindings.findChildViewById(view, i);
        if (qag != null) {
            i = qZH.StateListAnimator.pauseLocationServices;
            C48917uei c48917uei = (C48917uei) ViewBindings.findChildViewById(view, i);
            if (c48917uei != null) {
                i = qZH.StateListAnimator.apNKau;
                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                if (c55258xgZ != null) {
                    i = qZH.StateListAnimator.SFHvfS;
                    C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ2 != null) {
                        i = qZH.StateListAnimator.QUeTTI;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new C42657raZ(view, qag, c48917uei, c55258xgZ, c55258xgZ2, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
