package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23528hzt implements ViewBinding {
    public final C55008xbo EZpvd;
    public final android.view.View OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C23528hzt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull AppCompatImageView appCompatImageView) {
        this.OLrzqt = view;
        this.EZpvd = c55008xbo;
        this.copydefault = appCompatImageView;
    }

    public static C23528hzt KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.QwvEab, viewGroup);
        return copydefault(viewGroup);
    }

    public static C23528hzt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getSerial;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.sendCustomAction;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                return new C23528hzt(view, c55008xbo, appCompatImageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
