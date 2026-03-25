package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNL implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final C55258xgZ AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C55052xcf OLrzqt;
    public final C55052xcf copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final SwitchCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AYXKKw;
    }

    public oNL(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull C55052xcf c55052xcf2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SwitchCompat switchCompat, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AYXKKw = linearLayoutCompat;
        this.copydefault = c55052xcf;
        this.OLrzqt = c55052xcf2;
        this.KWHzl = imageView;
        this.EZpvd = imageView2;
        this.AEQbTJ = linearLayoutCompat2;
        this.gEmmrt = linearLayout;
        this.valueOf = switchCompat;
        this.AhwBna = c55258xgZ;
        this.djBIcL = textView;
        this.fetchVPNInfo = textView2;
    }

    public static oNL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.RKcVTr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static oNL OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.DcMfJKDCKfqP;
        C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
        if (c55052xcf != null) {
            i = C35964oKf.StateListAnimator.DMb;
            C55052xcf c55052xcf2 = (C55052xcf) ViewBindings.findChildViewById(view, i);
            if (c55052xcf2 != null) {
                i = C35964oKf.StateListAnimator.zeUYeG;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35964oKf.StateListAnimator.GiPPlLgiPPlL;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                        i = C35964oKf.StateListAnimator.jFiva;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C35964oKf.StateListAnimator.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21;
                            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                            if (switchCompat != null) {
                                i = C35964oKf.StateListAnimator.IMediaControllerCallback;
                                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                if (c55258xgZ != null) {
                                    i = C35964oKf.StateListAnimator.onExtrasChanged;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C35964oKf.StateListAnimator.onQueueChanged;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new oNL(linearLayoutCompat, c55052xcf, c55052xcf2, imageView, imageView2, linearLayoutCompat, linearLayout, switchCompat, c55258xgZ, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
