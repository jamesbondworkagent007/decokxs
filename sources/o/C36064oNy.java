package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.dexkline.market.widget.time_range_selection.TimeSelectionWidget;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36064oNy implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final C34562neS AYXKKw;
    public final C34564neU AhwBna;
    public final TimeSelectionWidget AkhnZx;
    public final C34646nfy DbNXlk;
    public final AppCompatTextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final NestedScrollView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final C34629nfh fetchVPNInfo;
    public final C34553neJ gEmmrt;
    public final C34551neH valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.OLrzqt;
    }

    public C36064oNy(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull C34553neJ c34553neJ, @androidx.annotation.NonNull C34562neS c34562neS, @androidx.annotation.NonNull C34564neU c34564neU, @androidx.annotation.NonNull C34551neH c34551neH, @androidx.annotation.NonNull C34629nfh c34629nfh, @androidx.annotation.NonNull TimeSelectionWidget timeSelectionWidget, @androidx.annotation.NonNull C34646nfy c34646nfy) {
        this.OLrzqt = nestedScrollView;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = linearLayoutCompat;
        this.copydefault = appCompatTextView;
        this.EZpvd = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.gEmmrt = c34553neJ;
        this.AYXKKw = c34562neS;
        this.AhwBna = c34564neU;
        this.valueOf = c34551neH;
        this.fetchVPNInfo = c34629nfh;
        this.AkhnZx = timeSelectionWidget;
        this.DbNXlk = c34646nfy;
    }

    public static C36064oNy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.KDccX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C36064oNy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.OStAOF;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C35964oKf.StateListAnimator.zdxASf;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C35964oKf.StateListAnimator.getRemoteControlClient;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C35964oKf.StateListAnimator.isActive;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C35964oKf.StateListAnimator.release;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0;
                            C34553neJ c34553neJ = (C34553neJ) ViewBindings.findChildViewById(view, i);
                            if (c34553neJ != null) {
                                i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi21;
                                C34562neS c34562neS = (C34562neS) ViewBindings.findChildViewById(view, i);
                                if (c34562neS != null) {
                                    i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi28;
                                    C34564neU c34564neU = (C34564neU) ViewBindings.findChildViewById(view, i);
                                    if (c34564neU != null) {
                                        i = C35964oKf.StateListAnimator.onMetadataUpdate;
                                        C34551neH c34551neH = (C34551neH) ViewBindings.findChildViewById(view, i);
                                        if (c34551neH != null) {
                                            i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi21ExtraSession;
                                            C34629nfh c34629nfh = (C34629nfh) ViewBindings.findChildViewById(view, i);
                                            if (c34629nfh != null) {
                                                i = C35964oKf.StateListAnimator.sendExtras;
                                                TimeSelectionWidget timeSelectionWidget = (TimeSelectionWidget) ViewBindings.findChildViewById(view, i);
                                                if (timeSelectionWidget != null) {
                                                    i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplBase;
                                                    C34646nfy c34646nfy = (C34646nfy) ViewBindings.findChildViewById(view, i);
                                                    if (c34646nfy != null) {
                                                        return new C36064oNy((NestedScrollView) view, appCompatImageView, linearLayoutCompat, appCompatTextView, appCompatTextView2, appCompatTextView3, c34553neJ, c34562neS, c34564neU, c34551neH, c34629nfh, timeSelectionWidget, c34646nfy);
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
