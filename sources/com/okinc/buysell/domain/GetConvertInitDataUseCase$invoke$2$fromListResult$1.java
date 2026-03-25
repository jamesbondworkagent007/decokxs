package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.lyO;
import o.lyU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class GetConvertInitDataUseCase$invoke$2$fromListResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ConvertCurrencyBean>>, Object> {
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ lyU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConvertInitDataUseCase$invoke$2$fromListResult$1(lyU lyu, String str, Continuation<? super GetConvertInitDataUseCase$invoke$2$fromListResult$1> continuation) {
        super(2, continuation);
        this.this$0 = lyu;
        this.$valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetConvertInitDataUseCase$invoke$2$fromListResult$1(this.this$0, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ConvertCurrencyBean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ConvertCurrencyBean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ConvertCurrencyBean>> continuation) {
        return ((GetConvertInitDataUseCase$invoke$2$fromListResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyO lyo = this.this$0.EZpvd;
            String str = this.$valuationUnit;
            this.label = 1;
            obj = lyO.invoke$default(lyo, false, str, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((AbstractC43419rot) obj).copydefault();
        return list == null ? yDY.AhwBna() : list;
    }
}
