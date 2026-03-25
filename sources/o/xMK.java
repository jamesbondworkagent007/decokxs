package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateReq;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse;
import com.okinc.unify_trade.net.BizApiService;
import com.okinc.unify_trade.trade.common.ExchangeRateManager$fetchExchangeRateAsync$1;
import com.okinc.unify_trade.trade.common.ExchangeRateManager$getExchangeRateFromCache$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMK {
    public static final xMK EZpvd = new xMK();
    public static ExchangeRateResponse AEQbTJ = new ExchangeRateResponse("₮", "USDT", 2, "1f");
    public static final int OLrzqt = 8;

    private xMK() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ExchangeRateResponse> continuation) throws java.lang.Throwable {
        ExchangeRateManager$fetchExchangeRateAsync$1 exchangeRateManager$fetchExchangeRateAsync$1;
        AbstractC43419rot actionBar;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ExchangeRateManager$fetchExchangeRateAsync$1) {
            exchangeRateManager$fetchExchangeRateAsync$1 = (ExchangeRateManager$fetchExchangeRateAsync$1) continuation;
            int i = exchangeRateManager$fetchExchangeRateAsync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exchangeRateManager$fetchExchangeRateAsync$1.label = i - Integer.MIN_VALUE;
            } else {
                exchangeRateManager$fetchExchangeRateAsync$1 = new ExchangeRateManager$fetchExchangeRateAsync$1(this, continuation);
            }
        }
        java.lang.Object objFetchCurrencyExchangeRate = exchangeRateManager$fetchExchangeRateAsync$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = exchangeRateManager$fetchExchangeRateAsync$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objFetchCurrencyExchangeRate);
                    Result.Application application = Result.Companion;
                    BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
                    ExchangeRateReq exchangeRateReq = new ExchangeRateReq(str, str2);
                    exchangeRateManager$fetchExchangeRateAsync$1.label = 1;
                    objFetchCurrencyExchangeRate = bizApiService.fetchCurrencyExchangeRate(exchangeRateReq, exchangeRateManager$fetchExchangeRateAsync$1);
                    if (objFetchCurrencyExchangeRate == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objFetchCurrencyExchangeRate);
                }
                ResponseData responseData = (ResponseData) objFetchCurrencyExchangeRate;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            ExchangeRateResponse exchangeRateResponse = (ExchangeRateResponse) actionBar.AEQbTJ();
            AEQbTJ = exchangeRateResponse;
            objM7377constructorimpl = Result.m7377constructorimpl(exchangeRateResponse);
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ExchangeRateResponse> continuation) throws java.lang.Throwable {
        ExchangeRateManager$getExchangeRateFromCache$1 exchangeRateManager$getExchangeRateFromCache$1;
        if (continuation instanceof ExchangeRateManager$getExchangeRateFromCache$1) {
            exchangeRateManager$getExchangeRateFromCache$1 = (ExchangeRateManager$getExchangeRateFromCache$1) continuation;
            int i = exchangeRateManager$getExchangeRateFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exchangeRateManager$getExchangeRateFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                exchangeRateManager$getExchangeRateFromCache$1 = new ExchangeRateManager$getExchangeRateFromCache$1(this, continuation);
            }
        }
        java.lang.Object obj = exchangeRateManager$getExchangeRateFromCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = exchangeRateManager$getExchangeRateFromCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd((java.lang.Object) AEQbTJ.getTargetCcy(), (java.lang.Object) str2)) {
                return AEQbTJ;
            }
            exchangeRateManager$getExchangeRateFromCache$1.label = 1;
            if (AEQbTJ(str, str2, exchangeRateManager$getExchangeRateFromCache$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return null;
    }
}
