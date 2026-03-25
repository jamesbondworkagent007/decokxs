package com.okinc.kline.ui.bot;

import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.data.BotPendingLineVo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC39006pkE;
import o.C39031pkd;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineBotViewModel extends AbstractC39006pkE {
    public final C39031pkd AEQbTJ;

    @yCM
    public KlineBotViewModel(@NotNull C39031pkd c39031pkd) {
        Intrinsics.checkNotNullParameter(c39031pkd, "");
        this.AEQbTJ = c39031pkd;
    }

    public final Object EZpvd(@NotNull IBotOrdersDataBean iBotOrdersDataBean, @NotNull Continuation<? super BotPendingLineVo> continuation) {
        return this.AEQbTJ.EZpvd(iBotOrdersDataBean, continuation);
    }
}
