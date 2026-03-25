package o;

import androidx.viewbinding.ViewBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46253tNm implements ViewBinding {
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.OLrzqt;
    }

    public C46253tNm(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = textView;
        this.KWHzl = textView2;
    }

    public static C46253tNm copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.UeEOUB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C46253tNm KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new C46253tNm(textView, textView);
    }
}
