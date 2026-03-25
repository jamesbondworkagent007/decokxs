package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16893esX implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C16893esX(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.OLrzqt = constraintLayout;
        this.copydefault = textView;
        this.AEQbTJ = textView2;
        this.KWHzl = textView3;
        this.EZpvd = textView4;
        this.valueOf = textView5;
        this.AYXKKw = textView6;
    }

    public static C16893esX EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fAklCm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16893esX copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.ReportDrawnKtReportDrawnAfter2;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C13754dXa.ActionBar.ReportDrawnKtReportDrawnWhen1;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C13754dXa.ActionBar.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C13754dXa.ActionBar.ReportDrawnKtReportDrawnWhen2;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = C13754dXa.ActionBar.ActivityResultContractsCaptureVideo;
                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = C13754dXa.ActionBar.CheckResult;
                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                return new C16893esX((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
