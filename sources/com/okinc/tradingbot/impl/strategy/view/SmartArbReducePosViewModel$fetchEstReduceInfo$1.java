package com.okinc.tradingbot.impl.strategy.view;

import com.okinc.tradingbot.impl.dto.EstReduceInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.vNB;
import o.wTP;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbReducePosViewModel$fetchEstReduceInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ratio;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SmartArbReducePosViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbReducePosViewModel$fetchEstReduceInfo$1(SmartArbReducePosViewModel smartArbReducePosViewModel, String str, Continuation<? super SmartArbReducePosViewModel$fetchEstReduceInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbReducePosViewModel;
        this.$ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbReducePosViewModel$fetchEstReduceInfo$1 smartArbReducePosViewModel$fetchEstReduceInfo$1 = new SmartArbReducePosViewModel$fetchEstReduceInfo$1(this.this$0, this.$ratio, continuation);
        smartArbReducePosViewModel$fetchEstReduceInfo$1.L$0 = obj;
        return smartArbReducePosViewModel$fetchEstReduceInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbReducePosViewModel$fetchEstReduceInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        SmartArbReducePosViewModel smartArbReducePosViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            smartArbReducePosViewModel = this.this$0;
            String str = this.$ratio;
            Result.Application application2 = Result.Companion;
            wTP wtp = smartArbReducePosViewModel.AYXKKw;
            wTP.ActionBar actionBar = new wTP.ActionBar(smartArbReducePosViewModel.copydefault(), C33129mqd.divS$default(str, C56443yFo.AEQbTJ(100), null, null, null, 14, null));
            this.L$0 = smartArbReducePosViewModel;
            this.label = 1;
            obj = wtp.KWHzl(actionBar, this);
            if (obj == objCopydefault) {
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
                SmartArbReducePosViewModel smartArbReducePosViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = smartArbReducePosViewModel2.AEQbTJ;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            smartArbReducePosViewModel = (SmartArbReducePosViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = smartArbReducePosViewModel.AEQbTJ;
        vNB.TaskDescription taskDescription = new vNB.TaskDescription((EstReduceInfo) obj);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        SmartArbReducePosViewModel smartArbReducePosViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
