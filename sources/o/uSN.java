package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uSN implements ViewBinding {
    public final C53539wnR AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final OKReminder AhwBna;
    public final C55113xdn EZpvd;
    public final wYE KWHzl;
    public final ComposeView OLrzqt;
    public final C55173xeu copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final uBL gEmmrt;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.djBIcL;
    }

    public uSN(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C53539wnR c53539wnR, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull wYE wye, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull uBL ubl) {
        this.djBIcL = frameLayout;
        this.AEQbTJ = c53539wnR;
        this.OLrzqt = composeView;
        this.KWHzl = wye;
        this.copydefault = c55173xeu;
        this.EZpvd = c55113xdn;
        this.valueOf = frameLayout2;
        this.AhwBna = oKReminder;
        this.AYXKKw = textView;
        this.gEmmrt = ubl;
    }

    public static uSN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialdPnHjp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uSN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.DNMMPQ;
        C53539wnR c53539wnR = (C53539wnR) ViewBindings.findChildViewById(view, i);
        if (c53539wnR != null) {
            i = C48033uCm.Application.GQzpsZ;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C48033uCm.Application.HJWChPQdUnVm;
                wYE wye = (wYE) ViewBindings.findChildViewById(view, i);
                if (wye != null) {
                    i = C48033uCm.Application.adwzgZ;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C48033uCm.Application.containsKey;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C48033uCm.Application.getString;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = C48033uCm.Application.getViewModelStore;
                                OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                if (oKReminder != null) {
                                    i = C48033uCm.Application.ReturnThis;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C48033uCm.Application.setDisplayUseLogoEnabled;
                                        uBL ubl = (uBL) ViewBindings.findChildViewById(view, i);
                                        if (ubl != null) {
                                            return new uSN((android.widget.FrameLayout) view, c53539wnR, composeView, wye, c55173xeu, c55113xdn, frameLayout, oKReminder, textView, ubl);
                                        }
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
