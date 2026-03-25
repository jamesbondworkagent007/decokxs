package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21487hBe implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final RecyclerView AhwBna;
    public final C54989xbV AkhnZx;
    public final C22227hbQ EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final Barrier OLrzqt;
    public final android.widget.HorizontalScrollView copydefault;
    public final C33603mza djBIcL;
    public final C33546myW gEmmrt;
    public final C54989xbV isConnected;
    public final OKReminder valueOf;
    public final C54989xbV values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C21487hBe(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull C22227hbQ c22227hbQ, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull C54989xbV c54989xbV3) {
        this.AYXKKw = constraintLayout;
        this.OLrzqt = barrier;
        this.KWHzl = linearLayout;
        this.copydefault = horizontalScrollView;
        this.EZpvd = c22227hbQ;
        this.AEQbTJ = c55113xdn;
        this.valueOf = oKReminder;
        this.djBIcL = c33603mza;
        this.AhwBna = recyclerView;
        this.gEmmrt = c33546myW;
        this.values = c54989xbV;
        this.AkhnZx = c54989xbV2;
        this.isConnected = c54989xbV3;
    }

    public static C21487hBe AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.awiJhF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21487hBe KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QkdxfA;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.sEAkxl;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.DPVBvL;
                android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                if (horizontalScrollView != null) {
                    i = C23274hvD.Application.MediaBrowserCompatConnectionCallback;
                    C22227hbQ c22227hbQ = (C22227hbQ) ViewBindings.findChildViewById(view, i);
                    if (c22227hbQ != null) {
                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.addOnConfigurationChangedListener;
                            OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                            if (oKReminder != null) {
                                i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                if (c33603mza != null) {
                                    i = C23274hvD.Application.onDraw;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = C23274hvD.Application.getLauncher;
                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                        if (c33546myW != null) {
                                            i = C23274hvD.Application.manageScrollIndicators;
                                            C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                            if (c54989xbV != null) {
                                                i = C23274hvD.Application.centerButton;
                                                C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                if (c54989xbV2 != null) {
                                                    i = C23274hvD.Application.setScrollIndicators;
                                                    C54989xbV c54989xbV3 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                    if (c54989xbV3 != null) {
                                                        return new C21487hBe((ConstraintLayout) view, barrier, linearLayout, horizontalScrollView, c22227hbQ, c55113xdn, oKReminder, c33603mza, recyclerView, c33546myW, c54989xbV, c54989xbV2, c54989xbV3);
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
