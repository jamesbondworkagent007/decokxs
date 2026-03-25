package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38418pYa extends AbstractC32996moC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DsrFlB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "MarketDiscoverFeedFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String name = C34818njd.class.getName();
        if (getChildFragmentManager().findFragmentByTag(name) != null) {
            return;
        }
        getChildFragmentManager().beginTransaction().add(qZH.StateListAnimator.UscePu, new C34818njd(), name).commitAllowingStateLoss();
    }
}
