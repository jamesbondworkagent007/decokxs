package o;

import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26550jeT {
    @yCM
    public C26550jeT() {
    }

    public final java.lang.Object OLrzqt(boolean z, @NotNull PaymentOption paymentOption, @NotNull Continuation<? super Unit> continuation) {
        SPUtils.put(z ? "sp_invest_pool_subscribe_select" : "sp_invest_pool_redeem_select", C56443yFo.AEQbTJ(paymentOption.getValue()));
        return Unit.INSTANCE;
    }
}
