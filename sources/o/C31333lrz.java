package o;

import com.okinc.business.web3pay.lib.core.model.ProjectId;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$createOrderByExternalApi$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$createOrderByExternalQrCode$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$decodeOrderByExternalQrCode$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$prepareCancelTransfer$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$prepareClaim$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$prepareClaimRedPacketUop$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$preparePayRedPacketUop$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$preparePayTransfer$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$preparePurchaseTypeUop$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$queryC2BExchangeRate$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$queryExchangeRateByExternalApi$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$rejectClaim$1;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionRepositoryImpl$submitTransaction$1;
import com.okinc.business.web3pay.lib.features.paytransaction.model.CancelClaimRequest;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PrepareClaimParams;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse;
import com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderQrCodeRequest;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryC2BExchangeRateParams;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryC2BExchangeRateResponse;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryFxByExternalApiParams;
import com.okinc.business.web3pay.lib.features.paytransaction.model.QueryFxByExternalApiResponse;
import com.okinc.business.web3pay.lib.features.uop.model.C2BUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCancelTransferResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCancelTransferUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateClaimRedPacketRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateClaimUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateSaUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.CreateSendRedPacketRequest;
import com.okinc.business.web3pay.lib.features.uop.model.OrderUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.OrderUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC31272lqr;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31333lrz {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final InterfaceC31347lsM AEQbTJ;
    public final InterfaceC31330lrw OLrzqt;

    /* JADX INFO: renamed from: o.lrz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrz.StateListAnimator.<init>():void type: THIS */
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
    public java.lang.Object KWHzl(@NotNull C31287lrF c31287lrF, @NotNull Continuation<? super Result<AbstractC31272lqr.TaskDescription>> continuation) {
        PayTransactionRepositoryImpl$preparePayTransfer$1 payTransactionRepositoryImpl$preparePayTransfer$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof PayTransactionRepositoryImpl$preparePayTransfer$1) {
            payTransactionRepositoryImpl$preparePayTransfer$1 = (PayTransactionRepositoryImpl$preparePayTransfer$1) continuation;
            int i = payTransactionRepositoryImpl$preparePayTransfer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$preparePayTransfer$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$preparePayTransfer$1 = new PayTransactionRepositoryImpl$preparePayTransfer$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = payTransactionRepositoryImpl$preparePayTransfer$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$preparePayTransfer$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                CreatePayTransferUopRequest createPayTransferUopRequest = new CreatePayTransferUopRequest(c31287lrF.AEQbTJ(), c31287lrF.OLrzqt(), c31287lrF.KWHzl(), c31287lrF.EZpvd(), c31287lrF.gEmmrt(), c31287lrF.AYXKKw(), c31287lrF.djBIcL(), c31287lrF.valueOf(), c31287lrF.copydefault().getValue());
                payTransactionRepositoryImpl$preparePayTransfer$1.label = 1;
                objCopydefault = interfaceC31347lsM.copydefault(createPayTransferUopRequest, payTransactionRepositoryImpl$preparePayTransfer$1);
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
            CreatePayTransferUopResponse createPayTransferUopResponse = (CreatePayTransferUopResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            pUU.KWHzl("PayTransactionRepository", "preparePayTransfer: " + createPayTransferUopResponse);
            boolean need2FA = createPayTransferUopResponse.getNeed2FA();
            java.lang.String uopHash = createPayTransferUopResponse.getUopHash();
            JsonElement serverOption = createPayTransferUopResponse.getServerOption();
            C31269lqo c31269lqo = C31269lqo.OLrzqt;
            return Result.m7377constructorimpl(new AbstractC31272lqr.TaskDescription(uopHash, serverOption, c31269lqo.copydefault(createPayTransferUopResponse.getTransactionOperations()), need2FA, c31269lqo.EZpvd(createPayTransferUopResponse.getTransactionOperations()), createPayTransferUopResponse.getMfaSessionId()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C31265lqk c31265lqk, @NotNull Continuation<? super Result<C31283lrB>> continuation) {
        PayTransactionRepositoryImpl$submitTransaction$1 payTransactionRepositoryImpl$submitTransaction$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof PayTransactionRepositoryImpl$submitTransaction$1) {
            payTransactionRepositoryImpl$submitTransaction$1 = (PayTransactionRepositoryImpl$submitTransaction$1) continuation;
            int i = payTransactionRepositoryImpl$submitTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$submitTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$submitTransaction$1 = new PayTransactionRepositoryImpl$submitTransaction$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = payTransactionRepositoryImpl$submitTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$submitTransaction$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                int value = c31265lqk.OLrzqt().getValue();
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                jsonObjectBuilder.put("responseJson", c31265lqk.AhwBna());
                Unit unit = Unit.INSTANCE;
                SendUopRequest sendUopRequest = new SendUopRequest(jsonObjectBuilder.build(), c31265lqk.gEmmrt(), c31265lqk.copydefault(), c31265lqk.KWHzl(), c31265lqk.EZpvd(), 0, 32, (DefaultConstructorMarker) null);
                java.lang.String strAEQbTJ = c31265lqk.AEQbTJ();
                payTransactionRepositoryImpl$submitTransaction$1.label = 1;
                objOLrzqt = interfaceC31347lsM.OLrzqt(value, sendUopRequest, strAEQbTJ, payTransactionRepositoryImpl$submitTransaction$1);
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
            SendUopResponse sendUopResponse = (SendUopResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            java.lang.String orderId = sendUopResponse.getOrderId();
            java.lang.Boolean needShareLink = sendUopResponse.getNeedShareLink();
            return Result.m7377constructorimpl(new C31283lrB(orderId, needShareLink != null ? needShareLink.booleanValue() : false));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(C31266lql.AEQbTJ((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl())));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull ProjectId projectId, @NotNull Continuation<? super Result<C31286lrE>> continuation) {
        PayTransactionRepositoryImpl$prepareCancelTransfer$1 payTransactionRepositoryImpl$prepareCancelTransfer$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$prepareCancelTransfer$1) {
            payTransactionRepositoryImpl$prepareCancelTransfer$1 = (PayTransactionRepositoryImpl$prepareCancelTransfer$1) continuation;
            int i = payTransactionRepositoryImpl$prepareCancelTransfer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$prepareCancelTransfer$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$prepareCancelTransfer$1 = new PayTransactionRepositoryImpl$prepareCancelTransfer$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = payTransactionRepositoryImpl$prepareCancelTransfer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$prepareCancelTransfer$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                CreateCancelTransferUopRequest createCancelTransferUopRequest = new CreateCancelTransferUopRequest(list, projectId.getValue());
                payTransactionRepositoryImpl$prepareCancelTransfer$1.label = 1;
                objEZpvd = interfaceC31347lsM.EZpvd(createCancelTransferUopRequest, payTransactionRepositoryImpl$prepareCancelTransfer$1);
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
                CreateCancelTransferResponse createCancelTransferResponse = (CreateCancelTransferResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
                pUU.KWHzl("PayTransactionRepository", "prepareCancelTransfer: " + createCancelTransferResponse);
                return Result.m7377constructorimpl(new C31286lrE(createCancelTransferResponse.getUopHash(), createCancelTransferResponse.getServerOption(), C31269lqo.OLrzqt.copydefault(createCancelTransferResponse.getTransactionOperations())));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull PrepareClaimParams prepareClaimParams, @NotNull Continuation<? super Result<C31284lrC>> continuation) {
        PayTransactionRepositoryImpl$prepareClaim$1 payTransactionRepositoryImpl$prepareClaim$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$prepareClaim$1) {
            payTransactionRepositoryImpl$prepareClaim$1 = (PayTransactionRepositoryImpl$prepareClaim$1) continuation;
            int i = payTransactionRepositoryImpl$prepareClaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$prepareClaim$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$prepareClaim$1 = new PayTransactionRepositoryImpl$prepareClaim$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = payTransactionRepositoryImpl$prepareClaim$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$prepareClaim$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                CreateClaimUopRequest createClaimUopRequest = new CreateClaimUopRequest(C56402yEa.EZpvd(prepareClaimParams.getOrderId()), prepareClaimParams.getProjectId().getValue());
                payTransactionRepositoryImpl$prepareClaim$1.label = 1;
                objEZpvd = interfaceC31347lsM.EZpvd(createClaimUopRequest, payTransactionRepositoryImpl$prepareClaim$1);
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
                CreateClaimUopResponse createClaimUopResponse = (CreateClaimUopResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
                pUU.KWHzl("PayTransactionRepository", "prepareClaim: " + createClaimUopResponse);
                java.lang.String uopHash = createClaimUopResponse.getUopHash();
                JsonElement serverOption = createClaimUopResponse.getServerOption();
                C31269lqo c31269lqo = C31269lqo.OLrzqt;
                return Result.m7377constructorimpl(new C31284lrC(uopHash, serverOption, c31269lqo.EZpvd(createClaimUopResponse.getTransactionOperations()), c31269lqo.copydefault(createClaimUopResponse.getTransactionOperations())));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31266lql.AEQbTJ((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<Unit>> continuation) {
        PayTransactionRepositoryImpl$rejectClaim$1 payTransactionRepositoryImpl$rejectClaim$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$rejectClaim$1) {
            payTransactionRepositoryImpl$rejectClaim$1 = (PayTransactionRepositoryImpl$rejectClaim$1) continuation;
            int i = payTransactionRepositoryImpl$rejectClaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$rejectClaim$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$rejectClaim$1 = new PayTransactionRepositoryImpl$rejectClaim$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = payTransactionRepositoryImpl$rejectClaim$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$rejectClaim$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31330lrw interfaceC31330lrw = this.OLrzqt;
                CancelClaimRequest cancelClaimRequest = new CancelClaimRequest(str);
                payTransactionRepositoryImpl$rejectClaim$1.label = 1;
                objCopydefault = interfaceC31330lrw.copydefault(cancelClaimRequest, payTransactionRepositoryImpl$rejectClaim$1);
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
                return Result.m7377constructorimpl(Unit.INSTANCE);
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31266lql.AEQbTJ((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull CreateSendRedPacketRequest createSendRedPacketRequest, @NotNull Continuation<? super Result<C31264lqj>> continuation) {
        PayTransactionRepositoryImpl$preparePayRedPacketUop$1 payTransactionRepositoryImpl$preparePayRedPacketUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$preparePayRedPacketUop$1) {
            payTransactionRepositoryImpl$preparePayRedPacketUop$1 = (PayTransactionRepositoryImpl$preparePayRedPacketUop$1) continuation;
            int i = payTransactionRepositoryImpl$preparePayRedPacketUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$preparePayRedPacketUop$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$preparePayRedPacketUop$1 = new PayTransactionRepositoryImpl$preparePayRedPacketUop$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = payTransactionRepositoryImpl$preparePayRedPacketUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$preparePayRedPacketUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                payTransactionRepositoryImpl$preparePayRedPacketUop$1.label = 1;
                objOLrzqt = interfaceC31347lsM.OLrzqt(createSendRedPacketRequest, payTransactionRepositoryImpl$preparePayRedPacketUop$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                pUU.KWHzl("PayTransactionRepository", "preparePayRedPacketUop: " + stateListAnimator2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C31348lsN.EZpvd((CreateSaUopResponse) stateListAnimator2.KWHzl()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull CreateClaimRedPacketRequest createClaimRedPacketRequest, @NotNull Continuation<? super Result<C31264lqj>> continuation) {
        PayTransactionRepositoryImpl$prepareClaimRedPacketUop$1 payTransactionRepositoryImpl$prepareClaimRedPacketUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$prepareClaimRedPacketUop$1) {
            payTransactionRepositoryImpl$prepareClaimRedPacketUop$1 = (PayTransactionRepositoryImpl$prepareClaimRedPacketUop$1) continuation;
            int i = payTransactionRepositoryImpl$prepareClaimRedPacketUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$prepareClaimRedPacketUop$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$prepareClaimRedPacketUop$1 = new PayTransactionRepositoryImpl$prepareClaimRedPacketUop$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = payTransactionRepositoryImpl$prepareClaimRedPacketUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$prepareClaimRedPacketUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                payTransactionRepositoryImpl$prepareClaimRedPacketUop$1.label = 1;
                objEZpvd = interfaceC31347lsM.EZpvd(createClaimRedPacketRequest, payTransactionRepositoryImpl$prepareClaimRedPacketUop$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                pUU.KWHzl("PayTransactionRepository", "prepareClaimRedPacketUop: " + stateListAnimator2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C31348lsN.EZpvd((CreateSaUopResponse) stateListAnimator2.KWHzl()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31266lql.AEQbTJ((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull OrderUopRequest orderUopRequest, @NotNull Continuation<? super Result<AbstractC31272lqr.Activity>> continuation) {
        PayTransactionRepositoryImpl$preparePurchaseTypeUop$1 payTransactionRepositoryImpl$preparePurchaseTypeUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$preparePurchaseTypeUop$1) {
            payTransactionRepositoryImpl$preparePurchaseTypeUop$1 = (PayTransactionRepositoryImpl$preparePurchaseTypeUop$1) continuation;
            int i = payTransactionRepositoryImpl$preparePurchaseTypeUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$preparePurchaseTypeUop$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$preparePurchaseTypeUop$1 = new PayTransactionRepositoryImpl$preparePurchaseTypeUop$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = payTransactionRepositoryImpl$preparePurchaseTypeUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$preparePurchaseTypeUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                payTransactionRepositoryImpl$preparePurchaseTypeUop$1.label = 1;
                objKWHzl = interfaceC31347lsM.KWHzl(orderUopRequest, payTransactionRepositoryImpl$preparePurchaseTypeUop$1);
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
                OrderUopResponse orderUopResponse = (OrderUopResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
                pUU.KWHzl("PayTransactionRepository", "preparePayTransfer: " + orderUopResponse);
                boolean need2FA = orderUopResponse.getNeed2FA();
                java.lang.String uopHash = orderUopResponse.getUopHash();
                JsonElement serverOption = orderUopResponse.getServerOption();
                C31269lqo c31269lqo = C31269lqo.OLrzqt;
                return Result.m7377constructorimpl(new AbstractC31272lqr.Activity(uopHash, serverOption, c31269lqo.copydefault(orderUopResponse.getTransactionOperations()), c31269lqo.EZpvd(orderUopResponse.getTransactionOperations()), need2FA, orderUopResponse.getMfaSessionId(), orderUopResponse.getMfaBizType()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull C2BUopRequest c2BUopRequest, @NotNull Continuation<? super Result<AbstractC31272lqr.Activity>> continuation) {
        PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1 payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1) {
            payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1 = (PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1) continuation;
            int i = payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1 = new PayTransactionRepositoryImpl$prepareC2BOrderTypeUop$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC31347lsM interfaceC31347lsM = this.AEQbTJ;
                payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1.label = 1;
                objKWHzl = interfaceC31347lsM.KWHzl(c2BUopRequest, payTransactionRepositoryImpl$prepareC2BOrderTypeUop$1);
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
                OrderUopResponse orderUopResponse = (OrderUopResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
                pUU.KWHzl("PayTransactionRepository", "prepareC2BOrderUop: " + orderUopResponse);
                boolean need2FA = orderUopResponse.getNeed2FA();
                java.lang.String uopHash = orderUopResponse.getUopHash();
                JsonElement serverOption = orderUopResponse.getServerOption();
                C31269lqo c31269lqo = C31269lqo.OLrzqt;
                return Result.m7377constructorimpl(new AbstractC31272lqr.Activity(uopHash, serverOption, c31269lqo.copydefault(orderUopResponse.getTransactionOperations()), c31269lqo.EZpvd(orderUopResponse.getTransactionOperations()), need2FA, orderUopResponse.getMfaSessionId(), orderUopResponse.getMfaBizType()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, @NotNull Continuation<? super Result<PurchaseOrderDetailResponse>> continuation) {
        PayTransactionRepositoryImpl$createOrderByExternalQrCode$1 payTransactionRepositoryImpl$createOrderByExternalQrCode$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$createOrderByExternalQrCode$1) {
            payTransactionRepositoryImpl$createOrderByExternalQrCode$1 = (PayTransactionRepositoryImpl$createOrderByExternalQrCode$1) continuation;
            int i = payTransactionRepositoryImpl$createOrderByExternalQrCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$createOrderByExternalQrCode$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$createOrderByExternalQrCode$1 = new PayTransactionRepositoryImpl$createOrderByExternalQrCode$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = payTransactionRepositoryImpl$createOrderByExternalQrCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$createOrderByExternalQrCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31330lrw interfaceC31330lrw = this.OLrzqt;
                payTransactionRepositoryImpl$createOrderByExternalQrCode$1.label = 1;
                objOLrzqt = interfaceC31330lrw.OLrzqt(purchaseOrderQrCodeRequest, payTransactionRepositoryImpl$createOrderByExternalQrCode$1);
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
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull QueryC2BExchangeRateParams queryC2BExchangeRateParams, @NotNull Continuation<? super Result<QueryC2BExchangeRateResponse>> continuation) {
        PayTransactionRepositoryImpl$queryC2BExchangeRate$1 payTransactionRepositoryImpl$queryC2BExchangeRate$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$queryC2BExchangeRate$1) {
            payTransactionRepositoryImpl$queryC2BExchangeRate$1 = (PayTransactionRepositoryImpl$queryC2BExchangeRate$1) continuation;
            int i = payTransactionRepositoryImpl$queryC2BExchangeRate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$queryC2BExchangeRate$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$queryC2BExchangeRate$1 = new PayTransactionRepositoryImpl$queryC2BExchangeRate$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = payTransactionRepositoryImpl$queryC2BExchangeRate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$queryC2BExchangeRate$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31330lrw interfaceC31330lrw = this.OLrzqt;
                payTransactionRepositoryImpl$queryC2BExchangeRate$1.label = 1;
                objOLrzqt = interfaceC31330lrw.OLrzqt(queryC2BExchangeRateParams, payTransactionRepositoryImpl$queryC2BExchangeRate$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                pUU.KWHzl("PayTransactionRepository", "queryC2BExchangeRate: " + stateListAnimator2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(stateListAnimator2.KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31266lql.AEQbTJ((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, @NotNull Continuation<? super Result<PurchaseOrderDetailResponse>> continuation) {
        PayTransactionRepositoryImpl$decodeOrderByExternalQrCode$1 payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$decodeOrderByExternalQrCode$1) {
            payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1 = (PayTransactionRepositoryImpl$decodeOrderByExternalQrCode$1) continuation;
            int i = payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1 = new PayTransactionRepositoryImpl$decodeOrderByExternalQrCode$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31330lrw interfaceC31330lrw = this.OLrzqt;
                payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1.label = 1;
                objEZpvd = interfaceC31330lrw.EZpvd(purchaseOrderQrCodeRequest, payTransactionRepositoryImpl$decodeOrderByExternalQrCode$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                pUU.KWHzl("PayTransactionRepository", "decodeOrderByExternalQrCode: " + stateListAnimator2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(stateListAnimator2.KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, @NotNull Continuation<? super Result<PurchaseOrderDetailResponse>> continuation) {
        PayTransactionRepositoryImpl$createOrderByExternalApi$1 payTransactionRepositoryImpl$createOrderByExternalApi$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$createOrderByExternalApi$1) {
            payTransactionRepositoryImpl$createOrderByExternalApi$1 = (PayTransactionRepositoryImpl$createOrderByExternalApi$1) continuation;
            int i = payTransactionRepositoryImpl$createOrderByExternalApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$createOrderByExternalApi$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$createOrderByExternalApi$1 = new PayTransactionRepositoryImpl$createOrderByExternalApi$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = payTransactionRepositoryImpl$createOrderByExternalApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$createOrderByExternalApi$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31330lrw interfaceC31330lrw = this.OLrzqt;
                payTransactionRepositoryImpl$createOrderByExternalApi$1.label = 1;
                objAEQbTJ = interfaceC31330lrw.AEQbTJ(purchaseOrderQrCodeRequest, payTransactionRepositoryImpl$createOrderByExternalApi$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                pUU.KWHzl("PayTransactionRepository", "createOrderByExternalApi: " + stateListAnimator2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(stateListAnimator2.KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull QueryFxByExternalApiParams queryFxByExternalApiParams, @NotNull Continuation<? super Result<QueryFxByExternalApiResponse>> continuation) {
        PayTransactionRepositoryImpl$queryExchangeRateByExternalApi$1 payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof PayTransactionRepositoryImpl$queryExchangeRateByExternalApi$1) {
            payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1 = (PayTransactionRepositoryImpl$queryExchangeRateByExternalApi$1) continuation;
            int i = payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1.label = i - Integer.MIN_VALUE;
            } else {
                payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1 = new PayTransactionRepositoryImpl$queryExchangeRateByExternalApi$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31330lrw interfaceC31330lrw = this.OLrzqt;
                payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1.label = 1;
                objEZpvd = interfaceC31330lrw.EZpvd(queryFxByExternalApiParams, payTransactionRepositoryImpl$queryExchangeRateByExternalApi$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                pUU.KWHzl("PayTransactionRepository", "queryExchangeRateByExternalApi: " + stateListAnimator2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(stateListAnimator2.KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(C31268lqn.copydefault((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl())));
        }
    }
}
