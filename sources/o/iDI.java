package o;

import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.repository.RedeemTransactionRepositoryImpl$checkRedeemAllowed$1;
import com.okinc.business.invest_biz.data.repository.RedeemTransactionRepositoryImpl$getInitialInfo$1;
import com.okinc.business.invest_biz.data.repository.RedeemTransactionRepositoryImpl$getReceiveInfo$1;
import com.okinc.business.invest_biz.data.repository.RedeemTransactionRepositoryImpl$getUniv3InitialInfo$1;
import com.okinc.business.invest_biz.data.repository.RedeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDI implements iDF {
    public final InterfaceC23589iBz EZpvd;

    @yCM
    public iDI(@NotNull InterfaceC23589iBz interfaceC23589iBz) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        this.EZpvd = interfaceC23589iBz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull InvestRedeemInitialReq investRedeemInitialReq, @NotNull Continuation<? super Result<InvestRedeemInitialInfo>> continuation) {
        RedeemTransactionRepositoryImpl$getInitialInfo$1 redeemTransactionRepositoryImpl$getInitialInfo$1;
        if (continuation instanceof RedeemTransactionRepositoryImpl$getInitialInfo$1) {
            redeemTransactionRepositoryImpl$getInitialInfo$1 = (RedeemTransactionRepositoryImpl$getInitialInfo$1) continuation;
            int i = redeemTransactionRepositoryImpl$getInitialInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemTransactionRepositoryImpl$getInitialInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemTransactionRepositoryImpl$getInitialInfo$1 = new RedeemTransactionRepositoryImpl$getInitialInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemTransactionRepositoryImpl$getInitialInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemTransactionRepositoryImpl$getInitialInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                redeemTransactionRepositoryImpl$getInitialInfo$1.L$0 = investRedeemInitialReq;
                redeemTransactionRepositoryImpl$getInitialInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(str, redeemTransactionRepositoryImpl$getInitialInfo$1);
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
                investRedeemInitialReq = (InvestRedeemInitialReq) redeemTransactionRepositoryImpl$getInitialInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemTransactionRepositoryImpl$getInitialInfo$1.L$0 = null;
            redeemTransactionRepositoryImpl$getInitialInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).copydefault(investRedeemInitialReq, redeemTransactionRepositoryImpl$getInitialInfo$1);
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
        RedeemTransactionRepositoryImpl$getUniv3InitialInfo$1 redeemTransactionRepositoryImpl$getUniv3InitialInfo$1;
        if (continuation instanceof RedeemTransactionRepositoryImpl$getUniv3InitialInfo$1) {
            redeemTransactionRepositoryImpl$getUniv3InitialInfo$1 = (RedeemTransactionRepositoryImpl$getUniv3InitialInfo$1) continuation;
            int i = redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemTransactionRepositoryImpl$getUniv3InitialInfo$1 = new RedeemTransactionRepositoryImpl$getUniv3InitialInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.L$0 = investUniv3RedeemInitialReq;
                redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(str, redeemTransactionRepositoryImpl$getUniv3InitialInfo$1);
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
                investUniv3RedeemInitialReq = (InvestUniv3RedeemInitialReq) redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.L$0 = null;
            redeemTransactionRepositoryImpl$getUniv3InitialInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).OLrzqt(investUniv3RedeemInitialReq, redeemTransactionRepositoryImpl$getUniv3InitialInfo$1);
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
        RedeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1 redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1;
        if (continuation instanceof RedeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1) {
            redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1 = (RedeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1) continuation;
            int i = redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1 = new RedeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.L$0 = investUniv3RedeemReceiveReq;
                redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(str, redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1);
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
                investUniv3RedeemReceiveReq = (InvestUniv3RedeemReceiveReq) redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.L$0 = null;
            redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).copydefault(investUniv3RedeemReceiveReq, redeemTransactionRepositoryImpl$getUniv3ReceiveInfo$1);
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
        RedeemTransactionRepositoryImpl$getReceiveInfo$1 redeemTransactionRepositoryImpl$getReceiveInfo$1;
        if (continuation instanceof RedeemTransactionRepositoryImpl$getReceiveInfo$1) {
            redeemTransactionRepositoryImpl$getReceiveInfo$1 = (RedeemTransactionRepositoryImpl$getReceiveInfo$1) continuation;
            int i = redeemTransactionRepositoryImpl$getReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemTransactionRepositoryImpl$getReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemTransactionRepositoryImpl$getReceiveInfo$1 = new RedeemTransactionRepositoryImpl$getReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = redeemTransactionRepositoryImpl$getReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemTransactionRepositoryImpl$getReceiveInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                java.lang.String accountId = investRedeemReceiveReq.getAccountId();
                redeemTransactionRepositoryImpl$getReceiveInfo$1.L$0 = investRedeemReceiveReq;
                redeemTransactionRepositoryImpl$getReceiveInfo$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, redeemTransactionRepositoryImpl$getReceiveInfo$1);
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
                investRedeemReceiveReq = (InvestRedeemReceiveReq) redeemTransactionRepositoryImpl$getReceiveInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            redeemTransactionRepositoryImpl$getReceiveInfo$1.L$0 = null;
            redeemTransactionRepositoryImpl$getReceiveInfo$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).KWHzl(investRedeemReceiveReq, redeemTransactionRepositoryImpl$getReceiveInfo$1);
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
        RedeemTransactionRepositoryImpl$checkRedeemAllowed$1 redeemTransactionRepositoryImpl$checkRedeemAllowed$1;
        if (continuation instanceof RedeemTransactionRepositoryImpl$checkRedeemAllowed$1) {
            redeemTransactionRepositoryImpl$checkRedeemAllowed$1 = (RedeemTransactionRepositoryImpl$checkRedeemAllowed$1) continuation;
            int i = redeemTransactionRepositoryImpl$checkRedeemAllowed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemTransactionRepositoryImpl$checkRedeemAllowed$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemTransactionRepositoryImpl$checkRedeemAllowed$1 = new RedeemTransactionRepositoryImpl$checkRedeemAllowed$1(this, continuation);
            }
        }
        RedeemTransactionRepositoryImpl$checkRedeemAllowed$1 redeemTransactionRepositoryImpl$checkRedeemAllowed$12 = redeemTransactionRepositoryImpl$checkRedeemAllowed$1;
        java.lang.Object objKWHzl = redeemTransactionRepositoryImpl$checkRedeemAllowed$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemTransactionRepositoryImpl$checkRedeemAllowed$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.EZpvd.OLrzqt();
                redeemTransactionRepositoryImpl$checkRedeemAllowed$12.label = 1;
                objKWHzl = interfaceC25472ixPOLrzqt.KWHzl(j, str, str2, redeemTransactionRepositoryImpl$checkRedeemAllowed$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return Result.m7377constructorimpl((ResponseData) objKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
