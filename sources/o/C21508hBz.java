package o;

import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21508hBz implements ViewBinding {
    public final CardView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final FlexboxLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final FlexboxLayout OLrzqt;
    public final FragmentContainerView copydefault;
    public final NestedScrollView djBIcL;
    public final FlexboxLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.djBIcL;
    }

    public C21508hBz(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull FlexboxLayout flexboxLayout2, @androidx.annotation.NonNull FlexboxLayout flexboxLayout3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.djBIcL = nestedScrollView;
        this.AEQbTJ = cardView;
        this.copydefault = fragmentContainerView;
        this.KWHzl = frameLayout;
        this.OLrzqt = flexboxLayout;
        this.EZpvd = flexboxLayout2;
        this.gEmmrt = flexboxLayout3;
        this.valueOf = textView;
        this.AYXKKw = textView2;
        this.AhwBna = textView3;
        this.isConnected = textView4;
        this.values = textView5;
        this.DbNXlk = textView6;
    }

    public static C21508hBz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DQzvGNdrmXxu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21508hBz KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QfJbVf;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = C23274hvD.Application.hfeTOA;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C23274hvD.Application.hPlhRW;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C23274hvD.Application.QzqeNH;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                    if (flexboxLayout != null) {
                        i = C23274hvD.Application.hpmliR;
                        FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                        if (flexboxLayout2 != null) {
                            i = C23274hvD.Application.aWuQzD;
                            FlexboxLayout flexboxLayout3 = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                            if (flexboxLayout3 != null) {
                                i = C23274hvD.Application.Keep;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C23274hvD.Application.getThemeUpIndicator;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.isDrawerIndicatorEnabled;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C23274hvD.Application.getInstance;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C23274hvD.Application.onStateChange;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = C23274hvD.Application.enableHomeButtonByDefault;
                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        return new C21508hBz((NestedScrollView) view, cardView, fragmentContainerView, frameLayout, flexboxLayout, flexboxLayout2, flexboxLayout3, textView, textView2, textView3, textView4, textView5, textView6);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
