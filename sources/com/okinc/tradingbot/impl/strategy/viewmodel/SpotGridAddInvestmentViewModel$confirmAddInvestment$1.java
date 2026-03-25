package com.okinc.tradingbot.impl.strategy.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AddSpotGridAddInvestmentReq;
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
import o.wTC;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotGridAddInvestmentViewModel$confirmAddInvestment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $additionalInvestmentAmount;
    final /* synthetic */ String $algoId;
    final /* synthetic */ BizApiService $service;
    final /* synthetic */ boolean $shouldReinvestProfits;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wTC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridAddInvestmentViewModel$confirmAddInvestment$1(wTC wtc, BizApiService bizApiService, String str, String str2, boolean z, Continuation<? super SpotGridAddInvestmentViewModel$confirmAddInvestment$1> continuation) {
        super(2, continuation);
        this.this$0 = wtc;
        this.$service = bizApiService;
        this.$algoId = str;
        this.$additionalInvestmentAmount = str2;
        this.$shouldReinvestProfits = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotGridAddInvestmentViewModel$confirmAddInvestment$1 spotGridAddInvestmentViewModel$confirmAddInvestment$1 = new SpotGridAddInvestmentViewModel$confirmAddInvestment$1(this.this$0, this.$service, this.$algoId, this.$additionalInvestmentAmount, this.$shouldReinvestProfits, continuation);
        spotGridAddInvestmentViewModel$confirmAddInvestment$1.L$0 = obj;
        return spotGridAddInvestmentViewModel$confirmAddInvestment$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotGridAddInvestmentViewModel$confirmAddInvestment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC43419rot actionBar;
        Throwable thM7380exceptionOrNullimpl;
        wTC wtc;
        Object objAddInvestmentForSpotGrid;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            wtc = this.this$0;
            BizApiService bizApiService = this.$service;
            String str = this.$algoId;
            String str2 = this.$additionalInvestmentAmount;
            boolean z = this.$shouldReinvestProfits;
            Result.Application application2 = Result.Companion;
            AddSpotGridAddInvestmentReq addSpotGridAddInvestmentReq = new AddSpotGridAddInvestmentReq(str, str2, String.valueOf(z));
            this.L$0 = wtc;
            this.label = 1;
            objAddInvestmentForSpotGrid = bizApiService.addInvestmentForSpotGrid(addSpotGridAddInvestmentReq, this);
            if (objAddInvestmentForSpotGrid == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                wTC wtc2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = wtc2.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    Pair pairOLrzqt = C56390yDp.OLrzqt(boolKWHzl, message != null ? message : "");
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            wtc = (wTC) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAddInvestmentForSpotGrid = obj;
        }
        ResponseData responseData = (ResponseData) objAddInvestmentForSpotGrid;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        actionBar.AEQbTJ();
        MutableSharedFlow mutableSharedFlow2 = wtc.KWHzl;
        Pair pairOLrzqt2 = C56390yDp.OLrzqt(C56443yFo.KWHzl(true), "");
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow2.emit(pairOLrzqt2, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        wTC wtc22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
