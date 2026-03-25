package com.okinc.dexkline.market.features.tag.ui;

import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34542ndz;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.tag.ui.TagViewModel$getTagMeta-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagMeta>>, Object> {
    final /* synthetic */ String $key$inlined;
    int label;
    final /* synthetic */ TagViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1(Continuation continuation, TagViewModel tagViewModel, String str) {
        super(2, continuation);
        this.this$0 = tagViewModel;
        this.$key$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$key$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TagMeta>> continuation) {
        return ((TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM8699getTagMeta0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C34542ndz c34542ndz = this.this$0.EZpvd;
                String str = this.$key$inlined;
                this.label = 1;
                objM8699getTagMeta0E7RQCE$default = C34542ndz.m8699getTagMeta0E7RQCE$default(c34542ndz, str, false, this, 2, null);
                if (objM8699getTagMeta0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8699getTagMeta0E7RQCE$default = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objM8699getTagMeta0E7RQCE$default)) {
                objM8699getTagMeta0E7RQCE$default = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objM8699getTagMeta0E7RQCE$default);
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
