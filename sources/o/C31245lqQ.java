package o;

import com.okinc.business.web3pay.lib.core.network.ws.TokenPriceSubResponse;
import com.okinc.business.web3pay.lib.features.coinprice.CoinPriceRepositoryImpl$getCoinPrice$1;
import com.okinc.business.web3pay.lib.features.coinprice.CoinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.coinprice.model.CoinPrice;
import com.okinc.business.web3pay.lib.features.coinprice.model.CoinPriceInfo;
import com.okinc.business.web3pay.lib.features.coinprice.model.CoinPriceRequest;
import com.okinc.business.web3pay.lib.features.coinprice.model.TokenCoinTypeNoInfo;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31245lqQ {
    public final InterfaceC31239lqK EZpvd;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Result<? extends java.util.ArrayList<CoinPriceInfo>>> continuation) {
        CoinPriceRepositoryImpl$getCoinPrice$1 coinPriceRepositoryImpl$getCoinPrice$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof CoinPriceRepositoryImpl$getCoinPrice$1) {
            coinPriceRepositoryImpl$getCoinPrice$1 = (CoinPriceRepositoryImpl$getCoinPrice$1) continuation;
            int i = coinPriceRepositoryImpl$getCoinPrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinPriceRepositoryImpl$getCoinPrice$1.label = i - Integer.MIN_VALUE;
            } else {
                coinPriceRepositoryImpl$getCoinPrice$1 = new CoinPriceRepositoryImpl$getCoinPrice$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = coinPriceRepositoryImpl$getCoinPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinPriceRepositoryImpl$getCoinPrice$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31239lqK interfaceC31239lqK = this.EZpvd;
                CoinPriceRequest coinPriceRequest = new CoinPriceRequest(set);
                coinPriceRepositoryImpl$getCoinPrice$1.label = 1;
                objEZpvd = interfaceC31239lqK.EZpvd(coinPriceRequest, coinPriceRepositoryImpl$getCoinPrice$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                java.util.List<TokenCoinTypeNoInfo> priceDTOList = ((CoinPrice) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()).getPriceDTOList();
                if (priceDTOList.isEmpty()) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("empty priceDTOList")));
                }
                Result.Application application2 = Result.Companion;
                java.util.ArrayList arrayList = new java.util.ArrayList(priceDTOList.size());
                for (TokenCoinTypeNoInfo tokenCoinTypeNoInfo : priceDTOList) {
                    arrayList.add(new CoinPriceInfo(tokenCoinTypeNoInfo.getPrice().length() > 0, tokenCoinTypeNoInfo.getPrice(), tokenCoinTypeNoInfo.getTokenCoinTypeNo()));
                }
                return Result.m7377constructorimpl(arrayList);
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX INFO: renamed from: o.lqQ$Activity */
    public static final class Activity implements Flow<CoinPriceInfo> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.lqQ$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                CoinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1 coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1;
                if (continuation instanceof CoinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1) {
                    coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1 = (CoinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1) continuation;
                    int i = coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1 = new CoinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    TokenPriceSubResponse tokenPriceSubResponse = (TokenPriceSubResponse) obj;
                    CoinPriceInfo coinPriceInfo = new CoinPriceInfo(tokenPriceSubResponse.getPrice().length() > 0, tokenPriceSubResponse.getPrice(), tokenPriceSubResponse.getTokenCoinTypeNo());
                    coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(coinPriceInfo, coinPriceRepositoryImpl$registerCoinPrice$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CoinPriceInfo> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
