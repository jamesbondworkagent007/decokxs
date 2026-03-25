package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36071oOe implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final RecyclerView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final C55173xeu EZpvd;
    public final ConstraintLayout KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final C55113xdn djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final Guideline fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView isConnected;
    public final ConstraintLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C36071oOe(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull Guideline guideline) {
        this.valueOf = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.copydefault = linearLayoutCompat3;
        this.AYXKKw = linearLayoutCompat4;
        this.gEmmrt = linearLayoutCompat5;
        this.djBIcL = c55113xdn;
        this.AhwBna = recyclerView;
        this.values = textView;
        this.AkhnZx = textView2;
        this.fetchVPNInfo = textView3;
        this.DbNXlk = textView4;
        this.isConnected = textView5;
        this.fJNWhG = textView6;
        this.fARcdN = textView7;
        this.AuCTel = textView8;
        this.ejfBZ = textView9;
        this.fIwbmz = guideline;
    }

    public static C36071oOe OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.gSBher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36071oOe KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.DTg;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C35964oKf.StateListAnimator.invokespecialgBtXYZ;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.HJWChPzRXNTw;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C35964oKf.StateListAnimator.apLTlu;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = C35964oKf.StateListAnimator.OKvQBs;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat3 != null) {
                            i = C35964oKf.StateListAnimator.getConnectivityMgr;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat4 != null) {
                                i = C35964oKf.StateListAnimator.RidNCX;
                                LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat5 != null) {
                                    i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C35964oKf.StateListAnimator.ICustomTabsServiceDefault;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C35964oKf.StateListAnimator.setSubtitle;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C35964oKf.StateListAnimator.MediaMetadataCompat1;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C35964oKf.StateListAnimator.newThumbRating;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C35964oKf.StateListAnimator.dispatchMediaButtonEvent;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = C35964oKf.StateListAnimator.getSessionActivity;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = C35964oKf.StateListAnimator.MediaControllerCompatApi23;
                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    i = C35964oKf.StateListAnimator.getStateWithUpdatedPosition;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView7 != null) {
                                                                        i = C35964oKf.StateListAnimator.MediaSessionCompat;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView8 != null) {
                                                                            i = C35964oKf.StateListAnimator.getCurrentControllerInfo;
                                                                            android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView9 != null) {
                                                                                i = C35964oKf.StateListAnimator.onRemoveQueueItemAt;
                                                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                                if (guideline != null) {
                                                                                    return new C36071oOe((ConstraintLayout) view, constraintLayout, c55173xeu, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, c55113xdn, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, guideline);
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
