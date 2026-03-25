package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hPw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC21883hPw extends FragmentStateAdapter {
    public abstract androidx.fragment.app.Fragment KWHzl(int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC21883hPw(@NotNull MarketDetailFragment marketDetailFragment) {
        super(marketDetailFragment.getChildFragmentManager(), marketDetailFragment.getLifecycle());
        Intrinsics.checkNotNullParameter(marketDetailFragment, "");
    }
}
