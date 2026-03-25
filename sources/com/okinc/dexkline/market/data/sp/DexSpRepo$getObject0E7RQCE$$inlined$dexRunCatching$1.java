package com.okinc.dexkline.market.data.sp;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.DeserializationStrategy;
import o.C32272mVw;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: com.okinc.dexkline.market.data.sp.DexSpRepo$getObject-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends T>>, Object> {
    final /* synthetic */ DeserializationStrategy $deserializer$inlined;
    final /* synthetic */ String $key$inlined;
    int label;
    final /* synthetic */ C32272mVw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C32272mVw c32272mVw, String str, DeserializationStrategy deserializationStrategy) {
        super(2, continuation);
        this.this$0 = c32272mVw;
        this.$key$inlined = str;
        this.$deserializer$inlined = deserializationStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$key$inlined, this.$deserializer$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends T>> continuation) {
        return ((DexSpRepo$getObject0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            String string = this.this$0.KWHzl().getString(this.$key$inlined, "");
            if (string != null) {
                str = string;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.OLrzqt.decodeFromString(this.$deserializer$inlined, str));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
