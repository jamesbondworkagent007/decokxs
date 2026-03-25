package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotFragmentV2$initView$1$onTabSelected$1;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotFragmentV2$jumpToDeeplinkTab$1;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotFragmentV2$onViewCreated$2;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotFragmentV2$showChargeGroupFilterDialog$1;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotGroupViewModel;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41242qnC extends AbstractC41279qnn {
    @Override // o.C41285qnt
    public java.util.List<CategoryGroupVo> EZpvd(@NotNull java.util.List<CategoryGroupVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CategoryGroupVo.Companion.copydefault(list, false);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        collectLatestOnLifecycle(AYXKKw(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotFragmentV2$onViewCreated$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverSpotGroupViewModel.Application) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverSpotGroupViewModel.Application) obj).KWHzl((String) obj2);
            }
        }, Lifecycle.State.RESUMED, new MarketDiscoverSpotFragmentV2$onViewCreated$2(this, null));
    }

    /* JADX INFO: renamed from: o.qnC$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C41242qnC.this), null, null, new MarketDiscoverSpotFragmentV2$initView$1$onTabSelected$1(C41242qnC.this, tab, null), 3, null);
        }
    }

    @Override // o.C41285qnt, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55244xgL c55244xgL;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42769rcf c42769rcfGEmmrt = gEmmrt();
        if (c42769rcfGEmmrt == null || (c55244xgL = c42769rcfGEmmrt.EZpvd) == null) {
            return;
        }
        c55244xgL.copydefault(new TaskDescription());
    }

    @Override // o.C41285qnt
    public void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketDiscoverSpotFragmentV2$showChargeGroupFilterDialog$1(this, null), 3, null);
    }

    @Override // o.C41285qnt
    public void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverSpotFragmentV2$jumpToDeeplinkTab$1(this, null), 3, null);
    }
}
