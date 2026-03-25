package o;

import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedLimitOrderRepoImpl$getLimitPairRate$1;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedLimitOrderRepoImpl$getLimitPairRate$2;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28155kQy implements InterfaceC28153kQw {
    public final InterfaceC23225huH copydefault;

    @yCM
    public C28155kQy(@NotNull InterfaceC23225huH interfaceC23225huH) {
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        this.copydefault = interfaceC23225huH;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull LimitPairRateRequest limitPairRateRequest, @NotNull Continuation<? super AbstractC43419rot<TokenPairRateQuote, OKServerException>> continuation) throws java.lang.Throwable {
        AdvancedLimitOrderRepoImpl$getLimitPairRate$1 advancedLimitOrderRepoImpl$getLimitPairRate$1;
        if (continuation instanceof AdvancedLimitOrderRepoImpl$getLimitPairRate$1) {
            advancedLimitOrderRepoImpl$getLimitPairRate$1 = (AdvancedLimitOrderRepoImpl$getLimitPairRate$1) continuation;
            int i = advancedLimitOrderRepoImpl$getLimitPairRate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedLimitOrderRepoImpl$getLimitPairRate$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedLimitOrderRepoImpl$getLimitPairRate$1 = new AdvancedLimitOrderRepoImpl$getLimitPairRate$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = advancedLimitOrderRepoImpl$getLimitPairRate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedLimitOrderRepoImpl$getLimitPairRate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AdvancedLimitOrderRepoImpl$getLimitPairRate$2 advancedLimitOrderRepoImpl$getLimitPairRate$2 = new AdvancedLimitOrderRepoImpl$getLimitPairRate$2(this, limitPairRateRequest, null);
            advancedLimitOrderRepoImpl$getLimitPairRate$1.label = 1;
            objEZpvd = kAB.EZpvd(advancedLimitOrderRepoImpl$getLimitPairRate$2, advancedLimitOrderRepoImpl$getLimitPairRate$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(gYT.EZpvd((LimitPairRateResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
