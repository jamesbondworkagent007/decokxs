package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uQN implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final wYK AYXKKw;
    public final Guideline AhwBna;
    public final ConstraintLayout AkhnZx;
    public final OKReminder AuCTel;
    public final ConstraintLayout DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final android.widget.TextView KWHzl;
    public final C47988uAv OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final NestedScrollView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final Guideline gEmmrt;
    public final android.widget.TextView isConnected;
    public final Guideline valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.DbNXlk;
    }

    public uQN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C47988uAv c47988uAv, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull Guideline guideline3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull OKReminder oKReminder) {
        this.DbNXlk = constraintLayout;
        this.OLrzqt = c47988uAv;
        this.KWHzl = textView;
        this.AEQbTJ = imageView;
        this.EZpvd = linearLayoutCompat;
        this.copydefault = textView2;
        this.gEmmrt = guideline;
        this.valueOf = guideline2;
        this.AhwBna = guideline3;
        this.djBIcL = textView3;
        this.AYXKKw = wyk;
        this.AkhnZx = constraintLayout2;
        this.fetchVPNInfo = textView4;
        this.values = constraintLayout3;
        this.isConnected = textView5;
        this.fJNWhG = nestedScrollView;
        this.AuCTel = oKReminder;
    }

    public static uQN AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.sTzBva, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static uQN copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.AhwBna;
        C47988uAv c47988uAv = (C47988uAv) ViewBindings.findChildViewById(view, i);
        if (c47988uAv != null) {
            i = C48033uCm.Application.DsrFlB;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.RZNAhV;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C48033uCm.Application.getValue;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C48033uCm.Application.OmYuqg;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C48033uCm.Application.UPbYzn;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = C48033uCm.Application.OTJFaA;
                                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline2 != null) {
                                    i = C48033uCm.Application.OsDdEf;
                                    Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline3 != null) {
                                        i = C48033uCm.Application.removeQueueItem;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C48033uCm.Application.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A;
                                            wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                                            if (wyk != null) {
                                                i = C48033uCm.Application.access001;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = C48033uCm.Application.addOnNewIntentListener;
                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = C48033uCm.Application.onCreatePanelMenu;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout2 != null) {
                                                            i = C48033uCm.Application.onMultiWindowModeChanged;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = C48033uCm.Application.FullyDrawnReporterExternalSyntheticLambda0;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                if (nestedScrollView != null) {
                                                                    i = C48033uCm.Application.ActionBarTab;
                                                                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                                                    if (oKReminder != null) {
                                                                        return new uQN((ConstraintLayout) view, c47988uAv, textView, imageView, linearLayoutCompat, textView2, guideline, guideline2, guideline3, textView3, wyk, constraintLayout, textView4, constraintLayout2, textView5, nestedScrollView, oKReminder);
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
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
