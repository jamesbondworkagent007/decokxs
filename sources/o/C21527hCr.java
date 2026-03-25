package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21527hCr implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.ImageView EZpvd;
    public final C28067kNr KWHzl;
    public final wYC OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C21527hCr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C28067kNr c28067kNr, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.AhwBna = constraintLayout;
        this.KWHzl = c28067kNr;
        this.OLrzqt = wyc;
        this.EZpvd = imageView;
        this.copydefault = linearLayout;
        this.AEQbTJ = linearLayout2;
        this.AYXKKw = appCompatTextView;
        this.valueOf = textView;
        this.djBIcL = textView2;
        this.gEmmrt = textView3;
        this.values = textView4;
        this.fetchVPNInfo = textView5;
    }

    public static C21527hCr AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aKhcqp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21527hCr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.RLmrWm;
        C28067kNr c28067kNr = (C28067kNr) ViewBindings.findChildViewById(view, i);
        if (c28067kNr != null) {
            i = C23274hvD.Application.QhsCdEQhsCdE;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C23274hvD.Application.INotificationSideChannel;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.RatingCompatStyle;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.MediaControllerCompatApi21PlaybackInfo;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C23274hvD.Application.InspectablePropertyValueType;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C23274hvD.Application.PluralsRes;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C23274hvD.Application.generateConfigDelta_colorMode;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.WindowDecorActionBarActionModeImpl;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C23274hvD.Application.getChild;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C23274hvD.Application.getChildCount;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    return new C21527hCr((ConstraintLayout) view, c28067kNr, wyc, imageView, linearLayout, linearLayout2, appCompatTextView, textView, textView2, textView3, textView4, textView5);
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
