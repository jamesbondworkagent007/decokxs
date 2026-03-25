package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42832rdp implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C55159xeg KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42832rdp(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55159xeg c55159xeg) {
        this.AEQbTJ = view;
        this.KWHzl = c55159xeg;
    }

    public static C42832rdp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.invokespecialaGOrKO, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C42832rdp EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sYcwUD;
        C55159xeg c55159xeg = (C55159xeg) ViewBindings.findChildViewById(view, i);
        if (c55159xeg != null) {
            return new C42832rdp(view, c55159xeg);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
