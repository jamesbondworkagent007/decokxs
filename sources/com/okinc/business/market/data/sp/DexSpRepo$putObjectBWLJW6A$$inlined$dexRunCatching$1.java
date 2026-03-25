package com.okinc.business.market.data.sp;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationStrategy;
import o.C27670jza;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.data.sp.DexSpRepo$putObject-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ Object $obj$inlined;
    final /* synthetic */ SerializationStrategy $serializer$inlined;
    int label;
    final /* synthetic */ C27670jza this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C27670jza c27670jza, String str, SerializationStrategy serializationStrategy, Object obj) {
        super(2, continuation);
        this.this$0 = c27670jza;
        this.$key$inlined = str;
        this.$serializer$inlined = serializationStrategy;
        this.$obj$inlined = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$key$inlined, this.$serializer$inlined, this.$obj$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((DexSpRepo$putObjectBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(this.this$0.KWHzl().edit().putString(this.$key$inlined, this.this$0.AEQbTJ.encodeToString(this.$serializer$inlined, this.$obj$inlined)).commit()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
