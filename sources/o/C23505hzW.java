package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23505hzW implements ViewBinding {
    public final C26092jRq AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final ConstraintLayout AhwBna;
    public final wYC AkhnZx;
    public final wYC AuCTel;
    public final RecyclerView AuCTelauCTel;
    public final android.widget.FrameLayout AubY;
    public final android.widget.TextView AwvSrB;
    public final C55113xdn DbNXlk;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final C26085jRj OLrzqt;
    public final OKAlertBanner copydefault;
    public final ConstraintLayout djBIcL;
    public final wYC ejfBZ;
    public final android.widget.TextView fARcdN;
    public final hSY fIwbmz;
    public final wYC fJNWhG;
    public final C55173xeu fetchVPNInfo;
    public final C26101jRz gEmmrt;
    public final android.widget.TextView gHZMYf;
    public final C55113xdn getFieldNames;
    public final C33603mza getNewProxyInstance;
    public final C33546myW hDKMBd;
    public final ConstraintLayout isConnected;
    public final C55113xdn iwGUEr;
    public final android.widget.ScrollView uzCIH;
    public final C26098jRw valueOf;
    public final NestedScrollView values;
    public final android.widget.TextView wlaJM;
    public final android.widget.TextView zLjUOn;
    public final android.widget.TextView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AubY;
    }

    public C23505hzW(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull C26085jRj c26085jRj, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C26092jRq c26092jRq, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C26101jRz c26101jRz, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull C26098jRw c26098jRw, @androidx.annotation.NonNull ConstraintLayout constraintLayout5, @androidx.annotation.NonNull ConstraintLayout constraintLayout6, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull wYC wyc3, @androidx.annotation.NonNull wYC wyc4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull hSY hsy, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull C55113xdn c55113xdn3, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.AubY = frameLayout;
        this.copydefault = oKAlertBanner;
        this.OLrzqt = c26085jRj;
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c26092jRq;
        this.KWHzl = constraintLayout2;
        this.gEmmrt = c26101jRz;
        this.AYXKKw = constraintLayout3;
        this.AhwBna = constraintLayout4;
        this.valueOf = c26098jRw;
        this.djBIcL = constraintLayout5;
        this.isConnected = constraintLayout6;
        this.values = nestedScrollView;
        this.fetchVPNInfo = c55173xeu;
        this.DbNXlk = c55113xdn;
        this.AkhnZx = wyc;
        this.fJNWhG = wyc2;
        this.ejfBZ = wyc3;
        this.AuCTel = wyc4;
        this.fARcdN = textView;
        this.fIwbmz = hsy;
        this.getFieldNames = c55113xdn2;
        this.iwGUEr = c55113xdn3;
        this.uzCIH = scrollView;
        this.hDKMBd = c33546myW;
        this.getNewProxyInstance = c33603mza;
        this.AuCTelauCTel = recyclerView;
        this.zsXlph = textView2;
        this.wlaJM = textView3;
        this.zLjUOn = textView4;
        this.AwvSrB = textView5;
        this.gHZMYf = textView6;
    }

    public static C23505hzW EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OTwTPd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23505hzW OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DXXBbs;
        OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
        if (oKAlertBanner != null) {
            i = C23274hvD.Application.DQYQgr;
            C26085jRj c26085jRj = (C26085jRj) ViewBindings.findChildViewById(view, i);
            if (c26085jRj != null) {
                i = C23274hvD.Application.reset;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C23274hvD.Application.isReflectionWorking;
                    C26092jRq c26092jRq = (C26092jRq) ViewBindings.findChildViewById(view, i);
                    if (c26092jRq != null) {
                        i = C23274hvD.Application.Th;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = C23274hvD.Application.DQzvGNdrmXxu;
                            C26101jRz c26101jRz = (C26101jRz) ViewBindings.findChildViewById(view, i);
                            if (c26101jRz != null) {
                                i = C23274hvD.Application.DQzvGNdrmXxudrmXxu;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout3 != null) {
                                    i = C23274hvD.Application.RIuxYh;
                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout4 != null) {
                                        i = C23274hvD.Application.DTeKQX;
                                        C26098jRw c26098jRw = (C26098jRw) ViewBindings.findChildViewById(view, i);
                                        if (c26098jRw != null) {
                                            i = C23274hvD.Application.RgLUBD;
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout5 != null) {
                                                i = C23274hvD.Application.RTWSvT;
                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout6 != null) {
                                                    i = C23274hvD.Application.stopBehavioSecDataCollection;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                    if (nestedScrollView != null) {
                                                        i = C23274hvD.Application.sZqaRl;
                                                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                                        if (c55173xeu != null) {
                                                            i = C23274hvD.Application.OVMstZ;
                                                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                            if (c55113xdn != null) {
                                                                i = C23274hvD.Application.UkuJRw;
                                                                wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                                                                if (wyc != null) {
                                                                    i = C23274hvD.Application.asInterface;
                                                                    wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                                                                    if (wyc2 != null) {
                                                                        i = C23274hvD.Application.warmup;
                                                                        wYC wyc3 = (wYC) ViewBindings.findChildViewById(view, i);
                                                                        if (wyc3 != null) {
                                                                            i = C23274hvD.Application.getDescription;
                                                                            wYC wyc4 = (wYC) ViewBindings.findChildViewById(view, i);
                                                                            if (wyc4 != null) {
                                                                                i = C23274hvD.Application.MediaDescriptionCompatBuilder;
                                                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView != null) {
                                                                                    i = C23274hvD.Application.newHeartRating;
                                                                                    hSY hsy = (hSY) ViewBindings.findChildViewById(view, i);
                                                                                    if (hsy != null) {
                                                                                        i = C23274hvD.Application.newThumbRating;
                                                                                        C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                                                        if (c55113xdn2 != null) {
                                                                                            i = C23274hvD.Application.toLegacyStreamType;
                                                                                            C55113xdn c55113xdn3 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                                                            if (c55113xdn3 != null) {
                                                                                                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                                                                                android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                if (scrollView != null) {
                                                                                                    i = C23274hvD.Application.access001;
                                                                                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                                                                    if (c33546myW != null) {
                                                                                                        i = C23274hvD.Application.lambdanew0;
                                                                                                        C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                                                                        if (c33603mza != null) {
                                                                                                            i = C23274hvD.Application.FullyDrawnReporterKtreportWhenComplete1;
                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (recyclerView != null) {
                                                                                                                i = C23274hvD.Application.RequiresOptIn;
                                                                                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView2 != null) {
                                                                                                                    i = C23274hvD.Application.AlertControllerAlertParams;
                                                                                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textView3 != null) {
                                                                                                                        i = C23274hvD.Application.attachBaseContext;
                                                                                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textView4 != null) {
                                                                                                                            i = C23274hvD.Application.AppCompatCallback;
                                                                                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (textView5 != null) {
                                                                                                                                i = C23274hvD.Application.resolveDensity;
                                                                                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    return new C23505hzW((android.widget.FrameLayout) view, oKAlertBanner, c26085jRj, constraintLayout, c26092jRq, constraintLayout2, c26101jRz, constraintLayout3, constraintLayout4, c26098jRw, constraintLayout5, constraintLayout6, nestedScrollView, c55173xeu, c55113xdn, wyc, wyc2, wyc3, wyc4, textView, hsy, c55113xdn2, c55113xdn3, scrollView, c33546myW, c33603mza, recyclerView, textView2, textView3, textView4, textView5, textView6);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
