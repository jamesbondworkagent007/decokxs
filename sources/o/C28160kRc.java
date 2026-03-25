package o;

import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedLimitRateUseCase$getLimitPairRate$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28160kRc {
    public final InterfaceC28153kQw AEQbTJ;
    public final C23212htv EZpvd;
    public final C30780lhc KWHzl;
    public final gYO OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C28196kSl djBIcL;

    @yCM
    public C28160kRc(@NotNull InterfaceC28153kQw interfaceC28153kQw, @NotNull gYO gyo, @NotNull C28196kSl c28196kSl, @NotNull C30780lhc c30780lhc, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28153kQw, "");
        Intrinsics.checkNotNullParameter(gyo, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c30780lhc, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC28153kQw;
        this.OLrzqt = gyo;
        this.djBIcL = c28196kSl;
        this.KWHzl = c30780lhc;
        this.EZpvd = c23212htv;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull LimitPairRateRequest limitPairRateRequest, @NotNull Continuation<? super Result<TokenPairRateQuote>> continuation) {
        AdvancedLimitRateUseCase$getLimitPairRate$1 advancedLimitRateUseCase$getLimitPairRate$1;
        if (continuation instanceof AdvancedLimitRateUseCase$getLimitPairRate$1) {
            advancedLimitRateUseCase$getLimitPairRate$1 = (AdvancedLimitRateUseCase$getLimitPairRate$1) continuation;
            int i = advancedLimitRateUseCase$getLimitPairRate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedLimitRateUseCase$getLimitPairRate$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedLimitRateUseCase$getLimitPairRate$1 = new AdvancedLimitRateUseCase$getLimitPairRate$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedLimitRateUseCase$getLimitPairRate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedLimitRateUseCase$getLimitPairRate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1 advancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1 = new AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1(null, this, limitPairRateRequest);
            advancedLimitRateUseCase$getLimitPairRate$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1, advancedLimitRateUseCase$getLimitPairRate$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final AdvancedQuoteResponse OLrzqt(@NotNull TokenPairRateQuote tokenPairRateQuote, @NotNull java.lang.String str, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(tokenPairRateQuote, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        return this.KWHzl.AEQbTJ(tokenPairRateQuote, str, advancedTradeType);
    }

    public final C30457lbX EZpvd(AdvancedQuoteResponse advancedQuoteResponse, @NotNull AdvancedTradeType advancedTradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return this.KWHzl.copydefault(advancedQuoteResponse, advancedTradeType, str, str2, str3, str4, str5, z, dexMultiTokenInfoBean);
    }
}
