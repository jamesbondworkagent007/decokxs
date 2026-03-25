package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAY implements ViewBinding {
    public final android.widget.HorizontalScrollView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C28985klB AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final C28985klB EZpvd;
    public final C29032klw KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.FrameLayout gEmmrt;
    public final CardView isConnected;
    public final android.widget.HorizontalScrollView valueOf;
    public final LinearLayoutCompat values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.values;
    }

    public hAY(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C28985klB c28985klB, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull C29032klw c29032klw, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView2, @androidx.annotation.NonNull C28985klB c28985klB2, @androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.values = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.EZpvd = c28985klB;
        this.copydefault = frameLayout;
        this.AEQbTJ = horizontalScrollView;
        this.KWHzl = c29032klw;
        this.AYXKKw = imageView;
        this.AhwBna = linearLayoutCompat3;
        this.djBIcL = linearLayoutCompat4;
        this.gEmmrt = frameLayout2;
        this.valueOf = horizontalScrollView2;
        this.AkhnZx = c28985klB2;
        this.isConnected = cardView;
        this.DbNXlk = textView;
        this.fetchVPNInfo = textView2;
    }

    public static hAY copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.YqksP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hAY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.setLocationManually;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.DzOuPm;
            C28985klB c28985klB = (C28985klB) ViewBindings.findChildViewById(view, i);
            if (c28985klB != null) {
                i = C23274hvD.Application.DtnWsU;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C23274hvD.Application.fdazkH;
                    android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                    if (horizontalScrollView != null) {
                        i = C23274hvD.Application.ruDxL;
                        C29032klw c29032klw = (C29032klw) ViewBindings.findChildViewById(view, i);
                        if (c29032klw != null) {
                            i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplApi213;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C23274hvD.Application.setShuffleMode;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C23274hvD.Application.IMediaSessionStub;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat3 != null) {
                                        i = C23274hvD.Application.MediaSessionCompatCallbackCallbackHandler;
                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout2 != null) {
                                            i = C23274hvD.Application.MediaSessionCompatCallbackStubApi23;
                                            android.widget.HorizontalScrollView horizontalScrollView2 = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                            if (horizontalScrollView2 != null) {
                                                i = C23274hvD.Application.updateBackInvokedCallbackStateactivity_release;
                                                C28985klB c28985klB2 = (C28985klB) ViewBindings.findChildViewById(view, i);
                                                if (c28985klB2 != null) {
                                                    i = C23274hvD.Application.Rid;
                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                    if (cardView != null) {
                                                        i = C23274hvD.Application.getMenu;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C23274hvD.Application.ToolbarActionBar;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                return new hAY((LinearLayoutCompat) view, linearLayoutCompat, c28985klB, frameLayout, horizontalScrollView, c29032klw, imageView, linearLayoutCompat2, linearLayoutCompat3, frameLayout2, horizontalScrollView2, c28985klB2, cardView, textView, textView2);
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
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
