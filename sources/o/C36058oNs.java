package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36058oNs implements ViewBinding {
    public final Group AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final Group EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AYXKKw;
    }

    public C36058oNs(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.AYXKKw = nestedScrollView;
        this.copydefault = constraintLayout;
        this.OLrzqt = textView;
        this.EZpvd = group;
        this.KWHzl = textView2;
        this.AEQbTJ = group2;
        this.valueOf = textView3;
        this.gEmmrt = textView4;
        this.AhwBna = textView5;
        this.djBIcL = textView6;
        this.AkhnZx = textView7;
        this.values = textView8;
    }

    public static C36058oNs copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DCUTEIddSDPG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C36058oNs copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.dSJNDS;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C35964oKf.StateListAnimator.HJWChPRGtXKCDKRTZD;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35964oKf.StateListAnimator.HJWChPURsaBn;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = C35964oKf.StateListAnimator.iqeXgQ;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C35964oKf.StateListAnimator.dxTXDv;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C35964oKf.StateListAnimator.onTransact;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C35964oKf.StateListAnimator.ICustomTabsCallbackStubProxy;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C35964oKf.StateListAnimator.forceCloseConnection;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase6;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = C35964oKf.StateListAnimator.onPlay;
                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = C35964oKf.StateListAnimator.onFastForward;
                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    return new C36058oNs((NestedScrollView) view, constraintLayout, textView, group, textView2, group2, textView3, textView4, textView5, textView6, textView7, textView8);
                                                }
                                            }
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
