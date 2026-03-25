package o;

import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.presenter.MarketPlaceCreateBotPresenter;
import com.okinc.unify_trade.biz.MpCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51408vmU extends AbstractC54119wyO<uUX, MarketPlaceCreateBotPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final int OLrzqt = C48033uCm.Activity.getAdvertisingId;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.vmU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vmU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C51408vmU AEQbTJ(@NotNull MpCategory mpCategory) {
            Intrinsics.checkNotNullParameter(mpCategory, "");
            C51408vmU c51408vmU = new C51408vmU();
            c51408vmU.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_category_type", mpCategory)));
            return c51408vmU;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC54119wyO, o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.copydefault.register(C51938vwU.class, new C51483vnq());
        RecyclerView recyclerView = ((uUX) gGvvIC()).EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        recyclerView.setAdapter(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww
    public void bt_() {
        MpCategory mpCategory;
        super.bt_();
        MarketPlaceCreateBotPresenter marketPlaceCreateBotPresenter = (MarketPlaceCreateBotPresenter) dxcTrN();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (mpCategory = (MpCategory) arguments.getParcelable("bot_category_type")) == null) {
            mpCategory = new MpCategory(null, null, null, 7, null);
        }
        marketPlaceCreateBotPresenter.copydefault(mpCategory);
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) ((MarketPlaceCreateBotPresenter) dxcTrN()).AEQbTJ());
        ((uUX) gGvvIC()).EZpvd.post(new java.lang.Runnable() { // from class: o.vmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51408vmU.AEQbTJ(this.copydefault);
            }
        });
        djBIcL();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C51408vmU c51408vmU) {
        c51408vmU.copydefault();
        c51408vmU.EZpvd(((MarketPlaceCreateBotPresenter) c51408vmU.dxcTrN()).KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        getParentFragmentManager().setFragmentResultListener("bot_category_fold" + ((MarketPlaceCreateBotPresenter) dxcTrN()).copydefault().getName(), getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51408vmU.OLrzqt(this.KWHzl, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(C51408vmU c51408vmU, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c51408vmU.EZpvd(bundle.getBoolean("bot_category_state") ? -2 : ((MarketPlaceCreateBotPresenter) c51408vmU.dxcTrN()).KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        int itemCount;
        if (((MarketPlaceCreateBotPresenter) dxcTrN()).KWHzl() != 0 || (itemCount = this.copydefault.getItemCount()) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i < 1) {
                android.view.View childAt = ((uUX) gGvvIC()).EZpvd.getChildAt(i);
                int measuredHeight = childAt != null ? childAt.getMeasuredHeight() : 0;
                MarketPlaceCreateBotPresenter marketPlaceCreateBotPresenter = (MarketPlaceCreateBotPresenter) dxcTrN();
                marketPlaceCreateBotPresenter.copydefault(marketPlaceCreateBotPresenter.KWHzl() + measuredHeight);
            }
            if (i == itemCount) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(int i) {
        RecyclerView recyclerView = ((uUX) gGvvIC()).EZpvd;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = i;
        recyclerView.setLayoutParams(marginLayoutParams);
    }
}
