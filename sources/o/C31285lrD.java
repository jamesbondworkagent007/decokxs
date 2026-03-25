package o;

import androidx.core.view.PointerIconCompat;
import com.okinc.business.web3pay.lib.core.model.ConvertFailedType;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderSubStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.PagingData;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo;
import com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit;
import com.okinc.business.web3pay.lib.core.network.ws.ClaimStatusSubResponse;
import com.okinc.business.web3pay.lib.core.network.ws.ConvertInfoWS;
import com.okinc.business.web3pay.lib.core.network.ws.TxStatusSubResponse;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$deleteCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getOrderDetail$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getPayOrderList$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getPayOrderListFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getPendingClaimList$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getPendingClaimListFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getTransactionOrderList$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getTransactionOrderListForToken$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardReferralRewardsOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.OrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PagingDataRequest;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.Stage;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderListRequest;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC31338lsD;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31285lrD {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC31383lsw AEQbTJ;
    public final InterfaceC31289lrH EZpvd;

    /* JADX INFO: renamed from: o.lrD$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderType.values().length];
            try {
                iArr[OrderType.CREATE_GIFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderType.CONVERT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderType.CARD_APPROVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderType.CARD_REVOKE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderType.CARD_GROWTH_CENTER_REFERRAL_REWARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.lrD$Application */
    public static final class Application implements Flow<C31386lsz> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.lrD$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TransactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1 transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1;
                if (continuation instanceof TransactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1) {
                    transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1 = (TransactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1) continuation;
                    int i = transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1 = new TransactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    ClaimStatusSubResponse claimStatusSubResponse = (ClaimStatusSubResponse) obj;
                    C31386lsz c31386lsz = new C31386lsz(claimStatusSubResponse.getOrderId(), claimStatusSubResponse.getUsdAmount(), claimStatusSubResponse.getTokenAmount(), claimStatusSubResponse.getTokenSymbol(), claimStatusSubResponse.getFrom(), ClaimStatusSubResponse.Companion.copydefault(claimStatusSubResponse.getOpType()));
                    transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c31386lsz, transactionHistoryRepositoryImpl$subscribeNewClaimOrder$$inlined$map$1$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super C31386lsz> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lrD$TaskDescription */
    public static final class TaskDescription implements Flow<C31339lsE> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.lrD$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1 transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1) {
                    transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1 = (TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1) continuation;
                    int i = transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1 = new TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    TxStatusSubResponse txStatusSubResponse = (TxStatusSubResponse) obj;
                    java.lang.String orderId = txStatusSubResponse.getOrderId();
                    java.lang.String parentOrderId = txStatusSubResponse.getParentOrderId();
                    OrderStatus orderStatusEZpvd = OrderStatus.Companion.EZpvd(txStatusSubResponse.getStatus());
                    java.lang.Integer code = txStatusSubResponse.getCode();
                    java.lang.String uopHash = txStatusSubResponse.getUopHash();
                    if (uopHash == null) {
                        uopHash = "";
                    }
                    java.lang.String str = uopHash;
                    java.lang.String txHash = txStatusSubResponse.getTxHash();
                    java.lang.Long timeToCancel = txStatusSubResponse.getTimeToCancel();
                    long jLongValue = timeToCancel != null ? timeToCancel.longValue() : 0L;
                    OrderType orderTypeOLrzqt = OrderType.Companion.OLrzqt(txStatusSubResponse.getOrderType());
                    ProductCode productCodeAEQbTJ = ProductCode.Companion.AEQbTJ(txStatusSubResponse.getProductCode());
                    java.lang.String merchantId = txStatusSubResponse.getMerchantId();
                    java.util.List<Stage> convertStages = txStatusSubResponse.getConvertStages();
                    if (convertStages != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(convertStages, 10));
                        java.util.Iterator<T> it = convertStages.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Stage) it.next()).toConvertStage());
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    java.lang.Integer failedType = txStatusSubResponse.getFailedType();
                    ConvertFailedType convertFailedTypeKWHzl = failedType != null ? ConvertFailedType.Companion.KWHzl(failedType.intValue()) : null;
                    java.lang.String toTokenAmount = txStatusSubResponse.getToTokenAmount();
                    TxStatusSubResponse.MsgType msgTypeCopydefault = TxStatusSubResponse.MsgType.Companion.copydefault(txStatusSubResponse.getMsgType());
                    java.lang.String tokenSymbol = txStatusSubResponse.getTokenSymbol();
                    java.lang.Integer tokenDecimal = txStatusSubResponse.getTokenDecimal();
                    java.lang.String chainIndex = txStatusSubResponse.getChainIndex();
                    java.lang.String tokenAddress = txStatusSubResponse.getTokenAddress();
                    java.lang.String tokenAmount = txStatusSubResponse.getTokenAmount();
                    java.lang.String tokenLogo = txStatusSubResponse.getTokenLogo();
                    java.lang.String currencyAmount = txStatusSubResponse.getCurrencyAmount();
                    java.lang.String from = txStatusSubResponse.getFrom();
                    java.lang.String to = txStatusSubResponse.getTo();
                    java.lang.Long createTime = txStatusSubResponse.getCreateTime();
                    ReceiverType receiverTypeEZpvd = ReceiverType.Companion.EZpvd(txStatusSubResponse.getReceiverType());
                    java.lang.String areaCode = txStatusSubResponse.getAreaCode();
                    java.lang.Integer subStatus = txStatusSubResponse.getSubStatus();
                    OrderSubStatus orderSubStatusAEQbTJ = subStatus != null ? OrderSubStatus.Companion.AEQbTJ(subStatus.intValue()) : null;
                    java.lang.String tokenCoinTypeNo = txStatusSubResponse.getTokenCoinTypeNo();
                    ConvertInfoWS convertInfo = txStatusSubResponse.getConvertInfo();
                    C31339lsE c31339lsE = new C31339lsE(orderId, parentOrderId, orderStatusEZpvd, code, str, txHash, jLongValue, orderTypeOLrzqt, productCodeAEQbTJ, merchantId, arrayList, convertFailedTypeKWHzl, toTokenAmount, msgTypeCopydefault, tokenSymbol, tokenDecimal, chainIndex, tokenAddress, tokenAmount, tokenLogo, currencyAmount, from, to, createTime, receiverTypeEZpvd, areaCode, orderSubStatusAEQbTJ, tokenCoinTypeNo, convertInfo != null ? C31271lqq.KWHzl(convertInfo) : null, SaCardAuthLimit.Companion.AEQbTJ(txStatusSubResponse.getAuthorizeType()), SACardOrderExtInfo.Companion.OLrzqt(txStatusSubResponse.getExtInfo()));
                    transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c31339lsE, transactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super C31339lsE> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lrD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$deleteCache$1 transactionHistoryRepositoryImpl$deleteCache$1;
        if (continuation instanceof TransactionHistoryRepositoryImpl$deleteCache$1) {
            transactionHistoryRepositoryImpl$deleteCache$1 = (TransactionHistoryRepositoryImpl$deleteCache$1) continuation;
            int i = transactionHistoryRepositoryImpl$deleteCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$deleteCache$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$deleteCache$1 = new TransactionHistoryRepositoryImpl$deleteCache$1(this, continuation);
            }
        }
        java.lang.Object obj = transactionHistoryRepositoryImpl$deleteCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionHistoryRepositoryImpl$deleteCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC31289lrH interfaceC31289lrH = this.EZpvd;
                transactionHistoryRepositoryImpl$deleteCache$1.label = 1;
                if (interfaceC31289lrH.copydefault(transactionHistoryRepositoryImpl$deleteCache$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #6 {all -> 0x01ab, blocks: (B:65:0x015f, B:67:0x0167, B:69:0x016d, B:70:0x017a), top: B:144:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull OrderType orderType, @NotNull Continuation<? super Result<C31337lsC>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getOrderDetail$1 transactionHistoryRepositoryImpl$getOrderDetail$1;
        java.lang.String str2;
        OrderType orderType2;
        C31285lrD c31285lrD;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        AbstractC43419rot actionBar2;
        ResponseData responseData2;
        ResponseData responseData3;
        AbstractC43419rot actionBar3;
        ResponseData responseData4;
        ResponseData responseData5;
        java.lang.String str3 = str;
        OrderType orderType3 = orderType;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getOrderDetail$1) {
            transactionHistoryRepositoryImpl$getOrderDetail$1 = (TransactionHistoryRepositoryImpl$getOrderDetail$1) continuation;
            int i = transactionHistoryRepositoryImpl$getOrderDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getOrderDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getOrderDetail$1 = new TransactionHistoryRepositoryImpl$getOrderDetail$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = transactionHistoryRepositoryImpl$getOrderDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionHistoryRepositoryImpl$getOrderDetail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            int i3 = StateListAnimator.KWHzl[orderType.ordinal()];
            if (i3 == 1) {
                try {
                    InterfaceC31383lsw interfaceC31383lsw = this.AEQbTJ;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$0 = str3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$1 = orderType3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.label = 1;
                    objEZpvd = interfaceC31383lsw.EZpvd(str3, transactionHistoryRepositoryImpl$getOrderDetail$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) objEZpvd;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    actionBar = actionBar2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str2 = str3;
                    orderType2 = orderType3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    java.lang.String str4 = str2;
                    orderType3 = orderType2;
                    str3 = str4;
                }
            } else if (i3 == 2) {
                try {
                    InterfaceC31383lsw interfaceC31383lsw2 = this.AEQbTJ;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$0 = str3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$1 = orderType3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.label = 2;
                    objEZpvd = interfaceC31383lsw2.copydefault(str3, transactionHistoryRepositoryImpl$getOrderDetail$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData2 = (ResponseData) objEZpvd;
                    if (responseData2.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
                    actionBar = actionBar2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    str2 = str3;
                    orderType2 = orderType3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    java.lang.String str42 = str2;
                    orderType3 = orderType2;
                    str3 = str42;
                }
            } else if (i3 == 3 || i3 == 4) {
                try {
                    InterfaceC31383lsw interfaceC31383lsw3 = this.AEQbTJ;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$0 = str3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$1 = orderType3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.label = 3;
                    objEZpvd = interfaceC31383lsw3.KWHzl(str3, transactionHistoryRepositoryImpl$getOrderDetail$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData3 = (ResponseData) objEZpvd;
                    if (responseData3.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData3);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData3.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData3), C43401rob.EZpvd(responseData3), null, 8, null));
                    actionBar = actionBar2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str2 = str3;
                    orderType2 = orderType3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    java.lang.String str422 = str2;
                    orderType3 = orderType2;
                    str3 = str422;
                }
            } else if (i3 == 5) {
                try {
                    InterfaceC31383lsw interfaceC31383lsw4 = this.AEQbTJ;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$0 = this;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$1 = str3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$2 = orderType3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.label = 4;
                    objEZpvd = interfaceC31383lsw4.OLrzqt(str3, transactionHistoryRepositoryImpl$getOrderDetail$1);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    c31285lrD = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar3 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar3 instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c31285lrD = this;
                responseData4 = (ResponseData) objEZpvd;
                if (responseData4.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData4);
                    actionBar3 = new AbstractC43419rot.ActionBar(new OKServerException(responseData4.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData4), C43401rob.EZpvd(responseData4), null, 8, null));
                    if (!(actionBar3 instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
            } else {
                try {
                    InterfaceC31383lsw interfaceC31383lsw5 = this.AEQbTJ;
                    int value = orderType.getValue();
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$0 = str3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.L$1 = orderType3;
                    transactionHistoryRepositoryImpl$getOrderDetail$1.label = 5;
                    objEZpvd = interfaceC31383lsw5.KWHzl(value, str3, transactionHistoryRepositoryImpl$getOrderDetail$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData5 = (ResponseData) objEZpvd;
                    if (responseData5.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData5);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData5.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData5), C43401rob.EZpvd(responseData5), null, 8, null));
                    actionBar = actionBar2;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    str2 = str3;
                    orderType2 = orderType3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    java.lang.String str4222 = str2;
                    orderType3 = orderType2;
                    str3 = str4222;
                }
            }
        } else if (i2 == 1) {
            orderType2 = (OrderType) transactionHistoryRepositoryImpl$getOrderDetail$1.L$1;
            str2 = (java.lang.String) transactionHistoryRepositoryImpl$getOrderDetail$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                orderType3 = orderType2;
                str3 = str2;
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    actionBar = actionBar2;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                java.lang.String str42222 = str2;
                orderType3 = orderType2;
                str3 = str42222;
            }
        } else if (i2 == 2) {
            orderType2 = (OrderType) transactionHistoryRepositoryImpl$getOrderDetail$1.L$1;
            str2 = (java.lang.String) transactionHistoryRepositoryImpl$getOrderDetail$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                orderType3 = orderType2;
                str3 = str2;
                responseData2 = (ResponseData) objEZpvd;
                if (responseData2.getCode() != 0 && responseData2.getData() != null) {
                    java.lang.Object data2 = responseData2.getData();
                    Intrinsics.copydefault(data2);
                    actionBar = new AbstractC43419rot.StateListAnimator(data2);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
                    actionBar = actionBar2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                java.lang.String str422222 = str2;
                orderType3 = orderType2;
                str3 = str422222;
            }
        } else if (i2 == 3) {
            orderType2 = (OrderType) transactionHistoryRepositoryImpl$getOrderDetail$1.L$1;
            str2 = (java.lang.String) transactionHistoryRepositoryImpl$getOrderDetail$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                orderType3 = orderType2;
                str3 = str2;
                responseData3 = (ResponseData) objEZpvd;
                if (responseData3.getCode() != 0 && responseData3.getData() != null) {
                    java.lang.Object data3 = responseData3.getData();
                    Intrinsics.copydefault(data3);
                    actionBar = new AbstractC43419rot.StateListAnimator(data3);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData3);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData3.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData3), C43401rob.EZpvd(responseData3), null, 8, null));
                    actionBar = actionBar2;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                java.lang.String str4222222 = str2;
                orderType3 = orderType2;
                str3 = str4222222;
            }
        } else if (i2 == 4) {
            OrderType orderType4 = (OrderType) transactionHistoryRepositoryImpl$getOrderDetail$1.L$2;
            java.lang.String str5 = (java.lang.String) transactionHistoryRepositoryImpl$getOrderDetail$1.L$1;
            c31285lrD = (C31285lrD) transactionHistoryRepositoryImpl$getOrderDetail$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                orderType3 = orderType4;
                str3 = str5;
                try {
                    responseData4 = (ResponseData) objEZpvd;
                    if (responseData4.getCode() != 0 && responseData4.getData() != null) {
                        java.lang.Object data4 = responseData4.getData();
                        Intrinsics.copydefault(data4);
                        actionBar3 = new AbstractC43419rot.StateListAnimator(data4);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData4);
                        actionBar3 = new AbstractC43419rot.ActionBar(new OKServerException(responseData4.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData4), C43401rob.EZpvd(responseData4), null, 8, null));
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar3 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                orderType3 = orderType4;
                str3 = str5;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar3 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (!(actionBar3 instanceof AbstractC43419rot.StateListAnimator)) {
                }
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            if (!(actionBar3 instanceof AbstractC43419rot.StateListAnimator)) {
                actionBar = new AbstractC43419rot.StateListAnimator(c31285lrD.copydefault((CardReferralRewardsOrderDetailApiModel) ((AbstractC43419rot.StateListAnimator) actionBar3).KWHzl()));
            } else {
                if (!(actionBar3 instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar3).KWHzl());
            }
        } else {
            if (i2 != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            orderType2 = (OrderType) transactionHistoryRepositoryImpl$getOrderDetail$1.L$1;
            str2 = (java.lang.String) transactionHistoryRepositoryImpl$getOrderDetail$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                orderType3 = orderType2;
                str3 = str2;
                responseData5 = (ResponseData) objEZpvd;
                if (responseData5.getCode() != 0 && responseData5.getData() != null) {
                    java.lang.Object data5 = responseData5.getData();
                    Intrinsics.copydefault(data5);
                    actionBar = new AbstractC43419rot.StateListAnimator(data5);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData5);
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData5.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData5), C43401rob.EZpvd(responseData5), null, 8, null));
                    actionBar = actionBar2;
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                java.lang.String str42222222 = str2;
                orderType3 = orderType2;
                str3 = str42222222;
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((BaseOrderDetailApiModel) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).toDomainModel());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar4 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("TransactionHistoryRepository", "getOrderDetail(" + str3 + ", " + orderType3 + ")", (java.lang.Throwable) actionBar4.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar4.KWHzl()));
    }

    public final OrderDetailApiModel copydefault(@NotNull CardReferralRewardsOrderDetailApiModel cardReferralRewardsOrderDetailApiModel) {
        Intrinsics.checkNotNullParameter(cardReferralRewardsOrderDetailApiModel, "");
        java.lang.String orderId = cardReferralRewardsOrderDetailApiModel.getOrderId();
        java.lang.String parentOrderId = cardReferralRewardsOrderDetailApiModel.getParentOrderId();
        java.lang.String uopHash = cardReferralRewardsOrderDetailApiModel.getUopHash();
        java.lang.String txHash = cardReferralRewardsOrderDetailApiModel.getTxHash();
        java.lang.String chainIndex = cardReferralRewardsOrderDetailApiModel.getChainIndex();
        int orderType = cardReferralRewardsOrderDetailApiModel.getOrderType();
        java.lang.String merchantId = cardReferralRewardsOrderDetailApiModel.getMerchantId();
        java.lang.String productCode = cardReferralRewardsOrderDetailApiModel.getProductCode();
        java.lang.String from = cardReferralRewardsOrderDetailApiModel.getFrom();
        java.lang.Integer fromType = cardReferralRewardsOrderDetailApiModel.getFromType();
        java.lang.String to = cardReferralRewardsOrderDetailApiModel.getTo();
        java.lang.String areaCode = cardReferralRewardsOrderDetailApiModel.getAreaCode();
        java.lang.Integer toType = cardReferralRewardsOrderDetailApiModel.getToType();
        java.lang.String tokenAmount = cardReferralRewardsOrderDetailApiModel.getTokenAmount();
        int tokenDecimal = cardReferralRewardsOrderDetailApiModel.getTokenDecimal();
        java.lang.String tokenUsdAmount = cardReferralRewardsOrderDetailApiModel.getTokenUsdAmount();
        java.lang.String tokenLogo = cardReferralRewardsOrderDetailApiModel.getTokenLogo();
        java.lang.String tokenSymbol = cardReferralRewardsOrderDetailApiModel.getTokenSymbol();
        java.lang.String tokenAddress = cardReferralRewardsOrderDetailApiModel.getTokenAddress();
        java.lang.String feeTokenSymbol = cardReferralRewardsOrderDetailApiModel.getFeeTokenSymbol();
        java.lang.String str = feeTokenSymbol == null ? "" : feeTokenSymbol;
        java.lang.Integer feeTokenDecimal = cardReferralRewardsOrderDetailApiModel.getFeeTokenDecimal();
        return new OrderDetailApiModel(orderId, parentOrderId, uopHash, txHash, chainIndex, orderType, merchantId, productCode, from, fromType, to, areaCode, toType, tokenAmount, tokenDecimal, tokenUsdAmount, tokenLogo, tokenSymbol, tokenAddress, str, feeTokenDecimal != null ? feeTokenDecimal.intValue() : 0, cardReferralRewardsOrderDetailApiModel.getFeeTokenAmount(), cardReferralRewardsOrderDetailApiModel.getFeeTokenUsdAmount(), cardReferralRewardsOrderDetailApiModel.getStatus(), cardReferralRewardsOrderDetailApiModel.getErrMsg(), cardReferralRewardsOrderDetailApiModel.getFailedType(), cardReferralRewardsOrderDetailApiModel.getTransferComment(), cardReferralRewardsOrderDetailApiModel.getCreateTime(), cardReferralRewardsOrderDetailApiModel.getTimeToCancel(), cardReferralRewardsOrderDetailApiModel.getGasPayType(), cardReferralRewardsOrderDetailApiModel.getNetworkName(), cardReferralRewardsOrderDetailApiModel.getNetworkLogo(), cardReferralRewardsOrderDetailApiModel.getActivationFeeTokenAmount(), cardReferralRewardsOrderDetailApiModel.getActivationFeeUsdAmount(), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (ExternalFeeInfo) null, 0, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:33:0x008a, B:35:0x0092, B:37:0x0098, B:38:0x00a5), top: B:74:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd A[Catch: all -> 0x003d, CancellationException -> 0x0040, TRY_ENTER, TryCatch #6 {CancellationException -> 0x0040, all -> 0x003d, blocks: (B:13:0x0038, B:57:0x011f, B:58:0x0136, B:60:0x013c, B:61:0x014a, B:50:0x00fd, B:52:0x010d), top: B:80:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super Result<PagingData<C31343lsI>>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getPayOrderList$1 transactionHistoryRepositoryImpl$getPayOrderList$1;
        java.lang.String str3;
        C31285lrD c31285lrD;
        InterfaceC31383lsw interfaceC31383lsw;
        PagingDataRequest pagingDataRequest;
        AbstractC43419rot actionBar;
        PagingData<PayOrderApiModel> pagingData;
        PagingData<PayOrderApiModel> pagingData2;
        ResponseData responseData;
        java.lang.String str4 = str2;
        int i2 = i;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getPayOrderList$1) {
            transactionHistoryRepositoryImpl$getPayOrderList$1 = (TransactionHistoryRepositoryImpl$getPayOrderList$1) continuation;
            int i3 = transactionHistoryRepositoryImpl$getPayOrderList$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getPayOrderList$1.label = i3 - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getPayOrderList$1 = new TransactionHistoryRepositoryImpl$getPayOrderList$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = transactionHistoryRepositoryImpl$getPayOrderList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = transactionHistoryRepositoryImpl$getPayOrderList$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                try {
                    interfaceC31383lsw = this.AEQbTJ;
                    pagingDataRequest = new PagingDataRequest(str4, i2);
                    transactionHistoryRepositoryImpl$getPayOrderList$1.L$0 = this;
                    str3 = str;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str3 = str;
                }
                try {
                    transactionHistoryRepositoryImpl$getPayOrderList$1.L$1 = str3;
                    transactionHistoryRepositoryImpl$getPayOrderList$1.L$2 = str4;
                    transactionHistoryRepositoryImpl$getPayOrderList$1.I$0 = i2;
                    transactionHistoryRepositoryImpl$getPayOrderList$1.label = 1;
                    objAEQbTJ = interfaceC31383lsw.AEQbTJ(pagingDataRequest, transactionHistoryRepositoryImpl$getPayOrderList$1);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c31285lrD = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c31285lrD = this;
                responseData = (ResponseData) objAEQbTJ;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } else if (i4 == 1) {
                int i5 = transactionHistoryRepositoryImpl$getPayOrderList$1.I$0;
                java.lang.String str5 = (java.lang.String) transactionHistoryRepositoryImpl$getPayOrderList$1.L$2;
                java.lang.String str6 = (java.lang.String) transactionHistoryRepositoryImpl$getPayOrderList$1.L$1;
                c31285lrD = (C31285lrD) transactionHistoryRepositoryImpl$getPayOrderList$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    str3 = str6;
                    i2 = i5;
                    str4 = str5;
                    try {
                        responseData = (ResponseData) objAEQbTJ;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str3 = str6;
                    i2 = i5;
                    str4 = str5;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                    pUU.AEQbTJ("TransactionHistoryRepository", "getPayOrderList(" + str3 + ", " + str4 + ", " + i2 + ")", (java.lang.Throwable) actionBar2.KWHzl());
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
                }
                Result.Application application2 = Result.Companion;
                pagingData = (PagingData) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                if (str4.length() == 0) {
                    transactionHistoryRepositoryImpl$getPayOrderList$1.L$0 = pagingData;
                    transactionHistoryRepositoryImpl$getPayOrderList$1.L$1 = null;
                    transactionHistoryRepositoryImpl$getPayOrderList$1.L$2 = null;
                    transactionHistoryRepositoryImpl$getPayOrderList$1.label = 2;
                    if (c31285lrD.KWHzl(pagingData, str3, transactionHistoryRepositoryImpl$getPayOrderList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    pagingData2 = pagingData;
                    pagingData = pagingData2;
                }
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagingData2 = (PagingData) transactionHistoryRepositoryImpl$getPayOrderList$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                pagingData = pagingData2;
            }
            java.lang.String nextCursor = pagingData.getNextCursor();
            java.util.List<PayOrderApiModel> orderList = pagingData.getOrderList();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
            java.util.Iterator<T> it = orderList.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31382lsv) it.next()).toDomainModel());
            }
            return Result.m7377constructorimpl(new PagingData(nextCursor, arrayList));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th5) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th5);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<PagingData<C31343lsI>>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getPayOrderListFromCache$1 transactionHistoryRepositoryImpl$getPayOrderListFromCache$1;
        PagingData pagingData;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getPayOrderListFromCache$1) {
            transactionHistoryRepositoryImpl$getPayOrderListFromCache$1 = (TransactionHistoryRepositoryImpl$getPayOrderListFromCache$1) continuation;
            int i = transactionHistoryRepositoryImpl$getPayOrderListFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getPayOrderListFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getPayOrderListFromCache$1 = new TransactionHistoryRepositoryImpl$getPayOrderListFromCache$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = transactionHistoryRepositoryImpl$getPayOrderListFromCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionHistoryRepositoryImpl$getPayOrderListFromCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                InterfaceC31289lrH interfaceC31289lrH = this.EZpvd;
                transactionHistoryRepositoryImpl$getPayOrderListFromCache$1.label = 1;
                objOLrzqt = interfaceC31289lrH.OLrzqt(str, transactionHistoryRepositoryImpl$getPayOrderListFromCache$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            PagingData pagingData2 = (PagingData) objOLrzqt;
            if (pagingData2 != null) {
                java.lang.String nextCursor = pagingData2.getNextCursor();
                java.util.List orderList = pagingData2.getOrderList();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
                java.util.Iterator it = orderList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC31382lsv) it.next()).toDomainModel());
                }
                pagingData = new PagingData(nextCursor, arrayList);
            } else {
                pagingData = null;
            }
            return Result.m7377constructorimpl(pagingData);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #6 {all -> 0x00ce, blocks: (B:35:0x0082, B:37:0x008a, B:39:0x0090, B:40:0x009d), top: B:82:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb A[Catch: all -> 0x003b, CancellationException -> 0x003e, TRY_ENTER, TryCatch #7 {CancellationException -> 0x003e, all -> 0x003b, blocks: (B:13:0x0036, B:63:0x011f, B:54:0x00fb, B:56:0x0107, B:58:0x010d), top: B:84:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, int i, java.lang.String str2, @NotNull Continuation<? super Result<C31342lsH>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getPendingClaimList$1 transactionHistoryRepositoryImpl$getPendingClaimList$1;
        java.lang.String str3;
        int i2;
        java.lang.String str4;
        C31285lrD c31285lrD;
        InterfaceC31383lsw interfaceC31383lsw;
        java.lang.Integer numAEQbTJ;
        AbstractC43419rot actionBar;
        PendingClaimOrderResponse pendingClaimOrderResponse;
        PendingClaimOrderResponse pendingClaimOrderResponse2;
        ResponseData responseData;
        java.lang.String str5 = str2;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getPendingClaimList$1) {
            transactionHistoryRepositoryImpl$getPendingClaimList$1 = (TransactionHistoryRepositoryImpl$getPendingClaimList$1) continuation;
            int i3 = transactionHistoryRepositoryImpl$getPendingClaimList$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getPendingClaimList$1.label = i3 - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getPendingClaimList$1 = new TransactionHistoryRepositoryImpl$getPendingClaimList$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = transactionHistoryRepositoryImpl$getPendingClaimList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = transactionHistoryRepositoryImpl$getPendingClaimList$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                try {
                    interfaceC31383lsw = this.AEQbTJ;
                    numAEQbTJ = C56443yFo.AEQbTJ(i);
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.L$0 = this;
                    str3 = str;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str3 = str;
                }
                try {
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.L$1 = str3;
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.L$2 = str5;
                    i2 = i;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    i2 = i;
                    str4 = str3;
                    c31285lrD = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
                try {
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.I$0 = i2;
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.label = 1;
                    objEZpvd = interfaceC31383lsw.EZpvd(numAEQbTJ, str5, transactionHistoryRepositoryImpl$getPendingClaimList$1);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str4 = str3;
                    c31285lrD = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str3;
                c31285lrD = this;
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
            } else if (i4 == 1) {
                int i5 = transactionHistoryRepositoryImpl$getPendingClaimList$1.I$0;
                java.lang.String str6 = (java.lang.String) transactionHistoryRepositoryImpl$getPendingClaimList$1.L$2;
                str4 = (java.lang.String) transactionHistoryRepositoryImpl$getPendingClaimList$1.L$1;
                c31285lrD = (C31285lrD) transactionHistoryRepositoryImpl$getPendingClaimList$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    i2 = i5;
                    str5 = str6;
                    try {
                        responseData = (ResponseData) objEZpvd;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    i2 = i5;
                    str5 = str6;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                }
                if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                    if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                    pUU.AEQbTJ("TransactionHistoryRepository", "getPendingClaimList(" + str4 + ", " + i2 + ", " + str5 + ")", (java.lang.Throwable) actionBar2.KWHzl());
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
                }
                Result.Application application2 = Result.Companion;
                pendingClaimOrderResponse = (PendingClaimOrderResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                if (str5 == null || str5.length() == 0) {
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.L$0 = pendingClaimOrderResponse;
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.L$1 = null;
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.L$2 = null;
                    transactionHistoryRepositoryImpl$getPendingClaimList$1.label = 2;
                    if (c31285lrD.OLrzqt(pendingClaimOrderResponse, str4, transactionHistoryRepositoryImpl$getPendingClaimList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    pendingClaimOrderResponse2 = pendingClaimOrderResponse;
                    pendingClaimOrderResponse = pendingClaimOrderResponse2;
                }
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pendingClaimOrderResponse2 = (PendingClaimOrderResponse) transactionHistoryRepositoryImpl$getPendingClaimList$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                pendingClaimOrderResponse = pendingClaimOrderResponse2;
            }
            return Result.m7377constructorimpl(C31385lsy.OLrzqt(pendingClaimOrderResponse));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th6) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th6);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<C31342lsH>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getPendingClaimListFromCache$1 transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getPendingClaimListFromCache$1) {
            transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1 = (TransactionHistoryRepositoryImpl$getPendingClaimListFromCache$1) continuation;
            int i = transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1 = new TransactionHistoryRepositoryImpl$getPendingClaimListFromCache$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objDjBIcL);
                Result.Application application = Result.Companion;
                InterfaceC31289lrH interfaceC31289lrH = this.EZpvd;
                transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1.label = 1;
                objDjBIcL = interfaceC31289lrH.djBIcL(str, transactionHistoryRepositoryImpl$getPendingClaimListFromCache$1);
                if (objDjBIcL == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objDjBIcL);
            }
            PendingClaimOrderResponse pendingClaimOrderResponse = (PendingClaimOrderResponse) objDjBIcL;
            return Result.m7377constructorimpl(pendingClaimOrderResponse != null ? C31385lsy.OLrzqt(pendingClaimOrderResponse) : null);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #5 {all -> 0x015b, blocks: (B:56:0x0101, B:58:0x0109, B:60:0x010f, B:61:0x011d), top: B:122:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196 A[Catch: all -> 0x003e, CancellationException -> 0x0041, TRY_ENTER, TryCatch #11 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:92:0x01c7, B:93:0x01de, B:95:0x01e4, B:96:0x01f2, B:81:0x0196, B:83:0x01a3, B:86:0x01ab, B:89:0x01b2), top: B:132:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4 A[Catch: all -> 0x003e, CancellationException -> 0x0041, LOOP:0: B:93:0x01de->B:95:0x01e4, LOOP_END, TryCatch #11 {CancellationException -> 0x0041, all -> 0x003e, blocks: (B:13:0x0039, B:92:0x01c7, B:93:0x01de, B:95:0x01e4, B:96:0x01f2, B:81:0x0196, B:83:0x01a3, B:86:0x01ab, B:89:0x01b2), top: B:132:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(java.lang.Long l, java.lang.Long l2, java.util.List<? extends OrderType> list, ProductCode productCode, java.lang.String str, int i, java.lang.String str2, @NotNull Continuation<? super AbstractC31338lsD> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getTransactionOrderList$1 transactionHistoryRepositoryImpl$getTransactionOrderList$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Long l3;
        java.lang.Long l4;
        java.lang.String str3;
        int i2;
        java.lang.String str4;
        C31285lrD c31285lrD;
        java.lang.String str5;
        java.util.ArrayList arrayList;
        AbstractC43419rot actionBar;
        PagingData<TransactionOrderApiModel> pagingData;
        ResponseData responseData;
        java.util.Iterator<T> it;
        java.util.List<? extends OrderType> list2 = list;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getTransactionOrderList$1) {
            transactionHistoryRepositoryImpl$getTransactionOrderList$1 = (TransactionHistoryRepositoryImpl$getTransactionOrderList$1) continuation;
            int i3 = transactionHistoryRepositoryImpl$getTransactionOrderList$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getTransactionOrderList$1.label = i3 - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getTransactionOrderList$1 = new TransactionHistoryRepositoryImpl$getTransactionOrderList$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = transactionHistoryRepositoryImpl$getTransactionOrderList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = transactionHistoryRepositoryImpl$getTransactionOrderList$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                try {
                    InterfaceC31383lsw interfaceC31383lsw = this.AEQbTJ;
                    if (list2 != null) {
                        try {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                            java.util.Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(C56443yFo.AEQbTJ(((OrderType) it2.next()).getValue()));
                            }
                            arrayList = arrayList2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            l3 = l;
                            l4 = l2;
                            str5 = str;
                            i2 = i;
                            str4 = str2;
                            c31285lrD = this;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    TransactionOrderListRequest transactionOrderListRequest = new TransactionOrderListRequest((java.lang.String) null, (java.lang.String) null, l, l2, arrayList, productCode != null ? productCode.getValue() : null, str, i, 3, (DefaultConstructorMarker) null);
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$0 = this;
                    l3 = l;
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$1 = l3;
                        l4 = l2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        l4 = l2;
                        str3 = str;
                        i2 = i;
                        str4 = str2;
                        c31285lrD = this;
                        str5 = str3;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$2 = l4;
                        transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$3 = list2;
                        str3 = str;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        str3 = str;
                        i2 = i;
                        str4 = str2;
                        c31285lrD = this;
                        str5 = str3;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$4 = str3;
                        str4 = str2;
                        try {
                            transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$5 = str4;
                            i2 = i;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i2 = i;
                        }
                        try {
                            transactionHistoryRepositoryImpl$getTransactionOrderList$1.I$0 = i2;
                            transactionHistoryRepositoryImpl$getTransactionOrderList$1.label = 1;
                            objAEQbTJ = interfaceC31383lsw.AEQbTJ(transactionOrderListRequest, transactionHistoryRepositoryImpl$getTransactionOrderList$1);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            c31285lrD = this;
                            str5 = str3;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        i2 = i;
                        str4 = str2;
                        c31285lrD = this;
                        str5 = str3;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    l3 = l;
                }
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c31285lrD = this;
                str5 = str3;
                responseData = (ResponseData) objAEQbTJ;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } else if (i4 == 1) {
                int i5 = transactionHistoryRepositoryImpl$getTransactionOrderList$1.I$0;
                java.lang.String str6 = (java.lang.String) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$5;
                str5 = (java.lang.String) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$4;
                java.util.List<? extends OrderType> list3 = (java.util.List) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$3;
                l4 = (java.lang.Long) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$2;
                java.lang.Long l5 = (java.lang.Long) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$1;
                C31285lrD c31285lrD2 = (C31285lrD) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    i2 = i5;
                    list2 = list3;
                    l3 = l5;
                    str4 = str6;
                    c31285lrD = c31285lrD2;
                    try {
                        responseData = (ResponseData) objAEQbTJ;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    i2 = i5;
                    list2 = list3;
                    l3 = l5;
                    str4 = str6;
                    c31285lrD = c31285lrD2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                    if (((OKServerException) actionBar2.KWHzl()).getCode() == 10002) {
                        return AbstractC31338lsD.Activity.EZpvd;
                    }
                    pUU.AEQbTJ("TransactionHistoryRepository", "getTransactionOrderList(" + l3 + ", " + l4 + ", " + list2 + ", " + str5 + ", " + i2 + ")", (java.lang.Throwable) actionBar2.KWHzl());
                    return new AbstractC31338lsD.StateListAnimator((java.lang.Throwable) actionBar2.KWHzl());
                }
                Result.Application application = Result.Companion;
                pagingData = (PagingData) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                if ((str5 == null || str5.length() == 0) && str4 != null && str4.length() != 0) {
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$0 = pagingData;
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$1 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$2 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$3 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$4 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$5 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderList$1.label = 2;
                    if (c31285lrD.copydefault(pagingData, str4, transactionHistoryRepositoryImpl$getTransactionOrderList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                java.lang.String nextCursor = pagingData.getNextCursor();
                java.util.List<TransactionOrderApiModel> orderList = pagingData.getOrderList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
                it = orderList.iterator();
                while (it.hasNext()) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new PagingData(nextCursor, arrayList3));
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagingData = (PagingData) transactionHistoryRepositoryImpl$getTransactionOrderList$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                java.lang.String nextCursor2 = pagingData.getNextCursor();
                java.util.List<TransactionOrderApiModel> orderList2 = pagingData.getOrderList();
                java.util.ArrayList arrayList32 = new java.util.ArrayList(C56403yEb.AYXKKw(orderList2, 10));
                it = orderList2.iterator();
                while (it.hasNext()) {
                    arrayList32.add(((InterfaceC31382lsv) it.next()).toDomainModel());
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new PagingData(nextCursor2, arrayList32));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th10) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th10);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th10));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return new AbstractC31338lsD.TaskDescription((PagingData) objM7377constructorimpl);
        }
        return new AbstractC31338lsD.StateListAnimator(thM7380exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #8 {all -> 0x00fc, blocks: (B:41:0x00af, B:43:0x00b7, B:45:0x00bd, B:46:0x00cb), top: B:102:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134 A[Catch: all -> 0x0039, CancellationException -> 0x003c, TRY_ENTER, TryCatch #10 {CancellationException -> 0x003c, all -> 0x0039, blocks: (B:13:0x0034, B:75:0x0168, B:76:0x017f, B:78:0x0185, B:79:0x0193, B:66:0x0134, B:68:0x0140, B:70:0x0146), top: B:106:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull Continuation<? super Result<PagingData<C31340lsF>>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getTransactionOrderListForToken$1 transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        int i2;
        C31285lrD c31285lrD;
        InterfaceC31383lsw interfaceC31383lsw;
        TransactionOrderListRequest transactionOrderListRequest;
        AbstractC43419rot actionBar;
        PagingData<TransactionOrderApiModel> pagingData;
        PagingData<TransactionOrderApiModel> pagingData2;
        ResponseData responseData;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getTransactionOrderListForToken$1) {
            transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1 = (TransactionHistoryRepositoryImpl$getTransactionOrderListForToken$1) continuation;
            int i3 = transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.label = i3 - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1 = new TransactionHistoryRepositoryImpl$getTransactionOrderListForToken$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                try {
                    interfaceC31383lsw = this.AEQbTJ;
                    transactionOrderListRequest = new TransactionOrderListRequest(str2, str3, (java.lang.Long) null, (java.lang.Long) null, (java.util.List) null, (java.lang.String) null, str4, i, 60, (DefaultConstructorMarker) null);
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$0 = this;
                    str5 = str;
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$1 = str5;
                        str6 = str2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                        i2 = i;
                        c31285lrD = this;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$2 = str6;
                        str7 = str3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        str7 = str3;
                        str8 = str4;
                        i2 = i;
                        c31285lrD = this;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$3 = str7;
                        str8 = str4;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        str8 = str4;
                        i2 = i;
                        c31285lrD = this;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str5 = str;
                }
                try {
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$4 = str8;
                    i2 = i;
                    try {
                        transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.I$0 = i2;
                        transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.label = 1;
                        objAEQbTJ = interfaceC31383lsw.AEQbTJ(transactionOrderListRequest, transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        c31285lrD = this;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    i2 = i;
                    c31285lrD = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c31285lrD = this;
                responseData = (ResponseData) objAEQbTJ;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } else if (i4 == 1) {
                int i5 = transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.I$0;
                java.lang.String str9 = (java.lang.String) transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$4;
                java.lang.String str10 = (java.lang.String) transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$3;
                str6 = (java.lang.String) transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$2;
                java.lang.String str11 = (java.lang.String) transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$1;
                C31285lrD c31285lrD2 = (C31285lrD) transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    i2 = i5;
                    c31285lrD = c31285lrD2;
                    str8 = str9;
                    str7 = str10;
                    str5 = str11;
                    try {
                        responseData = (ResponseData) objAEQbTJ;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    i2 = i5;
                    c31285lrD = c31285lrD2;
                    str8 = str9;
                    str7 = str10;
                    str5 = str11;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                    pUU.AEQbTJ("TransactionHistoryRepository", "getTransactionOrderListForToken(" + str5 + ", " + str6 + ", " + str7 + ", " + str8 + ", " + i2 + ")", (java.lang.Throwable) actionBar2.KWHzl());
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
                }
                Result.Application application2 = Result.Companion;
                pagingData = (PagingData) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                if (str8 == null || str8.length() == 0) {
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$0 = pagingData;
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$1 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$2 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$3 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$4 = null;
                    transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.label = 2;
                    if (c31285lrD.AEQbTJ(pagingData, str6, str7, str5, transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    pagingData2 = pagingData;
                    pagingData = pagingData2;
                }
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagingData2 = (PagingData) transactionHistoryRepositoryImpl$getTransactionOrderListForToken$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                pagingData = pagingData2;
            }
            java.lang.String nextCursor = pagingData.getNextCursor();
            java.util.List<TransactionOrderApiModel> orderList = pagingData.getOrderList();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
            java.util.Iterator<T> it = orderList.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31382lsv) it.next()).toDomainModel());
            }
            return Result.m7377constructorimpl(new PagingData(nextCursor, arrayList));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th9) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th9);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<PagingData<C31340lsF>>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1 transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1;
        PagingData pagingData;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1) {
            transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1 = (TransactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1) continuation;
            int i = transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1 = new TransactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                InterfaceC31289lrH interfaceC31289lrH = this.EZpvd;
                transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1.label = 1;
                objOLrzqt = interfaceC31289lrH.OLrzqt(str, str2, str3, transactionHistoryRepositoryImpl$getTransactionOrderListForTokenFromCache$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            PagingData pagingData2 = (PagingData) objOLrzqt;
            if (pagingData2 != null) {
                java.lang.String nextCursor = pagingData2.getNextCursor();
                java.util.List orderList = pagingData2.getOrderList();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
                java.util.Iterator it = orderList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC31382lsv) it.next()).toDomainModel());
                }
                pagingData = new PagingData(nextCursor, arrayList);
            } else {
                pagingData = null;
            }
            return Result.m7377constructorimpl(pagingData);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object KWHzl(PagingData<PayOrderApiModel> pagingData, java.lang.String str, Continuation<? super Unit> continuation) {
        java.util.List<PayOrderApiModel> orderList = pagingData.getOrderList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
        int i = 0;
        for (java.lang.Object obj : orderList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new PayOrderEntity(str, (PayOrderApiModel) obj, i));
            i++;
        }
        java.lang.Object objKWHzl = this.EZpvd.KWHzl(str, arrayList, pagingData.getNextCursor(), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(PagingData<TransactionOrderApiModel> pagingData, java.lang.String str, Continuation<? super Unit> continuation) {
        java.util.List<TransactionOrderApiModel> orderList = pagingData.getOrderList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
        int i = 0;
        for (java.lang.Object obj : orderList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new TransactionOrderEntity(str, ((TransactionOrderApiModel) obj).toTransactionOrderEmbeddedEntity(), i));
            i++;
        }
        java.lang.Object objAEQbTJ = this.EZpvd.AEQbTJ(str, arrayList, pagingData.getNextCursor(), continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<PagingData<C31340lsF>>> continuation) throws java.lang.Throwable {
        TransactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1 transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1;
        PagingData pagingData;
        if (continuation instanceof TransactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1) {
            transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1 = (TransactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1) continuation;
            int i = transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1 = new TransactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1(this, continuation);
            }
        }
        java.lang.Object objAkhnZx = transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAkhnZx);
                Result.Application application = Result.Companion;
                InterfaceC31289lrH interfaceC31289lrH = this.EZpvd;
                transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1.label = 1;
                objAkhnZx = interfaceC31289lrH.AkhnZx(str, transactionHistoryRepositoryImpl$getTransactionOrderListFromCache$1);
                if (objAkhnZx == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAkhnZx);
            }
            PagingData pagingData2 = (PagingData) objAkhnZx;
            if (pagingData2 != null) {
                java.lang.String nextCursor = pagingData2.getNextCursor();
                java.util.List orderList = pagingData2.getOrderList();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
                java.util.Iterator it = orderList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC31382lsv) it.next()).toDomainModel());
                }
                pagingData = new PagingData(nextCursor, arrayList);
            } else {
                pagingData = null;
            }
            return Result.m7377constructorimpl(pagingData);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object OLrzqt(PendingClaimOrderResponse pendingClaimOrderResponse, java.lang.String str, Continuation<? super Unit> continuation) {
        java.util.List<PendingClaimOrderApiModel> orderList = pendingClaimOrderResponse.getOrderList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
        int i = 0;
        for (java.lang.Object obj : orderList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new PendingClaimOrderEntity(str, (PendingClaimOrderApiModel) obj, i));
            i++;
        }
        java.lang.Object objKWHzl = this.EZpvd.KWHzl(str, arrayList, pendingClaimOrderResponse.getNextCursor(), pendingClaimOrderResponse.getTotal(), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(PagingData<TransactionOrderApiModel> pagingData, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super Unit> continuation) {
        java.util.List<TransactionOrderApiModel> orderList = pagingData.getOrderList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
        int i = 0;
        for (java.lang.Object obj : orderList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new TransactionOrderForTokenEntity(str3, str, str2, ((TransactionOrderApiModel) obj).toTransactionOrderEmbeddedEntity(), i));
            i++;
        }
        java.lang.Object objEZpvd = this.EZpvd.EZpvd(str3, str, str2, arrayList, pagingData.getNextCursor(), continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }
}
