package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rfC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42899rfC implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.AEQbTJ;
    }

    public C42899rfC(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
    }

    public static C42899rfC EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.FQNKFG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42899rfC copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new C42899rfC(textView, textView);
    }
}
