package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.res, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42888res implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.EZpvd;
    }

    public C42888res(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = textView;
        this.OLrzqt = textView2;
    }

    public static C42888res KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.sendBehavioSecData, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42888res copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new C42888res(textView, textView);
    }
}
