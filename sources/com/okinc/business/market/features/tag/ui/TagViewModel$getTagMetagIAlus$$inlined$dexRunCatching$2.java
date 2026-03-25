package com.okinc.business.market.features.tag.ui;

import com.okinc.business.market.features.tag.domain.TagMeta;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29715kyq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.tag.ui.TagViewModel$getTagMeta-gIAlu-s$$inlined$dexRunCatching$2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends TagMeta>>>, Object> {
    final /* synthetic */ List $keys$inlined;
    int label;
    final /* synthetic */ TagViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2(Continuation continuation, TagViewModel tagViewModel, List list) {
        super(2, continuation);
        this.this$0 = tagViewModel;
        this.$keys$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2(continuation, this.this$0, this.$keys$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends TagMeta>>> continuation) {
        return ((TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM8678batchGet0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C29715kyq c29715kyq = this.this$0.AEQbTJ;
                List list = this.$keys$inlined;
                this.label = 1;
                objM8678batchGet0E7RQCE$default = C29715kyq.m8678batchGet0E7RQCE$default(c29715kyq, list, false, this, 2, null);
                if (objM8678batchGet0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8678batchGet0E7RQCE$default = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7380exceptionOrNullimpl(objM8678batchGet0E7RQCE$default) != null) {
                objM8678batchGet0E7RQCE$default = yDY.AhwBna();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objM8678batchGet0E7RQCE$default);
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
