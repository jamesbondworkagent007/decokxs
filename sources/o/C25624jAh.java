package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenDetailParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.business.market.domain.MarketTradeUseCase$addTokens$1;
import com.okinc.business.market.domain.MarketTradeUseCase$invoke$1;
import com.okinc.business.market.domain.MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.domain.MarketTradeUseCase$isDisplayToken$1;
import com.okinc.business.market.domain.MarketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.domain.MarketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1;
import com.okinc.business.market.domain.MarketTradeUseCase$updateTokenDisplay$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25624jAh {
    public final kKG AEQbTJ;
    public final InterfaceC27611jyU KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C25624jAh(@NotNull kKG kkg, @NotNull InterfaceC27611jyU interfaceC27611jyU, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(interfaceC27611jyU, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = kkg;
        this.KWHzl = interfaceC27611jyU;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends InterfaceC25627jAk>> continuation) throws java.lang.Throwable {
        MarketTradeUseCase$invoke$1 marketTradeUseCase$invoke$1;
        if (continuation instanceof MarketTradeUseCase$invoke$1) {
            marketTradeUseCase$invoke$1 = (MarketTradeUseCase$invoke$1) continuation;
            int i = marketTradeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketTradeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                marketTradeUseCase$invoke$1 = new MarketTradeUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketTradeUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketTradeUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 marketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            marketTradeUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, marketTradeUseCase$invoke$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, CoinDetailTradeJumpBean coinDetailTradeJumpBean, Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        MarketTradeUseCase$addTokens$1 marketTradeUseCase$addTokens$1;
        boolean z;
        if (continuation instanceof MarketTradeUseCase$addTokens$1) {
            marketTradeUseCase$addTokens$1 = (MarketTradeUseCase$addTokens$1) continuation;
            int i = marketTradeUseCase$addTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketTradeUseCase$addTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                marketTradeUseCase$addTokens$1 = new MarketTradeUseCase$addTokens$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = marketTradeUseCase$addTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketTradeUseCase$addTokens$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                DexMultiTokenInfoBean[] dexMultiTokenInfoBeanArr = new DexMultiTokenInfoBean[2];
                DexMultiTokenInfoBean fromTokenInfo = coinDetailTradeJumpBean.getFromTokenInfo();
                DexMultiTokenInfoBean dexMultiTokenInfoBean = null;
                if (fromTokenInfo == null || fromTokenInfo.isCustomCoin() || fromTokenInfo.isSubscribeCoin()) {
                    fromTokenInfo = null;
                }
                z = false;
                dexMultiTokenInfoBeanArr[0] = fromTokenInfo;
                DexMultiTokenInfoBean toTokenInfo = coinDetailTradeJumpBean.getToTokenInfo();
                if (toTokenInfo != null && !toTokenInfo.isCustomCoin() && !toTokenInfo.isSubscribeCoin()) {
                    dexMultiTokenInfoBean = toTokenInfo;
                }
                dexMultiTokenInfoBeanArr[1] = dexMultiTokenInfoBean;
                java.util.List<DexMultiTokenInfoBean> listValueOf = yDY.valueOf(dexMultiTokenInfoBeanArr);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
                for (DexMultiTokenInfoBean dexMultiTokenInfoBean2 : listValueOf) {
                    arrayList.add(new DexMultiTokenDetailParam(dexMultiTokenInfoBean2.getChainId(), dexMultiTokenInfoBean2.getOriginContractAddress(), dexMultiTokenInfoBean2.getTokenSymbol(), dexMultiTokenInfoBean2.getDecimals()));
                }
                if (!arrayList.isEmpty()) {
                    DexMultiTokenDetailReq dexMultiTokenDetailReq = new DexMultiTokenDetailReq(str, arrayList);
                    InterfaceC27611jyU interfaceC27611jyU = this.KWHzl;
                    marketTradeUseCase$addTokens$1.label = 1;
                    objKWHzl = interfaceC27611jyU.KWHzl(dexMultiTokenDetailReq, marketTradeUseCase$addTokens$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            z = !((java.util.List) ((AbstractC43419rot) objKWHzl).AEQbTJ()).isEmpty();
            return Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketTradeUseCase$updateTokenDisplay$1 marketTradeUseCase$updateTokenDisplay$1;
        if (continuation instanceof MarketTradeUseCase$updateTokenDisplay$1) {
            marketTradeUseCase$updateTokenDisplay$1 = (MarketTradeUseCase$updateTokenDisplay$1) continuation;
            int i = marketTradeUseCase$updateTokenDisplay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketTradeUseCase$updateTokenDisplay$1.label = i - Integer.MIN_VALUE;
            } else {
                marketTradeUseCase$updateTokenDisplay$1 = new MarketTradeUseCase$updateTokenDisplay$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketTradeUseCase$updateTokenDisplay$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketTradeUseCase$updateTokenDisplay$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MarketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1 marketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1 = new MarketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1(null, this, z);
            marketTradeUseCase$updateTokenDisplay$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketTradeUseCase$updateTokenDisplay$$inlined$dexRunCatching$1, marketTradeUseCase$updateTokenDisplay$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        MarketTradeUseCase$isDisplayToken$1 marketTradeUseCase$isDisplayToken$1;
        if (continuation instanceof MarketTradeUseCase$isDisplayToken$1) {
            marketTradeUseCase$isDisplayToken$1 = (MarketTradeUseCase$isDisplayToken$1) continuation;
            int i = marketTradeUseCase$isDisplayToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketTradeUseCase$isDisplayToken$1.label = i - Integer.MIN_VALUE;
            } else {
                marketTradeUseCase$isDisplayToken$1 = new MarketTradeUseCase$isDisplayToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketTradeUseCase$isDisplayToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketTradeUseCase$isDisplayToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MarketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1 marketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1 = new MarketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1(null, this);
            marketTradeUseCase$isDisplayToken$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketTradeUseCase$isDisplayTokenIoAF18A$$inlined$dexRunCatching$1, marketTradeUseCase$isDisplayToken$1);
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
}
