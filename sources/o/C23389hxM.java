package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23389hxM implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final jEN AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C33546myW AkhnZx;
    public final OKSortTextView AuCTel;
    public final RecyclerView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final OKAlertBanner OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C55113xdn djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final FragmentContainerView gEmmrt;
    public final android.widget.TextView isConnected;
    public final C55173xeu valueOf;
    public final C33603mza values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public C23389hxM(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull jEN jen, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull OKSortTextView oKSortTextView) {
        this.fetchVPNInfo = linearLayout;
        this.KWHzl = constraintLayout;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = oKAlertBanner;
        this.AEQbTJ = c52794wYp;
        this.copydefault = linearLayout2;
        this.valueOf = c55173xeu;
        this.gEmmrt = fragmentContainerView;
        this.AYXKKw = jen;
        this.djBIcL = c55113xdn;
        this.AhwBna = textView;
        this.DbNXlk = recyclerView;
        this.values = c33603mza;
        this.AkhnZx = c33546myW;
        this.isConnected = textView2;
        this.ejfBZ = textView3;
        this.AuCTel = oKSortTextView;
    }

    public static C23389hxM OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C23389hxM EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DTwDnp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23389hxM KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fvQaOB;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.accept;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.OqFWZa;
                OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
                if (oKAlertBanner != null) {
                    i = C23274hvD.Application.KDccX;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null) {
                        i = C23274hvD.Application.pauseLocationServices;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.sZqaRl;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C23274hvD.Application.iOIMNp;
                                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                if (fragmentContainerView != null) {
                                    i = C23274hvD.Application.adwzgZ;
                                    jEN jen = (jEN) ViewBindings.findChildViewById(view, i);
                                    if (jen != null) {
                                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                        if (c55113xdn != null) {
                                            i = C23274hvD.Application.onAddQueueItem;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C23274hvD.Application.ComponentActivity;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                    if (c33603mza != null) {
                                                        i = C23274hvD.Application.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose2;
                                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                        if (c33546myW != null) {
                                                            i = C23274hvD.Application.getCREATORannotations;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = C23274hvD.Application.updateState;
                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = C23274hvD.Application.isStateValid;
                                                                    OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oKSortTextView != null) {
                                                                        return new C23389hxM((android.widget.LinearLayout) view, constraintLayout, appCompatImageView, oKAlertBanner, c52794wYp, linearLayout, c55173xeu, fragmentContainerView, jen, c55113xdn, textView, recyclerView, c33603mza, c33546myW, textView2, textView3, oKSortTextView);
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
