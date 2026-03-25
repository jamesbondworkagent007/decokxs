package o;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.ProjectId;
import com.okinc.business.web3pay.lib.core.model.TransactionAlertType;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$checkAndCreateTravelRule$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$checkToAddressRisk$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$convertEnsDomainToAddress$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$getChainsActivationInfo$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$getPay2AddressBalance$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$getSupportNetwork$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$prepareOnChainTransfer$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$prepareUpdateUserAccount$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.OnChainTransactionRepositoryImpl$submitTransaction$1;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.ChainActivationInfo;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.EnsAddressRequest;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.EnsAddressResponse;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetChainsActivationInfoResp;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetSupportNetworkResponse;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.MaintenanceInfo;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferInfo;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferParams;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.PayToAddressBalanceResp;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.ResultForRiskData;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.SupportNetworkInfo;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.TravelRuleRequest;
import com.okinc.business.web3pay.lib.features.onchaintransaction.model.TravelRuleResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC31326lrs;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31328lru {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final InterfaceC31347lsM AEQbTJ;
    public final InterfaceC31329lrv copydefault;

    /* JADX INFO: renamed from: o.lru$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lru.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull OnChainTransferParams onChainTransferParams, @NotNull Continuation<? super Result<OnChainTransferInfo>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$prepareOnChainTransfer$1 onChainTransactionRepositoryImpl$prepareOnChainTransfer$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OnChainTransactionRepositoryImpl$prepareOnChainTransfer$1) {
            onChainTransactionRepositoryImpl$prepareOnChainTransfer$1 = (OnChainTransactionRepositoryImpl$prepareOnChainTransfer$1) continuation;
            int i = onChainTransactionRepositoryImpl$prepareOnChainTransfer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$prepareOnChainTransfer$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$prepareOnChainTransfer$1 = new OnChainTransactionRepositoryImpl$prepareOnChainTransfer$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = onChainTransactionRepositoryImpl$prepareOnChainTransfer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$prepareOnChainTransfer$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (onChainTransferParams.getPaymasterNameType() == null) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalArgumentException("paymasterNameType should not be null")));
                }
                CreateOnChainTransferUopRequest createOnChainTransferUopRequest = new CreateOnChainTransferUopRequest(onChainTransferParams.getChainIndex(), onChainTransferParams.getProjectId().getValue(), onChainTransferParams.getTokenAddress(), onChainTransferParams.getTokenAmount(), onChainTransferParams.getUsdAmount(), onChainTransferParams.getTo(), onChainTransferParams.getOrderType().getValue(), onChainTransferParams.getFeeTokenAddress(), onChainTransferParams.getMasterCurrencyId(), onChainTransferParams.getTokenCoinTypeNo(), new GasToken(C56443yFo.AEQbTJ(onChainTransferParams.getPaymasterNameType().getValue()), onChainTransferParams.getFeeTokenCoinTypeNo()), onChainTransferParams.getGasLimit(), onChainTransferParams.getGasPrice(), onChainTransferParams.getTravelRuleId());
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                onChainTransactionRepositoryImpl$prepareOnChainTransfer$1.label = 1;
                objOLrzqt = interfaceC31347lsM.OLrzqt(createOnChainTransferUopRequest, onChainTransactionRepositoryImpl$prepareOnChainTransfer$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            ResponseData responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            CreateOnChainTransferUopResponse createOnChainTransferUopResponse = (CreateOnChainTransferUopResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            pUU.KWHzl("OnChainTransactionRepository", "prepareOnChainTransfer: " + createOnChainTransferUopResponse);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C31344lsJ.KWHzl(createOnChainTransferUopResponse));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application3 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull OnChainTransferParams onChainTransferParams, @NotNull Continuation<? super Result<OnChainTransferInfo>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1 onChainTransactionRepositoryImpl$prepareExchangeTransfer$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1) {
            onChainTransactionRepositoryImpl$prepareExchangeTransfer$1 = (OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1) continuation;
            int i = onChainTransactionRepositoryImpl$prepareExchangeTransfer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$prepareExchangeTransfer$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$prepareExchangeTransfer$1 = new OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = onChainTransactionRepositoryImpl$prepareExchangeTransfer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$prepareExchangeTransfer$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                if (onChainTransferParams.getPaymasterNameType() == null) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalArgumentException("paymasterNameType should not be null")));
                }
                CreateOnChainTransferUopRequest createOnChainTransferUopRequest = new CreateOnChainTransferUopRequest(onChainTransferParams.getChainIndex(), onChainTransferParams.getProjectId().getValue(), onChainTransferParams.getTokenAddress(), onChainTransferParams.getTokenAmount(), onChainTransferParams.getUsdAmount(), onChainTransferParams.getTo(), onChainTransferParams.getOrderType().getValue(), onChainTransferParams.getFeeTokenAddress(), onChainTransferParams.getMasterCurrencyId(), onChainTransferParams.getTokenCoinTypeNo(), new GasToken(C56443yFo.AEQbTJ(onChainTransferParams.getPaymasterNameType().getValue()), onChainTransferParams.getFeeTokenCoinTypeNo()), onChainTransferParams.getGasLimit(), onChainTransferParams.getGasPrice(), onChainTransferParams.getTravelRuleId());
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                onChainTransactionRepositoryImpl$prepareExchangeTransfer$1.label = 1;
                objKWHzl = interfaceC31347lsM.KWHzl(createOnChainTransferUopRequest, onChainTransactionRepositoryImpl$prepareExchangeTransfer$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            ResponseData responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            CreateOnChainTransferUopResponse createOnChainTransferUopResponse = (CreateOnChainTransferUopResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            pUU.KWHzl("OnChainTransactionRepository", "prepareExchangeTransfer: " + createOnChainTransferUopResponse);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C31344lsJ.KWHzl(createOnChainTransferUopResponse));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application3 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C31265lqk c31265lqk, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$submitTransaction$1 onChainTransactionRepositoryImpl$submitTransaction$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OnChainTransactionRepositoryImpl$submitTransaction$1) {
            onChainTransactionRepositoryImpl$submitTransaction$1 = (OnChainTransactionRepositoryImpl$submitTransaction$1) continuation;
            int i = onChainTransactionRepositoryImpl$submitTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$submitTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$submitTransaction$1 = new OnChainTransactionRepositoryImpl$submitTransaction$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = onChainTransactionRepositoryImpl$submitTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$submitTransaction$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                jsonObjectBuilder.put("responseJson", c31265lqk.AhwBna());
                SendUopRequest sendUopRequest = new SendUopRequest(jsonObjectBuilder.build(), c31265lqk.gEmmrt(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 32, (DefaultConstructorMarker) null);
                java.lang.String strAEQbTJ = c31265lqk.AEQbTJ();
                int value = c31265lqk.OLrzqt().getValue();
                onChainTransactionRepositoryImpl$submitTransaction$1.label = 1;
                objOLrzqt = interfaceC31347lsM.OLrzqt(value, sendUopRequest, strAEQbTJ, onChainTransactionRepositoryImpl$submitTransaction$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            ResponseData responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((SendUopResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).getOrderId());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends java.util.List<SupportNetworkInfo>>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$getSupportNetwork$1 onChainTransactionRepositoryImpl$getSupportNetwork$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OnChainTransactionRepositoryImpl$getSupportNetwork$1) {
            onChainTransactionRepositoryImpl$getSupportNetwork$1 = (OnChainTransactionRepositoryImpl$getSupportNetwork$1) continuation;
            int i = onChainTransactionRepositoryImpl$getSupportNetwork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$getSupportNetwork$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$getSupportNetwork$1 = new OnChainTransactionRepositoryImpl$getSupportNetwork$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = onChainTransactionRepositoryImpl$getSupportNetwork$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$getSupportNetwork$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31329lrv interfaceC31329lrv = this.copydefault;
                onChainTransactionRepositoryImpl$getSupportNetwork$1.label = 1;
                objCopydefault = interfaceC31329lrv.copydefault(onChainTransactionRepositoryImpl$getSupportNetwork$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            java.lang.Iterable<GetSupportNetworkResponse> iterable = (java.lang.Iterable) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            for (GetSupportNetworkResponse getSupportNetworkResponse : iterable) {
                java.lang.String chainIndex = getSupportNetworkResponse.getChainIndex();
                java.lang.String chainName = getSupportNetworkResponse.getChainName();
                java.lang.String chainLogo = getSupportNetworkResponse.getChainLogo();
                boolean z = getSupportNetworkResponse.getUnderMaintenance() != null;
                MaintenanceInfo underMaintenance = getSupportNetworkResponse.getUnderMaintenance();
                long maintenanceBeginTime = underMaintenance != null ? underMaintenance.getMaintenanceBeginTime() : 0L;
                MaintenanceInfo underMaintenance2 = getSupportNetworkResponse.getUnderMaintenance();
                arrayList.add(new SupportNetworkInfo(chainIndex, chainName, chainLogo, z, maintenanceBeginTime, underMaintenance2 != null ? underMaintenance2.getMaintenanceEndTime() : 0L));
            }
            return Result.m7377constructorimpl(arrayList);
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<? extends java.util.List<ChainActivationInfo>>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$getChainsActivationInfo$1 onChainTransactionRepositoryImpl$getChainsActivationInfo$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof OnChainTransactionRepositoryImpl$getChainsActivationInfo$1) {
            onChainTransactionRepositoryImpl$getChainsActivationInfo$1 = (OnChainTransactionRepositoryImpl$getChainsActivationInfo$1) continuation;
            int i = onChainTransactionRepositoryImpl$getChainsActivationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$getChainsActivationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$getChainsActivationInfo$1 = new OnChainTransactionRepositoryImpl$getChainsActivationInfo$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = onChainTransactionRepositoryImpl$getChainsActivationInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$getChainsActivationInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31329lrv interfaceC31329lrv = this.copydefault;
                onChainTransactionRepositoryImpl$getChainsActivationInfo$1.label = 1;
                objAEQbTJ = interfaceC31329lrv.AEQbTJ(list, onChainTransactionRepositoryImpl$getChainsActivationInfo$1);
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
                java.util.List<ChainActivationInfo> chainActivationInfoList = ((GetChainsActivationInfoResp) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()).getChainActivationInfoList();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(chainActivationInfoList, 10));
                for (ChainActivationInfo chainActivationInfo : chainActivationInfoList) {
                    arrayList.add(new ChainActivationInfo(chainActivationInfo.getChainIndex(), chainActivationInfo.getActivated(), chainActivationInfo.getActivationFeeTokenDecimal(), chainActivationInfo.getActivationFeeTokenSymbol(), chainActivationInfo.getActivationFeeAmount(), chainActivationInfo.getTransactionFeeAmount()));
                }
                return Result.m7377constructorimpl(arrayList);
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull EnsAddressRequest ensAddressRequest, @NotNull Continuation<? super Result<EnsAddressResponse>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$convertEnsDomainToAddress$1 onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof OnChainTransactionRepositoryImpl$convertEnsDomainToAddress$1) {
            onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1 = (OnChainTransactionRepositoryImpl$convertEnsDomainToAddress$1) continuation;
            int i = onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1 = new OnChainTransactionRepositoryImpl$convertEnsDomainToAddress$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31329lrv interfaceC31329lrv = this.copydefault;
                onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1.label = 1;
                objCopydefault = interfaceC31329lrv.copydefault(ensAddressRequest, onChainTransactionRepositoryImpl$convertEnsDomainToAddress$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
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
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<PayToAddressBalanceResp>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$getPay2AddressBalance$1 onChainTransactionRepositoryImpl$getPay2AddressBalance$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof OnChainTransactionRepositoryImpl$getPay2AddressBalance$1) {
            onChainTransactionRepositoryImpl$getPay2AddressBalance$1 = (OnChainTransactionRepositoryImpl$getPay2AddressBalance$1) continuation;
            int i = onChainTransactionRepositoryImpl$getPay2AddressBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$getPay2AddressBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$getPay2AddressBalance$1 = new OnChainTransactionRepositoryImpl$getPay2AddressBalance$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = onChainTransactionRepositoryImpl$getPay2AddressBalance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$getPay2AddressBalance$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31329lrv interfaceC31329lrv = this.copydefault;
                onChainTransactionRepositoryImpl$getPay2AddressBalance$1.label = 1;
                objAEQbTJ = interfaceC31329lrv.AEQbTJ(str, onChainTransactionRepositoryImpl$getPay2AddressBalance$1);
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
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<ResultForRiskData>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$checkToAddressRisk$1 onChainTransactionRepositoryImpl$checkToAddressRisk$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof OnChainTransactionRepositoryImpl$checkToAddressRisk$1) {
            onChainTransactionRepositoryImpl$checkToAddressRisk$1 = (OnChainTransactionRepositoryImpl$checkToAddressRisk$1) continuation;
            int i = onChainTransactionRepositoryImpl$checkToAddressRisk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$checkToAddressRisk$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$checkToAddressRisk$1 = new OnChainTransactionRepositoryImpl$checkToAddressRisk$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = onChainTransactionRepositoryImpl$checkToAddressRisk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$checkToAddressRisk$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC31329lrv interfaceC31329lrv = this.copydefault;
                onChainTransactionRepositoryImpl$checkToAddressRisk$1.label = 1;
                objKWHzl = interfaceC31329lrv.KWHzl(str, str2, onChainTransactionRepositoryImpl$checkToAddressRisk$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
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
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Integer num, java.lang.String str2, GasLimit gasLimit, GasPrice gasPrice, @NotNull ProjectId projectId, @NotNull Continuation<? super AbstractC31326lrs> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$prepareUpdateUserAccount$1 onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OnChainTransactionRepositoryImpl$prepareUpdateUserAccount$1) {
            onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1 = (OnChainTransactionRepositoryImpl$prepareUpdateUserAccount$1) continuation;
            int i = onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1 = new OnChainTransactionRepositoryImpl$prepareUpdateUserAccount$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                CreateUpdateAccountUopRequest createUpdateAccountUopRequest = new CreateUpdateAccountUopRequest(str, projectId.getValue(), new GasToken(num, str2), gasLimit, gasPrice);
                onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1.label = 1;
                objCopydefault = interfaceC31347lsM.copydefault(createUpdateAccountUopRequest, onChainTransactionRepositoryImpl$prepareUpdateUserAccount$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) actionBar;
            pUU.KWHzl("OnChainTransactionRepository", "prepareUpdateUserAccount: " + stateListAnimator.KWHzl());
            return new AbstractC31326lrs.Application(C31352lsR.KWHzl((CreateUpdateAccountUopResponse) stateListAnimator.KWHzl()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        TransactionAlertType transactionAlertTypeEZpvd = TransactionAlertType.Companion.EZpvd(((OKServerException) actionBar2.KWHzl()).getCode());
        if (transactionAlertTypeEZpvd != null) {
            return new AbstractC31326lrs.Activity(transactionAlertTypeEZpvd);
        }
        return new AbstractC31326lrs.StateListAnimator((java.lang.Throwable) actionBar2.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<TravelRuleResponse>> continuation) throws java.lang.Throwable {
        OnChainTransactionRepositoryImpl$checkAndCreateTravelRule$1 onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof OnChainTransactionRepositoryImpl$checkAndCreateTravelRule$1) {
            onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1 = (OnChainTransactionRepositoryImpl$checkAndCreateTravelRule$1) continuation;
            int i2 = onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1.label = i2 - Integer.MIN_VALUE;
            } else {
                onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1 = new OnChainTransactionRepositoryImpl$checkAndCreateTravelRule$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31329lrv interfaceC31329lrv = this.copydefault;
                TravelRuleRequest travelRuleRequest = new TravelRuleRequest(str, str2, str3, i, str4);
                onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1.label = 1;
                objAEQbTJ = interfaceC31329lrv.AEQbTJ(travelRuleRequest, onChainTransactionRepositoryImpl$checkAndCreateTravelRule$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }
}
