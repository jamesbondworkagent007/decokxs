package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48464uSj implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView AuCTel;
    public final AppCompatTextView DbNXlk;
    public final RecyclerView EZpvd;
    public final NestedScrollView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final NestedScrollView copydefault;
    public final LinearLayoutCompat djBIcL;
    public final AppCompatTextView ejfBZ;
    public final AppCompatTextView fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final AppCompatTextView fetchVPNInfo;
    public final C52705wVh gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final AppCompatTextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView iwGUEr;
    public final AppCompatTextView uzCIH;
    public final AppCompatTextView valueOf;
    public final AppCompatTextView values;
    public final android.view.View wlaJM;
    public final LinearLayoutCompat zLjUOn;
    public final LinearLayoutCompat zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.KWHzl;
    }

    public C48464uSj(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C52705wVh c52705wVh, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10, @androidx.annotation.NonNull AppCompatTextView appCompatTextView11, @androidx.annotation.NonNull AppCompatTextView appCompatTextView12, @androidx.annotation.NonNull AppCompatTextView appCompatTextView13, @androidx.annotation.NonNull AppCompatTextView appCompatTextView14, @androidx.annotation.NonNull AppCompatTextView appCompatTextView15, @androidx.annotation.NonNull AppCompatTextView appCompatTextView16, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull android.view.View view) {
        this.KWHzl = nestedScrollView;
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = linearLayoutCompat;
        this.copydefault = nestedScrollView2;
        this.EZpvd = recyclerView;
        this.djBIcL = linearLayoutCompat2;
        this.gEmmrt = c52705wVh;
        this.AhwBna = linearLayoutCompat3;
        this.AYXKKw = imageView;
        this.valueOf = appCompatTextView;
        this.isConnected = appCompatTextView2;
        this.fetchVPNInfo = appCompatTextView3;
        this.DbNXlk = appCompatTextView4;
        this.values = appCompatTextView5;
        this.AkhnZx = appCompatTextView6;
        this.fARcdN = appCompatTextView7;
        this.fJNWhG = appCompatTextView8;
        this.AuCTel = appCompatTextView9;
        this.ejfBZ = appCompatTextView10;
        this.fIwbmz = appCompatTextView11;
        this.getNewProxyInstance = appCompatTextView12;
        this.getFieldNames = appCompatTextView13;
        this.hDKMBd = appCompatTextView14;
        this.iwGUEr = appCompatTextView15;
        this.uzCIH = appCompatTextView16;
        this.zsXlph = linearLayoutCompat4;
        this.zLjUOn = linearLayoutCompat5;
        this.wlaJM = view;
    }

    public static C48464uSj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.OmJATG;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C48033uCm.Application.registerKeyboardTarget;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = C48033uCm.Application.IResultReceiverDefault;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C48033uCm.Application.remove;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = C48033uCm.Application.getMaxItemsactivity_release;
                        C52705wVh c52705wVh = (C52705wVh) ViewBindings.findChildViewById(view, i);
                        if (c52705wVh != null) {
                            i = C48033uCm.Application.IntDef;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat3 != null) {
                                i = C48033uCm.Application.setSelectedNavigationItem;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C48033uCm.Application.ActionBarLayoutParams;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = C48033uCm.Application.setSingleChoiceItems;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C48033uCm.Application.dispatchKeyEvent;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C48033uCm.Application.openPanel;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C48033uCm.Application.reopenMenu;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C48033uCm.Application.startSupportActionModeFromWindow;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            i = C48033uCm.Application.peekSupportActionBar;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView7 != null) {
                                                                i = C48033uCm.Application.AppCompatDelegateImpl2;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView8 != null) {
                                                                    i = C48033uCm.Application.isPowerSaveMode;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView9 != null) {
                                                                        i = C48033uCm.Application.AppCompatDelegateImplApi26Impl;
                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView10 != null) {
                                                                            i = C48033uCm.Application.createCheckedTextView;
                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView11 != null) {
                                                                                i = C48033uCm.Application.createButton;
                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView12 != null) {
                                                                                    i = C48033uCm.Application.clear;
                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView13 != null) {
                                                                                        i = C48033uCm.Application.ResourcesFlusherApi16Impl;
                                                                                        AppCompatTextView appCompatTextView14 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView14 != null) {
                                                                                            i = C48033uCm.Application.flushNougats;
                                                                                            AppCompatTextView appCompatTextView15 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatTextView15 != null) {
                                                                                                i = C48033uCm.Application.flushThemedResourcesCache;
                                                                                                AppCompatTextView appCompatTextView16 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatTextView16 != null) {
                                                                                                    i = C48033uCm.Application.getColorStateList;
                                                                                                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                    if (linearLayoutCompat4 != null) {
                                                                                                        i = C48033uCm.Application.AnimatedStateListDrawableCompat;
                                                                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                                                        if (linearLayoutCompat5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.updateStateFromTypedArray))) != null) {
                                                                                                            return new C48464uSj(nestedScrollView, constraintLayout, linearLayoutCompat, nestedScrollView, recyclerView, linearLayoutCompat2, c52705wVh, linearLayoutCompat3, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15, appCompatTextView16, linearLayoutCompat4, linearLayoutCompat5, viewFindChildViewById);
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
