package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hAN implements ViewBinding {
    public final jPJ AEQbTJ;
    public final C55113xdn AYXKKw;
    public final C33603mza AhwBna;
    public final android.widget.FrameLayout AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final C55173xeu EZpvd;
    public final NestedScrollView KWHzl;
    public final C55173xeu OLrzqt;
    public final Guideline copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final AppCompatTextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final RecyclerView fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final AppCompatTextView getNewProxyInstance;
    public final android.widget.TextView hDKMBd;
    public final C33546myW isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public final AppCompatImageView valueOf;
    public final RecyclerView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AkhnZx;
    }

    public hAN(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull jPJ jpj, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.AkhnZx = frameLayout;
        this.KWHzl = nestedScrollView;
        this.OLrzqt = c55173xeu;
        this.EZpvd = c55173xeu2;
        this.AEQbTJ = jpj;
        this.copydefault = guideline;
        this.gEmmrt = appCompatImageView;
        this.valueOf = appCompatImageView2;
        this.djBIcL = linearLayout;
        this.AYXKKw = c55113xdn;
        this.AhwBna = c33603mza;
        this.values = recyclerView;
        this.fetchVPNInfo = recyclerView2;
        this.isConnected = c33546myW;
        this.DbNXlk = textView;
        this.fJNWhG = textView2;
        this.AuCTel = textView3;
        this.fARcdN = textView4;
        this.ejfBZ = appCompatTextView;
        this.fIwbmz = textView5;
        this.hDKMBd = textView6;
        this.uzCIH = textView7;
        this.iwGUEr = textView8;
        this.getFieldNames = appCompatTextView2;
        this.getNewProxyInstance = appCompatTextView3;
    }

    public static hAN EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zOIQXb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hAN OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dPkBzA;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
        if (nestedScrollView != null) {
            i = C23274hvD.Application.HJWChP;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.sZqaRl;
                C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu2 != null) {
                    i = C23274hvD.Application.DuR;
                    jPJ jpj = (jPJ) ViewBindings.findChildViewById(view, i);
                    if (jpj != null) {
                        i = C23274hvD.Application.QjzqRB;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = C23274hvD.Application.identifier;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                i = C23274hvD.Application.onConnectionFailed;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView2 != null) {
                                    i = C23274hvD.Application.sendCommand;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                        if (c55113xdn != null) {
                                            i = C23274hvD.Application.lambdanew0;
                                            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                            if (c33603mza != null) {
                                                i = C23274hvD.Application.ComponentActivity4;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = C23274hvD.Application.FullyDrawnReporterExternalSyntheticLambda0;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                    if (recyclerView2 != null) {
                                                        i = C23274hvD.Application.launch;
                                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                        if (c33546myW != null) {
                                                            i = C23274hvD.Application.getSelectedTab;
                                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                i = C23274hvD.Application.getNavigationMode;
                                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView2 != null) {
                                                                    i = C23274hvD.Application.getThemedContext;
                                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView3 != null) {
                                                                        i = C23274hvD.Application.onKeyShortcut;
                                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView4 != null) {
                                                                            i = C23274hvD.Application.setIcon;
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView != null) {
                                                                                i = C23274hvD.Application.checkOnClickListener;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView5 != null) {
                                                                                    i = C23274hvD.Application.backportAccessibilityAttributes;
                                                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView6 != null) {
                                                                                        i = C23274hvD.Application.isParserOutdated;
                                                                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView7 != null) {
                                                                                            i = C23274hvD.Application.NavItemSelectedListener;
                                                                                            android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView8 != null) {
                                                                                                i = C23274hvD.Application.hasLogo;
                                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatTextView2 != null) {
                                                                                                    i = C23274hvD.Application.showForSystem;
                                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (appCompatTextView3 != null) {
                                                                                                        return new hAN((android.widget.FrameLayout) view, nestedScrollView, c55173xeu, c55173xeu2, jpj, guideline, appCompatImageView, appCompatImageView2, linearLayout, c55113xdn, c33603mza, recyclerView, recyclerView2, c33546myW, textView, textView2, textView3, textView4, appCompatTextView, textView5, textView6, textView7, textView8, appCompatTextView2, appCompatTextView3);
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
