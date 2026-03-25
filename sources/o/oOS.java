package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOS implements ViewBinding {
    public final Guideline AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C57585ylG AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.Space EZpvd;
    public final Group KWHzl;
    public final mUA OLrzqt;
    public final Group copydefault;
    public final android.widget.ImageView djBIcL;
    public final AppCompatTextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final ConstraintLayout fJNWhG;
    public final RecyclerView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView hDKMBd;
    public final android.widget.TextView isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.fJNWhG;
    }

    public oOS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull mUA mua, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C57585ylG c57585ylG, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.fJNWhG = constraintLayout;
        this.OLrzqt = mua;
        this.AEQbTJ = guideline;
        this.EZpvd = space;
        this.copydefault = group;
        this.KWHzl = group2;
        this.gEmmrt = linearLayout;
        this.AhwBna = imageView;
        this.AYXKKw = imageView2;
        this.djBIcL = imageView3;
        this.valueOf = linearLayout2;
        this.values = imageView4;
        this.fetchVPNInfo = recyclerView;
        this.AkhnZx = textView;
        this.isConnected = textView2;
        this.DbNXlk = textView3;
        this.AuCTel = c57585ylG;
        this.ejfBZ = appCompatTextView;
        this.fIwbmz = textView4;
        this.fARcdN = textView5;
        this.hDKMBd = textView6;
        this.getFieldNames = textView7;
    }

    public static oOS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.iwGUEr;
        mUA mua = (mUA) ViewBindings.findChildViewById(view, i);
        if (mua != null) {
            i = C35964oKf.StateListAnimator.getAdvertisingId;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = C35964oKf.StateListAnimator.sZqaRl;
                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = C35964oKf.StateListAnimator.OAUGar;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C35964oKf.StateListAnimator.OWSZPf;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C35964oKf.StateListAnimator.Ohcwxs;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C35964oKf.StateListAnimator.keyboardTargetTextChanged;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C35964oKf.StateListAnimator.QSusPL;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C35964oKf.StateListAnimator.OVMstZ;
                                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = C35964oKf.StateListAnimator.RjCdvpRjCdvp;
                                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = C35964oKf.StateListAnimator.onAvailable;
                                                android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView4 != null) {
                                                    i = C35964oKf.StateListAnimator.SdSTJp;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                    if (recyclerView != null) {
                                                        i = C35964oKf.StateListAnimator.fObYrO;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C35964oKf.StateListAnimator.fACtfg;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = C35964oKf.StateListAnimator.iSpHlg;
                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = C35964oKf.StateListAnimator.getExtras;
                                                                    C57585ylG c57585ylG = (C57585ylG) ViewBindings.findChildViewById(view, i);
                                                                    if (c57585ylG != null) {
                                                                        i = C35964oKf.StateListAnimator.sendCustomAction;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView != null) {
                                                                            i = C35964oKf.StateListAnimator.setPlaybackState;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = C35964oKf.StateListAnimator.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView5 != null) {
                                                                                    i = C35964oKf.StateListAnimator.setPlaybackToLocal;
                                                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView6 != null) {
                                                                                        i = C35964oKf.StateListAnimator.MediaDescriptionCompat;
                                                                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView7 != null) {
                                                                                            return new oOS((ConstraintLayout) view, mua, guideline, space, group, group2, linearLayout, imageView, imageView2, imageView3, linearLayout2, imageView4, recyclerView, textView, textView2, textView3, c57585ylG, appCompatTextView, textView4, textView5, textView6, textView7);
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
