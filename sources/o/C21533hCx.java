package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21533hCx implements ViewBinding {
    public final C55008xbo AEQbTJ;
    public final android.view.View EZpvd;
    public final C55008xbo KWHzl;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C21533hCx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.EZpvd = view;
        this.AEQbTJ = c55008xbo;
        this.KWHzl = c55008xbo2;
        this.copydefault = imageView;
    }

    public static C21533hCx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.processStrongAuthMessage, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21533hCx copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gCNefq;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.HJWChPURsaBn;
            C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
            if (c55008xbo2 != null) {
                i = C23274hvD.Application.sendCustomAction;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new C21533hCx(view, c55008xbo, c55008xbo2, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
