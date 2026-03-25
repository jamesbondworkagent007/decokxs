package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8250azG implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final LottieAnimationView EZpvd;
    public final OKReminder KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C8250azG(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.copydefault = view;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = oKReminder;
        this.EZpvd = lottieAnimationView;
        this.AEQbTJ = appCompatTextView2;
    }

    public static C8250azG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C8206ayP.Application.DTwDnp, viewGroup);
        return copydefault(viewGroup);
    }

    public static C8250azG copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.flVtFt;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C8206ayP.StateListAnimator.RlQdEF;
            OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
            if (oKReminder != null) {
                i = C8206ayP.StateListAnimator.aUsmxb;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = C8206ayP.StateListAnimator.isReflectionWorking;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        return new C8250azG(view, appCompatTextView, oKReminder, lottieAnimationView, appCompatTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
