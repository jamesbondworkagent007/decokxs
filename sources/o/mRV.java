package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class mRV extends FragmentStateAdapter {
    public abstract androidx.fragment.app.Fragment copydefault(int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mRV(@NotNull DexMarketDetailFragment dexMarketDetailFragment) {
        super(dexMarketDetailFragment.getChildFragmentManager(), dexMarketDetailFragment.getLifecycle());
        Intrinsics.checkNotNullParameter(dexMarketDetailFragment, "");
    }
}
