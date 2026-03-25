package com.okinc.business.invest_biz.data.logic;

import com.okinc.business.invest_biz.data.bean.FilterRecord;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.internal.ArrayListSerializer;
import o.C23642iDy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends FilterRecord>>>, Object> {
    final /* synthetic */ String $key$inlined;
    int label;
    final /* synthetic */ C23642iDy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1(Continuation continuation, C23642iDy c23642iDy, String str) {
        super(2, continuation);
        this.this$0 = c23642iDy;
        this.$key$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1(continuation, this.this$0, this.$key$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends FilterRecord>>> continuation) {
        return ((InvestSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str = "";
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            String string = this.this$0.copydefault().getString(this.$key$inlined, "");
            if (string != null) {
                str = string;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.copydefault.decodeFromString(new ArrayListSerializer(FilterRecord.Companion.serializer()), str));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
