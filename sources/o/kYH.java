package o;

import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.trade.features.home.tokenlist.data.repo.TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kYH implements kYE {
    public final InterfaceC28372kYz AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC28370kYx copydefault;

    public kYH(@NotNull InterfaceC28372kYz interfaceC28372kYz, @NotNull InterfaceC28370kYx interfaceC28370kYx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28372kYz, "");
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC28372kYz;
        this.copydefault = interfaceC28370kYx;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.kYE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MemeCurrencyBean>, OKServerException>> continuation) throws java.lang.Throwable {
        TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1 tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1;
        if (continuation instanceof TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1) {
            tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1 = (TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1) continuation;
            int i = tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1 = new TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1(this, continuation);
            }
        }
        TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1 tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$12 = tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$1;
        java.lang.Object objWithContext = tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1 tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1 = new TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1(null, this, str, str2, num, str3);
                tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1, tokenListRepositoryImpl$getCopyTradingCurrencyTokenList$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }
}
