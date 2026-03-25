package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.core.widget.SortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.rfL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42908rfL implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final SortTextView EZpvd;
    public final SortTextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42908rfL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull SortTextView sortTextView, @androidx.annotation.NonNull SortTextView sortTextView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = sortTextView;
        this.EZpvd = sortTextView2;
        this.OLrzqt = textView;
        this.copydefault = textView2;
    }

    public static C42908rfL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.hbZCHz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42908rfL EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.OxVOHk;
        SortTextView sortTextView = (SortTextView) ViewBindings.findChildViewById(view, i);
        if (sortTextView != null) {
            i = qZH.StateListAnimator.DzCpqu;
            SortTextView sortTextView2 = (SortTextView) ViewBindings.findChildViewById(view, i);
            if (sortTextView2 != null) {
                i = qZH.StateListAnimator.dtVxwd;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C42908rfL((ConstraintLayout) view, sortTextView, sortTextView2, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
