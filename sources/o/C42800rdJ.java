package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rdJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42800rdJ implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.AEQbTJ;
    }

    public C42800rdJ(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
    }

    public static C42800rdJ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.aCSzUz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42800rdJ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new C42800rdJ(textView, textView);
    }
}
