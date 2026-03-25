package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitTeeLimitOrderUseCase$createOrder$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRL {
    public final C19745gNt AEQbTJ;
    public final C30786lhi EZpvd;

    @yCM
    public kRL(@NotNull C19745gNt c19745gNt, @NotNull C30786lhi c30786lhi) {
        Intrinsics.checkNotNullParameter(c19745gNt, "");
        Intrinsics.checkNotNullParameter(c30786lhi, "");
        this.AEQbTJ = c19745gNt;
        this.EZpvd = c30786lhi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(TokenPairRateQuote tokenPairRateQuote, C30808liD c30808liD, java.util.List<java.lang.String> list, @NotNull C28222kTk c28222kTk, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AdvancedTradeType advancedTradeType, boolean z, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z2, @NotNull Continuation<? super Result<LimitOrderDetailBean>> continuation) throws java.lang.Throwable {
        AdvancedSubmitTeeLimitOrderUseCase$createOrder$1 advancedSubmitTeeLimitOrderUseCase$createOrder$1;
        if (continuation instanceof AdvancedSubmitTeeLimitOrderUseCase$createOrder$1) {
            advancedSubmitTeeLimitOrderUseCase$createOrder$1 = (AdvancedSubmitTeeLimitOrderUseCase$createOrder$1) continuation;
            int i = advancedSubmitTeeLimitOrderUseCase$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedSubmitTeeLimitOrderUseCase$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedSubmitTeeLimitOrderUseCase$createOrder$1 = new AdvancedSubmitTeeLimitOrderUseCase$createOrder$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedSubmitTeeLimitOrderUseCase$createOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedSubmitTeeLimitOrderUseCase$createOrder$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        if (tokenPairRateQuote == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("Quote can not be null")));
        }
        if (c30808liD == null) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("Setting can not be null")));
        }
        TeeLimitPlaceOrderParams teeLimitPlaceOrderParamsOLrzqt = this.EZpvd.OLrzqt(tokenPairRateQuote, c30808liD, advancedTradeType, str, str2, c28222kTk, list, z2, z);
        C19745gNt c19745gNt = this.AEQbTJ;
        advancedSubmitTeeLimitOrderUseCase$createOrder$1.label = 1;
        java.lang.Object objKWHzl = c19745gNt.KWHzl(teeLimitPlaceOrderParamsOLrzqt, fragmentActivity, taskDescription, advancedSubmitTeeLimitOrderUseCase$createOrder$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
