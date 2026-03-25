package o;

import com.okinc.business.market.market.MarketContainerFragment;
import kotlin.jvm.internal.Intrinsics;
import o.kFE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kEX extends MarketContainerFragment {
    @Override // com.okinc.business.market.market.MarketContainerFragment
    public void EZpvd() {
    }

    @Override // com.okinc.business.market.market.MarketContainerFragment
    public androidx.fragment.app.Fragment EZpvd(@NotNull pWN pwn) {
        Intrinsics.checkNotNullParameter(pwn, "");
        return kFE.Activity.getFragmentByFirstGroupDataCR$default(kFE.Companion, pwn, false, 2, null);
    }

    @Override // com.okinc.business.market.market.MarketContainerFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        EZpvd(false);
    }
}
