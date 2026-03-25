package o;

import com.okinc.business.web3pay.lib.core.model.PagingData;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$deleteCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$getPayOrderListFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$getPendingClaimListFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$getTransactionOrderListForTokenFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$getTransactionOrderListFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$savePayOrders$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$savePendingClaimOrders$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$saveTransactionOrders$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.TransactionHistoryDao$saveTransactionOrdersForToken$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31289lrH {
    java.lang.Object AEQbTJ(@NotNull TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<TransactionOrderEntity> list, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super PayOrderCacheEntity> continuation);

    java.lang.Object AEQbTJ(@NotNull java.util.List<PayOrderEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<PayOrderEntity>> continuation);

    java.lang.Object AYXKKw(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super PendingClaimOrderCacheEntity> continuation);

    java.lang.Object AhwBna(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object AkhnZx(@NotNull java.lang.String str, @NotNull Continuation<? super PagingData<C31381lsu>> continuation);

    java.lang.Object EZpvd(@NotNull TransactionOrderCacheEntity transactionOrderCacheEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<TransactionOrderForTokenEntity> list, @NotNull java.lang.String str4, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.util.List<TransactionOrderForTokenEntity>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<TransactionOrderEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<PendingClaimOrderEntity> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<PayOrderEntity> list, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull PayOrderCacheEntity payOrderCacheEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super PagingData<C31381lsu>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super PagingData<PayOrderApiModel>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<PendingClaimOrderEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super TransactionOrderForTokenCacheEntity> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<TransactionOrderForTokenEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object djBIcL(@NotNull java.lang.String str, @NotNull Continuation<? super PendingClaimOrderResponse> continuation);

    java.lang.Object djBIcL(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<PendingClaimOrderEntity>> continuation);

    java.lang.Object gEmmrt(@NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object isConnected(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<TransactionOrderEntity>> continuation);

    java.lang.Object valueOf(@NotNull java.lang.String str, @NotNull Continuation<? super TransactionOrderCacheEntity> continuation);

    /* JADX INFO: renamed from: o.lrH$Application */
    public static final class Application {
        /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object AEQbTJ(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$deleteCache$1 transactionHistoryDao$deleteCache$1;
            if (continuation instanceof TransactionHistoryDao$deleteCache$1) {
                transactionHistoryDao$deleteCache$1 = (TransactionHistoryDao$deleteCache$1) continuation;
                int i = transactionHistoryDao$deleteCache$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$deleteCache$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$deleteCache$1 = new TransactionHistoryDao$deleteCache$1(continuation);
                }
            }
            java.lang.Object obj = transactionHistoryDao$deleteCache$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            switch (transactionHistoryDao$deleteCache$1.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 1;
                    if (interfaceC31289lrH.AEQbTJ(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 2;
                    if (interfaceC31289lrH.KWHzl(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 3;
                    if (interfaceC31289lrH.OLrzqt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 4;
                    if (interfaceC31289lrH.EZpvd(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 5;
                    if (interfaceC31289lrH.AYXKKw(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 6;
                    if (interfaceC31289lrH.AhwBna(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                case 1:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 2;
                    if (interfaceC31289lrH.KWHzl(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 3;
                    if (interfaceC31289lrH.OLrzqt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 4;
                    if (interfaceC31289lrH.EZpvd(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 5;
                    if (interfaceC31289lrH.AYXKKw(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 6;
                    if (interfaceC31289lrH.AhwBna(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 3;
                    if (interfaceC31289lrH.OLrzqt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 4;
                    if (interfaceC31289lrH.EZpvd(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 5;
                    if (interfaceC31289lrH.AYXKKw(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 6;
                    if (interfaceC31289lrH.AhwBna(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 4;
                    if (interfaceC31289lrH.EZpvd(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 5;
                    if (interfaceC31289lrH.AYXKKw(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 6;
                    if (interfaceC31289lrH.AhwBna(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 5;
                    if (interfaceC31289lrH.AYXKKw(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 6;
                    if (interfaceC31289lrH.AhwBna(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 6;
                    if (interfaceC31289lrH.AhwBna(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = interfaceC31289lrH;
                    transactionHistoryDao$deleteCache$1.label = 7;
                    if (interfaceC31289lrH.djBIcL(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$deleteCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionHistoryDao$deleteCache$1.L$0 = null;
                    transactionHistoryDao$deleteCache$1.label = 8;
                    if (interfaceC31289lrH.gEmmrt(transactionHistoryDao$deleteCache$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[LOOP:0: B:26:0x007f->B:28:0x0085, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object OLrzqt(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull Continuation<? super PagingData<PayOrderApiModel>> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$getPayOrderListFromCache$1 transactionHistoryDao$getPayOrderListFromCache$1;
            java.lang.String str2;
            java.util.Iterator it;
            if (continuation instanceof TransactionHistoryDao$getPayOrderListFromCache$1) {
                transactionHistoryDao$getPayOrderListFromCache$1 = (TransactionHistoryDao$getPayOrderListFromCache$1) continuation;
                int i = transactionHistoryDao$getPayOrderListFromCache$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$getPayOrderListFromCache$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$getPayOrderListFromCache$1 = new TransactionHistoryDao$getPayOrderListFromCache$1(continuation);
                }
            }
            java.lang.Object objAEQbTJ = transactionHistoryDao$getPayOrderListFromCache$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$getPayOrderListFromCache$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                transactionHistoryDao$getPayOrderListFromCache$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$getPayOrderListFromCache$1.L$1 = str;
                transactionHistoryDao$getPayOrderListFromCache$1.label = 1;
                objAEQbTJ = interfaceC31289lrH.AEQbTJ(str, transactionHistoryDao$getPayOrderListFromCache$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) transactionHistoryDao$getPayOrderListFromCache$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    java.lang.Iterable iterable = (java.lang.Iterable) objAEQbTJ;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PayOrderEntity) it.next()).getApiModel());
                    }
                    return new PagingData(str2, arrayList);
                }
                str = (java.lang.String) transactionHistoryDao$getPayOrderListFromCache$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$getPayOrderListFromCache$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            PayOrderCacheEntity payOrderCacheEntity = (PayOrderCacheEntity) objAEQbTJ;
            if (payOrderCacheEntity == null) {
                return null;
            }
            java.lang.String nextCursor = payOrderCacheEntity.getNextCursor();
            transactionHistoryDao$getPayOrderListFromCache$1.L$0 = nextCursor;
            transactionHistoryDao$getPayOrderListFromCache$1.L$1 = null;
            transactionHistoryDao$getPayOrderListFromCache$1.label = 2;
            java.lang.Object objAYXKKw = interfaceC31289lrH.AYXKKw(str, transactionHistoryDao$getPayOrderListFromCache$1);
            if (objAYXKKw == objCopydefault) {
                return objCopydefault;
            }
            objAEQbTJ = objAYXKKw;
            str2 = nextCursor;
            java.lang.Iterable iterable2 = (java.lang.Iterable) objAEQbTJ;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return new PagingData(str2, arrayList2);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[LOOP:0: B:26:0x0086->B:28:0x008c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object copydefault(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull Continuation<? super PendingClaimOrderResponse> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$getPendingClaimListFromCache$1 transactionHistoryDao$getPendingClaimListFromCache$1;
            java.lang.String str2;
            java.lang.String str3;
            java.util.Iterator it;
            if (continuation instanceof TransactionHistoryDao$getPendingClaimListFromCache$1) {
                transactionHistoryDao$getPendingClaimListFromCache$1 = (TransactionHistoryDao$getPendingClaimListFromCache$1) continuation;
                int i = transactionHistoryDao$getPendingClaimListFromCache$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$getPendingClaimListFromCache$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$getPendingClaimListFromCache$1 = new TransactionHistoryDao$getPendingClaimListFromCache$1(continuation);
                }
            }
            java.lang.Object objAhwBna = transactionHistoryDao$getPendingClaimListFromCache$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$getPendingClaimListFromCache$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAhwBna);
                transactionHistoryDao$getPendingClaimListFromCache$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$getPendingClaimListFromCache$1.L$1 = str;
                transactionHistoryDao$getPendingClaimListFromCache$1.label = 1;
                objAhwBna = interfaceC31289lrH.AhwBna(str, transactionHistoryDao$getPendingClaimListFromCache$1);
                if (objAhwBna == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (java.lang.String) transactionHistoryDao$getPendingClaimListFromCache$1.L$1;
                    str2 = (java.lang.String) transactionHistoryDao$getPendingClaimListFromCache$1.L$0;
                    C56391yDq.AEQbTJ(objAhwBna);
                    java.lang.Iterable iterable = (java.lang.Iterable) objAhwBna;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PendingClaimOrderEntity) it.next()).getApiModel());
                    }
                    return new PendingClaimOrderResponse(str3, str2, arrayList);
                }
                str = (java.lang.String) transactionHistoryDao$getPendingClaimListFromCache$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$getPendingClaimListFromCache$1.L$0;
                C56391yDq.AEQbTJ(objAhwBna);
            }
            PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity = (PendingClaimOrderCacheEntity) objAhwBna;
            if (pendingClaimOrderCacheEntity == null) {
                return null;
            }
            java.lang.String nextCursor = pendingClaimOrderCacheEntity.getNextCursor();
            java.lang.String total = pendingClaimOrderCacheEntity.getTotal();
            transactionHistoryDao$getPendingClaimListFromCache$1.L$0 = total;
            transactionHistoryDao$getPendingClaimListFromCache$1.L$1 = nextCursor;
            transactionHistoryDao$getPendingClaimListFromCache$1.label = 2;
            java.lang.Object objGEmmrt = interfaceC31289lrH.gEmmrt(str, transactionHistoryDao$getPendingClaimListFromCache$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            str2 = total;
            objAhwBna = objGEmmrt;
            str3 = nextCursor;
            java.lang.Iterable iterable2 = (java.lang.Iterable) objAhwBna;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return new PendingClaimOrderResponse(str3, str2, arrayList2);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[LOOP:0: B:26:0x0091->B:28:0x0097, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object AEQbTJ(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super PagingData<C31381lsu>> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$getTransactionOrderListForTokenFromCache$1 transactionHistoryDao$getTransactionOrderListForTokenFromCache$1;
            java.lang.String str4;
            java.util.Iterator it;
            if (continuation instanceof TransactionHistoryDao$getTransactionOrderListForTokenFromCache$1) {
                transactionHistoryDao$getTransactionOrderListForTokenFromCache$1 = (TransactionHistoryDao$getTransactionOrderListForTokenFromCache$1) continuation;
                int i = transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$getTransactionOrderListForTokenFromCache$1 = new TransactionHistoryDao$getTransactionOrderListForTokenFromCache$1(continuation);
                }
            }
            java.lang.Object objCopydefault = transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$1 = str;
                transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$2 = str2;
                transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$3 = str3;
                transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.label = 1;
                objCopydefault = interfaceC31289lrH.copydefault(str, str2, str3, transactionHistoryDao$getTransactionOrderListForTokenFromCache$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    java.lang.Iterable iterable = (java.lang.Iterable) objCopydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TransactionOrderForTokenEntity) it.next()).getApiModel());
                    }
                    return new PagingData(str4, arrayList);
                }
                str3 = (java.lang.String) transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$3;
                str2 = (java.lang.String) transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$2;
                str = (java.lang.String) transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity = (TransactionOrderForTokenCacheEntity) objCopydefault;
            if (transactionOrderForTokenCacheEntity == null) {
                return null;
            }
            java.lang.String nextCursor = transactionOrderForTokenCacheEntity.getNextCursor();
            transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$0 = nextCursor;
            transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$1 = null;
            transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$2 = null;
            transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.L$3 = null;
            transactionHistoryDao$getTransactionOrderListForTokenFromCache$1.label = 2;
            java.lang.Object objEZpvd = interfaceC31289lrH.EZpvd(str, str2, str3, transactionHistoryDao$getTransactionOrderListForTokenFromCache$1);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
            objCopydefault = objEZpvd;
            str4 = nextCursor;
            java.lang.Iterable iterable2 = (java.lang.Iterable) objCopydefault;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return new PagingData(str4, arrayList2);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[LOOP:0: B:26:0x007f->B:28:0x0085, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object EZpvd(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull Continuation<? super PagingData<C31381lsu>> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$getTransactionOrderListFromCache$1 transactionHistoryDao$getTransactionOrderListFromCache$1;
            java.lang.String str2;
            java.util.Iterator it;
            if (continuation instanceof TransactionHistoryDao$getTransactionOrderListFromCache$1) {
                transactionHistoryDao$getTransactionOrderListFromCache$1 = (TransactionHistoryDao$getTransactionOrderListFromCache$1) continuation;
                int i = transactionHistoryDao$getTransactionOrderListFromCache$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$getTransactionOrderListFromCache$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$getTransactionOrderListFromCache$1 = new TransactionHistoryDao$getTransactionOrderListFromCache$1(continuation);
                }
            }
            java.lang.Object objValueOf = transactionHistoryDao$getTransactionOrderListFromCache$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$getTransactionOrderListFromCache$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objValueOf);
                transactionHistoryDao$getTransactionOrderListFromCache$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$getTransactionOrderListFromCache$1.L$1 = str;
                transactionHistoryDao$getTransactionOrderListFromCache$1.label = 1;
                objValueOf = interfaceC31289lrH.valueOf(str, transactionHistoryDao$getTransactionOrderListFromCache$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) transactionHistoryDao$getTransactionOrderListFromCache$1.L$0;
                    C56391yDq.AEQbTJ(objValueOf);
                    java.lang.Iterable iterable = (java.lang.Iterable) objValueOf;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TransactionOrderEntity) it.next()).getApiModel());
                    }
                    return new PagingData(str2, arrayList);
                }
                str = (java.lang.String) transactionHistoryDao$getTransactionOrderListFromCache$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$getTransactionOrderListFromCache$1.L$0;
                C56391yDq.AEQbTJ(objValueOf);
            }
            TransactionOrderCacheEntity transactionOrderCacheEntity = (TransactionOrderCacheEntity) objValueOf;
            if (transactionOrderCacheEntity == null) {
                return null;
            }
            java.lang.String nextCursor = transactionOrderCacheEntity.getNextCursor();
            transactionHistoryDao$getTransactionOrderListFromCache$1.L$0 = nextCursor;
            transactionHistoryDao$getTransactionOrderListFromCache$1.L$1 = null;
            transactionHistoryDao$getTransactionOrderListFromCache$1.label = 2;
            java.lang.Object objIsConnected = interfaceC31289lrH.isConnected(str, transactionHistoryDao$getTransactionOrderListFromCache$1);
            if (objIsConnected == objCopydefault) {
                return objCopydefault;
            }
            objValueOf = objIsConnected;
            str2 = nextCursor;
            java.lang.Iterable iterable2 = (java.lang.Iterable) objValueOf;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return new PagingData(str2, arrayList2);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object AEQbTJ(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull java.util.List<TransactionOrderEntity> list, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$saveTransactionOrders$1 transactionHistoryDao$saveTransactionOrders$1;
            InterfaceC31289lrH interfaceC31289lrH2;
            java.lang.String str3;
            TransactionOrderCacheEntity transactionOrderCacheEntity;
            if (continuation instanceof TransactionHistoryDao$saveTransactionOrders$1) {
                transactionHistoryDao$saveTransactionOrders$1 = (TransactionHistoryDao$saveTransactionOrders$1) continuation;
                int i = transactionHistoryDao$saveTransactionOrders$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$saveTransactionOrders$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$saveTransactionOrders$1 = new TransactionHistoryDao$saveTransactionOrders$1(continuation);
                }
            }
            java.lang.Object obj = transactionHistoryDao$saveTransactionOrders$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$saveTransactionOrders$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                transactionHistoryDao$saveTransactionOrders$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$saveTransactionOrders$1.L$1 = str;
                transactionHistoryDao$saveTransactionOrders$1.L$2 = list;
                transactionHistoryDao$saveTransactionOrders$1.L$3 = str2;
                transactionHistoryDao$saveTransactionOrders$1.label = 1;
                if (interfaceC31289lrH.copydefault(str, transactionHistoryDao$saveTransactionOrders$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    str3 = (java.lang.String) transactionHistoryDao$saveTransactionOrders$1.L$2;
                    str = (java.lang.String) transactionHistoryDao$saveTransactionOrders$1.L$1;
                    interfaceC31289lrH2 = (InterfaceC31289lrH) transactionHistoryDao$saveTransactionOrders$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    transactionOrderCacheEntity = new TransactionOrderCacheEntity(str, str3);
                    transactionHistoryDao$saveTransactionOrders$1.L$0 = null;
                    transactionHistoryDao$saveTransactionOrders$1.L$1 = null;
                    transactionHistoryDao$saveTransactionOrders$1.L$2 = null;
                    transactionHistoryDao$saveTransactionOrders$1.label = 3;
                    if (interfaceC31289lrH2.EZpvd(transactionOrderCacheEntity, transactionHistoryDao$saveTransactionOrders$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                str2 = (java.lang.String) transactionHistoryDao$saveTransactionOrders$1.L$3;
                list = (java.util.List) transactionHistoryDao$saveTransactionOrders$1.L$2;
                str = (java.lang.String) transactionHistoryDao$saveTransactionOrders$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$saveTransactionOrders$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            transactionHistoryDao$saveTransactionOrders$1.L$0 = interfaceC31289lrH;
            transactionHistoryDao$saveTransactionOrders$1.L$1 = str;
            transactionHistoryDao$saveTransactionOrders$1.L$2 = str2;
            transactionHistoryDao$saveTransactionOrders$1.L$3 = null;
            transactionHistoryDao$saveTransactionOrders$1.label = 2;
            if (interfaceC31289lrH.EZpvd(list, transactionHistoryDao$saveTransactionOrders$1) == objCopydefault) {
                return objCopydefault;
            }
            interfaceC31289lrH2 = interfaceC31289lrH;
            str3 = str2;
            transactionOrderCacheEntity = new TransactionOrderCacheEntity(str, str3);
            transactionHistoryDao$saveTransactionOrders$1.L$0 = null;
            transactionHistoryDao$saveTransactionOrders$1.L$1 = null;
            transactionHistoryDao$saveTransactionOrders$1.L$2 = null;
            transactionHistoryDao$saveTransactionOrders$1.label = 3;
            if (interfaceC31289lrH2.EZpvd(transactionOrderCacheEntity, transactionHistoryDao$saveTransactionOrders$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object copydefault(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull java.util.List<PayOrderEntity> list, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$savePayOrders$1 transactionHistoryDao$savePayOrders$1;
            InterfaceC31289lrH interfaceC31289lrH2;
            java.lang.String str3;
            PayOrderCacheEntity payOrderCacheEntity;
            if (continuation instanceof TransactionHistoryDao$savePayOrders$1) {
                transactionHistoryDao$savePayOrders$1 = (TransactionHistoryDao$savePayOrders$1) continuation;
                int i = transactionHistoryDao$savePayOrders$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$savePayOrders$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$savePayOrders$1 = new TransactionHistoryDao$savePayOrders$1(continuation);
                }
            }
            java.lang.Object obj = transactionHistoryDao$savePayOrders$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$savePayOrders$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                transactionHistoryDao$savePayOrders$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$savePayOrders$1.L$1 = str;
                transactionHistoryDao$savePayOrders$1.L$2 = list;
                transactionHistoryDao$savePayOrders$1.L$3 = str2;
                transactionHistoryDao$savePayOrders$1.label = 1;
                if (interfaceC31289lrH.EZpvd(str, transactionHistoryDao$savePayOrders$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    str3 = (java.lang.String) transactionHistoryDao$savePayOrders$1.L$2;
                    str = (java.lang.String) transactionHistoryDao$savePayOrders$1.L$1;
                    interfaceC31289lrH2 = (InterfaceC31289lrH) transactionHistoryDao$savePayOrders$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    payOrderCacheEntity = new PayOrderCacheEntity(str, str3);
                    transactionHistoryDao$savePayOrders$1.L$0 = null;
                    transactionHistoryDao$savePayOrders$1.L$1 = null;
                    transactionHistoryDao$savePayOrders$1.L$2 = null;
                    transactionHistoryDao$savePayOrders$1.label = 3;
                    if (interfaceC31289lrH2.OLrzqt(payOrderCacheEntity, transactionHistoryDao$savePayOrders$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                str2 = (java.lang.String) transactionHistoryDao$savePayOrders$1.L$3;
                list = (java.util.List) transactionHistoryDao$savePayOrders$1.L$2;
                str = (java.lang.String) transactionHistoryDao$savePayOrders$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$savePayOrders$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            transactionHistoryDao$savePayOrders$1.L$0 = interfaceC31289lrH;
            transactionHistoryDao$savePayOrders$1.L$1 = str;
            transactionHistoryDao$savePayOrders$1.L$2 = str2;
            transactionHistoryDao$savePayOrders$1.L$3 = null;
            transactionHistoryDao$savePayOrders$1.label = 2;
            if (interfaceC31289lrH.AEQbTJ(list, transactionHistoryDao$savePayOrders$1) == objCopydefault) {
                return objCopydefault;
            }
            interfaceC31289lrH2 = interfaceC31289lrH;
            str3 = str2;
            payOrderCacheEntity = new PayOrderCacheEntity(str, str3);
            transactionHistoryDao$savePayOrders$1.L$0 = null;
            transactionHistoryDao$savePayOrders$1.L$1 = null;
            transactionHistoryDao$savePayOrders$1.L$2 = null;
            transactionHistoryDao$savePayOrders$1.label = 3;
            if (interfaceC31289lrH2.OLrzqt(payOrderCacheEntity, transactionHistoryDao$savePayOrders$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object KWHzl(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull java.util.List<PendingClaimOrderEntity> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$savePendingClaimOrders$1 transactionHistoryDao$savePendingClaimOrders$1;
            java.lang.String str4;
            java.lang.String str5;
            InterfaceC31289lrH interfaceC31289lrH2;
            java.lang.String str6;
            PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity;
            if (continuation instanceof TransactionHistoryDao$savePendingClaimOrders$1) {
                transactionHistoryDao$savePendingClaimOrders$1 = (TransactionHistoryDao$savePendingClaimOrders$1) continuation;
                int i = transactionHistoryDao$savePendingClaimOrders$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$savePendingClaimOrders$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$savePendingClaimOrders$1 = new TransactionHistoryDao$savePendingClaimOrders$1(continuation);
                }
            }
            java.lang.Object obj = transactionHistoryDao$savePendingClaimOrders$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$savePendingClaimOrders$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                transactionHistoryDao$savePendingClaimOrders$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$savePendingClaimOrders$1.L$1 = str;
                transactionHistoryDao$savePendingClaimOrders$1.L$2 = list;
                transactionHistoryDao$savePendingClaimOrders$1.L$3 = str2;
                transactionHistoryDao$savePendingClaimOrders$1.L$4 = str3;
                transactionHistoryDao$savePendingClaimOrders$1.label = 1;
                if (interfaceC31289lrH.KWHzl(str, transactionHistoryDao$savePendingClaimOrders$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    str6 = (java.lang.String) transactionHistoryDao$savePendingClaimOrders$1.L$3;
                    str5 = (java.lang.String) transactionHistoryDao$savePendingClaimOrders$1.L$2;
                    str4 = (java.lang.String) transactionHistoryDao$savePendingClaimOrders$1.L$1;
                    interfaceC31289lrH2 = (InterfaceC31289lrH) transactionHistoryDao$savePendingClaimOrders$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    pendingClaimOrderCacheEntity = new PendingClaimOrderCacheEntity(str4, str5, str6);
                    transactionHistoryDao$savePendingClaimOrders$1.L$0 = null;
                    transactionHistoryDao$savePendingClaimOrders$1.L$1 = null;
                    transactionHistoryDao$savePendingClaimOrders$1.L$2 = null;
                    transactionHistoryDao$savePendingClaimOrders$1.L$3 = null;
                    transactionHistoryDao$savePendingClaimOrders$1.label = 3;
                    if (interfaceC31289lrH2.copydefault(pendingClaimOrderCacheEntity, transactionHistoryDao$savePendingClaimOrders$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                str3 = (java.lang.String) transactionHistoryDao$savePendingClaimOrders$1.L$4;
                str2 = (java.lang.String) transactionHistoryDao$savePendingClaimOrders$1.L$3;
                list = (java.util.List) transactionHistoryDao$savePendingClaimOrders$1.L$2;
                str = (java.lang.String) transactionHistoryDao$savePendingClaimOrders$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$savePendingClaimOrders$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            transactionHistoryDao$savePendingClaimOrders$1.L$0 = interfaceC31289lrH;
            transactionHistoryDao$savePendingClaimOrders$1.L$1 = str;
            transactionHistoryDao$savePendingClaimOrders$1.L$2 = str2;
            transactionHistoryDao$savePendingClaimOrders$1.L$3 = str3;
            transactionHistoryDao$savePendingClaimOrders$1.L$4 = null;
            transactionHistoryDao$savePendingClaimOrders$1.label = 2;
            if (interfaceC31289lrH.OLrzqt(list, transactionHistoryDao$savePendingClaimOrders$1) == objCopydefault) {
                return objCopydefault;
            }
            str4 = str;
            str5 = str2;
            interfaceC31289lrH2 = interfaceC31289lrH;
            str6 = str3;
            pendingClaimOrderCacheEntity = new PendingClaimOrderCacheEntity(str4, str5, str6);
            transactionHistoryDao$savePendingClaimOrders$1.L$0 = null;
            transactionHistoryDao$savePendingClaimOrders$1.L$1 = null;
            transactionHistoryDao$savePendingClaimOrders$1.L$2 = null;
            transactionHistoryDao$savePendingClaimOrders$1.L$3 = null;
            transactionHistoryDao$savePendingClaimOrders$1.label = 3;
            if (interfaceC31289lrH2.copydefault(pendingClaimOrderCacheEntity, transactionHistoryDao$savePendingClaimOrders$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object OLrzqt(@NotNull InterfaceC31289lrH interfaceC31289lrH, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<TransactionOrderForTokenEntity> list, @NotNull java.lang.String str4, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            TransactionHistoryDao$saveTransactionOrdersForToken$1 transactionHistoryDao$saveTransactionOrdersForToken$1;
            InterfaceC31289lrH interfaceC31289lrH2;
            java.lang.String str5;
            java.lang.String str6;
            java.lang.String str7;
            TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity;
            if (continuation instanceof TransactionHistoryDao$saveTransactionOrdersForToken$1) {
                transactionHistoryDao$saveTransactionOrdersForToken$1 = (TransactionHistoryDao$saveTransactionOrdersForToken$1) continuation;
                int i = transactionHistoryDao$saveTransactionOrdersForToken$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionHistoryDao$saveTransactionOrdersForToken$1.label = i - Integer.MIN_VALUE;
                } else {
                    transactionHistoryDao$saveTransactionOrdersForToken$1 = new TransactionHistoryDao$saveTransactionOrdersForToken$1(continuation);
                }
            }
            java.lang.Object obj = transactionHistoryDao$saveTransactionOrdersForToken$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = transactionHistoryDao$saveTransactionOrdersForToken$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$1 = str;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$2 = str2;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$3 = str3;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$4 = list;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$5 = str4;
                transactionHistoryDao$saveTransactionOrdersForToken$1.label = 1;
                if (interfaceC31289lrH.KWHzl(str, str2, str3, transactionHistoryDao$saveTransactionOrdersForToken$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    str5 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$4;
                    str7 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$3;
                    str2 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$2;
                    str6 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$1;
                    interfaceC31289lrH2 = (InterfaceC31289lrH) transactionHistoryDao$saveTransactionOrdersForToken$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str4 = str5;
                    interfaceC31289lrH = interfaceC31289lrH2;
                    java.lang.String str8 = str6;
                    str3 = str7;
                    str = str8;
                    transactionOrderForTokenCacheEntity = new TransactionOrderForTokenCacheEntity(str, str2, str3, str4);
                    transactionHistoryDao$saveTransactionOrdersForToken$1.L$0 = null;
                    transactionHistoryDao$saveTransactionOrdersForToken$1.L$1 = null;
                    transactionHistoryDao$saveTransactionOrdersForToken$1.L$2 = null;
                    transactionHistoryDao$saveTransactionOrdersForToken$1.L$3 = null;
                    transactionHistoryDao$saveTransactionOrdersForToken$1.L$4 = null;
                    transactionHistoryDao$saveTransactionOrdersForToken$1.L$5 = null;
                    transactionHistoryDao$saveTransactionOrdersForToken$1.label = 3;
                    if (interfaceC31289lrH.AEQbTJ(transactionOrderForTokenCacheEntity, transactionHistoryDao$saveTransactionOrdersForToken$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                str4 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$5;
                list = (java.util.List) transactionHistoryDao$saveTransactionOrdersForToken$1.L$4;
                str3 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$3;
                str2 = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$2;
                str = (java.lang.String) transactionHistoryDao$saveTransactionOrdersForToken$1.L$1;
                interfaceC31289lrH = (InterfaceC31289lrH) transactionHistoryDao$saveTransactionOrdersForToken$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (!list.isEmpty()) {
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$0 = interfaceC31289lrH;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$1 = str;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$2 = str2;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$3 = str3;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$4 = str4;
                transactionHistoryDao$saveTransactionOrdersForToken$1.L$5 = null;
                transactionHistoryDao$saveTransactionOrdersForToken$1.label = 2;
                if (interfaceC31289lrH.copydefault(list, transactionHistoryDao$saveTransactionOrdersForToken$1) == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC31289lrH2 = interfaceC31289lrH;
                str5 = str4;
                java.lang.String str9 = str3;
                str6 = str;
                str7 = str9;
                str4 = str5;
                interfaceC31289lrH = interfaceC31289lrH2;
                java.lang.String str82 = str6;
                str3 = str7;
                str = str82;
            }
            transactionOrderForTokenCacheEntity = new TransactionOrderForTokenCacheEntity(str, str2, str3, str4);
            transactionHistoryDao$saveTransactionOrdersForToken$1.L$0 = null;
            transactionHistoryDao$saveTransactionOrdersForToken$1.L$1 = null;
            transactionHistoryDao$saveTransactionOrdersForToken$1.L$2 = null;
            transactionHistoryDao$saveTransactionOrdersForToken$1.L$3 = null;
            transactionHistoryDao$saveTransactionOrdersForToken$1.L$4 = null;
            transactionHistoryDao$saveTransactionOrdersForToken$1.L$5 = null;
            transactionHistoryDao$saveTransactionOrdersForToken$1.label = 3;
            if (interfaceC31289lrH.AEQbTJ(transactionOrderForTokenCacheEntity, transactionHistoryDao$saveTransactionOrdersForToken$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
    }
}
