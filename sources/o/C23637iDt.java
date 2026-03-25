package o;

import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionProtocolsReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.repository.InvestBoostTransactionRepositoryImpl$getInitialInfo$1;
import com.okinc.business.invest_biz.data.repository.InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$1;
import com.okinc.business.invest_biz.data.repository.InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2;
import com.okinc.business.invest_biz.data.repository.InvestBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23637iDt implements InterfaceC23643iDz {
    public final InterfaceC23589iBz AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public C23637iDt(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23589iBz;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23643iDz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq, @NotNull Continuation<? super Result<InvestSubscriptionInfo>> continuation) throws java.lang.Throwable {
        InvestBoostTransactionRepositoryImpl$getInitialInfo$1 investBoostTransactionRepositoryImpl$getInitialInfo$1;
        if (continuation instanceof InvestBoostTransactionRepositoryImpl$getInitialInfo$1) {
            investBoostTransactionRepositoryImpl$getInitialInfo$1 = (InvestBoostTransactionRepositoryImpl$getInitialInfo$1) continuation;
            int i = investBoostTransactionRepositoryImpl$getInitialInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investBoostTransactionRepositoryImpl$getInitialInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                investBoostTransactionRepositoryImpl$getInitialInfo$1 = new InvestBoostTransactionRepositoryImpl$getInitialInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = investBoostTransactionRepositoryImpl$getInitialInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investBoostTransactionRepositoryImpl$getInitialInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.AEQbTJ;
                java.lang.String accountId = investSubscriptionInitialReq.getAccountId();
                investBoostTransactionRepositoryImpl$getInitialInfo$1.L$0 = investSubscriptionInitialReq;
                investBoostTransactionRepositoryImpl$getInitialInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, investBoostTransactionRepositoryImpl$getInitialInfo$1);
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
                investSubscriptionInitialReq = (InvestSubscriptionInitialReq) investBoostTransactionRepositoryImpl$getInitialInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            investBoostTransactionRepositoryImpl$getInitialInfo$1.L$0 = null;
            investBoostTransactionRepositoryImpl$getInitialInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).KWHzl(investSubscriptionInitialReq, investBoostTransactionRepositoryImpl$getInitialInfo$1);
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
        InvestBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1 investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1;
        if (continuation instanceof InvestBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1) {
            investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1 = (InvestBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1) continuation;
            int i = investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1 = new InvestBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.AEQbTJ;
                java.lang.String accountId = investSubscriptionReceiveReq.getAccountId();
                investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.L$0 = investSubscriptionReceiveReq;
                investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1);
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
                investSubscriptionReceiveReq = (InvestSubscriptionReceiveReq) investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.L$0 = null;
            investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).AEQbTJ(investSubscriptionReceiveReq, investBoostTransactionRepositoryImpl$getSubscribeReceiveInfo$1);
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
        InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$1 investBoostTransactionRepositoryImpl$getSubscribeProtocols$1;
        if (continuation instanceof InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$1) {
            investBoostTransactionRepositoryImpl$getSubscribeProtocols$1 = (InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$1) continuation;
            int i = investBoostTransactionRepositoryImpl$getSubscribeProtocols$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investBoostTransactionRepositoryImpl$getSubscribeProtocols$1.label = i - Integer.MIN_VALUE;
            } else {
                investBoostTransactionRepositoryImpl$getSubscribeProtocols$1 = new InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$1(this, continuation);
            }
        }
        java.lang.Object obj = investBoostTransactionRepositoryImpl$getSubscribeProtocols$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investBoostTransactionRepositoryImpl$getSubscribeProtocols$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2 investBoostTransactionRepositoryImpl$getSubscribeProtocols$2 = new InvestBoostTransactionRepositoryImpl$getSubscribeProtocols$2(null);
        investBoostTransactionRepositoryImpl$getSubscribeProtocols$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, investBoostTransactionRepositoryImpl$getSubscribeProtocols$2, investBoostTransactionRepositoryImpl$getSubscribeProtocols$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
