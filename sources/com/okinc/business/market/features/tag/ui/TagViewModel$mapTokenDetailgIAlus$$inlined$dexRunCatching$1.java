package com.okinc.business.market.features.tag.ui;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.features.token_detail.TokenDetail;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29772kzu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.tag.ui.TagViewModel$mapTokenDetail-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class TagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TokenDetail>>, Object> {
    final /* synthetic */ LatestMarketInfoBean $bean$inlined;
    int label;
    final /* synthetic */ TagViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1(Continuation continuation, TagViewModel tagViewModel, LatestMarketInfoBean latestMarketInfoBean) {
        super(2, continuation);
        this.this$0 = tagViewModel;
        this.$bean$inlined = latestMarketInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$bean$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TokenDetail>> continuation) {
        return ((TagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C29772kzu c29772kzu = this.this$0.gEmmrt;
                LatestMarketInfoBean latestMarketInfoBean = this.$bean$inlined;
                this.label = 1;
                objEZpvd = c29772kzu.EZpvd(latestMarketInfoBean, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
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
