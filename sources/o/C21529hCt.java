package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21529hCt implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C55173xeu OLrzqt;
    public final ConstraintLayout copydefault;
    public final C55113xdn djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final Guideline fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final RecyclerView gEmmrt;
    public final android.widget.TextView isConnected;
    public final LinearLayoutCompat valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C21529hCt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull Guideline guideline) {
        this.AhwBna = constraintLayout;
        this.copydefault = constraintLayout2;
        this.OLrzqt = c55173xeu;
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = linearLayoutCompat2;
        this.KWHzl = linearLayoutCompat3;
        this.AYXKKw = linearLayoutCompat4;
        this.valueOf = linearLayoutCompat5;
        this.djBIcL = c55113xdn;
        this.gEmmrt = recyclerView;
        this.AkhnZx = textView;
        this.DbNXlk = textView2;
        this.isConnected = textView3;
        this.values = textView4;
        this.fetchVPNInfo = textView5;
        this.fIwbmz = textView6;
        this.AuCTel = textView7;
        this.fARcdN = textView8;
        this.ejfBZ = textView9;
        this.fJNWhG = guideline;
    }

    public static C21529hCt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dIjzlO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21529hCt KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gqOnQv;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.QOjuYg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.onShuffleModeChanged;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.prepareFromMediaId;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = C23274hvD.Application.postToHandler;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat3 != null) {
                            i = C23274hvD.Application.onAudioInfoChanged;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat4 != null) {
                                i = C23274hvD.Application.getAudioAttributes;
                                LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat5 != null) {
                                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C23274hvD.Application.addOnReportDrawnListener;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C23274hvD.Application.getTabAt;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C23274hvD.Application.startActionMode;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C23274hvD.Application.onScrollStateChanged;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C23274hvD.Application.AppCompatViewInflaterDeclaredOnClickListener;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = C23274hvD.Application.LayoutIncludeDetector;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = C23274hvD.Application.DrawableContainer1;
                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    i = C23274hvD.Application.updateDensity;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView7 != null) {
                                                                        i = C23274hvD.Application.setCurrentIndex;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView8 != null) {
                                                                            i = C23274hvD.Application.getExitFadeDuration;
                                                                            android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView9 != null) {
                                                                                i = C23274hvD.Application.dispatchPopulateAccessibilityEvent;
                                                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                                if (guideline != null) {
                                                                                    return new C21529hCt((ConstraintLayout) view, constraintLayout, c55173xeu, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, c55113xdn, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, guideline);
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
