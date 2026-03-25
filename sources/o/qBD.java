package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qBD extends AbstractC39893qBr {
    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment
    public void OLrzqt() {
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment
    public void OLrzqt(boolean z) {
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment
    public CategoryGroupVo KWHzl() {
        return CategoryGroupVo.Companion.KWHzl();
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        qSI qsi;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42753rcP c42753rcPGEmmrt = gEmmrt();
        if (c42753rcPGEmmrt == null || (qsi = c42753rcPGEmmrt.valueOf) == null) {
            return;
        }
        qsi.setVisibility(8);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33014moU
    public void onRefreshCompleted(@NotNull java.lang.Object obj) {
        qSI qsi;
        Intrinsics.checkNotNullParameter(obj, "");
        super.onRefreshCompleted(obj);
        C42753rcP c42753rcPGEmmrt = gEmmrt();
        if (c42753rcPGEmmrt == null || (qsi = c42753rcPGEmmrt.valueOf) == null) {
            return;
        }
        qsi.setVisibility(8);
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
