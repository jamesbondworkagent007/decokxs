package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.uCU;

/* JADX INFO: loaded from: classes19.dex */
public final class LlmOrderViewModel$checkPopupsOnStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LlmOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderViewModel$checkPopupsOnStart$1(LlmOrderViewModel llmOrderViewModel, Continuation<? super LlmOrderViewModel$checkPopupsOnStart$1> continuation) {
        super(2, continuation);
        this.this$0 = llmOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderViewModel$checkPopupsOnStart$1 llmOrderViewModel$checkPopupsOnStart$1 = new LlmOrderViewModel$checkPopupsOnStart$1(this.this$0, continuation);
        llmOrderViewModel$checkPopupsOnStart$1.L$0 = obj;
        return llmOrderViewModel$checkPopupsOnStart$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmOrderViewModel$checkPopupsOnStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:7:0x0012, B:32:0x00b3, B:12:0x002b, B:26:0x008a, B:28:0x0096, B:31:0x00b0, B:15:0x0037, B:22:0x0075, B:18:0x0047), top: B:38:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:7:0x0012, B:32:0x00b3, B:12:0x002b, B:26:0x008a, B:28:0x0096, B:31:0x00b0, B:15:0x0037, B:22:0x0075, B:18:0x0047), top: B:38:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LlmOrderViewModel llmOrderViewModel;
        Deferred deferred;
        LlmOrderViewModel llmOrderViewModel2;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            llmOrderViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LlmOrderViewModel$checkPopupsOnStart$1$1$disclaimerDeferred$1(llmOrderViewModel, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LlmOrderViewModel$checkPopupsOnStart$1$1$botGuideDeferred$1(llmOrderViewModel, null), 3, null);
            this.L$0 = llmOrderViewModel;
            this.L$1 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                llmOrderViewModel = (LlmOrderViewModel) this.L$2;
                list = (List) this.L$1;
                llmOrderViewModel2 = (LlmOrderViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                llmOrderViewModel.djBIcL = (uCU.Application) obj;
                if (!(!list.isEmpty())) {
                    LlmOrderViewModel.Application.C0636Application c0636Application = new LlmOrderViewModel.Application.C0636Application((LlmDisclaimerInfoDto) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (llmOrderViewModel2.OLrzqt(c0636Application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    llmOrderViewModel2.AuCTel();
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            Deferred deferred2 = (Deferred) this.L$1;
            LlmOrderViewModel llmOrderViewModel3 = (LlmOrderViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferred = deferred2;
            llmOrderViewModel = llmOrderViewModel3;
        }
        List list2 = (List) obj;
        this.L$0 = llmOrderViewModel;
        this.L$1 = list2;
        this.L$2 = llmOrderViewModel;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        llmOrderViewModel2 = llmOrderViewModel;
        list = list2;
        obj = objAwait2;
        llmOrderViewModel.djBIcL = (uCU.Application) obj;
        if (!(!list.isEmpty())) {
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
