package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16592emo implements ViewBinding {
    public final AppBarLayout AEQbTJ;
    public final C17125ewr AYXKKw;
    public final android.view.View AhwBna;
    public final android.view.ViewStub AkhnZx;
    public final C33603mza AuCTel;
    public final LottieAnimationView DbNXlk;
    public final C55244xgL EZpvd;
    public final C17090ewI KWHzl;
    public final ViewPager2 OLrzqt;
    public final NestedScrollView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final ConstraintLayout ejfBZ;
    public final C16749epm fARcdN;
    public final android.view.ViewStub fIwbmz;
    public final C33546myW fJNWhG;
    public final C15764eUk fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final C15828eWu isConnected;
    public final C17161exa valueOf;
    public final NestedScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.ejfBZ;
    }

    public C16592emo(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C17090ewI c17090ewI, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C17125ewr c17125ewr, @androidx.annotation.NonNull C17161exa c17161exa, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull android.view.ViewStub viewStub, @androidx.annotation.NonNull C15764eUk c15764eUk, @androidx.annotation.NonNull C15828eWu c15828eWu, @androidx.annotation.NonNull android.view.ViewStub viewStub2, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C16749epm c16749epm) {
        this.ejfBZ = constraintLayout;
        this.KWHzl = c17090ewI;
        this.AEQbTJ = appBarLayout;
        this.EZpvd = c55244xgL;
        this.copydefault = nestedScrollView;
        this.OLrzqt = viewPager2;
        this.AYXKKw = c17125ewr;
        this.valueOf = c17161exa;
        this.AhwBna = view;
        this.gEmmrt = view2;
        this.djBIcL = frameLayout;
        this.DbNXlk = lottieAnimationView;
        this.values = nestedScrollView2;
        this.AkhnZx = viewStub;
        this.fetchVPNInfo = c15764eUk;
        this.isConnected = c15828eWu;
        this.fIwbmz = viewStub2;
        this.fJNWhG = c33546myW;
        this.AuCTel = c33603mza;
        this.fARcdN = c16749epm;
    }

    public static C16592emo copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.gwwfep, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16592emo AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C13754dXa.ActionBar.hDKMBd;
        android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById4 != null) {
            C17090ewI c17090ewIKWHzl = C17090ewI.KWHzl(viewFindChildViewById4);
            i = C13754dXa.ActionBar.iZzfmt;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
            if (appBarLayout != null) {
                i = C13754dXa.ActionBar.QSBOWP;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = C13754dXa.ActionBar.dHguZz;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        i = C13754dXa.ActionBar.RdAHlO;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.DGOPHZ))) != null) {
                            C17125ewr c17125ewrEZpvd = C17125ewr.EZpvd(viewFindChildViewById);
                            i = C13754dXa.ActionBar.DCUTEIddSDPG;
                            android.view.View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById5 != null) {
                                C17161exa c17161exaOLrzqt = C17161exa.OLrzqt(viewFindChildViewById5);
                                i = C13754dXa.ActionBar.call;
                                android.view.View viewFindChildViewById6 = ViewBindings.findChildViewById(view, i);
                                if (viewFindChildViewById6 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.DcqEDu))) != null) {
                                    i = C13754dXa.ActionBar.sYcwUD;
                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C13754dXa.ActionBar.read;
                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                        if (lottieAnimationView != null) {
                                            i = C13754dXa.ActionBar.getCallbacks;
                                            NestedScrollView nestedScrollView2 = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView2 != null) {
                                                i = C13754dXa.ActionBar.unregisterCallbackMessenger;
                                                android.view.ViewStub viewStub = (android.view.ViewStub) ViewBindings.findChildViewById(view, i);
                                                if (viewStub != null) {
                                                    i = C13754dXa.ActionBar.isEmpty;
                                                    C15764eUk c15764eUk = (C15764eUk) ViewBindings.findChildViewById(view, i);
                                                    if (c15764eUk != null) {
                                                        i = C13754dXa.ActionBar.onChildrenLoaded;
                                                        C15828eWu c15828eWu = (C15828eWu) ViewBindings.findChildViewById(view, i);
                                                        if (c15828eWu != null) {
                                                            i = C13754dXa.ActionBar.putCallback;
                                                            android.view.ViewStub viewStub2 = (android.view.ViewStub) ViewBindings.findChildViewById(view, i);
                                                            if (viewStub2 != null) {
                                                                i = C13754dXa.ActionBar.next;
                                                                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                                if (c33546myW != null) {
                                                                    i = C13754dXa.ActionBar.isTransportControlEnabled;
                                                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                                    if (c33603mza != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.getActiveQueueItemId))) != null) {
                                                                        return new C16592emo((ConstraintLayout) view, c17090ewIKWHzl, appBarLayout, c55244xgL, nestedScrollView, viewPager2, c17125ewrEZpvd, c17161exaOLrzqt, viewFindChildViewById6, viewFindChildViewById2, frameLayout, lottieAnimationView, nestedScrollView2, viewStub, c15764eUk, c15828eWu, viewStub2, c33546myW, c33603mza, C16749epm.EZpvd(viewFindChildViewById3));
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
