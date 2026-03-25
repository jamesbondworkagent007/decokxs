package o;

import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$getAACallData$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$getCallData$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$getNetworkFee$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$getTokenBalance$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$getValidatorList$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$getWeb3ClaimCallData$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$submitTransaction$1;
import com.okinc.business.invest_biz.data.repository.BoostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23629iDl implements iDH {
    public final iDH EZpvd;
    public final InterfaceC23589iBz copydefault;

    @yCM
    public C23629iDl(@NotNull iDH idh, @NotNull InterfaceC23589iBz interfaceC23589iBz) {
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        this.EZpvd = idh;
        this.copydefault = interfaceC23589iBz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull InvestTokenBalanceReq investTokenBalanceReq, @NotNull Continuation<? super Result<? extends java.util.List<InvestTokenWithAmount>>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$getTokenBalance$1 boostTransactionRepositoryImpl$getTokenBalance$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$getTokenBalance$1) {
            boostTransactionRepositoryImpl$getTokenBalance$1 = (BoostTransactionRepositoryImpl$getTokenBalance$1) continuation;
            int i = boostTransactionRepositoryImpl$getTokenBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$getTokenBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$getTokenBalance$1 = new BoostTransactionRepositoryImpl$getTokenBalance$1(this, continuation);
            }
        }
        java.lang.Object obj = boostTransactionRepositoryImpl$getTokenBalance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$getTokenBalance$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iDH idh = this.EZpvd;
        boostTransactionRepositoryImpl$getTokenBalance$1.label = 1;
        java.lang.Object objEZpvd = idh.EZpvd(investTokenBalanceReq, boostTransactionRepositoryImpl$getTokenBalance$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, int i, @NotNull java.lang.String str, java.lang.Long l, @NotNull Continuation<? super Result<InvestGasPriceConfig>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$getNetworkFee$1 boostTransactionRepositoryImpl$getNetworkFee$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$getNetworkFee$1) {
            boostTransactionRepositoryImpl$getNetworkFee$1 = (BoostTransactionRepositoryImpl$getNetworkFee$1) continuation;
            int i2 = boostTransactionRepositoryImpl$getNetworkFee$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$getNetworkFee$1.label = i2 - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$getNetworkFee$1 = new BoostTransactionRepositoryImpl$getNetworkFee$1(this, continuation);
            }
        }
        BoostTransactionRepositoryImpl$getNetworkFee$1 boostTransactionRepositoryImpl$getNetworkFee$12 = boostTransactionRepositoryImpl$getNetworkFee$1;
        java.lang.Object objAEQbTJ = boostTransactionRepositoryImpl$getNetworkFee$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = boostTransactionRepositoryImpl$getNetworkFee$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (l == null) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("stakeId is required for Boost getNetworkFee")));
                }
                Result.Application application2 = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPEZpvd = InterfaceC25472ixP.Companion.EZpvd(new iBA(null, null, null, 7, null));
                long jLongValue = l.longValue();
                boostTransactionRepositoryImpl$getNetworkFee$12.label = 1;
                objAEQbTJ = interfaceC25472ixPEZpvd.AEQbTJ(j, i, str, jLongValue, boostTransactionRepositoryImpl$getNetworkFee$12);
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
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$getCallData$1 boostTransactionRepositoryImpl$getCallData$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$getCallData$1) {
            boostTransactionRepositoryImpl$getCallData$1 = (BoostTransactionRepositoryImpl$getCallData$1) continuation;
            int i = boostTransactionRepositoryImpl$getCallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$getCallData$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$getCallData$1 = new BoostTransactionRepositoryImpl$getCallData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = boostTransactionRepositoryImpl$getCallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$getCallData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                InterfaceC23589iBz interfaceC23589iBz = this.copydefault;
                java.lang.String accountId = investCallDataReq.getAccountId();
                boostTransactionRepositoryImpl$getCallData$1.L$0 = investCallDataReq;
                boostTransactionRepositoryImpl$getCallData$1.label = 1;
                objKWHzl = interfaceC23589iBz.KWHzl(accountId, boostTransactionRepositoryImpl$getCallData$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    java.lang.Object objCopydefault2 = iBL.copydefault((ResponseData) objKWHzl, new Function1() { // from class: o.iDo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C23629iDl.KWHzl((ResponseData) obj));
                        }
                    });
                    Intrinsics.copydefault(objCopydefault2);
                    return Result.m7377constructorimpl((JsonObject) objCopydefault2);
                }
                investCallDataReq = (InvestCallDataReq) boostTransactionRepositoryImpl$getCallData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            boostTransactionRepositoryImpl$getCallData$1.L$0 = null;
            boostTransactionRepositoryImpl$getCallData$1.label = 2;
            objKWHzl = ((InterfaceC25472ixP) objKWHzl).KWHzl(investCallDataReq, boostTransactionRepositoryImpl$getCallData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            java.lang.Object objCopydefault22 = iBL.copydefault((ResponseData) objKWHzl, new Function1() { // from class: o.iDo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C23629iDl.KWHzl((ResponseData) obj));
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

    public static final boolean KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return (responseData.getCode() == 90006 || responseData.getCode() == 90010 || responseData.getCode() == 80001) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$getWeb3ClaimCallData$1 boostTransactionRepositoryImpl$getWeb3ClaimCallData$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$getWeb3ClaimCallData$1) {
            boostTransactionRepositoryImpl$getWeb3ClaimCallData$1 = (BoostTransactionRepositoryImpl$getWeb3ClaimCallData$1) continuation;
            int i = boostTransactionRepositoryImpl$getWeb3ClaimCallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$getWeb3ClaimCallData$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$getWeb3ClaimCallData$1 = new BoostTransactionRepositoryImpl$getWeb3ClaimCallData$1(this, continuation);
            }
        }
        java.lang.Object obj = boostTransactionRepositoryImpl$getWeb3ClaimCallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$getWeb3ClaimCallData$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iDH idh = this.EZpvd;
        boostTransactionRepositoryImpl$getWeb3ClaimCallData$1.label = 1;
        java.lang.Object objKWHzl = idh.KWHzl(investCallDataReq, boostTransactionRepositoryImpl$getWeb3ClaimCallData$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$getAACallData$1 boostTransactionRepositoryImpl$getAACallData$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$getAACallData$1) {
            boostTransactionRepositoryImpl$getAACallData$1 = (BoostTransactionRepositoryImpl$getAACallData$1) continuation;
            int i = boostTransactionRepositoryImpl$getAACallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$getAACallData$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$getAACallData$1 = new BoostTransactionRepositoryImpl$getAACallData$1(this, continuation);
            }
        }
        java.lang.Object obj = boostTransactionRepositoryImpl$getAACallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$getAACallData$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iDH idh = this.EZpvd;
        boostTransactionRepositoryImpl$getAACallData$1.label = 1;
        java.lang.Object objOLrzqt = idh.OLrzqt(investCallDataReq, boostTransactionRepositoryImpl$getAACallData$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ixP.suspendBoostSubmitTransaction$default(o.ixP, java.util.Map, okhttp3.RequestBody, java.lang.String, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody, @NotNull Continuation<? super Result<InvestTxData>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$submitTransaction$1 boostTransactionRepositoryImpl$submitTransaction$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$submitTransaction$1) {
            boostTransactionRepositoryImpl$submitTransaction$1 = (BoostTransactionRepositoryImpl$submitTransaction$1) continuation;
            int i = boostTransactionRepositoryImpl$submitTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$submitTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$submitTransaction$1 = new BoostTransactionRepositoryImpl$submitTransaction$1(this, continuation);
            }
        }
        BoostTransactionRepositoryImpl$submitTransaction$1 boostTransactionRepositoryImpl$submitTransaction$12 = boostTransactionRepositoryImpl$submitTransaction$1;
        java.lang.Object objSuspendBoostSubmitTransaction$default = boostTransactionRepositoryImpl$submitTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$submitTransaction$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objSuspendBoostSubmitTransaction$default);
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.copydefault.OLrzqt();
                boostTransactionRepositoryImpl$submitTransaction$12.label = 1;
                objSuspendBoostSubmitTransaction$default = InterfaceC25472ixP.suspendBoostSubmitTransaction$default(interfaceC25472ixPOLrzqt, map, requestBody, null, boostTransactionRepositoryImpl$submitTransaction$12, 4, null);
                if (objSuspendBoostSubmitTransaction$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objSuspendBoostSubmitTransaction$default);
            }
            java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objSuspendBoostSubmitTransaction$default, null, 1, null);
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
    public java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody, @NotNull Continuation<? super Result<InvestTxData>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1 boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1) {
            boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1 = (BoostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1) continuation;
            int i = boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1 = new BoostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1(this, continuation);
            }
        }
        java.lang.Object obj = boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iDH idh = this.EZpvd;
        boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1.label = 1;
        java.lang.Object objKWHzl = idh.KWHzl(map, requestBody, boostTransactionRepositoryImpl$submitWeb3ClaimTransaction$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull ValidatorRequestParam validatorRequestParam, @NotNull Continuation<? super Result<? extends java.util.List<InvestValidatorListItems>>> continuation) throws java.lang.Throwable {
        BoostTransactionRepositoryImpl$getValidatorList$1 boostTransactionRepositoryImpl$getValidatorList$1;
        if (continuation instanceof BoostTransactionRepositoryImpl$getValidatorList$1) {
            boostTransactionRepositoryImpl$getValidatorList$1 = (BoostTransactionRepositoryImpl$getValidatorList$1) continuation;
            int i = boostTransactionRepositoryImpl$getValidatorList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostTransactionRepositoryImpl$getValidatorList$1.label = i - Integer.MIN_VALUE;
            } else {
                boostTransactionRepositoryImpl$getValidatorList$1 = new BoostTransactionRepositoryImpl$getValidatorList$1(this, continuation);
            }
        }
        java.lang.Object obj = boostTransactionRepositoryImpl$getValidatorList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = boostTransactionRepositoryImpl$getValidatorList$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iDH idh = this.EZpvd;
        boostTransactionRepositoryImpl$getValidatorList$1.label = 1;
        java.lang.Object objEZpvd = idh.EZpvd(validatorRequestParam, boostTransactionRepositoryImpl$getValidatorList$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
