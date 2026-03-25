package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23506hzX implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C55008xbo EZpvd;
    public final AppCompatImageView KWHzl;
    public final C55249xgQ OLrzqt;
    public final AppCompatImageView copydefault;
    public final C55258xgZ djBIcL;
    public final LinearLayoutCompat gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.gEmmrt;
    }

    public C23506hzX(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.gEmmrt = linearLayoutCompat;
        this.EZpvd = c55008xbo;
        this.KWHzl = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.OLrzqt = c55249xgQ;
        this.AEQbTJ = linearLayout;
        this.AYXKKw = textView;
        this.AhwBna = textView2;
        this.djBIcL = c55258xgZ;
    }

    public static C23506hzX KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.itxZVF;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.notifyNotificationWithChannel;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBase3;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C23274hvD.Application.sendRepeatMode;
                    C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                    if (c55249xgQ != null) {
                        i = C23274hvD.Application.setExtraBinder;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.Size;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.ReturnThis;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C23274hvD.Application.clearMutated;
                                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                    if (c55258xgZ != null) {
                                        return new C23506hzX((LinearLayoutCompat) view, c55008xbo, appCompatImageView, appCompatImageView2, c55249xgQ, linearLayout, textView, textView2, c55258xgZ);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
