package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57389yhW implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57389yhW(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.copydefault = view;
        this.EZpvd = appCompatTextView;
        this.OLrzqt = appCompatTextView2;
        this.AEQbTJ = appCompatTextView3;
    }

    public static C57389yhW OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.QOLQEE, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C57389yhW EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.htlTjW;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C57406yhn.StateListAnimator.fjfviF;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = C57406yhn.StateListAnimator.Ufzxmz;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    return new C57389yhW(view, appCompatTextView, appCompatTextView2, appCompatTextView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
