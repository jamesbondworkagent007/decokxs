package com.okinc.business.trade.features.home.ui.viewmodel;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C23212htv;
import o.C56424yEw;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeConfirmOrderViewModel extends AbstractC33073mpa {
    public final C23212htv KWHzl;

    @yCM
    public TradeConfirmOrderViewModel(@NotNull C23212htv c23212htv) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        this.KWHzl = c23212htv;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.viewmodel.TradeConfirmOrderViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReferralCodeApplyPanel$default(TradeConfirmOrderViewModel tradeConfirmOrderViewModel, Context context, String str, Map map, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        tradeConfirmOrderViewModel.KWHzl(context, str, map, function1);
    }

    public final void KWHzl(@NotNull Context context, @NotNull String str, @NotNull Map<String, String> map, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl.OLrzqt(context, str, map, function1);
    }

    public final boolean EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.KWHzl(str, true);
    }
}
