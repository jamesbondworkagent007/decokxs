package com.okinc.business.invest_biz.ui.screens.search;

import com.okinc.business.invest_biz.data.bean.InvestChip;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.iGA;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSearchV2VM$searchByText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<InvestChip> $chips;
    final /* synthetic */ String $keyword;
    Object L$0;
    int label;
    final /* synthetic */ InvestSearchV2VM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSearchV2VM$searchByText$1(InvestSearchV2VM investSearchV2VM, List<InvestChip> list, String str, Continuation<? super InvestSearchV2VM$searchByText$1> continuation) {
        super(2, continuation);
        this.this$0 = investSearchV2VM;
        this.$chips = list;
        this.$keyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSearchV2VM$searchByText$1(this.this$0, this.$chips, this.$keyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestSearchV2VM$searchByText$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mutableStateFlow = this.this$0.AEQbTJ;
            iGA iga = this.this$0.isConnected;
            List<InvestChip> list = this.$chips;
            String str = this.$keyword;
            this.L$0 = mutableStateFlow;
            this.label = 1;
            objCopydefault = iga.copydefault(list, str, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            objCopydefault = yDY.AhwBna();
        }
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow.emit(objCopydefault, this) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }
}
