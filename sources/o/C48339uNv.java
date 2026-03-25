package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48339uNv implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final android.widget.ImageView AuCTel;
    public final android.widget.LinearLayout AuCTelauCTel;
    public final android.widget.TextView AubY;
    public final android.widget.LinearLayout AxsJAY;
    public final android.view.View DbNXlk;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final Guideline OLrzqt;
    public final android.widget.TextView copydefault;
    public final C55159xeg djBIcL;
    public final Group ejfBZ;
    public final android.widget.FrameLayout fARcdN;
    public final Group fIwbmz;
    public final Group fJNWhG;
    public final Barrier fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.FrameLayout gHZMYf;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final Guideline hDKMBd;
    public final C49352umt isConnected;
    public final ConstraintLayout iwGUEr;
    public final android.widget.TextView sSMYrx;
    public final ShapeableImageView uzCIH;
    public final android.widget.TextView valueOf;
    public final Barrier values;
    public final android.view.View wlaJM;
    public final android.widget.TextView zLjUOn;
    public final android.widget.TextView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.fARcdN;
    }

    public C48339uNv(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull C55159xeg c55159xeg, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C49352umt c49352umt, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull Group group3, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull android.widget.TextView textView10, @androidx.annotation.NonNull android.widget.TextView textView11, @androidx.annotation.NonNull android.widget.TextView textView12, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.fARcdN = frameLayout;
        this.AEQbTJ = textView;
        this.copydefault = textView2;
        this.KWHzl = constraintLayout;
        this.EZpvd = textView3;
        this.OLrzqt = guideline;
        this.AhwBna = textView4;
        this.valueOf = textView5;
        this.djBIcL = c55159xeg;
        this.AYXKKw = textView6;
        this.gEmmrt = constraintLayout2;
        this.DbNXlk = view;
        this.isConnected = c49352umt;
        this.values = barrier;
        this.fetchVPNInfo = barrier2;
        this.AkhnZx = imageView;
        this.AuCTel = imageView2;
        this.ejfBZ = group;
        this.fJNWhG = group2;
        this.fIwbmz = group3;
        this.uzCIH = shapeableImageView;
        this.getNewProxyInstance = textView7;
        this.getFieldNames = textView8;
        this.iwGUEr = constraintLayout3;
        this.hDKMBd = guideline2;
        this.AuCTelauCTel = linearLayout;
        this.wlaJM = view2;
        this.zsXlph = textView9;
        this.zLjUOn = textView10;
        this.AubY = textView11;
        this.sSMYrx = textView12;
        this.gHZMYf = frameLayout2;
        this.AxsJAY = linearLayout2;
    }

    public static C48339uNv AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C48033uCm.Application.QfJbVf;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.awiJhF;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C48033uCm.Application.dzCpvv;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C48033uCm.Application.zzQwtT;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C48033uCm.Application.cBPFI;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = C48033uCm.Application.hrjNmC;
                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = C48033uCm.Application.fGQ;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = C48033uCm.Application.DcMfJKfbSiEC;
                                    C55159xeg c55159xeg = (C55159xeg) ViewBindings.findChildViewById(view, i);
                                    if (c55159xeg != null) {
                                        i = C48033uCm.Application.clearRegistrations;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = C48033uCm.Application.drbYRJ;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.glXhWM))) != null) {
                                                i = C48033uCm.Application.zFZsbn;
                                                C49352umt c49352umt = (C49352umt) ViewBindings.findChildViewById(view, i);
                                                if (c49352umt != null) {
                                                    i = C48033uCm.Application.DYICSh;
                                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                                    if (barrier != null) {
                                                        i = C48033uCm.Application.QUeTTI;
                                                        Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                        if (barrier2 != null) {
                                                            i = C48033uCm.Application.ICustomTabsCallbackStubProxy;
                                                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView != null) {
                                                                i = C48033uCm.Application.putBitmap;
                                                                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView2 != null) {
                                                                    i = C48033uCm.Application.ComponentActivityNonConfigurationInstances;
                                                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                                    if (group != null) {
                                                                        i = C48033uCm.Application.ComponentActivityApi19Impl;
                                                                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                                                        if (group2 != null) {
                                                                            i = C48033uCm.Application.ComponentActivityApi33Impl;
                                                                            Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                                                            if (group3 != null) {
                                                                                i = C48033uCm.Application.ComponentActivityReportFullyDrawnExecutor;
                                                                                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (shapeableImageView != null) {
                                                                                    i = C48033uCm.Application.createHandler;
                                                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView7 != null) {
                                                                                        i = C48033uCm.Application.viewCreated;
                                                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView8 != null) {
                                                                                            i = C48033uCm.Application.trackPipAnimationHintViewpositionInWindow;
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (constraintLayout3 != null) {
                                                                                                i = C48033uCm.Application.RequiresFeature;
                                                                                                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                                                if (guideline2 != null) {
                                                                                                    i = C48033uCm.Application.setupCustomContent;
                                                                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (linearLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.AlertControllerAlertParams4))) != null) {
                                                                                                        i = C48033uCm.Application.AlertControllerAlertParamsOnPrepareListViewListener;
                                                                                                        android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView9 != null) {
                                                                                                            i = C48033uCm.Application.setItems;
                                                                                                            android.widget.TextView textView10 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView10 != null) {
                                                                                                                i = C48033uCm.Application.setOnCancelListener;
                                                                                                                android.widget.TextView textView11 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView11 != null) {
                                                                                                                    i = C48033uCm.Application.setPositiveButtonIcon;
                                                                                                                    android.widget.TextView textView12 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i = C48033uCm.Application.hideForActionMode;
                                                                                                                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (frameLayout != null) {
                                                                                                                            i = C48033uCm.Application.doHide;
                                                                                                                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                return new C48339uNv((android.widget.FrameLayout) view, textView, textView2, constraintLayout, textView3, guideline, textView4, textView5, c55159xeg, textView6, constraintLayout2, viewFindChildViewById, c49352umt, barrier, barrier2, imageView, imageView2, group, group2, group3, shapeableImageView, textView7, textView8, constraintLayout3, guideline2, linearLayout, viewFindChildViewById2, textView9, textView10, textView11, textView12, frameLayout, linearLayout2);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
