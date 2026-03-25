package com.okinc.tradingbot.impl.strategy.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.net.BizApiService;
import java.util.List;
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
import o.pUU;
import o.wTC;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotGridAddInvestmentViewModel$fetchConfirmInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ BizApiService $service;
    final /* synthetic */ boolean $shouldReinvestProfits;
    final /* synthetic */ String $topUpQuoteAmount;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wTC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridAddInvestmentViewModel$fetchConfirmInfo$1(wTC wtc, BizApiService bizApiService, String str, String str2, boolean z, Continuation<? super SpotGridAddInvestmentViewModel$fetchConfirmInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = wtc;
        this.$service = bizApiService;
        this.$algoId = str;
        this.$topUpQuoteAmount = str2;
        this.$shouldReinvestProfits = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotGridAddInvestmentViewModel$fetchConfirmInfo$1 spotGridAddInvestmentViewModel$fetchConfirmInfo$1 = new SpotGridAddInvestmentViewModel$fetchConfirmInfo$1(this.this$0, this.$service, this.$algoId, this.$topUpQuoteAmount, this.$shouldReinvestProfits, continuation);
        spotGridAddInvestmentViewModel$fetchConfirmInfo$1.L$0 = obj;
        return spotGridAddInvestmentViewModel$fetchConfirmInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotGridAddInvestmentViewModel$fetchConfirmInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:23:0x005a, B:25:0x0062, B:27:0x0068, B:28:0x0075), top: B:47:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        wTC wtc;
        Object objFetchConfirmInfoForSpotGridAddInvestment;
        wTC wtc2;
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
            wtc = this.this$0;
            BizApiService bizApiService = this.$service;
            String str = this.$algoId;
            String str2 = this.$topUpQuoteAmount;
            boolean z = this.$shouldReinvestProfits;
            Result.Application application2 = Result.Companion;
            try {
                this.L$0 = wtc;
                this.label = 1;
                objFetchConfirmInfoForSpotGridAddInvestment = bizApiService.fetchConfirmInfoForSpotGridAddInvestment(str, str2, String.valueOf(z), this);
            } catch (Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                wtc2 = wtc;
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objFetchConfirmInfoForSpotGridAddInvestment == objCopydefault) {
                return objCopydefault;
            }
            wtc2 = wtc;
            responseData = (ResponseData) objFetchConfirmInfoForSpotGridAddInvestment;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            return Unit.INSTANCE;
        }
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
            wTC wtc3 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                MutableSharedFlow mutableSharedFlow = wtc3.OLrzqt;
                Pair pairOLrzqt = C56390yDp.OLrzqt(null, thM7380exceptionOrNullimpl.getMessage());
                this.L$0 = objM7377constructorimpl;
                this.label = 3;
                if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        wtc2 = (wTC) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            objFetchConfirmInfoForSpotGridAddInvestment = obj;
            responseData = (ResponseData) objFetchConfirmInfoForSpotGridAddInvestment;
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
            wtc = wtc2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            wtc2 = wtc;
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        MutableSharedFlow mutableSharedFlow2 = wtc2.OLrzqt;
        Pair pairOLrzqt2 = C56390yDp.OLrzqt(((List) actionBar.AEQbTJ()).get(0), null);
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow2.emit(pairOLrzqt2, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        wTC wtc32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
