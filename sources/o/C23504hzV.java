package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.hzV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23504hzV implements ViewBinding {
    public final C19923gUi AEQbTJ;
    public final C19923gUi OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C19923gUi getRoot() {
        return this.AEQbTJ;
    }

    public C23504hzV(@androidx.annotation.NonNull C19923gUi c19923gUi, @androidx.annotation.NonNull C19923gUi c19923gUi2) {
        this.AEQbTJ = c19923gUi;
        this.OLrzqt = c19923gUi2;
    }

    public static C23504hzV EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C19923gUi c19923gUi = (C19923gUi) view;
        return new C23504hzV(c19923gUi, c19923gUi);
    }
}
