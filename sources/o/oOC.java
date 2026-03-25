package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oOC implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C54984xbQ AYXKKw;
    public final C54984xbQ AhwBna;
    public final AppCompatTextView DbNXlk;
    public final android.widget.NumberPicker EZpvd;
    public final android.widget.DatePicker KWHzl;
    public final android.widget.NumberPicker OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final C54984xbQ gEmmrt;
    public final C54984xbQ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public oOC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.DatePicker datePicker, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.NumberPicker numberPicker, @androidx.annotation.NonNull android.widget.NumberPicker numberPicker2, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C54984xbQ c54984xbQ2, @androidx.annotation.NonNull C54984xbQ c54984xbQ3, @androidx.annotation.NonNull C54984xbQ c54984xbQ4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = datePicker;
        this.copydefault = linearLayout;
        this.OLrzqt = numberPicker;
        this.EZpvd = numberPicker2;
        this.gEmmrt = c54984xbQ;
        this.valueOf = c54984xbQ2;
        this.AhwBna = c54984xbQ3;
        this.AYXKKw = c54984xbQ4;
        this.djBIcL = appCompatTextView;
        this.DbNXlk = appCompatTextView2;
    }

    public static oOC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DGUQLIdZmdUa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static oOC copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.zpGcln;
        android.widget.DatePicker datePicker = (android.widget.DatePicker) ViewBindings.findChildViewById(view, i);
        if (datePicker != null) {
            i = C35964oKf.StateListAnimator.onComplete;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C35964oKf.StateListAnimator.abAflu;
                android.widget.NumberPicker numberPicker = (android.widget.NumberPicker) ViewBindings.findChildViewById(view, i);
                if (numberPicker != null) {
                    i = C35964oKf.StateListAnimator.doTurnConnection;
                    android.widget.NumberPicker numberPicker2 = (android.widget.NumberPicker) ViewBindings.findChildViewById(view, i);
                    if (numberPicker2 != null) {
                        i = C35964oKf.StateListAnimator.MediaMetadataCompatApi21Builder;
                        C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                        if (c54984xbQ != null) {
                            i = C35964oKf.StateListAnimator.MediaMetadataCompatRatingKey;
                            C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                            if (c54984xbQ2 != null) {
                                i = C35964oKf.StateListAnimator.binderDied;
                                C54984xbQ c54984xbQ3 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                if (c54984xbQ3 != null) {
                                    i = C35964oKf.StateListAnimator.postToHandler;
                                    C54984xbQ c54984xbQ4 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                    if (c54984xbQ4 != null) {
                                        i = C35964oKf.StateListAnimator.getCurrentVolume;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            i = C35964oKf.StateListAnimator.MediaControllerCompatTransportControls;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView2 != null) {
                                                return new oOC((ConstraintLayout) view, datePicker, linearLayout, numberPicker, numberPicker2, c54984xbQ, c54984xbQ2, c54984xbQ3, c54984xbQ4, appCompatTextView, appCompatTextView2);
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
