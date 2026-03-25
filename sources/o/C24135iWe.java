package o;

import com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24135iWe {
    public static final InvestOrderDetailsState AEQbTJ(@NotNull InvestOrderDetailsState investOrderDetailsState) {
        Intrinsics.checkNotNullParameter(investOrderDetailsState, "");
        return InvestOrderDetailsState.copy$default(investOrderDetailsState, true, null, null, 6, null);
    }

    public static final InvestOrderDetailsState copydefault(@NotNull InvestOrderDetailsState investOrderDetailsState, @NotNull InvestOrderDetailsState.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(investOrderDetailsState, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        return InvestOrderDetailsState.copy$default(investOrderDetailsState, false, null, actionBar, 2, null);
    }
}
