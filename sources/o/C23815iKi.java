package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23815iKi implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C27131jpR OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C23815iKi(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27131jpR c27131jpR) {
        this.AEQbTJ = view;
        this.OLrzqt = c27131jpR;
    }

    public static C23815iKi AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.dvImUD, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C23815iKi KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.dLBcXg;
        C27131jpR c27131jpR = (C27131jpR) ViewBindings.findChildViewById(view, i);
        if (c27131jpR != null) {
            return new C23815iKi(view, c27131jpR);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
