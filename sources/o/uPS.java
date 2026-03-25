package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes19.dex */
public final class uPS implements ViewBinding {
    public final ComposeView KWHzl;
    public final ComposeView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ComposeView getRoot() {
        return this.OLrzqt;
    }

    public uPS(@androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull ComposeView composeView2) {
        this.OLrzqt = composeView;
        this.KWHzl = composeView2;
    }

    public static uPS copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new uPS(composeView, composeView);
    }
}
