package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEQ implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.ImageView ejfBZ;
    public final android.widget.ImageView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final ConstraintLayout fJNWhG;
    public final android.widget.FrameLayout fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final android.widget.TextView hDKMBd;
    public final C55320xhi isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public final android.widget.ImageView valueOf;
    public final ConstraintLayout values;
    public final android.widget.TextView zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public hEQ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.ImageView imageView5, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull android.widget.TextView textView10) {
        this.values = constraintLayout;
        this.OLrzqt = view;
        this.copydefault = c52794wYp;
        this.EZpvd = frameLayout;
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = textView;
        this.AhwBna = imageView;
        this.gEmmrt = linearLayoutCompat2;
        this.djBIcL = imageView2;
        this.valueOf = imageView3;
        this.AYXKKw = constraintLayout2;
        this.DbNXlk = textView2;
        this.AkhnZx = textView3;
        this.fetchVPNInfo = frameLayout2;
        this.isConnected = c55320xhi;
        this.fJNWhG = constraintLayout3;
        this.AuCTel = constraintLayout4;
        this.fARcdN = imageView4;
        this.ejfBZ = imageView5;
        this.fIwbmz = textView4;
        this.hDKMBd = textView5;
        this.getFieldNames = textView6;
        this.getNewProxyInstance = textView7;
        this.iwGUEr = textView8;
        this.uzCIH = textView9;
        this.zLjUOn = textView10;
    }

    public static hEQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QnnRaN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hEQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OJuSTm;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.zYHWMc;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C23274hvD.Application.dzkkkq;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C23274hvD.Application.hGuIrQ;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C23274hvD.Application.fAklCm;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.iRgjgR;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C23274hvD.Application.fRNHEq;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C23274hvD.Application.DhEJvI;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2;
                                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = C23274hvD.Application.MediaMetadataCompat;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout != null) {
                                                i = C23274hvD.Application.newStarRating;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C23274hvD.Application.onMediaButtonEvent;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C23274hvD.Application.PlaybackStateCompatErrorCode;
                                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout2 != null) {
                                                            i = C23274hvD.Application.PlaybackStateCompatCustomActionBuilder;
                                                            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                            if (c55320xhi != null) {
                                                                i = C23274hvD.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout2 != null) {
                                                                    i = C23274hvD.Application.create;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout3 != null) {
                                                                        i = C23274hvD.Application.setLauncher;
                                                                        android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView4 != null) {
                                                                            i = C23274hvD.Application.Discouraged;
                                                                            android.widget.ImageView imageView5 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView5 != null) {
                                                                                i = C23274hvD.Application.setActionBarUpIndicator;
                                                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView4 != null) {
                                                                                    i = C23274hvD.Application.startSupportActionMode;
                                                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView5 != null) {
                                                                                        i = C23274hvD.Application.hasWindowFeature;
                                                                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView6 != null) {
                                                                                            i = C23274hvD.Application.ToolbarActionBarMenuBuilderCallback;
                                                                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView7 != null) {
                                                                                                i = C23274hvD.Application.indexOfTransition;
                                                                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView8 != null) {
                                                                                                    i = C23274hvD.Application.getTransparentRegion;
                                                                                                    android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView9 != null) {
                                                                                                        i = C23274hvD.Application.setColor;
                                                                                                        android.widget.TextView textView10 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView10 != null) {
                                                                                                            return new hEQ((ConstraintLayout) view, viewFindChildViewById, c52794wYp, frameLayout, linearLayoutCompat, textView, imageView, linearLayoutCompat2, imageView2, imageView3, constraintLayout, textView2, textView3, frameLayout2, c55320xhi, constraintLayout2, constraintLayout3, imageView4, imageView5, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
