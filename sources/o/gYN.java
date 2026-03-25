package o;

import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$batchBroadcastV6$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$batchBroadcastV6$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$broadcastV6$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$broadcastV6$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$calldataV6$$inlined$getNewApiResult$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$calldataV6$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$getQuoteAndCallDataV6$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$limitPairRateV2$$inlined$getNewApiResult$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$limitPairRateV2$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1;
import com.okinc.business.dex.trade.core.data.repo.TradeCoreRepositoryImpl$quoteV6$1;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dex.trade.core.domain.model.limit.V2TokenPairRateResponseData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gYN implements gYO {
    public final CoroutineDispatcher EZpvd;
    public final gYL KWHzl;

    public gYN(@NotNull gYL gyl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(gyl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = gyl;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull V6QuoteRequest v6QuoteRequest, @NotNull Continuation<? super AbstractC43419rot<V6QuoteResponseData, OKServerException>> continuation) throws java.lang.Throwable {
        TradeCoreRepositoryImpl$quoteV6$1 tradeCoreRepositoryImpl$quoteV6$1;
        if (continuation instanceof TradeCoreRepositoryImpl$quoteV6$1) {
            tradeCoreRepositoryImpl$quoteV6$1 = (TradeCoreRepositoryImpl$quoteV6$1) continuation;
            int i = tradeCoreRepositoryImpl$quoteV6$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeCoreRepositoryImpl$quoteV6$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeCoreRepositoryImpl$quoteV6$1 = new TradeCoreRepositoryImpl$quoteV6$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradeCoreRepositoryImpl$quoteV6$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeCoreRepositoryImpl$quoteV6$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1 tradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1 = new TradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1(null, this, v6QuoteRequest);
                tradeCoreRepositoryImpl$quoteV6$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, tradeCoreRepositoryImpl$quoteV6$$inlined$getNewApiResult$1, tradeCoreRepositoryImpl$quoteV6$1);
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
            if (e instanceof OKServerException) {
                return new AbstractC43419rot.ActionBar(e);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull V6CalldataRequest v6CalldataRequest, @NotNull Continuation<? super AbstractC43419rot<V6CalldataResponseData, OKServerException>> continuation) throws java.lang.Throwable {
        TradeCoreRepositoryImpl$calldataV6$1 tradeCoreRepositoryImpl$calldataV6$1;
        if (continuation instanceof TradeCoreRepositoryImpl$calldataV6$1) {
            tradeCoreRepositoryImpl$calldataV6$1 = (TradeCoreRepositoryImpl$calldataV6$1) continuation;
            int i = tradeCoreRepositoryImpl$calldataV6$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeCoreRepositoryImpl$calldataV6$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeCoreRepositoryImpl$calldataV6$1 = new TradeCoreRepositoryImpl$calldataV6$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradeCoreRepositoryImpl$calldataV6$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeCoreRepositoryImpl$calldataV6$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                TradeCoreRepositoryImpl$calldataV6$$inlined$getNewApiResult$1 tradeCoreRepositoryImpl$calldataV6$$inlined$getNewApiResult$1 = new TradeCoreRepositoryImpl$calldataV6$$inlined$getNewApiResult$1(null, this, v6CalldataRequest);
                tradeCoreRepositoryImpl$calldataV6$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, tradeCoreRepositoryImpl$calldataV6$$inlined$getNewApiResult$1, tradeCoreRepositoryImpl$calldataV6$1);
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
            if (e instanceof OKServerException) {
                return new AbstractC43419rot.ActionBar(e);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6QuoteAndCalldataRequest v6QuoteAndCalldataRequest, @NotNull Continuation<? super AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException>> continuation) throws java.lang.Throwable {
        TradeCoreRepositoryImpl$getQuoteAndCallDataV6$1 tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1;
        if (continuation instanceof TradeCoreRepositoryImpl$getQuoteAndCallDataV6$1) {
            tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1 = (TradeCoreRepositoryImpl$getQuoteAndCallDataV6$1) continuation;
            int i = tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1 = new TradeCoreRepositoryImpl$getQuoteAndCallDataV6$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1 tradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1 = new TradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1(null, this, map, v6QuoteAndCalldataRequest);
                tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, tradeCoreRepositoryImpl$getQuoteAndCallDataV6$$inlined$getNewApiResult$1, tradeCoreRepositoryImpl$getQuoteAndCallDataV6$1);
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
            if (e instanceof OKServerException) {
                return new AbstractC43419rot.ActionBar(e);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:12:0x0029, B:34:0x007f, B:35:0x0081, B:37:0x0087, B:39:0x008d, B:40:0x009a, B:17:0x0041, B:25:0x0064, B:31:0x006c, B:21:0x004f), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull V6BroadcastRequest v6BroadcastRequest, @NotNull Continuation<? super AbstractC43419rot<V6BroadcastResponseData, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        TradeCoreRepositoryImpl$broadcastV6$1 tradeCoreRepositoryImpl$broadcastV6$1;
        AbstractC43419rot.ActionBar actionBar;
        gYN gyn;
        ResponseData responseData;
        if (continuation instanceof TradeCoreRepositoryImpl$broadcastV6$1) {
            tradeCoreRepositoryImpl$broadcastV6$1 = (TradeCoreRepositoryImpl$broadcastV6$1) continuation;
            int i = tradeCoreRepositoryImpl$broadcastV6$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeCoreRepositoryImpl$broadcastV6$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeCoreRepositoryImpl$broadcastV6$1 = new TradeCoreRepositoryImpl$broadcastV6$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradeCoreRepositoryImpl$broadcastV6$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeCoreRepositoryImpl$broadcastV6$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            if (coroutineDispatcher == null) {
                gyn = this;
                gYL gyl = gyn.KWHzl;
                tradeCoreRepositoryImpl$broadcastV6$1.L$0 = null;
                tradeCoreRepositoryImpl$broadcastV6$1.L$1 = null;
                tradeCoreRepositoryImpl$broadcastV6$1.L$2 = null;
                tradeCoreRepositoryImpl$broadcastV6$1.label = 2;
                objWithContext = gyl.OLrzqt(map, v6BroadcastRequest, tradeCoreRepositoryImpl$broadcastV6$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            TradeCoreRepositoryImpl$broadcastV6$$inlined$getApiResultWithJwtCheck$1 tradeCoreRepositoryImpl$broadcastV6$$inlined$getApiResultWithJwtCheck$1 = new TradeCoreRepositoryImpl$broadcastV6$$inlined$getApiResultWithJwtCheck$1(null, this, map, v6BroadcastRequest);
            tradeCoreRepositoryImpl$broadcastV6$1.L$0 = this;
            tradeCoreRepositoryImpl$broadcastV6$1.L$1 = map;
            tradeCoreRepositoryImpl$broadcastV6$1.L$2 = v6BroadcastRequest;
            tradeCoreRepositoryImpl$broadcastV6$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tradeCoreRepositoryImpl$broadcastV6$$inlined$getApiResultWithJwtCheck$1, tradeCoreRepositoryImpl$broadcastV6$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            gyn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            V6BroadcastRequest v6BroadcastRequest2 = (V6BroadcastRequest) tradeCoreRepositoryImpl$broadcastV6$1.L$2;
            java.util.Map<java.lang.String, java.lang.String> map2 = (java.util.Map) tradeCoreRepositoryImpl$broadcastV6$1.L$1;
            gyn = (gYN) tradeCoreRepositoryImpl$broadcastV6$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            v6BroadcastRequest = v6BroadcastRequest2;
            map = map2;
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            gYL gyl2 = gyn.KWHzl;
            tradeCoreRepositoryImpl$broadcastV6$1.L$0 = null;
            tradeCoreRepositoryImpl$broadcastV6$1.L$1 = null;
            tradeCoreRepositoryImpl$broadcastV6$1.L$2 = null;
            tradeCoreRepositoryImpl$broadcastV6$1.label = 2;
            objWithContext = gyl2.OLrzqt(map, v6BroadcastRequest, tradeCoreRepositoryImpl$broadcastV6$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull V6BatchBroadcastRequest v6BatchBroadcastRequest, @NotNull Continuation<? super AbstractC43419rot<V6BatchBroadcastResponseData, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        TradeCoreRepositoryImpl$batchBroadcastV6$1 tradeCoreRepositoryImpl$batchBroadcastV6$1;
        AbstractC43419rot.ActionBar actionBar;
        gYN gyn;
        ResponseData responseData;
        if (continuation instanceof TradeCoreRepositoryImpl$batchBroadcastV6$1) {
            tradeCoreRepositoryImpl$batchBroadcastV6$1 = (TradeCoreRepositoryImpl$batchBroadcastV6$1) continuation;
            int i = tradeCoreRepositoryImpl$batchBroadcastV6$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeCoreRepositoryImpl$batchBroadcastV6$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeCoreRepositoryImpl$batchBroadcastV6$1 = new TradeCoreRepositoryImpl$batchBroadcastV6$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradeCoreRepositoryImpl$batchBroadcastV6$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeCoreRepositoryImpl$batchBroadcastV6$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            if (coroutineDispatcher == null) {
                gyn = this;
                gYL gyl = gyn.KWHzl;
                tradeCoreRepositoryImpl$batchBroadcastV6$1.L$0 = null;
                tradeCoreRepositoryImpl$batchBroadcastV6$1.L$1 = null;
                tradeCoreRepositoryImpl$batchBroadcastV6$1.label = 2;
                objWithContext = gyl.OLrzqt(v6BatchBroadcastRequest, tradeCoreRepositoryImpl$batchBroadcastV6$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            TradeCoreRepositoryImpl$batchBroadcastV6$$inlined$getApiResultWithJwtCheck$1 tradeCoreRepositoryImpl$batchBroadcastV6$$inlined$getApiResultWithJwtCheck$1 = new TradeCoreRepositoryImpl$batchBroadcastV6$$inlined$getApiResultWithJwtCheck$1(null, this, v6BatchBroadcastRequest);
            tradeCoreRepositoryImpl$batchBroadcastV6$1.L$0 = this;
            tradeCoreRepositoryImpl$batchBroadcastV6$1.L$1 = v6BatchBroadcastRequest;
            tradeCoreRepositoryImpl$batchBroadcastV6$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tradeCoreRepositoryImpl$batchBroadcastV6$$inlined$getApiResultWithJwtCheck$1, tradeCoreRepositoryImpl$batchBroadcastV6$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            gyn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            v6BatchBroadcastRequest = (V6BatchBroadcastRequest) tradeCoreRepositoryImpl$batchBroadcastV6$1.L$1;
            gyn = (gYN) tradeCoreRepositoryImpl$batchBroadcastV6$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            gYL gyl2 = gyn.KWHzl;
            tradeCoreRepositoryImpl$batchBroadcastV6$1.L$0 = null;
            tradeCoreRepositoryImpl$batchBroadcastV6$1.L$1 = null;
            tradeCoreRepositoryImpl$batchBroadcastV6$1.label = 2;
            objWithContext = gyl2.OLrzqt(v6BatchBroadcastRequest, tradeCoreRepositoryImpl$batchBroadcastV6$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull PairRateParams pairRateParams, @NotNull Continuation<? super AbstractC43419rot<TokenPairRateQuote, OKServerException>> continuation) throws java.lang.Throwable {
        TradeCoreRepositoryImpl$limitPairRateV2$1 tradeCoreRepositoryImpl$limitPairRateV2$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof TradeCoreRepositoryImpl$limitPairRateV2$1) {
            tradeCoreRepositoryImpl$limitPairRateV2$1 = (TradeCoreRepositoryImpl$limitPairRateV2$1) continuation;
            int i = tradeCoreRepositoryImpl$limitPairRateV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeCoreRepositoryImpl$limitPairRateV2$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeCoreRepositoryImpl$limitPairRateV2$1 = new TradeCoreRepositoryImpl$limitPairRateV2$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradeCoreRepositoryImpl$limitPairRateV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeCoreRepositoryImpl$limitPairRateV2$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                TradeCoreRepositoryImpl$limitPairRateV2$$inlined$getNewApiResult$1 tradeCoreRepositoryImpl$limitPairRateV2$$inlined$getNewApiResult$1 = new TradeCoreRepositoryImpl$limitPairRateV2$$inlined$getNewApiResult$1(null, this, pairRateParams);
                tradeCoreRepositoryImpl$limitPairRateV2$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, tradeCoreRepositoryImpl$limitPairRateV2$$inlined$getNewApiResult$1, tradeCoreRepositoryImpl$limitPairRateV2$1);
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
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
            }
        } catch (java.lang.Exception e) {
            if (e instanceof OKServerException) {
                actionBar = new AbstractC43419rot.ActionBar(e);
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(gYT.copydefault((V2TokenPairRateResponseData) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
