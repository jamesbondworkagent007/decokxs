package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21657hHm implements ViewBinding {
    public final android.widget.NumberPicker AEQbTJ;
    public final C54984xbQ AYXKKw;
    public final C54984xbQ AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.DatePicker KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.NumberPicker copydefault;
    public final C54984xbQ djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final C54984xbQ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C21657hHm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.DatePicker datePicker, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.NumberPicker numberPicker, @androidx.annotation.NonNull android.widget.NumberPicker numberPicker2, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C54984xbQ c54984xbQ2, @androidx.annotation.NonNull C54984xbQ c54984xbQ3, @androidx.annotation.NonNull C54984xbQ c54984xbQ4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = datePicker;
        this.EZpvd = linearLayout;
        this.copydefault = numberPicker;
        this.AEQbTJ = numberPicker2;
        this.AYXKKw = c54984xbQ;
        this.valueOf = c54984xbQ2;
        this.AhwBna = c54984xbQ3;
        this.djBIcL = c54984xbQ4;
        this.gEmmrt = appCompatTextView;
        this.isConnected = appCompatTextView2;
    }

    public static C21657hHm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QzqeNH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21657hHm AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hwXsuq;
        android.widget.DatePicker datePicker = (android.widget.DatePicker) ViewBindings.findChildViewById(view, i);
        if (datePicker != null) {
            i = C23274hvD.Application.fzHEvu;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.apNKau;
                android.widget.NumberPicker numberPicker = (android.widget.NumberPicker) ViewBindings.findChildViewById(view, i);
                if (numberPicker != null) {
                    i = C23274hvD.Application.onSkipToPrevious;
                    android.widget.NumberPicker numberPicker2 = (android.widget.NumberPicker) ViewBindings.findChildViewById(view, i);
                    if (numberPicker2 != null) {
                        i = C23274hvD.Application.setActionBarDescription;
                        C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                        if (c54984xbQ != null) {
                            i = C23274hvD.Application.onOptionsItemSelected;
                            C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                            if (c54984xbQ2 != null) {
                                i = C23274hvD.Application.configureTab;
                                C54984xbQ c54984xbQ3 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                if (c54984xbQ3 != null) {
                                    i = C23274hvD.Application.cleanupTabs;
                                    C54984xbQ c54984xbQ4 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                    if (c54984xbQ4 != null) {
                                        i = C23274hvD.Application.WindowDecorActionBarTabImpl;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            i = C23274hvD.Application.selectTransition;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView2 != null) {
                                                return new C21657hHm((ConstraintLayout) view, datePicker, linearLayout, numberPicker, numberPicker2, c54984xbQ, c54984xbQ2, c54984xbQ3, c54984xbQ4, appCompatTextView, appCompatTextView2);
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
