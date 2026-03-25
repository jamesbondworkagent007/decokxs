package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNR implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final C33603mza AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView AuCTelauCTel;
    public final android.widget.TextView AubY;
    public final android.widget.FrameLayout DbNXlk;
    public final mXE EZpvd;
    public final NestedScrollView KWHzl;
    public final android.view.View OLrzqt;
    public final C55173xeu copydefault;
    public final android.widget.ImageView djBIcL;
    public final C33546myW ejfBZ;
    public final android.widget.TextView fARcdN;
    public final ConstraintLayout fIwbmz;
    public final RecyclerView fJNWhG;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final Guideline gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final android.widget.TextView hDKMBd;
    public final C55113xdn isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public final AppCompatImageView valueOf;
    public final RecyclerView values;
    public final android.widget.TextView wlaJM;
    public final AppCompatTextView zLjUOn;
    public final AppCompatTextView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.DbNXlk;
    }

    public oNR(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull mXE mxe, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.TextView textView9) {
        this.DbNXlk = frameLayout;
        this.KWHzl = nestedScrollView;
        this.OLrzqt = view;
        this.AEQbTJ = c55173xeu;
        this.copydefault = c55173xeu2;
        this.EZpvd = mxe;
        this.gEmmrt = guideline;
        this.AYXKKw = appCompatImageView;
        this.valueOf = appCompatImageView2;
        this.AhwBna = imageView;
        this.djBIcL = imageView2;
        this.fetchVPNInfo = linearLayout;
        this.isConnected = c55113xdn;
        this.AkhnZx = c33603mza;
        this.values = recyclerView;
        this.fIwbmz = constraintLayout;
        this.fJNWhG = recyclerView2;
        this.ejfBZ = c33546myW;
        this.fARcdN = textView;
        this.AuCTel = textView2;
        this.uzCIH = textView3;
        this.iwGUEr = textView4;
        this.getFieldNames = appCompatTextView;
        this.hDKMBd = textView5;
        this.getNewProxyInstance = textView6;
        this.wlaJM = textView7;
        this.AubY = textView8;
        this.zLjUOn = appCompatTextView2;
        this.zsXlph = appCompatTextView3;
        this.AuCTelauCTel = textView9;
    }

    public static oNR KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.ULRxlR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static oNR KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.DGUQLIOvDItG;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
        if (nestedScrollView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DPHNDa))) != null) {
            i = C35964oKf.StateListAnimator.invokespecialROgMPW;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.invokespecialhlXVux;
                C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu2 != null) {
                    i = C35964oKf.StateListAnimator.init;
                    mXE mxe = (mXE) ViewBindings.findChildViewById(view, i);
                    if (mxe != null) {
                        i = C35964oKf.StateListAnimator.DcMfJKffREWX;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = C35964oKf.StateListAnimator.sYcwUD;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                i = C35964oKf.StateListAnimator.RcvFxC;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView2 != null) {
                                    i = C35964oKf.StateListAnimator.unregister;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C35964oKf.StateListAnimator.RhjxDW;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = C35964oKf.StateListAnimator.hpmliR;
                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                if (c55113xdn != null) {
                                                    i = C35964oKf.StateListAnimator.ICustomTabsCallback;
                                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                    if (c33603mza != null) {
                                                        i = C35964oKf.StateListAnimator.validateRelationship;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = C35964oKf.StateListAnimator.ICustomTabsServiceStubProxy;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout != null) {
                                                                i = C35964oKf.StateListAnimator.IPostMessageServiceStubProxy;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                if (recyclerView2 != null) {
                                                                    i = C35964oKf.StateListAnimator.getNotifyChildrenChangedOptions;
                                                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                                    if (c33546myW != null) {
                                                                        i = C35964oKf.StateListAnimator.MediaMetadataCompat;
                                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView != null) {
                                                                            i = C35964oKf.StateListAnimator.newInstance;
                                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView2 != null) {
                                                                                i = C35964oKf.StateListAnimator.MediaDescriptionCompatApi23Builder;
                                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView3 != null) {
                                                                                    i = C35964oKf.StateListAnimator.getBitmap;
                                                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView4 != null) {
                                                                                        i = C35964oKf.StateListAnimator.keySet;
                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView != null) {
                                                                                            i = C35964oKf.StateListAnimator.IMediaSessionStubProxy;
                                                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView5 != null) {
                                                                                                i = C35964oKf.StateListAnimator.validateCustomAction;
                                                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView6 != null) {
                                                                                                    i = C35964oKf.StateListAnimator.getPlaybackInfo;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView7 != null) {
                                                                                                        i = C35964oKf.StateListAnimator.getSessionToken2Bundle;
                                                                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView8 != null) {
                                                                                                            i = C35964oKf.StateListAnimator.MediaControllerCompatMediaControllerImpl;
                                                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                i = C35964oKf.StateListAnimator.MediaControllerCompatMediaControllerExtraData;
                                                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (appCompatTextView3 != null) {
                                                                                                                    i = C35964oKf.StateListAnimator.setQueueTitle;
                                                                                                                    android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textView9 != null) {
                                                                                                                        return new oNR((android.widget.FrameLayout) view, nestedScrollView, viewFindChildViewById, c55173xeu, c55173xeu2, mxe, guideline, appCompatImageView, appCompatImageView2, imageView, imageView2, linearLayout, c55113xdn, c33603mza, recyclerView, constraintLayout, recyclerView2, c33546myW, textView, textView2, textView3, textView4, appCompatTextView, textView5, textView6, textView7, textView8, appCompatTextView2, appCompatTextView3, textView9);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
