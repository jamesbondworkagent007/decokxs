package com.okinc.tradingbot.impl.strategy.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.wTD;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDCAViewModel$editReinvestment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ boolean $currentReinvestmentSetting;
    final /* synthetic */ boolean $isTurnOnReinvestment;
    final /* synthetic */ BizApiService $service;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wTD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDCAViewModel$editReinvestment$1(boolean z, boolean z2, wTD wtd, BizApiService bizApiService, String str, Continuation<? super ContractDCAViewModel$editReinvestment$1> continuation) {
        super(2, continuation);
        this.$currentReinvestmentSetting = z;
        this.$isTurnOnReinvestment = z2;
        this.this$0 = wtd;
        this.$service = bizApiService;
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContractDCAViewModel$editReinvestment$1 contractDCAViewModel$editReinvestment$1 = new ContractDCAViewModel$editReinvestment$1(this.$currentReinvestmentSetting, this.$isTurnOnReinvestment, this.this$0, this.$service, this.$algoId, continuation);
        contractDCAViewModel$editReinvestment$1.L$0 = obj;
        return contractDCAViewModel$editReinvestment$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractDCAViewModel$editReinvestment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0033, B:32:0x00b0, B:34:0x00b8, B:36:0x00be, B:37:0x00cb), top: B:60:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        wTD wtd;
        Object objEditContractDcaSuspend;
        wTD wtd2;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.$currentReinvestmentSetting;
            boolean z2 = this.$isTurnOnReinvestment;
            if (z == z2) {
                MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
                Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(true), "");
                this.label = 1;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            wtd = this.this$0;
            BizApiService bizApiService = this.$service;
            String str = this.$algoId;
            Result.Application application2 = Result.Companion;
            try {
                EditContractDcaReq editContractDcaReq = new EditContractDcaReq(str, null, null, null, null, null, null, null, "contract_dca", String.valueOf(z2), "4", false, null, 6398, null);
                this.L$0 = wtd;
                this.label = 2;
                objEditContractDcaSuspend = bizApiService.editContractDcaSuspend(editContractDcaReq, this);
            } catch (Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                wtd2 = wtd;
            }
            if (objEditContractDcaSuspend == objCopydefault) {
                return objCopydefault;
            }
            wtd2 = wtd;
            responseData = (ResponseData) objEditContractDcaSuspend;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            wTD wtd3 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                MutableSharedFlow mutableSharedFlow2 = wtd3.OLrzqt;
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                String message = thM7380exceptionOrNullimpl.getMessage();
                Pair pairOLrzqt2 = C56390yDp.OLrzqt(boolKWHzl, message != null ? message : "");
                this.L$0 = objM7377constructorimpl;
                this.label = 4;
                if (mutableSharedFlow2.emit(pairOLrzqt2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        wtd2 = (wTD) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            objEditContractDcaSuspend = obj;
            responseData = (ResponseData) objEditContractDcaSuspend;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th3) {
            th = th3;
            wtd = wtd2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            wtd2 = wtd;
        }
        actionBar.AEQbTJ();
        MutableSharedFlow mutableSharedFlow3 = wtd2.OLrzqt;
        Pair pairOLrzqt3 = C56390yDp.OLrzqt(C56443yFo.KWHzl(true), "");
        this.L$0 = null;
        this.label = 3;
        if (mutableSharedFlow3.emit(pairOLrzqt3, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        wTD wtd32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
