package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.list.OKAnchorSelection;

/* JADX INFO: renamed from: o.elS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16517elS implements ViewBinding {
    public final OKAnchorSelection EZpvd;
    public final OKAnchorSelection KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public OKAnchorSelection getRoot() {
        return this.EZpvd;
    }

    public C16517elS(@androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection2) {
        this.EZpvd = oKAnchorSelection;
        this.KWHzl = oKAnchorSelection2;
    }

    public static C16517elS OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) view;
        return new C16517elS(oKAnchorSelection, oKAnchorSelection);
    }
}
