package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesFragmentV2$initView$1$onTabSelected$1;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesFragmentV2$jumpToDeeplinkTab$1;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesFragmentV2$onViewCreated$2;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesFragmentV2$showFuturesFilterDialog$1;
import com.okinc.market.discover.features.markets.sub.futures.viewmodel.MarketDiscoverFuturesGroupViewModel;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qcN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40670qcN extends C40663qcG implements InterfaceC49363unD {
    @Override // o.C40663qcG
    public java.util.List<CategoryGroupVo> OLrzqt(@NotNull java.util.List<CategoryGroupVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CategoryGroupVo.Companion.copydefault(list, true);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        collectLatestOnLifecycle(EZpvd(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesFragmentV2$onViewCreated$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverFuturesGroupViewModel.Activity) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverFuturesGroupViewModel.Activity) obj).copydefault((String) obj2);
            }
        }, Lifecycle.State.RESUMED, new MarketDiscoverFuturesFragmentV2$onViewCreated$2(this, null));
    }

    /* JADX INFO: renamed from: o.qcN$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C40670qcN.this), null, null, new MarketDiscoverFuturesFragmentV2$initView$1$onTabSelected$1(C40670qcN.this, tab, null), 3, null);
        }
    }

    @Override // o.C40663qcG, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55244xgL c55244xgL;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42704rbT c42704rbTAEQbTJ = AEQbTJ();
        if (c42704rbTAEQbTJ == null || (c55244xgL = c42704rbTAEQbTJ.AEQbTJ) == null) {
            return;
        }
        c55244xgL.copydefault(new StateListAnimator());
    }

    @Override // o.C40663qcG
    public void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketDiscoverFuturesFragmentV2$showFuturesFilterDialog$1(this, null), 3, null);
    }

    @Override // o.C40663qcG
    public void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverFuturesFragmentV2$jumpToDeeplinkTab$1(this, null), 3, null);
    }
}
