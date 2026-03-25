package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21596hFf implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C29580kwN AYXKKw;
    public final ComposeView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final FlexboxLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final ConstraintLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C21596hFf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C29580kwN c29580kwN, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.valueOf = constraintLayout;
        this.copydefault = imageView;
        this.AEQbTJ = imageView2;
        this.KWHzl = imageView3;
        this.EZpvd = flexboxLayout;
        this.OLrzqt = linearLayout;
        this.AhwBna = composeView;
        this.gEmmrt = constraintLayout2;
        this.AYXKKw = c29580kwN;
        this.djBIcL = textView;
        this.AkhnZx = textView2;
        this.fetchVPNInfo = textView3;
        this.isConnected = textView4;
        this.values = textView5;
        this.DbNXlk = textView6;
        this.fIwbmz = textView7;
        this.fARcdN = textView8;
    }

    public static C21596hFf AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.inahnb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21596hFf EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OfWYUE;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.ITrustedWebActivityCallbackStubProxy;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C23274hvD.Application.onResult;
                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = C23274hvD.Application.getQueueTitle;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                    if (flexboxLayout != null) {
                        i = C23274hvD.Application.MediaControllerCompatPlaybackInfo;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.registerMediaButtonEventReceiver;
                            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = C23274hvD.Application.ActivityResultContractsPickVisualMedia;
                                C29580kwN c29580kwN = (C29580kwN) ViewBindings.findChildViewById(view, i);
                                if (c29580kwN != null) {
                                    i = C23274hvD.Application.hasWindowFeature;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C23274hvD.Application.getLocalNightMode;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C23274hvD.Application.installViewFactory;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C23274hvD.Application.AppCompatDialog;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = C23274hvD.Application.ToolbarActionBar1;
                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = C23274hvD.Application.createFromXmlInner;
                                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView6 != null) {
                                                            i = C23274hvD.Application.unscheduleDrawable;
                                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView7 != null) {
                                                                i = C23274hvD.Application.indexOfTransition;
                                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView8 != null) {
                                                                    return new C21596hFf(constraintLayout, imageView, imageView2, imageView3, flexboxLayout, linearLayout, composeView, constraintLayout, c29580kwN, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
