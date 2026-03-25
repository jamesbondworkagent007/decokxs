package o;

import com.okinc.crcore.coreapi.net.requestbean.transactions.trades.ActivityCurrency;
import com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.TransactionActivityList;
import com.okinc.crcore.coreapi.net.responsebean.transactions.filter.TransactionFilterData;
import com.okinc.crcore.coreapi.net.responsebean.transactions.trades.TransactionTradeItem;
import com.okinc.crcore.coreapi.repository.CRTransactionsRepository$getAssetActivityHistory$1;
import com.okinc.crcore.coreapi.repository.CRTransactionsRepository$getAssetActivityHistory$2$1;
import com.okinc.crcore.coreapi.repository.CRTransactionsRepository$getTransactionFilterInfo$1;
import com.okinc.crcore.coreapi.repository.CRTransactionsRepository$getTransactionFilterInfo$2$1;
import com.okinc.crcore.coreapi.repository.CRTransactionsRepository$getTransactionTrades$1;
import com.okinc.crcore.coreapi.repository.CRTransactionsRepository$getTransactionTrades$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mCU {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC31773mDj copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TransactionFilterData>, OKServerException>> continuation) throws java.lang.Throwable {
        CRTransactionsRepository$getTransactionFilterInfo$1 cRTransactionsRepository$getTransactionFilterInfo$1;
        if (continuation instanceof CRTransactionsRepository$getTransactionFilterInfo$1) {
            cRTransactionsRepository$getTransactionFilterInfo$1 = (CRTransactionsRepository$getTransactionFilterInfo$1) continuation;
            int i = cRTransactionsRepository$getTransactionFilterInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cRTransactionsRepository$getTransactionFilterInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                cRTransactionsRepository$getTransactionFilterInfo$1 = new CRTransactionsRepository$getTransactionFilterInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = cRTransactionsRepository$getTransactionFilterInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cRTransactionsRepository$getTransactionFilterInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                CRTransactionsRepository$getTransactionFilterInfo$2$1 cRTransactionsRepository$getTransactionFilterInfo$2$1 = new CRTransactionsRepository$getTransactionFilterInfo$2$1(this, null);
                cRTransactionsRepository$getTransactionFilterInfo$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, cRTransactionsRepository$getTransactionFilterInfo$2$1, cRTransactionsRepository$getTransactionFilterInfo$1);
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
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.Long l2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TransactionTradeItem>, OKServerException>> continuation) throws java.lang.Throwable {
        CRTransactionsRepository$getTransactionTrades$1 cRTransactionsRepository$getTransactionTrades$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof CRTransactionsRepository$getTransactionTrades$1) {
            cRTransactionsRepository$getTransactionTrades$1 = (CRTransactionsRepository$getTransactionTrades$1) continuation;
            int i = cRTransactionsRepository$getTransactionTrades$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cRTransactionsRepository$getTransactionTrades$1.label = i - Integer.MIN_VALUE;
            } else {
                cRTransactionsRepository$getTransactionTrades$1 = new CRTransactionsRepository$getTransactionTrades$1(this, continuation);
            }
        }
        CRTransactionsRepository$getTransactionTrades$1 cRTransactionsRepository$getTransactionTrades$12 = cRTransactionsRepository$getTransactionTrades$1;
        java.lang.Object objWithContext = cRTransactionsRepository$getTransactionTrades$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cRTransactionsRepository$getTransactionTrades$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                CRTransactionsRepository$getTransactionTrades$2$1 cRTransactionsRepository$getTransactionTrades$2$1 = new CRTransactionsRepository$getTransactionTrades$2$1(this, str, str2, l, l2, str3, null);
                cRTransactionsRepository$getTransactionTrades$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, cRTransactionsRepository$getTransactionTrades$2$1, cRTransactionsRepository$getTransactionTrades$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.Long l, java.lang.Long l2, int i, java.lang.Integer num, ActivityCurrency activityCurrency, java.lang.Long l3, java.lang.Long l4, Continuation<? super AbstractC43419rot<TransactionActivityList, OKServerException>> continuation) throws java.lang.Throwable {
        CRTransactionsRepository$getAssetActivityHistory$1 cRTransactionsRepository$getAssetActivityHistory$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof CRTransactionsRepository$getAssetActivityHistory$1) {
            cRTransactionsRepository$getAssetActivityHistory$1 = (CRTransactionsRepository$getAssetActivityHistory$1) continuation;
            int i2 = cRTransactionsRepository$getAssetActivityHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cRTransactionsRepository$getAssetActivityHistory$1.label = i2 - Integer.MIN_VALUE;
            } else {
                cRTransactionsRepository$getAssetActivityHistory$1 = new CRTransactionsRepository$getAssetActivityHistory$1(this, continuation);
            }
        }
        CRTransactionsRepository$getAssetActivityHistory$1 cRTransactionsRepository$getAssetActivityHistory$12 = cRTransactionsRepository$getAssetActivityHistory$1;
        java.lang.Object objWithContext = cRTransactionsRepository$getAssetActivityHistory$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = cRTransactionsRepository$getAssetActivityHistory$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                CRTransactionsRepository$getAssetActivityHistory$2$1 cRTransactionsRepository$getAssetActivityHistory$2$1 = new CRTransactionsRepository$getAssetActivityHistory$2$1(num, activityCurrency, l, l2, i, l3, l4, this, null);
                cRTransactionsRepository$getAssetActivityHistory$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, cRTransactionsRepository$getAssetActivityHistory$2$1, cRTransactionsRepository$getAssetActivityHistory$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mCU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
