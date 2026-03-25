package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.swap.history.detail.widget.childorder.two.TwoCrossOrderChildInfoPackUpView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFL implements ViewBinding {
    public final TwoCrossOrderChildInfoPackUpView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final android.view.View KWHzl;
    public final C22073hWx OLrzqt;
    public final C24328ibk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public hFL(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C22073hWx c22073hWx, @androidx.annotation.NonNull C24328ibk c24328ibk, @androidx.annotation.NonNull TwoCrossOrderChildInfoPackUpView twoCrossOrderChildInfoPackUpView) {
        this.KWHzl = view;
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = c22073hWx;
        this.copydefault = c24328ibk;
        this.AEQbTJ = twoCrossOrderChildInfoPackUpView;
    }

    public static hFL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.hcetpZ, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hFL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fTEjYi;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.putInt;
            C22073hWx c22073hWx = (C22073hWx) ViewBindings.findChildViewById(view, i);
            if (c22073hWx != null) {
                i = C23274hvD.Application.zbGDDc;
                C24328ibk c24328ibk = (C24328ibk) ViewBindings.findChildViewById(view, i);
                if (c24328ibk != null) {
                    i = C23274hvD.Application.dGrqPl;
                    TwoCrossOrderChildInfoPackUpView twoCrossOrderChildInfoPackUpView = (TwoCrossOrderChildInfoPackUpView) ViewBindings.findChildViewById(view, i);
                    if (twoCrossOrderChildInfoPackUpView != null) {
                        return new hFL(view, linearLayoutCompat, c22073hWx, c24328ibk, twoCrossOrderChildInfoPackUpView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
