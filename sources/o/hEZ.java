package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEZ implements ViewBinding {
    public final C54989xbV AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C54989xbV OLrzqt;
    public final C54989xbV copydefault;
    public final android.widget.LinearLayout gEmmrt;
    public final C54989xbV valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.gEmmrt;
    }

    public hEZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull C54989xbV c54989xbV3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C54989xbV c54989xbV4) {
        this.gEmmrt = linearLayout;
        this.AEQbTJ = c54989xbV;
        this.OLrzqt = c54989xbV2;
        this.copydefault = c54989xbV3;
        this.KWHzl = imageView;
        this.EZpvd = linearLayout2;
        this.valueOf = c54989xbV4;
    }

    public static hEZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gAnGwV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hEZ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.HJWChPiaHEvk;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C23274hvD.Application.DpxfQh;
            C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
            if (c54989xbV2 != null) {
                i = C23274hvD.Application.onProviderDisabled;
                C54989xbV c54989xbV3 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                if (c54989xbV3 != null) {
                    i = C23274hvD.Application.RIsQag;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                        i = C23274hvD.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1;
                        C54989xbV c54989xbV4 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                        if (c54989xbV4 != null) {
                            return new hEZ(linearLayout, c54989xbV, c54989xbV2, c54989xbV3, imageView, linearLayout, c54989xbV4);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
