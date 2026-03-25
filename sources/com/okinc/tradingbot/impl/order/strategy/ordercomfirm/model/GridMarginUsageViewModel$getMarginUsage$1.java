package com.okinc.tradingbot.impl.order.strategy.ordercomfirm.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.ContractGridReq;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C52671wUa;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.vTC;

/* JADX INFO: loaded from: classes11.dex */
public final class GridMarginUsageViewModel$getMarginUsage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instId;
    final /* synthetic */ ContractGridReq $req;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vTC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridMarginUsageViewModel$getMarginUsage$1(vTC vtc, String str, ContractGridReq contractGridReq, Continuation<? super GridMarginUsageViewModel$getMarginUsage$1> continuation) {
        super(2, continuation);
        this.this$0 = vtc;
        this.$instId = str;
        this.$req = contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GridMarginUsageViewModel$getMarginUsage$1 gridMarginUsageViewModel$getMarginUsage$1 = new GridMarginUsageViewModel$getMarginUsage$1(this.this$0, this.$instId, this.$req, continuation);
        gridMarginUsageViewModel$getMarginUsage$1.L$0 = obj;
        return gridMarginUsageViewModel$getMarginUsage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GridMarginUsageViewModel$getMarginUsage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        vTC vtc;
        Object next;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            vtc = this.this$0;
            String str = this.$instId;
            ContractGridReq contractGridReq = this.$req;
            Result.Application application2 = Result.Companion;
            System.currentTimeMillis();
            C52671wUa c52671wUa = vtc.AEQbTJ;
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(contractGridReq.getGridNum());
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            String maxPx = contractGridReq.getMaxPx();
            String minPx = contractGridReq.getMinPx();
            String runType = contractGridReq.getRunType();
            if (runType == null) {
                runType = "";
            }
            String str2 = runType;
            Iterator<T> it = contractGridReq.getSignParams().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((AdvancedTriggerSign) next).getTriggerAction(), (Object) TtmlNode.START)) {
                    break;
                }
            }
            AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) next;
            C52671wUa.Activity activity = new C52671wUa.Activity(str, iIntValue, maxPx, minPx, str2, null, null, null, null, null, advancedTriggerSign != null ? advancedTriggerSign.getIndicator() : null, null, null, contractGridReq.getDirection(), contractGridReq.getBasePos(), contractGridReq.getLever(), contractGridReq.getActualMarginSz(), contractGridReq.getExtraMarginSz(), 7136, null);
            this.L$0 = vtc;
            this.label = 1;
            objKWHzl = c52671wUa.KWHzl(activity, this);
            if (objKWHzl == objCopydefault) {
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
                vTC vtc2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = vtc2.copydefault;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            vtc = (vTC) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        MutableStateFlow mutableStateFlow2 = vtc.copydefault;
        vNB.TaskDescription taskDescription = new vNB.TaskDescription((List) objKWHzl);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        vTC vtc22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
