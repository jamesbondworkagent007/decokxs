package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23529hzu implements ViewBinding {
    public final C55258xgZ EZpvd;
    public final C19931gUq KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C23529hzu(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C19931gUq c19931gUq) {
        this.copydefault = view;
        this.OLrzqt = textView;
        this.EZpvd = c55258xgZ;
        this.KWHzl = c19931gUq;
    }

    public static C23529hzu copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.UlJrfe, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C23529hzu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DWgRXt;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.registerKeyboardTarget;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = C23274hvD.Application.isAvailable;
                C19931gUq c19931gUq = (C19931gUq) ViewBindings.findChildViewById(view, i);
                if (c19931gUq != null) {
                    return new C23529hzu(view, textView, c55258xgZ, c19931gUq);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
