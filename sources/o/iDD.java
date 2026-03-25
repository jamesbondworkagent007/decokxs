package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionProtocolsReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.repository.InvestTransactionRepositoryImpl$getInitialInfo$1;
import com.okinc.business.invest_biz.data.repository.InvestTransactionRepositoryImpl$getSubscribeProtocols$1;
import com.okinc.business.invest_biz.data.repository.InvestTransactionRepositoryImpl$getSubscribeProtocols$2;
import com.okinc.business.invest_biz.data.repository.InvestTransactionRepositoryImpl$getSubscribeReceiveInfo$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDD implements InterfaceC23643iDz {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC23589iBz AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public iDD(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23589iBz;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23643iDz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq, @NotNull Continuation<? super Result<InvestSubscriptionInfo>> continuation) throws java.lang.Throwable {
        InvestTransactionRepositoryImpl$getInitialInfo$1 investTransactionRepositoryImpl$getInitialInfo$1;
        if (continuation instanceof InvestTransactionRepositoryImpl$getInitialInfo$1) {
            investTransactionRepositoryImpl$getInitialInfo$1 = (InvestTransactionRepositoryImpl$getInitialInfo$1) continuation;
            int i = investTransactionRepositoryImpl$getInitialInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investTransactionRepositoryImpl$getInitialInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                investTransactionRepositoryImpl$getInitialInfo$1 = new InvestTransactionRepositoryImpl$getInitialInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = investTransactionRepositoryImpl$getInitialInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investTransactionRepositoryImpl$getInitialInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.AEQbTJ;
                java.lang.String accountId = investSubscriptionInitialReq.getAccountId();
                investTransactionRepositoryImpl$getInitialInfo$1.L$0 = investSubscriptionInitialReq;
                investTransactionRepositoryImpl$getInitialInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, investTransactionRepositoryImpl$getInitialInfo$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
                    Intrinsics.copydefault(objUnwrapResponseData$default);
                    return Result.m7377constructorimpl((InvestSubscriptionInfo) objUnwrapResponseData$default);
                }
                investSubscriptionInitialReq = (InvestSubscriptionInitialReq) investTransactionRepositoryImpl$getInitialInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            investTransactionRepositoryImpl$getInitialInfo$1.L$0 = null;
            investTransactionRepositoryImpl$getInitialInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).EZpvd(investSubscriptionInitialReq, investTransactionRepositoryImpl$getInitialInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((InvestSubscriptionInfo) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23643iDz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq, @NotNull Continuation<? super Result<InvestSubscriptionReceiveInfo>> continuation) throws java.lang.Throwable {
        InvestTransactionRepositoryImpl$getSubscribeReceiveInfo$1 investTransactionRepositoryImpl$getSubscribeReceiveInfo$1;
        if (continuation instanceof InvestTransactionRepositoryImpl$getSubscribeReceiveInfo$1) {
            investTransactionRepositoryImpl$getSubscribeReceiveInfo$1 = (InvestTransactionRepositoryImpl$getSubscribeReceiveInfo$1) continuation;
            int i = investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                investTransactionRepositoryImpl$getSubscribeReceiveInfo$1 = new InvestTransactionRepositoryImpl$getSubscribeReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.AEQbTJ;
                java.lang.String accountId = investSubscriptionReceiveReq.getAccountId();
                investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.L$0 = investSubscriptionReceiveReq;
                investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, investTransactionRepositoryImpl$getSubscribeReceiveInfo$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
                    Intrinsics.copydefault(objUnwrapResponseData$default);
                    return Result.m7377constructorimpl((InvestSubscriptionReceiveInfo) objUnwrapResponseData$default);
                }
                investSubscriptionReceiveReq = (InvestSubscriptionReceiveReq) investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.L$0 = null;
            investTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).OLrzqt(investSubscriptionReceiveReq, investTransactionRepositoryImpl$getSubscribeReceiveInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((InvestSubscriptionReceiveInfo) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23643iDz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull InvestSubscriptionProtocolsReq investSubscriptionProtocolsReq, @NotNull Continuation<? super Result<InvestSubscriptionProtocolModel>> continuation) throws java.lang.Throwable {
        InvestTransactionRepositoryImpl$getSubscribeProtocols$1 investTransactionRepositoryImpl$getSubscribeProtocols$1;
        if (continuation instanceof InvestTransactionRepositoryImpl$getSubscribeProtocols$1) {
            investTransactionRepositoryImpl$getSubscribeProtocols$1 = (InvestTransactionRepositoryImpl$getSubscribeProtocols$1) continuation;
            int i = investTransactionRepositoryImpl$getSubscribeProtocols$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investTransactionRepositoryImpl$getSubscribeProtocols$1.label = i - Integer.MIN_VALUE;
            } else {
                investTransactionRepositoryImpl$getSubscribeProtocols$1 = new InvestTransactionRepositoryImpl$getSubscribeProtocols$1(this, continuation);
            }
        }
        java.lang.Object obj = investTransactionRepositoryImpl$getSubscribeProtocols$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investTransactionRepositoryImpl$getSubscribeProtocols$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
        InvestTransactionRepositoryImpl$getSubscribeProtocols$2 investTransactionRepositoryImpl$getSubscribeProtocols$2 = new InvestTransactionRepositoryImpl$getSubscribeProtocols$2(this, investSubscriptionProtocolsReq, null);
        investTransactionRepositoryImpl$getSubscribeProtocols$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, investTransactionRepositoryImpl$getSubscribeProtocols$2, investTransactionRepositoryImpl$getSubscribeProtocols$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iDD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final InvestSubscriptionInitialReq EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            java.lang.String str3 = "";
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            long jIsConnected = transactionConfig.isConnected();
            int iAkhnZx = transactionConfig.AkhnZx();
            boolean zAwvSrB = transactionConfig.AwvSrB();
            if (transactionConfig.AwvSrB()) {
                InvestInputData investInputData = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(transactionConfig.valueOf());
                java.lang.String tokenAddress = investInputData != null ? investInputData.getTokenAddress() : null;
                if (tokenAddress != null) {
                    str3 = tokenAddress;
                }
            }
            java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
            return new InvestSubscriptionInitialReq(jIsConnected, str, zAwvSrB, str3, str2, null, java.lang.Integer.valueOf(iAkhnZx), (numFJNWhG != null && numFJNWhG.intValue() == -1) ? null : transactionConfig.fJNWhG(), transactionConfig.AEQbTJ());
        }

        public final InvestSubscriptionReceiveReq KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, InvestTokenWithAmount investTokenWithAmount) {
            java.lang.String tokenPrecision;
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            long jIsConnected = transactionConfig.isConnected();
            int iAkhnZx = transactionConfig.AkhnZx();
            java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
            java.lang.Integer numFJNWhG2 = (numFJNWhG != null && numFJNWhG.intValue() == -1) ? null : transactionConfig.fJNWhG();
            boolean zAwvSrB = transactionConfig.AwvSrB();
            java.lang.String tokenAddress = investTokenWithAmount != null ? investTokenWithAmount.getTokenAddress() : null;
            java.lang.String str5 = tokenAddress != null ? tokenAddress : "";
            if (investTokenWithAmount == null || (tokenPrecision = investTokenWithAmount.getTokenPrecision()) == null) {
                tokenPrecision = OrderDetailListItem.SLIP_OUT;
            }
            return new InvestSubscriptionReceiveReq(str3, str, jIsConnected, str5, str4, tokenPrecision, java.lang.Boolean.valueOf(zAwvSrB), str2, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, java.lang.Integer.valueOf(iAkhnZx), numFJNWhG2, transactionConfig.AEQbTJ(), 1792, (DefaultConstructorMarker) null);
        }

        public final InvestSubscriptionProtocolsReq OLrzqt(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InvestSubscriptionProtocolsReq(j, str);
        }
    }
}
