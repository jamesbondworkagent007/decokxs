package o;

import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.repository.RedeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1;
import com.okinc.business.invest_biz.data.repository.RedeemBoostTransactionRepositoryImpl$getInitialInfo$1;
import com.okinc.business.invest_biz.data.repository.RedeemBoostTransactionRepositoryImpl$getReceiveInfo$1;
import com.okinc.business.invest_biz.data.repository.RedeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1;
import com.okinc.business.invest_biz.data.repository.RedeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDG implements iDF {
    public final InterfaceC23589iBz copydefault;

    @yCM
    public iDG(@NotNull InterfaceC23589iBz interfaceC23589iBz) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        this.copydefault = interfaceC23589iBz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull InvestRedeemInitialReq investRedeemInitialReq, @NotNull Continuation<? super Result<InvestRedeemInitialInfo>> continuation) {
        RedeemBoostTransactionRepositoryImpl$getInitialInfo$1 redeemBoostTransactionRepositoryImpl$getInitialInfo$1;
        if (continuation instanceof RedeemBoostTransactionRepositoryImpl$getInitialInfo$1) {
            redeemBoostTransactionRepositoryImpl$getInitialInfo$1 = (RedeemBoostTransactionRepositoryImpl$getInitialInfo$1) continuation;
            int i = redeemBoostTransactionRepositoryImpl$getInitialInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemBoostTransactionRepositoryImpl$getInitialInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemBoostTransactionRepositoryImpl$getInitialInfo$1 = new RedeemBoostTransactionRepositoryImpl$getInitialInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemBoostTransactionRepositoryImpl$getInitialInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemBoostTransactionRepositoryImpl$getInitialInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.copydefault;
                redeemBoostTransactionRepositoryImpl$getInitialInfo$1.L$0 = investRedeemInitialReq;
                redeemBoostTransactionRepositoryImpl$getInitialInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(str, redeemBoostTransactionRepositoryImpl$getInitialInfo$1);
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
                    return Result.m7377constructorimpl((InvestRedeemInitialInfo) objUnwrapResponseData$default);
                }
                investRedeemInitialReq = (InvestRedeemInitialReq) redeemBoostTransactionRepositoryImpl$getInitialInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemBoostTransactionRepositoryImpl$getInitialInfo$1.L$0 = null;
            redeemBoostTransactionRepositoryImpl$getInitialInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).AEQbTJ(investRedeemInitialReq, redeemBoostTransactionRepositoryImpl$getInitialInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((InvestRedeemInitialInfo) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq, @NotNull Continuation<? super Result<InvestUniv3RedeemInitialInfo>> continuation) {
        RedeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1 redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1;
        if (continuation instanceof RedeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1) {
            redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1 = (RedeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1) continuation;
            int i = redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1 = new RedeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.copydefault;
                redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.L$0 = investUniv3RedeemInitialReq;
                redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(str, redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1);
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
                    return Result.m7377constructorimpl((InvestUniv3RedeemInitialInfo) objUnwrapResponseData$default);
                }
                investUniv3RedeemInitialReq = (InvestUniv3RedeemInitialReq) redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.L$0 = null;
            redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).OLrzqt(investUniv3RedeemInitialReq, redeemBoostTransactionRepositoryImpl$getUniv3InitialInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((InvestUniv3RedeemInitialInfo) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, @NotNull Continuation<? super Result<InvestUniv3RedeemReceiveInfo>> continuation) {
        RedeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1 redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1;
        if (continuation instanceof RedeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1) {
            redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1 = (RedeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1) continuation;
            int i = redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1 = new RedeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.copydefault;
                redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.L$0 = investUniv3RedeemReceiveReq;
                redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(str, redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1);
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
                    return Result.m7377constructorimpl((InvestUniv3RedeemReceiveInfo) objUnwrapResponseData$default);
                }
                investUniv3RedeemReceiveReq = (InvestUniv3RedeemReceiveReq) redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.L$0 = null;
            redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).copydefault(investUniv3RedeemReceiveReq, redeemBoostTransactionRepositoryImpl$getUniv3ReceiveInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((InvestUniv3RedeemReceiveInfo) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull InvestRedeemReceiveReq investRedeemReceiveReq, @NotNull Continuation<? super Result<InvestRedeemReceiveInfo>> continuation) {
        RedeemBoostTransactionRepositoryImpl$getReceiveInfo$1 redeemBoostTransactionRepositoryImpl$getReceiveInfo$1;
        if (continuation instanceof RedeemBoostTransactionRepositoryImpl$getReceiveInfo$1) {
            redeemBoostTransactionRepositoryImpl$getReceiveInfo$1 = (RedeemBoostTransactionRepositoryImpl$getReceiveInfo$1) continuation;
            int i = redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemBoostTransactionRepositoryImpl$getReceiveInfo$1 = new RedeemBoostTransactionRepositoryImpl$getReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.copydefault;
                java.lang.String accountId = investRedeemReceiveReq.getAccountId();
                redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.L$0 = investRedeemReceiveReq;
                redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, redeemBoostTransactionRepositoryImpl$getReceiveInfo$1);
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
                    return Result.m7377constructorimpl((InvestRedeemReceiveInfo) objUnwrapResponseData$default);
                }
                investRedeemReceiveReq = (InvestRedeemReceiveReq) redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.L$0 = null;
            redeemBoostTransactionRepositoryImpl$getReceiveInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).OLrzqt(investRedeemReceiveReq, redeemBoostTransactionRepositoryImpl$getReceiveInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((InvestRedeemReceiveInfo) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, @NotNull Continuation<? super Result<ResponseData<java.lang.Object>>> continuation) {
        RedeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1 redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1;
        if (continuation instanceof RedeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1) {
            redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1 = (RedeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1) continuation;
            int i = redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1 = new RedeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1(this, continuation);
            }
        }
        RedeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1 redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$12 = redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$1;
        java.lang.Object objEZpvd = redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                if (l == null) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("stakeId is required for Boost checkRedeemAllowed")));
                }
                Result.Application application2 = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.copydefault.OLrzqt();
                long jLongValue = l.longValue();
                redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$12.label = 1;
                objEZpvd = interfaceC25472ixPOLrzqt.EZpvd(j, str, str2, jLongValue, redeemBoostTransactionRepositoryImpl$checkRedeemAllowed$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return Result.m7377constructorimpl((ResponseData) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
