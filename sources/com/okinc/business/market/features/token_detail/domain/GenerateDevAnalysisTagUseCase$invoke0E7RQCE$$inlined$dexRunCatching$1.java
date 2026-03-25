package com.okinc.business.market.features.token_detail.domain;

import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagExtra;
import com.okinc.business.market.features.tag.domain.TagLocalProperty;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29715kyq;
import o.C29773kzv;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.token_detail.domain.GenerateDevAnalysisTagUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagWrapper>>, Object> {
    final /* synthetic */ Integer $devCreateCount$inlined;
    final /* synthetic */ Integer $devRugCount$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C29773kzv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, Integer num, Integer num2, C29773kzv c29773kzv) {
        super(2, continuation);
        this.$devRugCount$inlined = num;
        this.$devCreateCount$inlined = num2;
        this.this$0 = c29773kzv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$devRugCount$inlined, this.$devCreateCount$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TagWrapper>> continuation) {
        return ((GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM8679getTagMeta0E7RQCE$default;
        TagLocalProperty tagLocalProperty;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                TagLocalProperty tagLocalProperty2 = new TagLocalProperty(null, null, null, null, this.$devRugCount$inlined, this.$devCreateCount$inlined, null, 79, null);
                C29715kyq c29715kyq = this.this$0.copydefault;
                this.L$0 = tagLocalProperty2;
                this.label = 1;
                objM8679getTagMeta0E7RQCE$default = C29715kyq.m8679getTagMeta0E7RQCE$default(c29715kyq, "creatorMigrationCnt", false, this, 2, null);
                if (objM8679getTagMeta0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                tagLocalProperty = tagLocalProperty2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TagLocalProperty tagLocalProperty3 = (TagLocalProperty) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM8679getTagMeta0E7RQCE$default = ((Result) obj).m7386unboximpl();
                tagLocalProperty = tagLocalProperty3;
            }
            if (Result.m7383isFailureimpl(objM8679getTagMeta0E7RQCE$default)) {
                objM8679getTagMeta0E7RQCE$default = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new TagWrapper(new CompactTag("creatorMigrationCnt", true, new TagExtra(null, null, null, tagLocalProperty, null, null, null, null, 247, null)), (TagMeta) objM8679getTagMeta0E7RQCE$default));
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
