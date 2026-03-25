package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGC implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C55113xdn KWHzl;
    public final android.widget.RelativeLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public hGC(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.AEQbTJ = view;
        this.copydefault = relativeLayout;
        this.KWHzl = c55113xdn;
    }

    public static hGC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.apHBvG, viewGroup);
        return EZpvd(viewGroup);
    }

    public static hGC EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getStateWithUpdatedPosition;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C23274hvD.Application.getMediaSession;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                return new hGC(view, relativeLayout, c55113xdn);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
