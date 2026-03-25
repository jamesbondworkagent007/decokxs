package o;

import androidx.viewbinding.ViewBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16411ejS implements ViewBinding {
    public final android.widget.TextView AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.AEQbTJ;
    }

    public C16411ejS(@androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = textView;
    }

    public static C16411ejS copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.zblBkD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16411ejS copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C16411ejS((android.widget.TextView) view);
    }
}
