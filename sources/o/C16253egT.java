package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16253egT implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatImageView AhwBna;
    public final NestedScrollView AkhnZx;
    public final AppCompatTextView AuCTel;
    public final ConstraintLayout DbNXlk;
    public final ConstraintLayout EZpvd;
    public final C52794wYp KWHzl;
    public final android.view.View OLrzqt;
    public final Barrier copydefault;
    public final C55173xeu djBIcL;
    public final AppCompatTextView ejfBZ;
    public final ConstraintLayout fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final AppCompatImageView fetchVPNInfo;
    public final ShapeableImageView gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final Group getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final LinearLayoutCompat isConnected;
    public final AppCompatTextView iwGUEr;
    public final AppCompatTextView uzCIH;
    public final AppCompatImageView valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.DbNXlk;
    }

    public C16253egT(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull Group group) {
        this.DbNXlk = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.copydefault = barrier;
        this.KWHzl = c52794wYp;
        this.AEQbTJ = c33537myN;
        this.OLrzqt = view;
        this.djBIcL = c55173xeu;
        this.AYXKKw = constraintLayout3;
        this.gEmmrt = shapeableImageView;
        this.valueOf = appCompatImageView;
        this.AhwBna = appCompatImageView2;
        this.fetchVPNInfo = appCompatImageView3;
        this.isConnected = linearLayoutCompat;
        this.values = constraintLayout4;
        this.AkhnZx = nestedScrollView;
        this.fARcdN = constraintLayout5;
        this.ejfBZ = appCompatTextView;
        this.fIwbmz = appCompatTextView2;
        this.AuCTel = appCompatTextView3;
        this.fJNWhG = appCompatTextView4;
        this.getFieldNames = appCompatTextView5;
        this.hDKMBd = appCompatTextView6;
        this.uzCIH = appCompatTextView7;
        this.iwGUEr = appCompatTextView8;
        this.getNewProxyInstance = group;
    }

    public static C16253egT EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C16253egT EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16253egT copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.fIwbmz;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13754dXa.ActionBar.QwvEab;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C13754dXa.ActionBar.getPriority;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C13754dXa.ActionBar.gkZNMa;
                    C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
                    if (c33537myN != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.dbUqJD))) != null) {
                        i = C13754dXa.ActionBar.getValue;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C13754dXa.ActionBar.RckOJh;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C13754dXa.ActionBar.sFt;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                                if (shapeableImageView != null) {
                                    i = C13754dXa.ActionBar.zFZsbn;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView != null) {
                                        i = C13754dXa.ActionBar.SFHvfS;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView2 != null) {
                                            i = C13754dXa.ActionBar.gxJrGF;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView3 != null) {
                                                i = C13754dXa.ActionBar.ICustomTabsCallbackStub;
                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat != null) {
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                    i = C13754dXa.ActionBar.getStateWithUpdatedPosition;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                    if (nestedScrollView != null) {
                                                        i = C13754dXa.ActionBar.setPlaybackToRemote;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout4 != null) {
                                                            i = C13754dXa.ActionBar.createItem;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView != null) {
                                                                i = C13754dXa.ActionBar.MediaSessionCompatApi24;
                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView2 != null) {
                                                                    i = C13754dXa.ActionBar.PlaybackStateCompat;
                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView3 != null) {
                                                                        i = C13754dXa.ActionBar.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA;
                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView4 != null) {
                                                                            i = C13754dXa.ActionBar.ComponentDialogExternalSyntheticApiModelOutline0;
                                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView5 != null) {
                                                                                i = C13754dXa.ActionBar.launch;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = C13754dXa.ActionBar.getLauncher;
                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView7 != null) {
                                                                                        i = C13754dXa.ActionBar.getSystemFallbackPickeractivity_release;
                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView8 != null) {
                                                                                            i = C13754dXa.ActionBar.hide;
                                                                                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                                                            if (group != null) {
                                                                                                return new C16253egT(constraintLayout3, constraintLayout, barrier, c52794wYp, c33537myN, viewFindChildViewById, c55173xeu, constraintLayout2, shapeableImageView, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, constraintLayout3, nestedScrollView, constraintLayout4, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, group);
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
