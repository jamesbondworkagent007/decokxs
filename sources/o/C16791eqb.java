package o;

import androidx.viewbinding.ViewBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16791eqb implements ViewBinding {
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.ImageView getRoot() {
        return this.copydefault;
    }

    public C16791eqb(@androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.copydefault = imageView;
    }

    public static C16791eqb EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.QWpYiD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16791eqb AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C16791eqb((android.widget.ImageView) view);
    }
}
