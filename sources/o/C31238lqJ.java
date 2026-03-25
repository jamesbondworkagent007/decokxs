package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.PagingData;
import com.okinc.business.web3pay.lib.core.model.ProjectId;
import com.okinc.business.web3pay.lib.features.cardauth.CardAuthRepositoryImpl$createCardAuthUop$1;
import com.okinc.business.web3pay.lib.features.cardauth.CardAuthRepositoryImpl$getCardAuthOrderDetail$1;
import com.okinc.business.web3pay.lib.features.cardauth.CardAuthRepositoryImpl$getCardAuthTransactionHistory$1;
import com.okinc.business.web3pay.lib.features.cardauth.CardAuthRepositoryImpl$sendCardAuthUop$1;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardAuthOrderDetailApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderListRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CardAuthAuthorizeInfo;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopResponse;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopRequest;
import com.okinc.business.web3pay.lib.features.uop.model.SendUopResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC31272lqr;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31238lqJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final InterfaceC31383lsw EZpvd;
    public final InterfaceC31347lsM copydefault;

    /* JADX INFO: renamed from: o.lqJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lqJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.List<CardAuthAuthorizeInfo> list, @NotNull Continuation<? super Result<AbstractC31272lqr.Application>> continuation) {
        CardAuthRepositoryImpl$createCardAuthUop$1 cardAuthRepositoryImpl$createCardAuthUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof CardAuthRepositoryImpl$createCardAuthUop$1) {
            cardAuthRepositoryImpl$createCardAuthUop$1 = (CardAuthRepositoryImpl$createCardAuthUop$1) continuation;
            int i = cardAuthRepositoryImpl$createCardAuthUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardAuthRepositoryImpl$createCardAuthUop$1.label = i - Integer.MIN_VALUE;
            } else {
                cardAuthRepositoryImpl$createCardAuthUop$1 = new CardAuthRepositoryImpl$createCardAuthUop$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = cardAuthRepositoryImpl$createCardAuthUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cardAuthRepositoryImpl$createCardAuthUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31347lsM interfaceC31347lsM = this.copydefault;
                CreateCardAuthUopRequest createCardAuthUopRequest = new CreateCardAuthUopRequest(list, ProjectId.CARD.getValue());
                cardAuthRepositoryImpl$createCardAuthUop$1.label = 1;
                objEZpvd = interfaceC31347lsM.EZpvd(createCardAuthUopRequest, cardAuthRepositoryImpl$createCardAuthUop$1);
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
                AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                return Result.m7377constructorimpl(new AbstractC31272lqr.Application(((CreateCardAuthUopResponse) stateListAnimator2.KWHzl()).getUopHash(), ((CreateCardAuthUopResponse) stateListAnimator2.KWHzl()).getServerOption(), C31269lqo.OLrzqt.copydefault(((CreateCardAuthUopResponse) stateListAnimator2.KWHzl()).getTransactionOperations()), ((CreateCardAuthUopResponse) stateListAnimator2.KWHzl()).getTransactionOperations(), ((CreateCardAuthUopResponse) stateListAnimator2.KWHzl()).getMfaBizType(), ((CreateCardAuthUopResponse) stateListAnimator2.KWHzl()).getMfaSessionId()));
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull JsonElement jsonElement, @NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        CardAuthRepositoryImpl$sendCardAuthUop$1 cardAuthRepositoryImpl$sendCardAuthUop$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof CardAuthRepositoryImpl$sendCardAuthUop$1) {
            cardAuthRepositoryImpl$sendCardAuthUop$1 = (CardAuthRepositoryImpl$sendCardAuthUop$1) continuation;
            int i = cardAuthRepositoryImpl$sendCardAuthUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardAuthRepositoryImpl$sendCardAuthUop$1.label = i - Integer.MIN_VALUE;
            } else {
                cardAuthRepositoryImpl$sendCardAuthUop$1 = new CardAuthRepositoryImpl$sendCardAuthUop$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = cardAuthRepositoryImpl$sendCardAuthUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cardAuthRepositoryImpl$sendCardAuthUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC31347lsM interfaceC31347lsM = this.copydefault;
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                jsonObjectBuilder.put("responseJson", jsonElement);
                SendUopRequest sendUopRequest = new SendUopRequest(jsonObjectBuilder.build(), str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 32, (DefaultConstructorMarker) null);
                cardAuthRepositoryImpl$sendCardAuthUop$1.label = 1;
                objKWHzl = interfaceC31347lsM.KWHzl(sendUopRequest, cardAuthRepositoryImpl$sendCardAuthUop$1);
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
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((SendUopResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).getOrderId());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<C31337lsC>> continuation) throws java.lang.Throwable {
        CardAuthRepositoryImpl$getCardAuthOrderDetail$1 cardAuthRepositoryImpl$getCardAuthOrderDetail$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof CardAuthRepositoryImpl$getCardAuthOrderDetail$1) {
            cardAuthRepositoryImpl$getCardAuthOrderDetail$1 = (CardAuthRepositoryImpl$getCardAuthOrderDetail$1) continuation;
            int i = cardAuthRepositoryImpl$getCardAuthOrderDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardAuthRepositoryImpl$getCardAuthOrderDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                cardAuthRepositoryImpl$getCardAuthOrderDetail$1 = new CardAuthRepositoryImpl$getCardAuthOrderDetail$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = cardAuthRepositoryImpl$getCardAuthOrderDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cardAuthRepositoryImpl$getCardAuthOrderDetail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC31383lsw interfaceC31383lsw = this.EZpvd;
                cardAuthRepositoryImpl$getCardAuthOrderDetail$1.label = 1;
                objKWHzl = interfaceC31383lsw.KWHzl(str, cardAuthRepositoryImpl$getCardAuthOrderDetail$1);
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
            if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
                pUU.AEQbTJ("CardAuthRepositoryImpl", "getOrderDetailForCardAuth()", (java.lang.Throwable) actionBar2.KWHzl());
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
            }
            try {
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(((CardAuthOrderDetailApiModel) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()).toDomainModel());
            } catch (CancellationException e) {
                throw e;
            } catch (java.lang.Throwable th2) {
                pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th2);
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super Result<PagingData<C31340lsF>>> continuation) throws java.lang.Throwable {
        CardAuthRepositoryImpl$getCardAuthTransactionHistory$1 cardAuthRepositoryImpl$getCardAuthTransactionHistory$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof CardAuthRepositoryImpl$getCardAuthTransactionHistory$1) {
            cardAuthRepositoryImpl$getCardAuthTransactionHistory$1 = (CardAuthRepositoryImpl$getCardAuthTransactionHistory$1) continuation;
            int i = cardAuthRepositoryImpl$getCardAuthTransactionHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardAuthRepositoryImpl$getCardAuthTransactionHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                cardAuthRepositoryImpl$getCardAuthTransactionHistory$1 = new CardAuthRepositoryImpl$getCardAuthTransactionHistory$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = cardAuthRepositoryImpl$getCardAuthTransactionHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cardAuthRepositoryImpl$getCardAuthTransactionHistory$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC31383lsw interfaceC31383lsw = this.EZpvd;
                TransactionOrderListRequest transactionOrderListRequest = new TransactionOrderListRequest((java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Long) null, C56402yEa.EZpvd(C56443yFo.AEQbTJ(OrderType.CARD_APPROVE.getValue())), (java.lang.String) null, (java.lang.String) null, 10, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, (DefaultConstructorMarker) null);
                cardAuthRepositoryImpl$getCardAuthTransactionHistory$1.label = 1;
                objAEQbTJ = interfaceC31383lsw.AEQbTJ(transactionOrderListRequest, cardAuthRepositoryImpl$getCardAuthTransactionHistory$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
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
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
            pUU.AEQbTJ("CardAuthRepositoryImpl", "getTransactionHistoryForCardAuth()", (java.lang.Throwable) actionBar2.KWHzl());
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
        }
        try {
            Result.Application application2 = Result.Companion;
            PagingData pagingData = (PagingData) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            java.lang.String nextCursor = pagingData.getNextCursor();
            java.util.List orderList = pagingData.getOrderList();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
            java.util.Iterator it = orderList.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31382lsv) it.next()).toDomainModel());
            }
            return Result.m7377constructorimpl(new PagingData(nextCursor, arrayList));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th2) {
            pUU.AEQbTJ("Web3Pay", "suspendRunCatching", th2);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
    }
}
