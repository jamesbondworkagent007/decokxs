package o;

import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.network.ws.GasFeeSubResponse;
import com.okinc.business.web3pay.lib.features.gas.GasRepositoryImpl$getConvertGas$1;
import com.okinc.business.web3pay.lib.features.gas.GasRepositoryImpl$getTransactionGas$1;
import com.okinc.business.web3pay.lib.features.gas.GasRepositoryImpl$getTransactionToExchangeGas$1;
import com.okinc.business.web3pay.lib.features.gas.GasRepositoryImpl$getUpdateAccountGas$1;
import com.okinc.business.web3pay.lib.features.gas.GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo;
import com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasRequest;
import com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse;
import com.okinc.business.web3pay.lib.features.gas.model.GetUpdateAccountGasRequest;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasInfo;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasParam;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasRequest;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasResponse;
import com.okinc.business.web3pay.lib.features.gas.model.UpdateAccountGasInfoApiModel;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31323lrp {
    public final InterfaceC31321lrn EZpvd;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.lrp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull OnChainGasParam onChainGasParam, @NotNull Continuation<? super Result<OnChainGasInfo>> continuation) {
        GasRepositoryImpl$getTransactionGas$1 gasRepositoryImpl$getTransactionGas$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GasRepositoryImpl$getTransactionGas$1) {
            gasRepositoryImpl$getTransactionGas$1 = (GasRepositoryImpl$getTransactionGas$1) continuation;
            int i = gasRepositoryImpl$getTransactionGas$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gasRepositoryImpl$getTransactionGas$1.label = i - Integer.MIN_VALUE;
            } else {
                gasRepositoryImpl$getTransactionGas$1 = new GasRepositoryImpl$getTransactionGas$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = gasRepositoryImpl$getTransactionGas$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = gasRepositoryImpl$getTransactionGas$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31321lrn interfaceC31321lrn = this.EZpvd;
                OnChainGasRequest onChainGasRequest = new OnChainGasRequest(onChainGasParam.getChainIndex(), onChainGasParam.getTokenAddress(), onChainGasParam.getTokenAmount(), onChainGasParam.getTo(), onChainGasParam.getMasterCurrencyId(), onChainGasParam.getTokenCoinTypeNo());
                gasRepositoryImpl$getTransactionGas$1.label = 1;
                objAEQbTJ = interfaceC31321lrn.AEQbTJ(onChainGasRequest, gasRepositoryImpl$getTransactionGas$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C31320lrm.AEQbTJ((OnChainGasResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX INFO: renamed from: o.lrp$Application */
    public static final class Application implements Flow<GasPrice> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.lrp$Application$2, reason: invalid class name */
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
                GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1 gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1;
                if (continuation instanceof GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1) {
                    gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1 = (GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1) continuation;
                    int i = gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1 = new GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    GasFeeSubResponse gasFeeSubResponse = (GasFeeSubResponse) obj;
                    GasPrice gasPrice = new GasPrice(gasFeeSubResponse.getBaseFee(), gasFeeSubResponse.getMaxFeePerGas(), gasFeeSubResponse.getMaxPriorityFeePerGas(), gasFeeSubResponse.getL1GasPrice());
                    gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(gasPrice, gasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1) == objCopydefault) {
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
        public java.lang.Object collect(FlowCollector<? super GasPrice> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull OnChainGasParam onChainGasParam, @NotNull Continuation<? super Result<OnChainGasInfo>> continuation) {
        GasRepositoryImpl$getTransactionToExchangeGas$1 gasRepositoryImpl$getTransactionToExchangeGas$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GasRepositoryImpl$getTransactionToExchangeGas$1) {
            gasRepositoryImpl$getTransactionToExchangeGas$1 = (GasRepositoryImpl$getTransactionToExchangeGas$1) continuation;
            int i = gasRepositoryImpl$getTransactionToExchangeGas$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gasRepositoryImpl$getTransactionToExchangeGas$1.label = i - Integer.MIN_VALUE;
            } else {
                gasRepositoryImpl$getTransactionToExchangeGas$1 = new GasRepositoryImpl$getTransactionToExchangeGas$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = gasRepositoryImpl$getTransactionToExchangeGas$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = gasRepositoryImpl$getTransactionToExchangeGas$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31321lrn interfaceC31321lrn = this.EZpvd;
                OnChainGasRequest onChainGasRequest = new OnChainGasRequest(onChainGasParam.getChainIndex(), onChainGasParam.getTokenAddress(), onChainGasParam.getTokenAmount(), onChainGasParam.getTo(), onChainGasParam.getMasterCurrencyId(), onChainGasParam.getTokenCoinTypeNo());
                gasRepositoryImpl$getTransactionToExchangeGas$1.label = 1;
                objEZpvd = interfaceC31321lrn.EZpvd(onChainGasRequest, gasRepositoryImpl$getTransactionToExchangeGas$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C31320lrm.AEQbTJ((OnChainGasResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<C31325lrr>> continuation) {
        GasRepositoryImpl$getUpdateAccountGas$1 gasRepositoryImpl$getUpdateAccountGas$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GasRepositoryImpl$getUpdateAccountGas$1) {
            gasRepositoryImpl$getUpdateAccountGas$1 = (GasRepositoryImpl$getUpdateAccountGas$1) continuation;
            int i = gasRepositoryImpl$getUpdateAccountGas$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gasRepositoryImpl$getUpdateAccountGas$1.label = i - Integer.MIN_VALUE;
            } else {
                gasRepositoryImpl$getUpdateAccountGas$1 = new GasRepositoryImpl$getUpdateAccountGas$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = gasRepositoryImpl$getUpdateAccountGas$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = gasRepositoryImpl$getUpdateAccountGas$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31321lrn interfaceC31321lrn = this.EZpvd;
                GetUpdateAccountGasRequest getUpdateAccountGasRequest = new GetUpdateAccountGasRequest(str);
                gasRepositoryImpl$getUpdateAccountGas$1.label = 1;
                objOLrzqt = interfaceC31321lrn.OLrzqt(getUpdateAccountGasRequest, gasRepositoryImpl$getUpdateAccountGas$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C31327lrt.AEQbTJ((UpdateAccountGasInfoApiModel) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #3 {all -> 0x00d8, blocks: (B:33:0x008b, B:35:0x0093, B:37:0x0099, B:38:0x00a7), top: B:72:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super Result<ConvertFeeInfo>> continuation) {
        GasRepositoryImpl$getConvertGas$1 gasRepositoryImpl$getConvertGas$1;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        InterfaceC31321lrn interfaceC31321lrn;
        GetConvertGasRequest getConvertGasRequest;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof GasRepositoryImpl$getConvertGas$1) {
            gasRepositoryImpl$getConvertGas$1 = (GasRepositoryImpl$getConvertGas$1) continuation;
            int i = gasRepositoryImpl$getConvertGas$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gasRepositoryImpl$getConvertGas$1.label = i - Integer.MIN_VALUE;
            } else {
                gasRepositoryImpl$getConvertGas$1 = new GasRepositoryImpl$getConvertGas$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = gasRepositoryImpl$getConvertGas$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = gasRepositoryImpl$getConvertGas$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                interfaceC31321lrn = this.EZpvd;
                getConvertGasRequest = new GetConvertGasRequest(str, str2, str3, str4, str5);
                str6 = str;
            } catch (java.lang.Throwable th) {
                th = th;
                str6 = str;
            }
            try {
                gasRepositoryImpl$getConvertGas$1.L$0 = str6;
                str7 = str2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                str7 = str2;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                str11 = str6;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            try {
                gasRepositoryImpl$getConvertGas$1.L$1 = str7;
                str8 = str3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                str11 = str6;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            try {
                gasRepositoryImpl$getConvertGas$1.L$2 = str8;
                str9 = str4;
                try {
                    gasRepositoryImpl$getConvertGas$1.L$3 = str9;
                    str10 = str5;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str10 = str5;
                    str11 = str6;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    gasRepositoryImpl$getConvertGas$1.L$4 = str10;
                    gasRepositoryImpl$getConvertGas$1.label = 1;
                    objCopydefault = interfaceC31321lrn.copydefault(getConvertGasRequest, gasRepositoryImpl$getConvertGas$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    str11 = str6;
                    responseData = (ResponseData) objCopydefault;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    str11 = str6;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                str9 = str4;
                str10 = str5;
                str11 = str6;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str12 = (java.lang.String) gasRepositoryImpl$getConvertGas$1.L$4;
            java.lang.String str13 = (java.lang.String) gasRepositoryImpl$getConvertGas$1.L$3;
            java.lang.String str14 = (java.lang.String) gasRepositoryImpl$getConvertGas$1.L$2;
            java.lang.String str15 = (java.lang.String) gasRepositoryImpl$getConvertGas$1.L$1;
            str11 = (java.lang.String) gasRepositoryImpl$getConvertGas$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                str10 = str12;
                str9 = str13;
                str8 = str14;
                str7 = str15;
            } catch (java.lang.Throwable th7) {
                th = th7;
                str10 = str12;
                str9 = str13;
                str8 = str14;
                str7 = str15;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
            try {
                responseData = (ResponseData) objCopydefault;
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
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C31322lro.AEQbTJ((GetConvertGasResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.AEQbTJ("GasRepository", "getConvertGas(" + str11 + ", " + str7 + ", " + str8 + ", " + str9 + ", " + str10 + ")", (java.lang.Throwable) actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }
}
