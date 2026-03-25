package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.uWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48566uWd implements ViewBinding {
    public final C51728vsW KWHzl;
    public final C51728vsW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51728vsW getRoot() {
        return this.copydefault;
    }

    public C48566uWd(@androidx.annotation.NonNull C51728vsW c51728vsW, @androidx.annotation.NonNull C51728vsW c51728vsW2) {
        this.copydefault = c51728vsW;
        this.KWHzl = c51728vsW2;
    }

    public static C48566uWd copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C51728vsW c51728vsW = (C51728vsW) view;
        return new C48566uWd(c51728vsW, c51728vsW);
    }
}
