package o;

import com.okinc.business.market.features.home.domain.HomeTab;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28402kaB extends AbstractC28450kax {
    public final androidx.fragment.app.Fragment AEQbTJ;
    public final xWA EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28402kaB(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.util.List<HomeTab> list, @NotNull xWA xwa) {
        super(fragment, str, list);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(xwa, "");
        this.AEQbTJ = fragment;
        this.EZpvd = xwa;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (i == 0) {
            return copydefault();
        }
        HomeTab homeTab = (HomeTab) CollectionsKt___CollectionsKt.AkhnZx(EZpvd(), i);
        if (!Intrinsics.EZpvd((java.lang.Object) (homeTab != null ? homeTab.EZpvd() : null), (java.lang.Object) "dapp_home")) {
            return KWHzl(i);
        }
        xWA xwa = this.EZpvd;
        androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        return xwa.EZpvd(parentFragmentManager, C23274hvD.Application.zeUYeG);
    }
}
