package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.okinc.buysell.analytics.PaymentsBannerTrackerAttrType;
import com.okinc.buysell.view.LegacyBuySellHeader;
import com.okinc.core.util.SPUtils;
import com.okinc.okx.paymentapi.service.SupportBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lzN<T extends ViewDataBinding> extends AbstractC32996moC {
    public T AEQbTJ;
    public android.view.View AhwBna;
    public final int EZpvd;
    public boolean KWHzl;
    public LegacyBuySellHeader valueOf;
    public final C58216yxB copydefault = new C58216yxB();
    public boolean OLrzqt = true;

    public abstract void AYXKKw();

    public abstract boolean AhwBna();

    public abstract void EZpvd();

    public abstract lzT OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(LegacyBuySellHeader legacyBuySellHeader) {
        this.valueOf = legacyBuySellHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.AEQbTJ = t;
    }

    public abstract void djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB valueOf() {
        return this.copydefault;
    }

    public boolean values() {
        return true;
    }

    public lzN(@androidx.annotation.LayoutRes int i) {
        this.EZpvd = i;
    }

    public final T KWHzl() {
        T t = this.AEQbTJ;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(boolean z) {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        copydefault(DataBindingUtil.inflate(layoutInflater, getLayoutId(), viewGroup, false));
        android.view.View root = KWHzl().getRoot();
        this.AhwBna = root;
        if (root == null) {
            Intrinsics.gEmmrt("");
            root = null;
        }
        root.setClickable(true);
        android.view.View view = this.AhwBna;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setFocusable(true);
        android.view.View view2 = this.AhwBna;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = getActivity();
        lzF lzf = activity instanceof lzF ? (lzF) activity : null;
        this.valueOf = lzf != null ? lzf.OLrzqt() : null;
        AYXKKw();
        AEQbTJ();
        EZpvd();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (values()) {
            lzT.runBannerCheck$default(OLrzqt(), AhwBna() && this.OLrzqt, false, 2, null);
        }
        if (this.OLrzqt) {
            this.OLrzqt = false;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        OLrzqt().DbNXlk();
    }

    public final void AEQbTJ() {
        lzT lztOLrzqt = OLrzqt();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAYXKKw = lztOLrzqt.AYXKKw();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAYXKKw, viewLifecycleOwner, new Function1() { // from class: o.lzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lzN.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(lzN lzn, boolean z) {
        java.util.List<SupportBanner> listDjBIcL = lzn.OLrzqt().djBIcL();
        if (listDjBIcL != null) {
            showAnnouncementBannersV2$default(lzn, listDjBIcL, 0, 2, null);
            if (C33129mqd.KWHzl((java.util.Collection) listDjBIcL)) {
                lzn.OLrzqt().OLrzqt(lzn.OLrzqt().valueOf());
            } else {
                lzn.gEmmrt();
                lzn.OLrzqt().DbNXlk();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showAnnouncementBannersV2$default(lzN lzn, java.util.List list, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAnnouncementBannersV2");
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.EZpvd;
        }
        lzn.AEQbTJ((java.util.List<SupportBanner>) list, i);
    }

    public void AEQbTJ(@NotNull java.util.List<SupportBanner> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        LegacyBuySellHeader legacyBuySellHeader = this.valueOf;
        if (legacyBuySellHeader != null) {
            legacyBuySellHeader.AEQbTJ(i, OLrzqt().AEQbTJ(), list, new Function1() { // from class: o.lzM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lzN.EZpvd(this.AEQbTJ, (java.lang.Integer) obj);
                }
            }, new Function1() { // from class: o.lzO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lzN.copydefault(this.KWHzl, (java.util.List) obj);
                }
            }, new Function0() { // from class: o.lzP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lzN.KWHzl(this.copydefault);
                }
            }, new Function1() { // from class: o.lzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lzN.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit copydefault(lzN lzn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        lzn.OLrzqt().EZpvd(list);
        lzT.trackBannerV2Event$default(lzn.OLrzqt(), PaymentsBannerTrackerAttrType.BANNER_V2_OK_BUTTON_CLICK, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lzN lzn) {
        lzT.trackBannerV2Event$default(lzn.OLrzqt(), PaymentsBannerTrackerAttrType.PILL_BUTTON_CLICK, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lzN lzn, java.lang.Integer num) {
        lzn.OLrzqt().OLrzqt(PaymentsBannerTrackerAttrType.CTA_BUTTON_BANNER, num);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lzN lzn, boolean z) {
        if (z) {
            lzT.trackBannerV2Event$default(lzn.OLrzqt(), PaymentsBannerTrackerAttrType.PILL_BUTTON_VIEW, null, 2, null);
        } else {
            lzT.trackBannerV2Event$default(lzn.OLrzqt(), PaymentsBannerTrackerAttrType.PILL_BUTTON_VIEW_HIDDEN, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public void gEmmrt() {
        LegacyBuySellHeader legacyBuySellHeader = this.valueOf;
        if (legacyBuySellHeader != null) {
            legacyBuySellHeader.KWHzl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.view.View view = this.AhwBna;
        if (view != null) {
            if (view == null) {
                Intrinsics.gEmmrt("");
                view = null;
            }
            if (view.getParent() != null) {
                android.view.View view2 = this.AhwBna;
                if (view2 == null) {
                    Intrinsics.gEmmrt("");
                    view2 = null;
                }
                android.view.ViewParent parent = view2.getParent();
                Intrinsics.copydefault(parent, "");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                android.view.View view3 = this.AhwBna;
                if (view3 == null) {
                    Intrinsics.gEmmrt("");
                    view3 = null;
                }
                viewGroup.removeView(view3);
            }
        }
        KWHzl().unbind();
        this.copydefault.OLrzqt();
        this.valueOf = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.copydefault.dispose();
        super.onDestroy();
    }

    public final boolean DbNXlk() {
        return SPUtils.getBoolean("bsc_transfer_page_show_margin_balance_reminder", true);
    }
}
