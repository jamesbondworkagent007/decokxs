package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48391uPt implements ViewBinding {
    public final Guideline AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final OKReminder AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.TextView EZpvd;
    public final Guideline KWHzl;
    public final Guideline OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.ImageView isConnected;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public C48391uPt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull Guideline guideline3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.AkhnZx = constraintLayout;
        this.copydefault = linearLayoutCompat;
        this.EZpvd = textView;
        this.AEQbTJ = guideline;
        this.KWHzl = guideline2;
        this.OLrzqt = guideline3;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.AhwBna = oKReminder;
        this.gEmmrt = constraintLayout2;
        this.djBIcL = textView4;
        this.isConnected = imageView;
    }

    public static C48391uPt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DWgRXt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C48391uPt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.getValue;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C48033uCm.Application.PUZqN;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.UPbYzn;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C48033uCm.Application.OTJFaA;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = C48033uCm.Application.OsDdEf;
                        Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline3 != null) {
                            i = C48033uCm.Application.onPostMessage;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C48033uCm.Application.addOnTrimMemoryListener;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C48033uCm.Application.getViewModelStore;
                                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                    if (oKReminder != null) {
                                        i = C48033uCm.Application.onPanelClosed;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = C48033uCm.Application.onMultiWindowModeChanged;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C48033uCm.Application.lambda;
                                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    return new C48391uPt((ConstraintLayout) view, linearLayoutCompat, textView, guideline, guideline2, guideline3, textView2, textView3, oKReminder, constraintLayout, textView4, imageView);
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
