package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iKG implements ViewBinding {
    public final C27224jrE AEQbTJ;
    public final C27224jrE KWHzl;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public iKG(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C27224jrE c27224jrE, @androidx.annotation.NonNull C27224jrE c27224jrE2) {
        this.OLrzqt = frameLayout;
        this.AEQbTJ = c27224jrE;
        this.KWHzl = c27224jrE2;
    }

    public static iKG AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static iKG AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.vLaW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static iKG OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.putBitmap;
        C27224jrE c27224jrE = (C27224jrE) ViewBindings.findChildViewById(view, i);
        if (c27224jrE != null) {
            i = C25493ixk.ActionBar.MediaMetadataCompatApi21Builder;
            C27224jrE c27224jrE2 = (C27224jrE) ViewBindings.findChildViewById(view, i);
            if (c27224jrE2 != null) {
                return new iKG((android.widget.FrameLayout) view, c27224jrE, c27224jrE2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
