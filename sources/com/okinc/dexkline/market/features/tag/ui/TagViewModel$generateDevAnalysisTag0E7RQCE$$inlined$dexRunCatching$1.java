package com.okinc.dexkline.market.features.tag.ui;

import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34579nej;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.tag.ui.TagViewModel$generateDevAnalysisTag-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class TagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagWrapper>>, Object> {
    final /* synthetic */ Integer $devCreateCount$inlined;
    final /* synthetic */ Integer $devRugCount$inlined;
    int label;
    final /* synthetic */ TagViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, TagViewModel tagViewModel, Integer num, Integer num2) {
        super(2, continuation);
        this.this$0 = tagViewModel;
        this.$devRugCount$inlined = num;
        this.$devCreateCount$inlined = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$devRugCount$inlined, this.$devCreateCount$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TagWrapper>> continuation) {
        return ((TagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C34579nej c34579nej = this.this$0.OLrzqt;
                Integer num = this.$devRugCount$inlined;
                Integer num2 = this.$devCreateCount$inlined;
                this.label = 1;
                objAEQbTJ = c34579nej.AEQbTJ(num, num2, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
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
