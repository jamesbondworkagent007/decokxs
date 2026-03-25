package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17036evH implements ViewBinding {
    public final wYS AEQbTJ;
    public final wYS EZpvd;
    public final ConstraintLayout KWHzl;
    public final wYS OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C17036evH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYS wys, @androidx.annotation.NonNull wYS wys2, @androidx.annotation.NonNull wYS wys3) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = wys;
        this.OLrzqt = wys2;
        this.EZpvd = wys3;
    }

    public static C17036evH OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DtnWsU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C17036evH AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.onSetRating;
        wYS wys = (wYS) ViewBindings.findChildViewById(view, i);
        if (wys != null) {
            i = C13754dXa.ActionBar.onSetShuffleMode;
            wYS wys2 = (wYS) ViewBindings.findChildViewById(view, i);
            if (wys2 != null) {
                i = C13754dXa.ActionBar.onSetRepeatMode;
                wYS wys3 = (wYS) ViewBindings.findChildViewById(view, i);
                if (wys3 != null) {
                    return new C17036evH((ConstraintLayout) view, wys, wys2, wys3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
