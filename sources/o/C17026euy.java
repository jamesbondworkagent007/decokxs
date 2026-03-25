package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17026euy implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55113xdn AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C55173xeu OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final C10319bmH gEmmrt;
    public final android.widget.TextView isConnected;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.valueOf;
    }

    public C17026euy(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C10319bmH c10319bmH, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.valueOf = linearLayoutCompat;
        this.KWHzl = linearLayoutCompat2;
        this.copydefault = frameLayout;
        this.AEQbTJ = frameLayout2;
        this.OLrzqt = c55173xeu;
        this.EZpvd = linearLayoutCompat3;
        this.AhwBna = imageView;
        this.AYXKKw = c55113xdn;
        this.gEmmrt = c10319bmH;
        this.djBIcL = textView;
        this.isConnected = textView2;
    }

    public static C17026euy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.iRgjgR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17026euy copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.fiXcQa;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C13754dXa.ActionBar.pXZxY;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C13754dXa.ActionBar.zzJhsT;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = C13754dXa.ActionBar.RihMUf;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C13754dXa.ActionBar.unregister;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat2 != null) {
                            i = C13754dXa.ActionBar.hTAtCx;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C13754dXa.ActionBar.INotificationSideChannelStubProxy;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C13754dXa.ActionBar.getMediaItem;
                                    C10319bmH c10319bmH = (C10319bmH) ViewBindings.findChildViewById(view, i);
                                    if (c10319bmH != null) {
                                        i = C13754dXa.ActionBar.dispose;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C13754dXa.ActionBar.bindRcKey;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                return new C17026euy((LinearLayoutCompat) view, linearLayoutCompat, frameLayout, frameLayout2, c55173xeu, linearLayoutCompat2, imageView, c55113xdn, c10319bmH, textView, textView2);
                                            }
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
