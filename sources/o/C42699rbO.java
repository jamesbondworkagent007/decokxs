package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42699rbO implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final Group OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42699rbO(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AEQbTJ = view;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = group;
        this.copydefault = textView;
        this.KWHzl = appCompatImageView2;
        this.AYXKKw = appCompatImageView3;
        this.valueOf = textView2;
        this.AhwBna = textView3;
    }

    public static C42699rbO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.sVXHln, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42699rbO OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.gdmIOq;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = qZH.StateListAnimator.aGOrKO;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = qZH.StateListAnimator.itxZVF;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.znKlvJ;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = qZH.StateListAnimator.keyboardTargetTextChanged;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView3 != null) {
                            i = qZH.StateListAnimator.OsDdEf;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = qZH.StateListAnimator.RAaltf;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new C42699rbO(view, appCompatImageView, group, textView, appCompatImageView2, appCompatImageView3, textView2, textView3);
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
