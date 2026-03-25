package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.market.widget.time_range_selection.TimeSelectionWidget;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23461hyf implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C28010kLo AYXKKw;
    public final C28029kMg AhwBna;
    public final C28040kMr AkhnZx;
    public final TimeSelectionWidget DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final NestedScrollView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final C28024kMb fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final C28044kMv isConnected;
    public final C28034kMl valueOf;
    public final C28055kNf values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.KWHzl;
    }

    public C23461hyf(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull C28010kLo c28010kLo, @androidx.annotation.NonNull C28029kMg c28029kMg, @androidx.annotation.NonNull C28034kMl c28034kMl, @androidx.annotation.NonNull C28040kMr c28040kMr, @androidx.annotation.NonNull C28024kMb c28024kMb, @androidx.annotation.NonNull C28044kMv c28044kMv, @androidx.annotation.NonNull TimeSelectionWidget timeSelectionWidget, @androidx.annotation.NonNull C28055kNf c28055kNf) {
        this.KWHzl = nestedScrollView;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.gEmmrt = appCompatTextView3;
        this.djBIcL = appCompatTextView4;
        this.AYXKKw = c28010kLo;
        this.AhwBna = c28029kMg;
        this.valueOf = c28034kMl;
        this.AkhnZx = c28040kMr;
        this.fetchVPNInfo = c28024kMb;
        this.isConnected = c28044kMv;
        this.DbNXlk = timeSelectionWidget;
        this.values = c28055kNf;
    }

    public static C23461hyf EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.giSNqX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23461hyf OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.writeTypedObject;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.getSessionActivity;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.InspectablePropertyValueType;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.setChangingConfigurations;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C23274hvD.Application.getArrowHeadLength;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C23274hvD.Application.getArrowShaftLength;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView4 != null) {
                                i = C23274hvD.Application.setExpandedFormat;
                                C28010kLo c28010kLo = (C28010kLo) ViewBindings.findChildViewById(view, i);
                                if (c28010kLo != null) {
                                    i = C23274hvD.Application.getId;
                                    C28029kMg c28029kMg = (C28029kMg) ViewBindings.findChildViewById(view, i);
                                    if (c28029kMg != null) {
                                        i = C23274hvD.Application.getMenuView;
                                        C28034kMl c28034kMl = (C28034kMl) ViewBindings.findChildViewById(view, i);
                                        if (c28034kMl != null) {
                                            i = C23274hvD.Application.initForMenu;
                                            C28040kMr c28040kMr = (C28040kMr) ViewBindings.findChildViewById(view, i);
                                            if (c28040kMr != null) {
                                                i = C23274hvD.Application.internalClear;
                                                C28024kMb c28024kMb = (C28024kMb) ViewBindings.findChildViewById(view, i);
                                                if (c28024kMb != null) {
                                                    i = C23274hvD.Application.getSubMenuWrapper;
                                                    C28044kMv c28044kMv = (C28044kMv) ViewBindings.findChildViewById(view, i);
                                                    if (c28044kMv != null) {
                                                        i = C23274hvD.Application.createPopupWindow;
                                                        TimeSelectionWidget timeSelectionWidget = (TimeSelectionWidget) ViewBindings.findChildViewById(view, i);
                                                        if (timeSelectionWidget != null) {
                                                            i = C23274hvD.Application.findIndexOfAddedMenu;
                                                            C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
                                                            if (c28055kNf != null) {
                                                                return new C23461hyf((NestedScrollView) view, appCompatImageView, linearLayoutCompat, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, c28010kLo, c28029kMg, c28034kMl, c28040kMr, c28024kMb, c28044kMv, timeSelectionWidget, c28055kNf);
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
