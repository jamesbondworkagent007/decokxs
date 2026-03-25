package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.nPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34036nPa implements ViewBinding {
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.KWHzl;
    }

    public C34036nPa(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = textView;
        this.OLrzqt = textView2;
    }

    public static C34036nPa AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new C34036nPa(textView, textView);
    }
}
