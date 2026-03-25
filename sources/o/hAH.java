package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAH implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C25330iug AhwBna;
    public final ViewOnClickListenerC25336ium EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final C25332iui djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public hAH(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ViewOnClickListenerC25336ium viewOnClickListenerC25336ium, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C25332iui c25332iui, @androidx.annotation.NonNull C25330iug c25330iug, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = view;
        this.OLrzqt = frameLayout;
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = viewOnClickListenerC25336ium;
        this.copydefault = constraintLayout;
        this.djBIcL = c25332iui;
        this.AhwBna = c25330iug;
        this.AYXKKw = textView;
        this.valueOf = textView2;
    }

    public static hAH OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.vLaW, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hAH KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.AxsJAYaxsJAY;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.OYuSWK;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.getPercentRating;
                ViewOnClickListenerC25336ium viewOnClickListenerC25336ium = (ViewOnClickListenerC25336ium) ViewBindings.findChildViewById(view, i);
                if (viewOnClickListenerC25336ium != null) {
                    i = C23274hvD.Application.getLifecycle;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C23274hvD.Application.trackPipAnimationHintView;
                        C25332iui c25332iui = (C25332iui) ViewBindings.findChildViewById(view, i);
                        if (c25332iui != null) {
                            i = C23274hvD.Application.r8lambda3HoOD4FOOs4BK4W3sogOQmeeOUI;
                            C25330iug c25330iug = (C25330iug) ViewBindings.findChildViewById(view, i);
                            if (c25330iug != null) {
                                i = C23274hvD.Application.AnimatedStateListDrawableCompat;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C23274hvD.Application.getColorStateList;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new hAH(view, frameLayout, appCompatImageView, viewOnClickListenerC25336ium, constraintLayout, c25332iui, c25330iug, textView, textView2);
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
