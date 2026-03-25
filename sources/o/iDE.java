package o;

import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$getAACallData$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$getCallData$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$getNetworkFee$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$getTokenBalance$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$getValidatorList$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$getWeb3ClaimCallData$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$submitTransaction$1;
import com.okinc.business.invest_biz.data.repository.TransactionRepositoryImpl$submitWeb3ClaimTransaction$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDE implements iDH {
    public final InterfaceC23589iBz EZpvd;

    @yCM
    public iDE(@NotNull InterfaceC23589iBz interfaceC23589iBz) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        this.EZpvd = interfaceC23589iBz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull InvestTokenBalanceReq investTokenBalanceReq, @NotNull Continuation<? super Result<? extends java.util.List<InvestTokenWithAmount>>> continuation) {
        TransactionRepositoryImpl$getTokenBalance$1 transactionRepositoryImpl$getTokenBalance$1;
        if (continuation instanceof TransactionRepositoryImpl$getTokenBalance$1) {
            transactionRepositoryImpl$getTokenBalance$1 = (TransactionRepositoryImpl$getTokenBalance$1) continuation;
            int i = transactionRepositoryImpl$getTokenBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$getTokenBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$getTokenBalance$1 = new TransactionRepositoryImpl$getTokenBalance$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = transactionRepositoryImpl$getTokenBalance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$getTokenBalance$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                java.lang.String accountId = investTokenBalanceReq.getAccountId();
                transactionRepositoryImpl$getTokenBalance$1.L$0 = investTokenBalanceReq;
                transactionRepositoryImpl$getTokenBalance$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, transactionRepositoryImpl$getTokenBalance$1);
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
                    return Result.m7377constructorimpl((java.util.List) objUnwrapResponseData$default);
                }
                investTokenBalanceReq = (InvestTokenBalanceReq) transactionRepositoryImpl$getTokenBalance$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            transactionRepositoryImpl$getTokenBalance$1.L$0 = null;
            transactionRepositoryImpl$getTokenBalance$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).KWHzl(investTokenBalanceReq, transactionRepositoryImpl$getTokenBalance$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((java.util.List) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation) {
        TransactionRepositoryImpl$getCallData$1 transactionRepositoryImpl$getCallData$1;
        if (continuation instanceof TransactionRepositoryImpl$getCallData$1) {
            transactionRepositoryImpl$getCallData$1 = (TransactionRepositoryImpl$getCallData$1) continuation;
            int i = transactionRepositoryImpl$getCallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$getCallData$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$getCallData$1 = new TransactionRepositoryImpl$getCallData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = transactionRepositoryImpl$getCallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$getCallData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                java.lang.String accountId = investCallDataReq.getAccountId();
                transactionRepositoryImpl$getCallData$1.L$0 = investCallDataReq;
                transactionRepositoryImpl$getCallData$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, transactionRepositoryImpl$getCallData$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    java.lang.Object objCopydefault2 = iBL.copydefault((ResponseData) objKWHzl, new Function1() { // from class: o.iDN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(iDE.copydefault((ResponseData) obj));
                        }
                    });
                    Intrinsics.copydefault(objCopydefault2);
                    return Result.m7377constructorimpl((JsonObject) objCopydefault2);
                }
                investCallDataReq = (InvestCallDataReq) transactionRepositoryImpl$getCallData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            transactionRepositoryImpl$getCallData$1.L$0 = null;
            transactionRepositoryImpl$getCallData$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).AEQbTJ(investCallDataReq, transactionRepositoryImpl$getCallData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objCopydefault22 = iBL.copydefault((ResponseData) objKWHzl, new Function1() { // from class: o.iDN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(iDE.copydefault((ResponseData) obj));
                }
            });
            Intrinsics.copydefault(objCopydefault22);
            return Result.m7377constructorimpl((JsonObject) objCopydefault22);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return (responseData.getCode() == 90006 || responseData.getCode() == 90010 || responseData.getCode() == 80001) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation) {
        TransactionRepositoryImpl$getWeb3ClaimCallData$1 transactionRepositoryImpl$getWeb3ClaimCallData$1;
        if (continuation instanceof TransactionRepositoryImpl$getWeb3ClaimCallData$1) {
            transactionRepositoryImpl$getWeb3ClaimCallData$1 = (TransactionRepositoryImpl$getWeb3ClaimCallData$1) continuation;
            int i = transactionRepositoryImpl$getWeb3ClaimCallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$getWeb3ClaimCallData$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$getWeb3ClaimCallData$1 = new TransactionRepositoryImpl$getWeb3ClaimCallData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = transactionRepositoryImpl$getWeb3ClaimCallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$getWeb3ClaimCallData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                java.lang.String accountId = investCallDataReq.getAccountId();
                transactionRepositoryImpl$getWeb3ClaimCallData$1.L$0 = investCallDataReq;
                transactionRepositoryImpl$getWeb3ClaimCallData$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, transactionRepositoryImpl$getWeb3ClaimCallData$1);
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
                    return Result.m7377constructorimpl((JsonObject) objUnwrapResponseData$default);
                }
                investCallDataReq = (InvestCallDataReq) transactionRepositoryImpl$getWeb3ClaimCallData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            transactionRepositoryImpl$getWeb3ClaimCallData$1.L$0 = null;
            transactionRepositoryImpl$getWeb3ClaimCallData$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).EZpvd(investCallDataReq, transactionRepositoryImpl$getWeb3ClaimCallData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((JsonObject) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation) {
        TransactionRepositoryImpl$getAACallData$1 transactionRepositoryImpl$getAACallData$1;
        if (continuation instanceof TransactionRepositoryImpl$getAACallData$1) {
            transactionRepositoryImpl$getAACallData$1 = (TransactionRepositoryImpl$getAACallData$1) continuation;
            int i = transactionRepositoryImpl$getAACallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$getAACallData$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$getAACallData$1 = new TransactionRepositoryImpl$getAACallData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = transactionRepositoryImpl$getAACallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$getAACallData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.EZpvd;
                java.lang.String accountId = investCallDataReq.getAccountId();
                transactionRepositoryImpl$getAACallData$1.L$0 = investCallDataReq;
                transactionRepositoryImpl$getAACallData$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, transactionRepositoryImpl$getAACallData$1);
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
                    return Result.m7377constructorimpl((JsonObject) objUnwrapResponseData$default);
                }
                investCallDataReq = (InvestCallDataReq) transactionRepositoryImpl$getAACallData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            transactionRepositoryImpl$getAACallData$1.L$0 = null;
            transactionRepositoryImpl$getAACallData$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).copydefault(investCallDataReq, transactionRepositoryImpl$getAACallData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            return Result.m7377constructorimpl((JsonObject) objUnwrapResponseData$default2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, int i, @NotNull java.lang.String str, java.lang.Long l, @NotNull Continuation<? super Result<InvestGasPriceConfig>> continuation) {
        TransactionRepositoryImpl$getNetworkFee$1 transactionRepositoryImpl$getNetworkFee$1;
        if (continuation instanceof TransactionRepositoryImpl$getNetworkFee$1) {
            transactionRepositoryImpl$getNetworkFee$1 = (TransactionRepositoryImpl$getNetworkFee$1) continuation;
            int i2 = transactionRepositoryImpl$getNetworkFee$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$getNetworkFee$1.label = i2 - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$getNetworkFee$1 = new TransactionRepositoryImpl$getNetworkFee$1(this, continuation);
            }
        }
        TransactionRepositoryImpl$getNetworkFee$1 transactionRepositoryImpl$getNetworkFee$12 = transactionRepositoryImpl$getNetworkFee$1;
        java.lang.Object objAEQbTJ = transactionRepositoryImpl$getNetworkFee$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = transactionRepositoryImpl$getNetworkFee$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.EZpvd.OLrzqt();
                transactionRepositoryImpl$getNetworkFee$12.label = 1;
                objAEQbTJ = interfaceC25472ixPOLrzqt.AEQbTJ(j, i, str, transactionRepositoryImpl$getNetworkFee$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objAEQbTJ, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            return Result.m7377constructorimpl((InvestGasPriceConfig) objUnwrapResponseData$default);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody, @NotNull Continuation<? super Result<InvestTxData>> continuation) {
        TransactionRepositoryImpl$submitTransaction$1 transactionRepositoryImpl$submitTransaction$1;
        if (continuation instanceof TransactionRepositoryImpl$submitTransaction$1) {
            transactionRepositoryImpl$submitTransaction$1 = (TransactionRepositoryImpl$submitTransaction$1) continuation;
            int i = transactionRepositoryImpl$submitTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$submitTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$submitTransaction$1 = new TransactionRepositoryImpl$submitTransaction$1(this, continuation);
            }
        }
        TransactionRepositoryImpl$submitTransaction$1 transactionRepositoryImpl$submitTransaction$12 = transactionRepositoryImpl$submitTransaction$1;
        java.lang.Object objSuspendSubmitTransaction$default = transactionRepositoryImpl$submitTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$submitTransaction$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objSuspendSubmitTransaction$default);
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.EZpvd.OLrzqt();
                transactionRepositoryImpl$submitTransaction$12.label = 1;
                objSuspendSubmitTransaction$default = InterfaceC25472ixP.suspendSubmitTransaction$default(interfaceC25472ixPOLrzqt, map, requestBody, null, transactionRepositoryImpl$submitTransaction$12, 4, null);
                if (objSuspendSubmitTransaction$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objSuspendSubmitTransaction$default);
            }
            java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objSuspendSubmitTransaction$default, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            return Result.m7377constructorimpl((InvestTxData) objUnwrapResponseData$default);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody, @NotNull Continuation<? super Result<InvestTxData>> continuation) {
        TransactionRepositoryImpl$submitWeb3ClaimTransaction$1 transactionRepositoryImpl$submitWeb3ClaimTransaction$1;
        if (continuation instanceof TransactionRepositoryImpl$submitWeb3ClaimTransaction$1) {
            transactionRepositoryImpl$submitWeb3ClaimTransaction$1 = (TransactionRepositoryImpl$submitWeb3ClaimTransaction$1) continuation;
            int i = transactionRepositoryImpl$submitWeb3ClaimTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$submitWeb3ClaimTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$submitWeb3ClaimTransaction$1 = new TransactionRepositoryImpl$submitWeb3ClaimTransaction$1(this, continuation);
            }
        }
        TransactionRepositoryImpl$submitWeb3ClaimTransaction$1 transactionRepositoryImpl$submitWeb3ClaimTransaction$12 = transactionRepositoryImpl$submitWeb3ClaimTransaction$1;
        java.lang.Object objSuspendSubmitWeb3ClaimTransaction$default = transactionRepositoryImpl$submitWeb3ClaimTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$submitWeb3ClaimTransaction$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objSuspendSubmitWeb3ClaimTransaction$default);
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.EZpvd.OLrzqt();
                transactionRepositoryImpl$submitWeb3ClaimTransaction$12.label = 1;
                objSuspendSubmitWeb3ClaimTransaction$default = InterfaceC25472ixP.suspendSubmitWeb3ClaimTransaction$default(interfaceC25472ixPOLrzqt, map, requestBody, null, transactionRepositoryImpl$submitWeb3ClaimTransaction$12, 4, null);
                if (objSuspendSubmitWeb3ClaimTransaction$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objSuspendSubmitWeb3ClaimTransaction$default);
            }
            java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objSuspendSubmitWeb3ClaimTransaction$default, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            return Result.m7377constructorimpl((InvestTxData) objUnwrapResponseData$default);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull ValidatorRequestParam validatorRequestParam, @NotNull Continuation<? super Result<? extends java.util.List<InvestValidatorListItems>>> continuation) {
        TransactionRepositoryImpl$getValidatorList$1 transactionRepositoryImpl$getValidatorList$1;
        if (continuation instanceof TransactionRepositoryImpl$getValidatorList$1) {
            transactionRepositoryImpl$getValidatorList$1 = (TransactionRepositoryImpl$getValidatorList$1) continuation;
            int i = transactionRepositoryImpl$getValidatorList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionRepositoryImpl$getValidatorList$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionRepositoryImpl$getValidatorList$1 = new TransactionRepositoryImpl$getValidatorList$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = transactionRepositoryImpl$getValidatorList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionRepositoryImpl$getValidatorList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.EZpvd.OLrzqt();
                transactionRepositoryImpl$getValidatorList$1.label = 1;
                objEZpvd = interfaceC25472ixPOLrzqt.EZpvd(validatorRequestParam, transactionRepositoryImpl$getValidatorList$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            java.util.List listAhwBna = (java.util.List) iBL.unwrapResponseData$default((ResponseData) objEZpvd, null, 1, null);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            return Result.m7377constructorimpl(listAhwBna);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
