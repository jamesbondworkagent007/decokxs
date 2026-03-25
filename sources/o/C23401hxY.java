package o;

import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23401hxY implements ViewBinding {
    public final Group AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final Group EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AYXKKw;
    }

    public C23401hxY(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.AYXKKw = nestedScrollView;
        this.KWHzl = textView;
        this.AEQbTJ = group;
        this.OLrzqt = textView2;
        this.EZpvd = group2;
        this.copydefault = textView3;
        this.gEmmrt = textView4;
        this.djBIcL = textView5;
        this.valueOf = textView6;
        this.AhwBna = textView7;
        this.AkhnZx = textView8;
    }

    public static C23401hxY OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dNCPSb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23401hxY KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fromMediaMetadata;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.containsKey;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C23274hvD.Application.keySet;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.getActiveQueueItemId;
                    Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                    if (group2 != null) {
                        i = C23274hvD.Application.getSavedStateRegistry;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C23274hvD.Application.getOnBackPressedDispatcher;
                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = C23274hvD.Application.AnimRes;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = C23274hvD.Application.CallSuper;
                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = C23274hvD.Application.initializeTheme;
                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            i = C23274hvD.Application.getAssets;
                                            android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView8 != null) {
                                                return new C23401hxY((NestedScrollView) view, textView, group, textView2, group2, textView3, textView4, textView5, textView6, textView7, textView8);
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
