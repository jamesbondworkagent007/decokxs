package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.search.features.kline.landscape.LandscapeNavSearchFragment;
import com.okinc.market.search.features.kline.landscape.delegate.LandscapeNavSearchItemClickDelegate$handleInstrumentClick$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39887qBl extends qOX {
    @Override // o.qOX, o.qPL
    public void KWHzl(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        androidx.fragment.app.DialogFragment dialogFragmentKWHzl = KWHzl();
        if (dialogFragmentKWHzl == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(dialogFragmentKWHzl)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new LandscapeNavSearchItemClickDelegate$handleInstrumentClick$1(this, bizInstrument, view, i, str, str2, str3, z, null), 3, null);
    }

    @Override // o.qOX, o.qPL
    public void AEQbTJ(@NotNull android.view.View view, @NotNull C48915ueg c48915ueg, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, InterfaceC55797xqi interfaceC55797xqi) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c48915ueg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("data", new MarketCoinInfo(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null)));
        androidx.fragment.app.DialogFragment dialogFragmentKWHzl = KWHzl();
        if (dialogFragmentKWHzl != null) {
            java.lang.String simpleName = LandscapeNavSearchFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            FragmentKt.setFragmentResult(dialogFragmentKWHzl, simpleName, bundleBundleOf);
        }
        super.AEQbTJ(view, c48915ueg, str, str2, z, interfaceC55797xqi);
    }
}
